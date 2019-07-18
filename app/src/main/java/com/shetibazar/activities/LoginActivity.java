package com.shetibazar.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.shetibazar.R;

public class LoginActivity extends AppCompatActivity implements OnClickListener {

    private Context mContext;
    private TextView btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mContext = LoginActivity.this;
        getIds();
    }

    private void getIds() {
        btn_register = (TextView) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_register:
                Intent splashIntent = new Intent(mContext, RegistrationActivity.class);
                startActivity(splashIntent);
                break;
        }
    }
}
