package com.example.android.kibirayni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {

    Button Chef, Customer, DeliveryPerson;
    Intent intent;
    String type;
    ConstraintLayout bgimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.bggg), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic1), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic2), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic3), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic4), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic5), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic6), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic7), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic10), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic12), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic16), 3000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(850);
        animationDrawable.setExitFadeDuration(1600);

        bgimage = findViewById(R.id.back3);
        bgimage.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();

        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        Chef = (Button) findViewById(R.id.chef);
        DeliveryPerson = (Button) findViewById(R.id.deliveryPerson);
        Customer = (Button) findViewById(R.id.customer);


        /* SETTING FUNCTIONALITY TO BUTTON */

        Chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("Email")){
                    Intent loginemail = new Intent(ChooseOne.this ,ChefLogin.class);
                    startActivity(loginemail);
                    finish();
                }
                 if(type.equals("Phone")){
                    Intent loginphone = new Intent(ChooseOne.this ,ChefLoginPhone.class);
                    startActivity(loginphone);
                    finish();
                }
                if (type.equals("SignUp")) {
                    Intent Register = new Intent(ChooseOne.this, ChefRegistration.class);
                    startActivity(Register);
                    finish();
                }

            }
        });

        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (type.equals("Email")) {
                    Intent loginemailcust = new Intent(ChooseOne.this, Login.class);
                    startActivity(loginemailcust);
                    finish();
                }
                if (type.equals("Phone")) {
                    Intent loginphonecust = new Intent(ChooseOne.this, LoginPhone.class);
                    startActivity(loginphonecust);
                    finish();
                }
                if (type.equals("SignUp")) {
                    Intent Registercust = new Intent(ChooseOne.this, Registration.class);
                    startActivity(Registercust);
                    finish();

                }
            }
        });

        DeliveryPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (type.equals("Email")) {
                    Intent loginemaildel = new Intent(ChooseOne.this, Delivery_Login.class);
                    startActivity(loginemaildel);
                    finish();
                }
                if (type.equals("Phone")) {
                    Intent loginphonedel = new Intent(ChooseOne.this, Delivery_LoginPhone.class);
                    startActivity(loginphonedel);
                    finish();
                }
                if (type.equals("SignUp")) {
                    Intent Registerdel = new Intent(ChooseOne.this, Delivery_Registration.class);
                    startActivity(Registerdel);
                    finish();

                }
            }
        });
    }
}