package com.example.khushal.myconverter;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.microedition.khronos.opengles.GL;

public class Currency extends AppCompatActivity {

    String [] currencyoptions={"AUD","BGN","BRL","CAD","CHF","CNY","CZK","DKK","EUR","GBP","HKD","HRK","HUF","IDR","ILS","INR","JPY","KRW","MXN","MYR","NOK","NZD","PHP","PLN","RON","RUB","SEK","SGD","THB","TRY","USD","ZAR"};
    Spinner sp;
    Spinner sp1;
    Button button;
    EditText edit;
    TextView textView;
    TextView lastupdate;
    TextView temptext;
    String to;
    String from;
    //int temp=GlobalVars.getTemp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);



        sp=(Spinner)findViewById(R.id.spinner);
        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);
            android.widget.ListPopupWindow popupWindow = (android.widget.ListPopupWindow) popup.get(sp);
            popupWindow.setHeight(500);
        } catch (NoClassDefFoundError | ClassCastException | NoSuchFieldException | IllegalAccessException e) {
        }
        sp1=(Spinner)findViewById(R.id.spinner2);
        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);
            android.widget.ListPopupWindow popupWindow = (android.widget.ListPopupWindow) popup.get(sp1);
            popupWindow.setHeight(500);
        } catch (NoClassDefFoundError | ClassCastException | NoSuchFieldException | IllegalAccessException e) {
        }
        button=(Button)findViewById(R.id.button1);
        edit=(EditText) findViewById(R.id.edit);
        temptext=(TextView) findViewById(R.id.temptext);

        edit.setFocusable(false);
        edit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                edit.setFocusableInTouchMode(true);

                return false;
            }
        });

        textView=(TextView)findViewById(R.id.textView);
        lastupdate=(TextView)findViewById(R.id.lastupdate);
        /*if(temp==1) {
            temptext.setVisibility(View.VISIBLE);
        }*/


        ArrayAdapter<String> ardp1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,currencyoptions);
        ardp1.setDropDownViewResource(R.layout.drop_down_layout);

        sp.setAdapter(ardp1);
        sp1.setAdapter(ardp1);

        button.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                int i = sp.getSelectedItemPosition();
                int j = sp1.getSelectedItemPosition();
                    if(!isNetworkConnected())
                    {Toast.makeText(Currency.this,"Pleast connect to Internet to use this service",Toast.LENGTH_LONG).show();}


                    else if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(Currency.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                    else {
                        from = sp.getItemAtPosition(i).toString();
                        to = sp1.getItemAtPosition(j).toString();
                        Toast.makeText(Currency.this, from + "->" + to, Toast.LENGTH_LONG).show();
                        BackGround bb = new BackGround();
                        bb.execute(from, to);
                    }



            }

        });


    }


    class BackGround extends AsyncTask<String, String, String> {


        private ProgressDialog dialog;
        protected void onPreExecute()
        {
            super.onPreExecute();
            dialog = ProgressDialog.show(Currency.this, "Retriving current rates...", "Please wait...", true, true);


        }


        @Override
        protected String doInBackground(String... params) {


            String to=params[0];
            String from=params[1];


            String data = "";
            int tmp;

            try {
                URL url = new URL("http://api.fixer.io/latest?symbols="+to+","+from);
                //String urlParams = null;

                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream is = httpURLConnection.getInputStream();
                while ((tmp = is.read()) != -1) {
                    data += (char) tmp;
                }

                is.close();
                httpURLConnection.disconnect();

                return data;
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return "Exception: " + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "Exception: " + e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String s) {

            super.onPostExecute(s);
            String err = null;
            try {
                JSONObject root = new JSONObject(s);
                JSONObject arr = root.getJSONObject("rates");


                    String To = arr.getString(to);
                    Double To1 = Double.parseDouble(To);
                    String From=arr.getString(from);
                    Double From1=Double.parseDouble(From);
                    Double d1=To1/From1;
                    Double d=Double.parseDouble(edit.getText().toString());
                    DecimalFormat df=new DecimalFormat("#.###############");
                    String answer=df.format(d*d1);
                    textView.setText(answer);

                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date date = new Date();

                    lastupdate.setText(dateFormat.format(date));
                    temptext.setVisibility(View.VISIBLE);
                    //GlobalVars.setTemp(1);
                    /*temp=GlobalVars.getTemp();
                    if(temp==1) {
                        temptext.setVisibility(View.VISIBLE);
                    }*/

                    //Iterate through the elements of the array i.
                    //Get thier value.
                    //Get the value for the first element and the value for the last element.



            } catch (JSONException e) {
                e.printStackTrace();
                err = "Exception: " + e.getMessage();
            }
            dialog.dismiss();



        }
    }



    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }


}
