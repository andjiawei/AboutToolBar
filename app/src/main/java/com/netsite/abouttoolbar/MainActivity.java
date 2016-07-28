package com.netsite.abouttoolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toolbar_foot_hide = (Button) findViewById(R.id.toolbar_foot_hide);
        toolbar_foot_hide.setOnClickListener(this);
        Button toolbar_alpha = (Button) findViewById(R.id.toolbar_alpha);
        toolbar_alpha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.toolbar_foot_hide :
                startActivity(new Intent(this,ToolBarFootHideActivity.class));
                break;
            case R.id.toolbar_alpha :
                startActivity(new Intent(this,ToolBarAlphaActivity.class));
                break;
        }
    }
}
