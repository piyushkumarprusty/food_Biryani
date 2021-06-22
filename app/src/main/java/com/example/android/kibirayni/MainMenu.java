package com.example.android.kibirayni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {
    Button signinemail, signinphone, signup;
    ImageView bgimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Animation effect for background
        final Animation zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        final Animation zoomOut = AnimationUtils.loadAnimation(this, R.anim.zoomout);

        bgimage = findViewById(R.id.back2);
        bgimage.setAnimation(zoomIn);
        bgimage.setAnimation(zoomOut);

        zoomOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bgimage.setAnimation(zoomIn);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        zoomIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bgimage.setAnimation(zoomOut);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        signinemail = findViewById(R.id.SignwithEmail);
        signinphone = findViewById(R.id.SignwithPhone);
        signup = findViewById(R.id.Signup);

        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signemail = new Intent(MainMenu.this, ChooseOne.class);
                signemail.putExtra("Home", "Email");
                startActivity(signemail);
                finish();
            }
        });

        signinphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signephone = new Intent(MainMenu.this, ChooseOne.class);
                signephone.putExtra("Home", "Phone");
                startActivity(signephone);
                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainMenu.this, ChooseOne.class);
                signup.putExtra("Home", "SignUp");
                startActivity(signup);
                finish();
            }
        });




    }
// To destroy the activity

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.gc();
    }

}