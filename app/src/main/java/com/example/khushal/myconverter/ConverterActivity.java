package com.example.khushal.myconverter;

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

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConverterActivity extends AppCompatActivity {

    String [] areaoptions={"Square kilometer","Square metere","Square mile","Square Yard","Square Foot","Square Inch","Hactare","Acre"};
    String [] datatransferoptions={"Bit per Second","Kilobit per second","Kilobyte per second","Kibibit per second","Megabit per second","Megabyte per second","Mebibit per second","Gigabit per second","Gigabyte per second","Gibibit per second"};
    String [] digitalstorageoptions={"Bit","Byte","Kilobit","KiloByte","KibiBit","KibiByte","MegaBit","Megabyte","MebiBit","MebiByte","GigaBit","GigaByte","GibiBit","GibiByte","TeraBit","TeraByte","TebiBit","TebiByte","PetaBit","PetaByte","PebiBit","PebiByte"};
    String [] energyoptions={"Joule","KiloJoule","Gram Calorie","KiloCalorie","Watt Hour","KiloWatt Hour","Electronvolt","British thermal unit","US-therm","Foot-pound"};
    String [] freqoptions={"Hertz","KiloHertz","MegaHertz","GigaHertz"};
    String [] fueleconomyoptions={"US Miles per Gallon","Miles per Gallon(imperial)","Kilometre Per Litre","Litre per 100 Kilometres"};
    String [] lengthoptions={"Metre","Kilometre","Centimetre","Millimetre","Micrometre","Nanometre","Mile","Yard","Foot","Inch","Nautical-Mile"};
    String [] massoptions={"Tonne","Kilogram","Gram","Milligram","Microgram","Imperial Ton","US ton","Stone","Pound","Ounce"};
    String [] planeangleoptins={"Degree","Gradian","Milliradian","Minute of arc","Radian","Second of arc"};
    String [] pressureoptins={"Atmosphere","Bar","Pascal","Pound Force per Square inch","Torr"};
    String [] speedoptins={"Miles per hour","Foot per second","Metre per second","Kilometre per hour","Knot"};
    String [] tempoptions={"Celsius","Fahrenheit","Kelvin"};
    String [] timeoptions={"Nano second","Micro second","Milli second","Second","Minute","Hour","Day","Week","Month","Year","Decade","Century"};
    String [] volumeoptions={"Milliliter (ml)","Liter (L)","Cubic meter (m3)","Cubic inch (in3)","Cubic foot/feet (ft3)","Pint (pt) [US liquid]","Quart (qt) [US liquid]","Gallon (gal) [US liquid]","Barrel (bbl) [US liquid]"};
    Spinner sp;
    Spinner sp1;
    Button button;
    EditText edit;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        String pos=GlobalVars.getVar();
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

        edit.setFocusable(false);
        edit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                edit.setFocusableInTouchMode(true);

                return false;
            }
        });

        textView=(TextView)findViewById(R.id.textView);

        switch (pos){
            case "Area":
                ArrayAdapter<String> ardp=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,areaoptions);
                ardp.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp);
                sp1.setAdapter(ardp);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getArea(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });



                break;



            case "Data Transfer Rate":
                ArrayAdapter<String> ardp2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datatransferoptions);
                ardp2.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp2);
                sp1.setAdapter(ardp2);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getDtr(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;

            case "Digital Storage":
                ArrayAdapter<String> ardp3=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,digitalstorageoptions);
                ardp3.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp3);
                sp1.setAdapter(ardp3);


                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getDs(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });


                break;

            case "Energy":
                ArrayAdapter<String> ardp4=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,energyoptions);
                ardp4.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp4);
                sp1.setAdapter(ardp4);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getEnergy(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;

            case "Frequency":
                ArrayAdapter<String> ardp5=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,freqoptions);
                ardp5.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp5);
                sp1.setAdapter(ardp5);

                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        int i = sp.getSelectedItemPosition();
                        int j = sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getFreq(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });


                break;

            case "Fuel Economy":
                ArrayAdapter<String> ardp6=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,fueleconomyoptions);
                ardp6.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp6);
                sp1.setAdapter(ardp6);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getFe(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;

            case "Length":
                ArrayAdapter<String> ardp7=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lengthoptions);
                ardp7.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp7);
                sp1.setAdapter(ardp7);

                button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {

                    int i = sp.getSelectedItemPosition();
                    int j = sp1.getSelectedItemPosition();
                    if (edit.getText().toString().equals(""))
                    {
                        Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                    }
                    else {
                        double d = Double.parseDouble(edit.getText().toString());
                        double d1 = GlobalVars.getLength(i, j);
                        double ans = d * d1;
                        DecimalFormat df = new DecimalFormat("#.###############");
                        String answer = df.format(ans);
                        textView.setText(answer);
                    }

                }
                });


                break;

            case "Mass":
                ArrayAdapter<String> ardp8=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,massoptions);
                ardp8.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp8);
                sp1.setAdapter(ardp8);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getMass(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;

            case "Plane Angle":
                ArrayAdapter<String> ardp9=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,planeangleoptins);
                ardp9.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp9);
                sp1.setAdapter(ardp9);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getPa(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;

            case "Pressure":
                ArrayAdapter<String> ardp10=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pressureoptins);
                ardp10.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp10);
                sp1.setAdapter(ardp10);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getPressure(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;

            case "Speed":
                ArrayAdapter<String> ardp11=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,speedoptins);
                ardp11.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp11);
                sp1.setAdapter(ardp11);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            textView.setText(null);
                            Toast.makeText(ConverterActivity.this,"Null value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getSpeed(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;


            case "Temperature":
                ArrayAdapter<String> ardp12=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,tempoptions);
                ardp12.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp12);
                sp1.setAdapter(ardp12);

                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        if(sp.getSelectedItem().equals("Celsius"))
                        {
                            if(sp1.getSelectedItem().equals("Celsius"))
                            {
                                textView.setText(edit.getText().toString());
                            }
                            else if(sp1.getSelectedItem().equals("Fahrenheit"))
                            {
                                double d = Double.parseDouble(edit.getText().toString());
                                double ans=((d*9)/5)+32;
                                DecimalFormat df = new DecimalFormat("#.###############");
                                String answer = df.format(ans);
                                textView.setText(answer);
                            }
                            else
                            {
                                double d = Double.parseDouble(edit.getText().toString());
                                double ans=d+273.15;
                                DecimalFormat df = new DecimalFormat("#.###############");
                                String answer = df.format(ans);
                                textView.setText(answer);
                            }
                        }

                        else if(sp.getSelectedItem().equals("Fahrenheit"))
                        {
                            if (sp1.getSelectedItem().equals("Celsius"))
                            {
                                double d = Double.parseDouble(edit.getText().toString());
                                double ans=((d-32)*5)/9;
                                DecimalFormat df = new DecimalFormat("#.###############");
                                String answer = df.format(ans);
                                textView.setText(answer);

                            }
                            else if (sp1.getSelectedItem().equals("Fahrenheit"))
                            {
                                textView.setText(edit.getText().toString());
                            }
                            else
                            {
                                double d = Double.parseDouble(edit.getText().toString());
                                double ans=((d-32)*(5/9))+273.15;
                                DecimalFormat df = new DecimalFormat("#.###############");
                                String answer = df.format(ans);
                                textView.setText(answer);

                            }
                        }

                        else
                        {
                            if(sp1.getSelectedItem().equals("Celsius"))
                            {
                                double d = Double.parseDouble(edit.getText().toString());
                                double ans=d-273.15;
                                DecimalFormat df = new DecimalFormat("#.###############");
                                String answer = df.format(ans);
                                textView.setText(answer);
                            }
                            else if(sp1.getSelectedItem().equals("Fahrenheit"))
                            {
                                double d = Double.parseDouble(edit.getText().toString());
                                double ans=(((d-273.15)*9)/5)+32;
                                DecimalFormat df = new DecimalFormat("#.###############");
                                String answer = df.format(ans);
                                textView.setText(answer);
                            }
                            else
                            {
                                textView.setText(edit.getText().toString());
                            }
                        }

                    }
                });

                break;

            case "Time":
                ArrayAdapter<String> ardp13=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,timeoptions);
                ardp13.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp13);
                sp1.setAdapter(ardp13);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getTime(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;


            case "Volume":
                ArrayAdapter<String> ardp14=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,volumeoptions);
                ardp14.setDropDownViewResource(R.layout.drop_down_layout);

                sp.setAdapter(ardp14);
                sp1.setAdapter(ardp14);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        int i=sp.getSelectedItemPosition();
                        int j=sp1.getSelectedItemPosition();
                        if (edit.getText().toString().equals(""))
                        {
                            Toast.makeText(ConverterActivity.this,"Null Value is not allowed",Toast.LENGTH_LONG).show();
                        }
                        else {
                            double d = Double.parseDouble(edit.getText().toString());
                            double d1 = GlobalVars.getVolume(i, j);
                            double ans = d * d1;
                            DecimalFormat df = new DecimalFormat("#.###############");
                            String answer = df.format(ans);
                            textView.setText(answer);
                        }
                    }
                });

                break;



        }
    }
}
