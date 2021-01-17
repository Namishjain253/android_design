package com.n2n.jcshop.activity.merchant;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.n2n.jcshop.R;
import com.n2n.jcshop.activity.other.ForgotPasswordActivity;
import com.n2n.jcshop.activity.other.LoginActivity;
import com.n2n.jcshop.model.IntentAnimation;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MerchantDashboardActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    IntentAnimation animation = new IntentAnimation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        View hView = navigationView.getHeaderView(0);
        TextView nav_user = (TextView) hView.findViewById(R.id.userStoreName);
        nav_user.setText(getResources().getString(R.string.app_name));


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_merchant_home, R.id.nav_merchant_order, R.id.nav_merchant_deal, R.id.nav_merchant_account, R.id.nav_merchant_transaction, R.id.nav_merchant_about_us, R.id.nav_merchant_contact_us)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        animation.backwardAnimation(MerchantDashboardActivity.this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.merchant_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.card) {
            Intent intent = new Intent(this, MerchantCardActivity.class);
            startActivity(intent);
            animation.forwardAnimation(MerchantDashboardActivity.this);
        } else if (id == R.id.logOut) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
            animation.backwardAnimation(MerchantDashboardActivity.this);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}