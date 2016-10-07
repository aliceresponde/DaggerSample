package com.example.aliciabeltran.daggerexample.main.view;

import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aliciabeltran.daggerexample.R;
import com.example.aliciabeltran.daggerexample.bases.BaseActivity;
import com.example.aliciabeltran.daggerexample.bases.BasePresenter;

public class MainActivity extends BaseActivity implements MainActivityView {

    EditText etName;
    Button btnSend;
    View rootView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = (EditText) findViewById(R.id.etName);
        btnSend = (Button) findViewById(R.id.btnSend);
        rootView = (View) findViewById(R.id.root);
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void handleSend(String sentence) {

    }

    @Override
    public void displayMessage(String message) {
        Snackbar.make(rootView, message , Snackbar.LENGTH_LONG).show();
    }

    @Override
    public BasePresenter getPresenter() {
        return ;
    }
}
