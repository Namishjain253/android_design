package com.n2n.jcshop.activity.other;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.n2n.jcshop.R;
import com.n2n.jcshop.model.IntentAnimation;

public class ForgotPasswordActivity extends AppCompatActivity {

    ImageView backPress;
    IntentAnimation animation = new IntentAnimation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        init();
        click();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        animation.backwardAnimation(ForgotPasswordActivity.this);
    }

    @Override
    public void finish() {
        super.finish();
        animation.backwardAnimation(ForgotPasswordActivity.this);
    }

    private void click() {
        backPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                animation.backwardAnimation(ForgotPasswordActivity.this);
            }
        });
    }

    private void init() {
        backPress = findViewById(R.id.backPress);
    }
}