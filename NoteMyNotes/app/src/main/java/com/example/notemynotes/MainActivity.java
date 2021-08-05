package com.example.notemynotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button mSnackBarBtn;
    private Toolbar materialToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialToolbar=findViewById(R.id.topAppBar);
        setSupportActionBar(materialToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      super.onCreateOptionsMenu(menu);
      getMenuInflater().inflate(R.menu.main_menu,menu);
      for(int i=0; i<menu.size();i++){
          MenuItem menuItem =menu.getItem(i);
          SpannableString spannableString = new SpannableString(
                  menu.getItem(i).getTitle().toString()
          );
          spannableString.setSpan(new ForegroundColorSpan(Color.BLACK),0,spannableString.length(),0);
          menuItem.setTitle(spannableString);
      }
        return true;
    }
}