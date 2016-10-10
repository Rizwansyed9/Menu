package com.example.rizwansyed.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu m)
    {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, m);
                return true;
    }
    public boolean onOptionItemSelected(MenuItem mi)
    {
    switch (mi.getItemId())
    {
        case R.id.new_game:
            Toast.makeText(this, "selected new game", Toast.LENGTH_SHORT).show();
            break;

        case R.id.help:
            Toast.makeText(this, "selected help", Toast.LENGTH_SHORT).show();
            break;

        case 3:
            Toast.makeText(this, "selected option 3", Toast.LENGTH_SHORT).show();
            break;

        case 4:
            Toast.makeText(this, "selected option 4", Toast.LENGTH_SHORT).show();
            break;



    }
        return true;
    }
}
