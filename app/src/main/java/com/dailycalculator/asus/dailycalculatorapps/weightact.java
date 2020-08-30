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

public class weightact extends AppCompatActivity {

    public Spinner wetrspinner1,wetrspinner2;
    public String[] weightName;
    public TextView resview;
    public EditText edt1;
    public Button btn1,btn2;
    Intent rateApp;
    public ShareActionProvider shareActionProvider;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        wetrspinner1=(Spinner) findViewById(R.id.weatherspinner1id);
        wetrspinner2=(Spinner) findViewById(R.id.weatherspinner2id);
        resview=(TextView) findViewById(R.id.Txt2Id);
        btn1=(Button) findViewById(R.id.calcId);
        btn2=(Button) findViewById(R.id.resId);
        edt1=(EditText) findViewById(R.id.editTxt1Id);
        weightName=getResources().getStringArray(R.array.weight_string);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.temp,R.id.textviewid,weightName);
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

                    if(s1.contentEquals("GRAM") && s2.contentEquals("KILOGRAM"))
                    {
                        double res=d1*0.001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GRAM") && s2.contentEquals("MILLIGRAM"))
                    {
                        double res=d1*1000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GRAM") && s2.contentEquals("MICROGRAM"))
                    {
                        double res=d1*1000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GRAM") && s2.contentEquals("POUND"))
                    {
                        double res=d1*0.00220462;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GRAM") && s2.contentEquals("OUNCE"))
                    {
                        double res=d1*0.035274;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("GRAM") && s2.contentEquals("TONNE"))
                    {
                        double res=d1*0.0000011023;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("POUND") && s2.contentEquals("GRAM"))
                    {
                        double res=d1*453.592;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("POUND") && s2.contentEquals("MILLIGRAM"))
                    {
                        double res=d1*453592;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("POUND") && s2.contentEquals("KILOGRAM"))
                    {
                        double res=d1*0.453592;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("POUND") && s2.contentEquals("MICROGRAM"))
                    {
                        double res=d1*453600000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("POUND") && s2.contentEquals("TONNE"))
                    {
                        double res=d1*0.0005;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("POUND") && s2.contentEquals("OUNCE"))
                    {
                        double res=d1*16;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOGRAM") && s2.contentEquals("GRAM"))
                    {
                        double res=d1*1000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOGRAM") && s2.contentEquals("MILLIGRAM"))
                    {
                        double res=d1*1000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOGRAM") && s2.contentEquals("MICROGRAM"))
                    {
                        double res=d1*1000000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOGRAM") && s2.contentEquals("TONNE"))
                    {
                        double res=d1*0.00110231;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOGRAM") && s2.contentEquals("POUND"))
                    {
                        double res=d1*2.20462;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("KILOGRAM") && s2.contentEquals("OUNCE"))
                    {
                        double res=d1*35.274;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIGRAM") && s2.contentEquals("KILOGRAM"))
                    {
                        double res=d1*0.00000100001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIGRAM") && s2.contentEquals("GRAM"))
                    {
                        double res=d1*0.0010000168212;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIGRAM") && s2.contentEquals("MICROGRAM"))
                    {
                        double res=d1*1000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIGRAM") && s2.contentEquals("TONNE"))
                    {
                        double res=d1*0.00000000011023;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIGRAM") && s2.contentEquals("POUND"))
                    {
                        double res=d1*0.0000022046;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLIGRAM") && s2.contentEquals("OUNCE"))
                    {
                        double res=d1*0.000035274;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("TONNE") && s2.contentEquals("KILOGRAM"))
                    {
                        double res=d1*907.185;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("TONNE") && s2.contentEquals("GRAM"))
                    {
                        double res=d1*907185;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("TONNE") && s2.contentEquals("MILLIGRAM"))
                    {
                        double res=d1*907200000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("TONNE") && s2.contentEquals("MICROGRAM"))
                    {
                        double res=d1*907200000000.0;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("TONNE") && s2.contentEquals("POUND"))
                    {
                        double res=d1*2000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("TONNE") && s2.contentEquals("OUNCE"))
                    {
                        double res=d1*3200;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("OUNCE") && s2.contentEquals("KILOGRAM"))
                    {
                        double res=d1*0.0283495;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("OUNCE") && s2.contentEquals("GRAM"))
                    {
                        double res=d1*28.3495;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("OUNCE") && s2.contentEquals("MILLIGRAM"))
                    {
                        double res=d1*28349.5;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("OUNCE") && s2.contentEquals("MICROGRAM"))
                    {
                        double res=d1*28350000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("OUNCE") && s2.contentEquals("TONNE"))
                    {
                        double res=d1*0.00003125052;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("OUNCE") && s2.contentEquals("POUND"))
                    {
                        double res=d1*0.06250105133;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROGRAM") && s2.contentEquals("GRAM"))
                    {
                        double res=d1*0.000001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROGRAM") && s2.contentEquals("KILOGRAM"))
                    {
                        double res=d1*0.000000001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROGRAM") && s2.contentEquals("MILLIGRAM"))
                    {
                        double res=d1*0.001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROGRAM") && s2.contentEquals("TONNE"))
                    {
                        double res=d1*0.00000000001102;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROGRAM") && s2.contentEquals("POUND"))
                    {
                        double res=d1*0.000000002204;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MICROGRAM") && s2.contentEquals("OUNCE"))
                    {
                        double res=d1*0.000000003527;
                        resview.setText(""+fort.format(res));
                    }
                }catch(Exception e)
                {
                    Toast.makeText(weightact.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
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
            Intent ab=new Intent(weightact.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
