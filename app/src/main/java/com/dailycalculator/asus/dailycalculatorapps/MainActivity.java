package com.dailycalculator.asus.dailycalculatorapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    Intent rateApp;
    InterstitialAd interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,interstitialAd6;
    public Button weatherbutton,weightbutton,speedbutton,shapebutton,distancebutton,cupbutton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherbutton=(Button) findViewById(R.id.weatherid);
        weightbutton=(Button) findViewById(R.id.weightid);
        speedbutton=(Button) findViewById(R.id.speedid);
        shapebutton=(Button) findViewById(R.id.shapeid);
        distancebutton=(Button) findViewById(R.id.distanceid);
        cupbutton=(Button) findViewById(R.id.cupid);

        interstitialAd1=new InterstitialAd(this);
        interstitialAd1.setAdUnitId("ca-app-pub-1818607113375588/2200185640");
        interstitialAd1.loadAd(new AdRequest.Builder().build());
        interstitialAd1.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,weatheract.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd2=new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-1818607113375588/5875583069");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,weightact.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd3=new InterstitialAd(this);
        interstitialAd3.setAdUnitId("ca-app-pub-1818607113375588/4563744660");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,speedact.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd4=new InterstitialAd(this);
        interstitialAd4.setAdUnitId("ca-app-pub-1818607113375588/5464519526");
        interstitialAd4.loadAd(new AdRequest.Builder().build());
        interstitialAd4.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,shapeact.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd5=new InterstitialAd(this);
        interstitialAd5.setAdUnitId("ca-app-pub-1818607113375588/3797457909");
        interstitialAd5.loadAd(new AdRequest.Builder().build());
        interstitialAd5.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,distanceact.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd6=new InterstitialAd(this);
        interstitialAd6.setAdUnitId("ca-app-pub-1818607113375588/1909661165");
        interstitialAd6.loadAd(new AdRequest.Builder().build());
        interstitialAd6.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,cupact.class);
                                              startActivity(intent);
                                          }
                                      }
        );

        weatherbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.weatherid)
                {
                    if(interstitialAd1.isLoaded())
                    {
                        interstitialAd1.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,weatheract.class);
                        startActivity(intent);
                        interstitialAd1.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        weightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.weightid)
                {
                    if(interstitialAd2.isLoaded())
                    {
                        interstitialAd2.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,weightact.class);
                        startActivity(intent);
                        interstitialAd2.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        speedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.speedid)
                {
                    if(interstitialAd3.isLoaded())
                    {
                        interstitialAd3.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,speedact.class);
                        startActivity(intent);
                        interstitialAd3.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        shapebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.shapeid)
                {
                    if(interstitialAd4.isLoaded())
                    {
                        interstitialAd4.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,shapeact.class);
                        startActivity(intent);
                        interstitialAd4.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        distancebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.distanceid)
                {
                    if(interstitialAd5.isLoaded())
                    {
                        interstitialAd5.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,distanceact.class);
                        startActivity(intent);
                        interstitialAd5.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        cupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.cupid)
                {
                    if(interstitialAd6.isLoaded())
                    {
                        interstitialAd6.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,cupact.class);
                        startActivity(intent);
                        interstitialAd6.loadAd(new AdRequest.Builder().build());
                    }
                }
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
            Intent ab=new Intent(MainActivity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
