package com.example.android.kibirayni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.common.annotation.KeepForSdkWithFieldsAndMethods;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;

import java.util.ArrayList;

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

        signup = findViewById(R.id.Signup);
        Emaill = findViewById(R.id.email);
        Phone = findViewById(R.id.phone);

        Cpp= findViewById(R.id.countrycode);

        Statespin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Object value = parent.getItemAtPosition(position);
                statee = value.toString().trim();

                if(statee.equals("Odisha")){
                    ArrayList<String> list = new ArrayList<>();
                    for (String cities : Odisha){
                        list.add(cities);

                    }
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ChefRegistration.this, android.R.layout.simple_spinner_item,list);
                    Cityspin.setAdapter(arrayAdapter);
                }
            }
        });
        /* Firebase automatiocally create parent as "Chef" in which the data of chef is going to store */

        databaseReference = firebaseDatabase.getInstance().getReference("Chef");

        FAuth = FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname = Fname.getEditText().getText().toString().trim();
                lname = Lname.getEditText().getText().toString().trim();
                emailid = Email.getEditText().getText().toString().trim();
                mobile = mobileno.getEditText().getText().toString().trim();
                password = Pass.getEditText().getText().toString().trim();
                confpassword = cpass.getEditText().getText().toString().trim();
                Area = area.getEditText().getText().toString().trim();
                house = houseno.getEditText().getText().toString().trim();
                Pincode = pincode.getEditText().getText().toString().trim();
            }
        });
    }
}