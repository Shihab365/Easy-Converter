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

public class shapeact extends AppCompatActivity {

    public Spinner wetrspinner1,wetrspinner2;
    public String[] shapeName;
    public EditText edt1;
    public TextView resview;
    public Button btn1,btn2;
    Intent rateApp;
    public ShareActionProvider shareActionProvider;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapeact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        wetrspinner1=(Spinner) findViewById(R.id.weatherspinner1id);
        wetrspinner2=(Spinner) findViewById(R.id.weatherspinner2id);
        edt1=(EditText) findViewById(R.id.editTxt1Id);
        resview=(TextView) findViewById(R.id.Txt2Id);
        btn1=(Button) findViewById(R.id.calcId);
        btn2=(Button) findViewById(R.id.resId);
        shapeName=getResources().getStringArray(R.array.shape_string);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.temp,R.id.textviewid,shapeName);
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

                     if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE METRE"))
                     {
                         double res=d1*1000000;
                         resview.setText(""+fort.format(res));
                     }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.386102;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*10760000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*1550000000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE KILOMETRE") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*100;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.000001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.0000003861;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*10.7639;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE METRE") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*0.0001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*2.58999;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE METRE"))
                    {
                        double res=d1*2590000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*4014000000.0;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*258.999;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE MILE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*27880000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.01;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE METRE"))
                    {
                        double res=d1*10000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.00386;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*15500000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("HECTARE") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*107639;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.00000000064516;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE METRE"))
                    {
                        double res=d1*0.00064516;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.0000000002491;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE INCH") && s2.contentEquals("SQUARE FOOT"))
                    {
                        double res=d1*0.00694444;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE KILOMETRE"))
                    {
                        double res=d1*0.000000092903;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.00000003587;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("HECTARE"))
                    {
                        double res=d1*0.0000092903;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE INCH"))
                    {
                        double res=d1*144;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("SQUARE FOOT") && s2.contentEquals("SQUARE MILE"))
                    {
                        double res=d1*0.092903;
                        resview.setText(""+fort.format(res));
                    }
                }catch(Exception e)
                {
                    Toast.makeText(shapeact.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
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
            Intent ab=new Intent(shapeact.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
