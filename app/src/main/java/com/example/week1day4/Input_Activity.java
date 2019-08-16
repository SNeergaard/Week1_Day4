package com.example.week1day4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Input_Activity extends AppCompatActivity {
    public static final int MAIN_CODE = 344;
    private EditText etFN;
    private EditText etLN;
    private EditText etSA;
    private EditText etCity;
    private EditText etSt;
    private EditText etZip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_);

        etFN = findViewById(R.id.etFN);
        etLN = findViewById(R.id.etLN);
        etSA = findViewById(R.id.etSA);
        etCity = findViewById(R.id.etCity);
        etSt = findViewById(R.id.etSt);
        etZip = findViewById(R.id.etZip);

    }

    public void input_bundle(View view) {
        switch (view.getId()) {
            case R.id.btnInput:
                final String firstNameInput = etFN.getText().toString();
                final String LastNameInput = etLN.getText().toString();
                final String StreetAddressInput = etSA.getText().toString();
                final String CityNameInput = etCity.getText().toString();
                final String StateNameInput = etSt.getText().toString();
                final String ZipCodeNameInput = etZip.getText().toString();
                final Mailing_Info mailingInfo = new Mailing_Info(firstNameInput, LastNameInput, StreetAddressInput, CityNameInput, StateNameInput, ZipCodeNameInput);
                Intent expicitIntent = new Intent(this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("mailingInfo", mailingInfo);
                expicitIntent.putExtras(bundle);
                //setResult(MAIN_CODE, expicitIntent);
                startActivity(expicitIntent);
                finish();


        }

    }

}
