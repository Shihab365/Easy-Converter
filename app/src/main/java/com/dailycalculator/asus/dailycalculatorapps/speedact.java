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

import java.text.DecimalFormat;

public class speedact extends AppCompatActivity {

    public Spinner wetrspinner1,wetrspinner2;
    public String[] speedName;
    public TextView resview;
    public Button btn1,btn2;
    public EditText edt1;
    Intent rateApp;
    public ShareActionProvider shareActionProvider;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speedact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        wetrspinner1=(Spinner) findViewById(R.id.weatherspinner1id);
        wetrspinner2=(Spinner) findViewById(R.id.weatherspinner2id);
        edt1=(EditText) findViewById(R.id.editTxt1Id);
        btn1=(Button) findViewById(R.id.calcId);
        btn2=(Button) findViewById(R.id.resId);
        resview=(TextView) findViewById(R.id.Txt2Id);
        speedName=getResources().getStringArray(R.array.speed_string);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.temp,R.id.textviewid,speedName);
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

                    if(s1.contentEquals("MILES PER HOUR") && s2.contentEquals("FOOT PER SECOND"))
                    {
                        double res=d1*1.46667;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILES PER HOUR") && s2.contentEquals("METRE PER SECOND"))
                    {
                        double res=d1*0.44704;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILES PER HOUR") && s2.contentEquals("KILOMETRE PER HOUR"))
                    {
                        double res=d1*1.60934;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT PER SECOND") && s2.contentEquals("MILES PER HOUR"))
                    {
                        double res=d1*0.681818;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT PER SECOND") && s2.contentEquals("METRE PER SECOND"))
                    {
                        double res=d1*0.3048;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FOOT PER SECOND") && s2.contentEquals("KILOMETRE PER HOUR"))
                    {
                        double res=d1*1.09728;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE PER SECOND") && s2.contentEquals("MILES PER HOUR"))
                    {
                        double res=d1*2.23694;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE PER SECOND") && s2.contentEquals("FOOT PER SECOND"))
                    {
                        double res=d1*3.28084;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("METRE PER SECOND") && s2.contentEquals("KILOMETRE PER HOUR"))
                    {
                        double res=d1*3.6;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE PER HOUR") && s2.contentEquals("MILES PER HOUR"))
                    {
                        double res=d1*0.621371;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE PER HOUR") && s2.contentEquals("METRE PER SECOND"))
                    {
                        double res=d1*0.277778;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOMETRE PER HOUR") && s2.contentEquals("FOOT PER SECOND"))
                    {
                        double res=d1*0.911344;
                        resview.setText(""+fort.format(res));
                    }
                }catch(Exception e)
                {
                    Toast.makeText(speedact.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
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
            Intent ab=new Intent(speedact.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
