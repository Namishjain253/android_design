package com.n2n.jcshop.activity.other;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.n2n.jcshop.R;
import com.n2n.jcshop.activity.merchant.MerchantDashboardActivity;
import com.n2n.jcshop.model.IntentAnimation;

public class LoginActivity extends AppCompatActivity {

    TextView newUserClick, forgotPasswordClick;
    Button login_click;
    IntentAnimation animation = new IntentAnimation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        click();
    }

    private void click() {
        newUserClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                animation.forwardAnimation(LoginActivity.this);
            }
        });
        forgotPasswordClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
                animation.forwardAnimation(LoginActivity.this);
            }
        });
        login_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(LoginActivity.this, MerchantDashboardActivity.class);
                startActivity(intent);
                animation.forwardAnimation(LoginActivity.this);
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        animation.backwardAnimation(LoginActivity.this);
    }

    private void init() {
        newUserClick = findViewById(R.id.newUserClick);
        forgotPasswordClick = findViewById(R.id.forgotPasswordClick);
        login_click = findViewById(R.id.login_click);
    }
}