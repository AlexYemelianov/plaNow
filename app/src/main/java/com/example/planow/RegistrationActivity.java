package com.example.planow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    Button registreted;
    boolean check = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);

        registreted = (Button)findViewById(R.id.reg);
        registreted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText name = findViewById(R.id.name);
                String user_name = name.getText().toString();
                EditText email = findViewById(R.id.email);
                String user_email = email.getText().toString();
                EditText password = findViewById(R.id.password);
                String user_password = password.getText().toString();
                EditText repassword = findViewById(R.id.password);
                String user_repassword = password.getText().toString();



//                while (check){
//                    if (user_name.isEmpty() || user_email.isEmpty() || user_password.isEmpty() || user_repassword.isEmpty()) {
//                        Toast toast = Toast.makeText(getApplicationContext(),
//                                "Заповніть всі поля!", Toast.LENGTH_SHORT);
//                        toast.show();
//                    } else {
//                        check = false;
//                    }
//                    if(){
//                        Toast toast = Toast.makeText(getApplicationContext(),
//                                "Заповніть email!", Toast.LENGTH_SHORT);
//                        toast.show();
//                    } else {
//                        check = false;
//                    }
//                    if(user_email.isEmpty()){
//                        Toast toast = Toast.makeText(getApplicationContext(),
//                                "Заповніть email!", Toast.LENGTH_SHORT);
//                        toast.show();
//                    } else {
//                        check = false;
//                    }

//                }
                    Intent rege = new Intent(RegistrationActivity.this, MainActivity.class);

                    startActivity(rege);


            }
        });

    }

}
