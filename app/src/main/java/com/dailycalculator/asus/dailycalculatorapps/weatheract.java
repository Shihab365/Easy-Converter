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

public class weatheract extends AppCompatActivity {

    public Spinner spinner1,spinner2;
    public String[] wetrName;
    public EditText edt1;
    public TextView resview;
    public Button btn1,btn2;
    Intent rateApp;
    public ShareActionProvider shareActionProvider;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weatheract);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edt1=(EditText) findViewById(R.id.editTxt1Id);
        resview=(TextView) findViewById(R.id.Txt2Id);
        btn1=(Button) findViewById(R.id.calcId);
        btn2=(Button) findViewById(R.id.resId);
        spinner1=(Spinner) findViewById(R.id.weatherspinner1id);
        spinner2=(Spinner) findViewById(R.id.weatherspinner2id);
        wetrName=getResources().getStringArray(R.array.weather_string);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.temp,R.id.textviewid,wetrName);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    DecimalFormat fort=new DecimalFormat("#.########");

                    String c1=edt1.getText().toString();
                    double d1=Double.parseDouble(c1);

                    String s1=String.valueOf(spinner1.getSelectedItem());
                    String s2=String.valueOf(spinner2.getSelectedItem());

                    if(s1.contentEquals("CELSIUS") && s2.contentEquals("FAHRENHEIT"))
                    {
                        double res=d1*1.8+32;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("FAHRENHEIT") && s2.contentEquals("CELSIUS"))
                    {
                        double res=(d1-32)*0.5556;
                        resview.setText(""+fort.format(res));
                    }

                }catch(Exception e)
                {
                    Toast.makeText(weatheract.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
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
            Intent ab=new Intent(weatheract.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
