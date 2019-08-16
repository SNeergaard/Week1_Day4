package com.example.week1day4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int INPUT_CODE = 344;
    private TextView tvFN;
    private TextView tvLN;
    private TextView tvSA;
    private TextView tvCity;
    private TextView tvSt;
    private TextView tvZip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFN = findViewById(R.id.tvFN);
        tvLN = findViewById(R.id.tvLN);
        tvSA = findViewById(R.id.tvSA);
        tvCity = findViewById(R.id.tvCity);
        tvSt = findViewById(R.id.tvSt);
        tvZip = findViewById(R.id.tvZip);


        try{

            //create contextual intent and then pull the bundle off of the intent if possible
            Intent passedIntent = getIntent();
            Bundle passedBundle = passedIntent.getExtras();
            Mailing_Info passed = passedBundle.getParcelable("mailingInfo");

            //Binding to views

            tvFN.setText(passed.getFirst_Name());
            tvLN.setText(passed.getLast_Name());
            tvSA.setText(passed.getStreet_Address());
            tvCity.setText(passed.getCity());
            tvSt.setText(passed.getState());
            tvZip.setText(passed.getZip());


        }catch(Exception e){

        }

        //create a null check to find if the bundle has the package to populate

    }

    public void main_bundle(View view) {
        switch (view.getId()) {
            case R.id.btnMain:
                Intent explicitIntent = new Intent(this, Input_Activity.class);
                startActivityForResult(explicitIntent ,INPUT_CODE);
        }
    }
}
