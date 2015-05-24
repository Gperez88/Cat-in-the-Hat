package com.gperez.catinthehat;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button theCatButton;
    private Button thingOneButton;
    private Button thingTwoButton;
    private Button thingamajiggerButton;
    private Button sallyButton;
    private Button nickButton;
    private Button drSeussButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init buttons.
        theCatButton = (Button) findViewById(R.id.the_cat_button);
        thingOneButton = (Button) findViewById(R.id.thing_one_button);
        thingTwoButton = (Button) findViewById(R.id.thing_two_button);
        thingamajiggerButton = (Button) findViewById(R.id.thingamajigger_button);
        sallyButton = (Button) findViewById(R.id.sally_button);
        nickButton = (Button) findViewById(R.id.nick_button);
        drSeussButton = (Button) findViewById(R.id.dr_seuss_button);

        //set oncliklisteners buttons.
        theCatButton.setOnClickListener(this);
        thingOneButton.setOnClickListener(this);
        thingTwoButton.setOnClickListener(this);
        thingamajiggerButton.setOnClickListener(this);
        sallyButton.setOnClickListener(this);
        nickButton.setOnClickListener(this);
        drSeussButton.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button) {
            Button button = (Button) v;
            Toast.makeText(this, String.format("Click in %s button.", button.getText()), Toast.LENGTH_SHORT).show();
        }
    }
}
