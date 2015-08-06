package com.example.jpratik.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = (Button) findViewById(R.id.button);
        Button buttonCancel = (Button) findViewById(R.id.button2);

        buttonCancel.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);
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

        EditText editTextName = (EditText) findViewById(R.id.editText);
        EditText editTextPass = (EditText) findViewById(R.id.editText2);
//        TextView textViewName = (TextView) findViewById(R.id.textView);
 //       TextView textViewPass = (TextView) findViewById(R.id.textView);

        String name = editTextName.getText().toString();
        String pass = editTextPass.getText().toString();

        switch (v.getId()){
            case R.id.button:
                if (name.equals("pratik") && pass.equals("jaiswal"))
                {
                    Intent i = new Intent(this, Main2Activity.class);
                    startActivity(i);
                }
                break;

            case R.id.button2:
                editTextName.setText(" ");
                editTextPass.setText(" ");
                break;
            default:
                break;
        }
    }
}