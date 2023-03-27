package com.example.rekisterointi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AskInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_information);
    }

    public void addUser(View view) {

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        EditText fName = findViewById(R.id.TextFirstName);
        EditText lName = findViewById(R.id.TextLastName);
        EditText email = findViewById(R.id.TextEmailAddress);

        String fName2 = fName.getText().toString();
        String lName2 = lName.getText().toString();
        String email2 = email.getText().toString();

        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.RadioButtonTite:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Tietotekniikka"));
                break;
            case R.id.RadioButtonTuta:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Tuotantotalous"));
                break;
            case R.id.RadioButtonLate:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Laskennallinen tekniikka"));
                break;
            case R.id.RadioButtonSate:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Sähkötekniikka"));
                break;
        }
    }
}