package com.example.khushal.myconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] items={"Area","Currency","Data Transfer Rate","Digital Storage","Energy","Frequency","Fuel Economy","Length","Mass","Plane Angle","Pressure","Speed","Temperature","Time","Volume"};
    ListView list;
    EditText sv;
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        adp=new ArrayAdapter<String>(
                this, //Context
                R.layout.list_item_layout, //Each Item Layout
                items); //Items to be displayed
        sv=(EditText)findViewById(R.id.searchview1);
        sv.setFocusable(false);
        sv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                sv.setFocusableInTouchMode(true);

                return false;
            }
        });
        sv.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                MainActivity.this.adp.getFilter().filter(cs);
            }



            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
        list=(ListView)findViewById(R.id.listViewOptions);

        list.setAdapter(adp);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public  void  onItemClick(AdapterView<?> parent , View view,int position ,long id){
                int id1=(int)id;
                String name = parent.getItemAtPosition(position).toString();
                switch(name){
                    case "Area":



                        Intent area=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(area);



                        break;

                    case "Currency":
                        Intent currency=new Intent(MainActivity.this,Currency.class);
                        GlobalVars.setVar(name);
                        startActivity(currency);


                        break;

                    case "Data Transfer Rate":
                        Intent dtr=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(dtr);

                        break;

                    case "Digital Storage":
                        Intent ds=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(ds);

                        break;

                    case "Energy":
                        Intent energy=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(energy);

                        break;

                    case "Frequency":
                        Intent frequency=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(frequency);

                        break;

                    case "Fuel Economy":
                        Intent fe=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(fe);

                        break;

                    case "Length":
                        Intent length=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(length);

                        break;

                    case "Mass":
                        Intent mass=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(mass);

                        break;

                    case "Plane Angle":
                        Intent pa=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(pa);

                        break;

                    case "Pressure":
                        Intent pressure=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(pressure);

                        break;

                    case "Speed":
                        Intent speed=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(speed);

                        break;

                    case "Temperature":
                        Intent temperature=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(temperature);

                        break;

                    case "Time":
                        Intent time=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(time);

                        break;

                    case "Volume":
                        Intent volume=new Intent(MainActivity.this,ConverterActivity.class);
                        GlobalVars.setVar(name);
                        startActivity(volume);

                        break;
                }
            }

        });

    }




}
