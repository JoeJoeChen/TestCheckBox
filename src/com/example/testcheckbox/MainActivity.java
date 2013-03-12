package com.example.testcheckbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity
{

    private CheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = (CheckBox) findViewById(R.id.checkbox);
        c.setButtonDrawable(R.drawable.my_checkbox);

        
        c.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "?" + c.isChecked(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
