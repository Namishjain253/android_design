package com.n2n.jcshop.activity.other;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.n2n.jcshop.R;
import com.n2n.jcshop.model.IntentAnimation;

public class SignUpActivity extends AppCompatActivity {

    TextView oldUserClick;
    IntentAnimation animation = new IntentAnimation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        init();
        click();
    }

    private void click() {
        oldUserClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
                animation.forwardAnimation(SignUpActivity.this);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        animation.backwardAnimation(SignUpActivity.this);
    }

    @Override
    public void finish() {
        super.finish();
        animation.backwardAnimation(SignUpActivity.this);
    }

    private void init() {
        oldUserClick = findViewById(R.id.oldUserClick);
    }
}