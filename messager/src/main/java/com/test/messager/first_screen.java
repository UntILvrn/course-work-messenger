package com.test.messager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class first_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);

        Button register = (Button) findViewById(R.id.email_sign_in_button);
        final EditText login = (EditText) findViewById(R.id.login) ;

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_screen.this, Friend_activity.class);
                intent.putExtra("login", login.getText().toString());
                startActivity(intent);

            }
        });
    }
}
