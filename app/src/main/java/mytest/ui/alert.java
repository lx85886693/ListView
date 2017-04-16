package mytest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

public class alert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater=LayoutInflater.from(this);
        View loginview=inflater.inflate(R.layout.activity_alert,null);
        new AlertDialog.Builder(this).setView(loginview).setPositiveButton("Cancel",null).setNegativeButton("Sign in",null).show();
    }
}
