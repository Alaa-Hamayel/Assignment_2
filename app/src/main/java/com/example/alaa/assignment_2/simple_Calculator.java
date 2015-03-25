package com.example.alaa.assignment_2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class simple_Calculator extends ActionBarActivity {

    EditText screen;
    int Number1;
    int Number2;
    float Result;
    int MP_Number =0;
    char opr ;
    boolean bool = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple__calculator);
        screen = (EditText)findViewById(R.id.screen);
        screen.setText("0");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple__calculator, menu);
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


    public void Click_1 (View V){


            screen = (EditText) findViewById(R.id.screen);
            if ((screen.getText().toString()).equals("0")) {
                screen.setText("1");

            } else {
                screen.append("1");
            }


    }
    public void Click_2 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("2");

        }else {
            screen.append("2");
        }

    }public void Click_3 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("3");

        }else {
            screen.append("3");
        }

    }
    public void Click_4 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("4");

        }else {
            screen.append("4");
        }

    }
    public void Click_5 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("5");

        }else {
            screen.append("5");
        }

    }
    public void Click_6(View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("6");

        }else {
            screen.append("6");
        }

    }
    public void Click_7 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("7");

        }else {
            screen.append("7");
        }

    }
    public void Click_8 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("8");

        }else {
            screen.append("8");
        }

    }
    public void Click_9 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("9");

        }else {
            screen.append("9");
        }

    }
    public void Click_0 (View V){

        screen = (EditText)findViewById(R.id.screen);
        if ((screen.getText().toString()).equals("0")){
            screen.setText("0");

        }else {
            screen.append("0");
        }

    }
    public void Click_C (View V){

        screen = (EditText)findViewById(R.id.screen);
       screen.setText("0");


    }
    public void Click_MP (View V){

        screen = (EditText)findViewById(R.id.screen);
        MP_Number = Integer.parseInt((screen.getText().toString()));

    }
    public void Click_MR (View V){
        if (MP_Number==0){


        }else {



            screen = (EditText) findViewById(R.id.screen);
            screen.setText(""+MP_Number);
        }

    }
    public void Click_MC (View V){

        MP_Number = 0;

    }
    public void Click_N (View V){
        screen = (EditText)findViewById(R.id.screen);
        int Number = Integer.parseInt(screen.getText().toString());
        Number = -Number;

        screen.setText(""+Number);



    }
    public void Click_Back (View V){
        screen = (EditText)findViewById(R.id.screen);
        String back = screen.getText().toString();
        int ln = back.length();
        back = back.substring(0,back.length()-1);
        screen.setText(back);
        if (back.length()==0){
            screen.setText("0");
        }



    }

    public void Click_P (View V){
        opr = '+';
        screen = (EditText)findViewById(R.id.screen);
        Number1 = Integer.parseInt(screen.getText().toString());
        screen.setText("0");



    }
    public void Click_D (View V){
        opr = '/';
        screen = (EditText)findViewById(R.id.screen);
        Number1 = Integer.parseInt(screen.getText().toString());
        screen.setText("0");



    }

    public void Click_M (View V){
        opr = '*';
        screen = (EditText)findViewById(R.id.screen);
        Number1 = Integer.parseInt(screen.getText().toString());
        screen.setText("0");



    }

    public void Click_MI (View V){
        opr = '-';
        screen = (EditText)findViewById(R.id.screen);
        Number1 = Integer.parseInt(screen.getText().toString());
        screen.setText("0");



    }
    public void Click_E (View V){


        screen = (EditText)findViewById(R.id.screen);
        Number2 = Integer.parseInt(screen.getText().toString());
        int res;
        switch (opr){
            case '+':
                res = Number1+Number2;
                screen.setText(""+res);

                break;
            case '-':
                res = Number1-Number2;
                screen.setText(""+res);
                break;
            case '*':
                res =Number1*Number2;
                screen.setText(""+res);
                break;
            case '/':
                Result = Number1/(float)Number2;
                screen.setText(""+Result);
                break;


        }






    }






}
