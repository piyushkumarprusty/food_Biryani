package com.example.android.kibirayni;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] Odisha = {"Bhubaneswar" , "Balasore" , "Cuttack" , "Puri"};
        TextInputLayout Fname , Lname , Email , Pass , cpass , mobileno , houseno , area , pincode;
        Spinner Statespin , Cityspin;
        Button signup, Emaill , Phone;
        CountryCodePicker Cpp;
        FirebaseAuth FAuth;
        DatabaseReference databaseReference;
        FirebaseDatabase firebaseDatabase;
        String fname,lname,emailid,password,confpassword,mobile,house,Area,Pincode,role="Chef",statee , cityy;

        imageView =  findViewById(R.id.imageView);
        textView =  findViewById(R.id.textView7);

        imageView.animate().alpha(0f).setDuration(0);
        textView.animate().alpha(0f).setDuration(0);

        imageView.animate().alpha(1f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                textView.animate().alpha(1f).setDuration(800);
            }
        });


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this , MainMenu.class);
                startActivity(intent);
            }
        }, 3000);


    }
}