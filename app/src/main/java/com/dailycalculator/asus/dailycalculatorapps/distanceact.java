package com.dailycalculator.asus.dailycalculatorapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class distanceact extends AppCompatActivity {

    public Spinner wetrspinner1,wetrspinner2;
    public String[] distName;
    public EditText edt1;
    public TextView resview;
    public Button btn1,btn2;
    Intent rateApp;
    public ShareActionProvider shareActionProvider;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distanceact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        wetrspinner1=(Spinner) findViewById(R.id.weatherspinner1id);
        wetrspinner2=(Spinner) findViewById(R.id.weatherspinner2id);
        edt1=(EditText) findViewById(R.id.editTxt1Id);
        resview=(TextView) findViewById(R.id.Txt2Id);
        btn1=(Button) findViewById(R.id.calcId);
        btn2=(Button) findViewById(R.id.resId);
        distName=getResources().getStringArray(R.array.distance_string);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.temp,R.id.textviewid,distName);
        wetrspinner1.setAdapter(adapter);
        wetrspinner2.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    DecimalFormat fort=new DecimalFormat("#.########");
                    String c1=edt1.getText().toString();
                    double d1=Double.parseDouble(c1);
                    String s1=String.valueOf(wetrspinner1.getSelectedItem());
                    String s2=String.valueOf(wetrspinner2.getSelectedItem());

                    if(s1.contentEquals("METRE") && s2.contentEquals("KILOMETRE"))
                    {
                        double res=d1*0.001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE") && s2.contentEquals("CENTIMETRE"))
                    {
                        double res=d1*100;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE") && s2.contentEquals("MILLIMETRE"))
                    {
                        double res=d1*1000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE") && s2.contentEquals("MICROMETRE"))
                    {
                        double res=d1*1000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE") && s2.contentEquals("MILE"))
                    {
                        double res=d1*0.000621371;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE") && s2.contentEquals("FOOT"))
                    {
                        double res=d1*3.28084;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE") && s2.contentEquals("INCH"))
                    {
                        double res=d1*39.3701;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE") && s2.contentEquals("METRE"))
                    {
                        double res=d1*1000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE") && s2.contentEquals("CENTIMETRE"))
                    {
                        double res=d1*100000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE") && s2.contentEquals("MILLIMETRE"))
                    {
                        double res=d1*1000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE") && s2.contentEquals("MICROMETRE"))
                    {
                        double res=d1*1000000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE") && s2.contentEquals("MILE"))
                    {
                        double res=d1*0.621371;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE") && s2.contentEquals("FOOT"))
                    {
                        double res=d1*3280.84;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE") && s2.contentEquals("INCH"))
                    {
                        double res=d1*39370.1;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CENTIMETRE") && s2.contentEquals("KILOMETRE"))
                    {
                        double res=d1*0.00001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CENTIMETRE") && s2.contentEquals("METRE"))
                    {
                        double res=d1*0.01;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CENTIMETRE") && s2.contentEquals("MILLIMETRE"))
                    {
                        double res=d1*10;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CENTIMETRE") && s2.contentEquals("MICROMETRE"))
                    {
                        double res=d1*100000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CENTIMETRE") && s2.contentEquals("MILE"))
                    {
                        double res=d1*0.0000062137;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CENTIMETRE") && s2.contentEquals("FOOT"))
                    {
                        double res=d1*0.0328084;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CENTIMETRE") && s2.contentEquals("INCH"))
                    {
                        double res=d1*0.393701;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIMETRE") && s2.contentEquals("KILOMETRE"))
                    {
                        double res=d1*0.000001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIMETRE") && s2.contentEquals("METRE"))
                    {
                        double res=d1*0.001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIMETRE") && s2.contentEquals("MICROMETRE"))
                    {
                        double res=d1*1000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIMETRE") && s2.contentEquals("MILE"))
                    {
                        double res=d1*0.0062137;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIMETRE") && s2.contentEquals("FOOT"))
                    {
                        double res=d1*0.00328084;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIMETRE") && s2.contentEquals("INCH"))
                    {
                        double res=d1*0.0393701;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIMETRE") && s2.contentEquals("CENTIMETRE"))
                    {
                        double res=d1*0.1;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROMETRE") && s2.contentEquals("KILOMETRE"))
                    {
                        double res=d1*0.000000001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROMETRE") && s2.contentEquals("METRE"))
                    {
                        double res=d1*0.000001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROMETRE") && s2.contentEquals("MILLIMETRE"))
                    {
                        double res=d1*0.001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROMETRE") && s2.contentEquals("MILE"))
                    {
                        double res=d1*0.0000062137;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROMETRE") && s2.contentEquals("FOOT"))
                    {
                        double res=d1*0.0000032808;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROMETRE") && s2.contentEquals("INCH"))
                    {
                        double res=d1*0.00003937;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROMETRE") && s2.contentEquals("CENTIMETRE"))
                    {
                        double res=d1*0.0001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILE") && s2.contentEquals("KILOMETRE"))
                    {
                        double res=d1*1.60934;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILE") && s2.contentEquals("METRE"))
                    {
                        double res=d1*1609.34;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILE") && s2.contentEquals("MILLIMETRE"))
                    {
                        double res=d1*1609000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILE") && s2.contentEquals("MICROMETRE"))
                    {
                        double res=d1*1609000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILE") && s2.contentEquals("CENTIMETRE"))
                    {
                        double res=d1*160934;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILE") && s2.contentEquals("INCH"))
                    {
                        double res=d1*63360;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILE") && s2.contentEquals("FOOT"))
                    {
                        double res=d1*5280;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT") && s2.contentEquals("METRE"))
                    {
                        double res=d1*0.3048;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT") && s2.contentEquals("KILOMETRE"))
                    {
                        double res=d1*0.0003048;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT") && s2.contentEquals("MILLIMETRE"))
                    {
                        double res=d1*304.8;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT") && s2.contentEquals("MICROMETRE"))
                    {
                        double res=d1*304800;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT") && s2.contentEquals("CENTIMETRE"))
                    {
                        double res=d1*30.48;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT") && s2.contentEquals("MILE"))
                    {
                        double res=d1*0.000189394;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT") && s2.contentEquals("INCH"))
                    {
                        double res=d1*12;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("INCH") && s2.contentEquals("KILOMETRE"))
                    {
                        double res=d1*0.0000254;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("INCH") && s2.contentEquals("METRE"))
                    {
                        double res=d1*0.0254;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("INCH") && s2.contentEquals("MILLIMETRE"))
                    {
                        double res=d1*25.4;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("INCH") && s2.contentEquals("MICROMETRE"))
                    {
                        double res=d1*25400.27;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("INCH") && s2.contentEquals("CENTIMETRE"))
                    {
                        double res=d1*2.54;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("INCH") && s2.contentEquals("FOOT"))
                    {
                        double res=d1*0.08333424;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("INCH") && s2.contentEquals("MILE"))
                    {
                        double res=d1*0.000015783;
                        resview.setText(""+fort.format(res));
                    }
                }catch(Exception e)
                {
                    Toast.makeText(distanceact.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                resview.setText("");
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.shareid)
        {
            Intent i=new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT,"My new app https://play.google.com");
            startActivity(Intent.createChooser(i,"Share Via"));
            return true;
        }
        if(item.getItemId()==R.id.feedbackid)
        {
            rateApp.setData(Uri.parse("https://play.google.com"));
            startActivity(rateApp);
            return true;
        }
        if(item.getItemId()==R.id.aboutid)
        {
            Intent ab=new Intent(distanceact.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
