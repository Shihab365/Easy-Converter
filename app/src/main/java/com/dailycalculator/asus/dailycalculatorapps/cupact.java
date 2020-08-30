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

public class cupact extends AppCompatActivity {

    public Spinner wetrspinner1,wetrspinner2;
    public String[] cupName;
    public EditText edt1;
    public TextView resview;
    public Button btn1,btn2;

    public ShareActionProvider shareActionProvider;
    Intent rateApp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        wetrspinner1=(Spinner) findViewById(R.id.weatherspinner1id);
        wetrspinner2=(Spinner) findViewById(R.id.weatherspinner2id);
        edt1=(EditText) findViewById(R.id.editTxt1Id);
        resview=findViewById(R.id.Txt2Id);
        btn1=(Button) findViewById(R.id.calcId);
        btn2=(Button) findViewById(R.id.resId);
        cupName=getResources().getStringArray(R.array.cup_string);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.temp,R.id.textviewid,cupName);
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

                    if(s1.contentEquals("LITRE") && s2.contentEquals("MILLILITRE"))
                    {
                        double res=d1*1000;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("LITRE") && s2.contentEquals("IMPERIAL GALLON"))
                    {
                        double res=d1*0.219969;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("LITRE") && s2.contentEquals("IMPERIAL CUP"))
                    {
                        double res=d1*3.51951;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("LITRE") && s2.contentEquals("CUBIC FOOT"))
                    {
                        double res=d1*0.0353147;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("LITRE") && s2.contentEquals("CUBIC INCH"))
                    {
                        double res=d1*61.0237;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL GALLON") && s2.contentEquals("LITRE"))
                    {
                        double res=d1*4.54609;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL GALLON") && s2.contentEquals("MILLILITRE"))
                    {
                        double res=d1*4546.09;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL GALLON") && s2.contentEquals("IMPERIAL CUP"))
                    {
                        double res=d1*16;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL GALLON") && s2.contentEquals("CUBIC FOOT"))
                    {
                        double res=d1*0.160544;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL GALLON") && s2.contentEquals("CUBIC INCH"))
                    {
                        double res=d1*277.419;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL CUP") && s2.contentEquals("LITRE"))
                    {
                        double res=d1*0.284131;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL CUP") && s2.contentEquals("MILLILITRE"))
                    {
                        double res=d1*284.131;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL CUP") && s2.contentEquals("IMPERIAL GALLON"))
                    {
                        double res=d1*0.0625;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL CUP") && s2.contentEquals("CUBIC FOOT"))
                    {
                        double res=d1*0.010034;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("IMPERIAL CUP") && s2.contentEquals("CUBIC INCH"))
                    {
                        double res=d1*17.3387;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC FOOT") && s2.contentEquals("LITRE"))
                    {
                        double res=d1*28.3168;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC FOOT") && s2.contentEquals("MILLILITRE"))
                    {
                        double res=d1*28316.8;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC FOOT") && s2.contentEquals("IMPERIAL GALLON"))
                    {
                        double res=d1*6.22884;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC FOOT") && s2.contentEquals("CUBIC INCH"))
                    {
                        double res=d1*99.6614;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC FOOT") && s2.contentEquals("IMPERIAL CUP"))
                    {
                        double res=d1*1728;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC INCH") && s2.contentEquals("LITRE"))
                    {
                        double res=d1*0.0163871;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC INCH") && s2.contentEquals("MILLILITRE"))
                    {
                        double res=d1*16.3871;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC INCH") && s2.contentEquals("IMPERIAL GALLON"))
                    {
                        double res=d1*0.00360465;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC INCH") && s2.contentEquals("CUBIC FOOT"))
                    {
                        double res=d1*0.000578704;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("CUBIC INCH") && s2.contentEquals("IMPERIAL CUP"))
                    {
                        double res=d1*0.0576744;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLILITRE") && s2.contentEquals("LITRE"))
                    {
                        double res=d1*0.001;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLILITRE") && s2.contentEquals("IMPERIAL GALLON"))
                    {
                        double res=d1*0.000219969;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLILITRE") && s2.contentEquals("IMPERIAL CUP"))
                    {
                        double res=d1*0.00351951;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLILITRE") && s2.contentEquals("CUBIC INCH"))
                    {
                        double res=d1*0.0610237;
                        resview.setText(""+fort.format(res));
                    }
                    if(s1.contentEquals("MILLILITRE") && s2.contentEquals("CUBIC FOOT"))
                    {
                        double res=d1*0.000035315;
                        resview.setText(""+fort.format(res));
                    }
                }catch(Exception e)
                {
                    Toast.makeText(cupact.this,"Please Fill The Box",Toast.LENGTH_SHORT).show();
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
            Intent ab=new Intent(cupact.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
