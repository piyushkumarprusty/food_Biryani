package com.example.android.kibirayni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.common.annotation.KeepForSdkWithFieldsAndMethods;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;

public class ChefRegistration extends AppCompatActivity {
    String[] Odisha = {"Bhubaneswar" , "Balasore" , "Cuttack" , "Puri"};
    TextInputLayout Fname , Lname , Email , Pass , cpass , mobileno , houseno , area , pincode;
    Spinner Statespin , Cityspin;
    Button signup, Emaill , Phone;
    CountryCodePicker Cpp;
    FirebaseAuth FAuth;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    String fname,lname,emailid,password,confpassword,mobile,house,Area,Pincode,role="Chef",statee , cityy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_registration);

        Fname = findViewById(R.id.Firstname);
        Lname = findViewById(R.id.Lastname);
        Email = findViewById(R.id.Email);
        Pass = findViewById(R.id.Pwd);
        cpass = findViewById(R.id.Cpass);
        mobileno = findViewById(R.id.Mobileno);
        houseno = findViewById(R.id.houseNo);
        pincode = findViewById(R.id.PinCode);
        area = findViewById(R.id.Area);
        Statespin = findViewById(R.id.Statee);
        Cityspin = findViewById(R.id.Citys);
    }
}