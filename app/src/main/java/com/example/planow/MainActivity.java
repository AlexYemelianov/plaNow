package com.example.planow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {


    Button register, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText email = findViewById(R.id.email);
                String user_email = email.getText().toString();
                EditText password = findViewById(R.id.password);
                String user_password = password.getText().toString();


                Intent log = new Intent(MainActivity.this, ListsActivity.class);
                startActivity(log);


            }
        });
        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(register);
            }
        });
    }

}
