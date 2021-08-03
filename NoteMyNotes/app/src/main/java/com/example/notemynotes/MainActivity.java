package com.example.notemynotes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button mSnackBarBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSnackBarBtn= findViewById(R.id.snackBar_btn);

        mSnackBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view,"Note Added", Snackbar.LENGTH_LONG);
                snackbar.setAction("Okay", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                snackbar.show();
            }
        });
    }
}