package com.testview.kevin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.testview.kevin.activity.BaseActivity;
import com.testview.kevin.activity.HidingScrollToolbar.HidingScrollToolbarActivity;
import com.testview.kevin.activity.activitylikedilog.Dilog;
import com.testview.kevin.activity.bottmonbar.BottomBarActivity;
import com.testview.kevin.activity.createqrcode.CreateQrcodeActivity;
import com.testview.kevin.activity.ondragActivity.OnDragActivity;
import com.testview.kevin.activity.ontoucher.OnTouchActivity;
import com.testview.kevin.activity.viewpagerfragemnt.MainActivity;
import com.testview.kevin.activity.zippicture.ZipPicActivity;

/**
 * Created by kevin.
 */
public class StartActivity extends BaseActivity implements View.OnClickListener {
    private Button viewpager;
    private Button ondrag;
    private Button ondrags;
    private Button createqr;
    private Button takepic;
    private Button pic;
    private Button onTouch;
    private Button bottome;


    ////
    //  private ExplosionField mExplosionField;

    /////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        initview();
        addlistener();
    }

    private void initview() {
        viewpager = (Button) findViewById(R.id.viewpager);
        ondrag = (Button) findViewById(R.id.ondrag);
        ondrags = (Button) findViewById(R.id.ondrags);
        createqr = (Button) findViewById(R.id.createqr);
        takepic = (Button) findViewById(R.id.takepic);
        pic = (Button) findViewById(R.id.pic);
        onTouch = (Button) findViewById(R.id.onTouch);
        bottome = (Button) findViewById(R.id.bottome);

    }

    private void addlistener() {
        viewpager.setOnClickListener(this);
        ondrag.setOnClickListener(this);
        ondrags.setOnClickListener(this);
        createqr.setOnClickListener(this);
        takepic.setOnClickListener(this);
        pic.setOnClickListener(this);
        onTouch.setOnClickListener(this);
        bottome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.viewpager:
                startActivity(new Intent(StartActivity.this, MainActivity.class));
                break;
            case R.id.ondrag:
                startActivity(new Intent(StartActivity.this, HidingScrollToolbarActivity.class));
                break;
            case R.id.ondrags:
                startActivity(new Intent(StartActivity.this, OnDragActivity.class));
                break;
            case R.id.createqr:
                startActivity(new Intent(StartActivity.this, CreateQrcodeActivity.class));
                break;
            case R.id.takepic:
                startActivity(new Intent(StartActivity.this, ZipPicActivity.class));
                break;
            case R.id.pic:
                startActivity(new Intent(StartActivity.this, Dilog.class));
                break;
            case R.id.onTouch:
                startActivity(new Intent(StartActivity.this, OnTouchActivity.class));
                break;
            case R.id.bottome:
                startActivity(new Intent(StartActivity.this, BottomBarActivity.class));
                break;
            default:
                break;
        }
    }
}
