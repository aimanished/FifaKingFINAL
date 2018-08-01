package com.example.user.fifaking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Shooting extends AppCompatActivity {

    ArrayList<Fragment>al;
    MyFragmentPagerAdapter adapter;
    ViewPager vPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shooting);
        vPager = findViewById(R.id.vPager);
        FragmentManager fm = getSupportFragmentManager();
        al=new ArrayList<Fragment>();
        al.add(new Chips());
        al.add(new LongShots());
        adapter = new MyFragmentPagerAdapter(fm,al);
        vPager.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.swiper, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.Longshots:
                vPager.setCurrentItem(0,true);
                break;
            case R.id.Chips:
                vPager.setCurrentItem(2,true);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
