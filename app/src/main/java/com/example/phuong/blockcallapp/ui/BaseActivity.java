package com.example.phuong.blockcallapp.ui;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * Created by phuong on 03/02/2017.
 */
@EActivity
public abstract class BaseActivity extends AppCompatActivity {
    @AfterViews
    public abstract void inits();

}
