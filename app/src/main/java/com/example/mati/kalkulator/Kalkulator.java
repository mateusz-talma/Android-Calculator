package com.example.mati.kalkulator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Kalkulator extends ActionBarActivity {


    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,eq,dot;
    TextView display;
    int action=0;
    double firstNumber=0,secondNumber=0,result=0;
    boolean dott=false;
    public void Click0(View v)
    {
       display.setText(display.getText()+"0");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click1(View v)
    {
        display.setText(display.getText()+"1");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click2(View v)
    {
        display.setText(display.getText()+"2");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click3(View v)
    {
        display.setText(display.getText()+"3");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click4(View v)
    {
        display.setText(display.getText()+"4");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click5(View v)
    {
        display.setText(display.getText()+"5");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click6(View v)
    {
        display.setText(display.getText()+"6");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click7(View v)
    {
        display.setText(display.getText()+"7");
        if (action ==0 || action ==2)
            action++;
    }

    public void Click8(View v)
    {
        display.setText(display.getText()+"8");
        if (action ==0 || action ==2)
            action++;
    }
    public void Click9(View v)
    {
        display.setText(display.getText()+"9");
        if (action ==0 || action ==2)
            action++;
    }
    public void ClickMul(View v)
    {
        if (action==1) {
            display.setText(display.getText() + "*");
            action++;
            dott=false;
            getFirstNumber();
        }
    }
    public void ClickDiv(View v)
    {
        if (action==1) {
         //   display.setText(display.getText() + "/");
            action++;
            dott=false;
            getFirstNumber();


        }
    }
    public void ClickAdd(View v)
    {
        if (action==1) {
           // display.setText(display.getText() + "+");
            action++;
            dott=false;
            getFirstNumber();


        }
    }
    public void ClickSub(View v)
    {
        if (action==1) {
           // display.setText(display.getText() + "-");
            action++;
            dott=false;
            getFirstNumber();
        }
    }
    public void ClickDot(View v)
    {
        if ((action==1 || action ==2)&& dott==false) {
            display.setText(display.getText() + ".");
            dott = true;
        }
    }


    public void ClickClear(View view)
    {
        action=0;
        display.setText("");
    }

    public void ClickEq(View v)
    {
        if (action==3) {
            getSecondNumber();
            result = firstNumber + secondNumber;
            display.setText(Double.toString(result));
        }
    }

    public void getFirstNumber()
    {
        try {
            firstNumber = Double.parseDouble(display.getText().toString());
        } catch(NumberFormatException nfe) {

        }
        display.setText("");
    }

    public void getSecondNumber()
    {
        try {
            secondNumber = Double.parseDouble(display.getText().toString());
        } catch(NumberFormatException nfe) {

        }
        display.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        init();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kalkulator, menu);
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
    private void init()
    {
        b0=(Button) findViewById(R.id.b0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        dot=(Button) findViewById(R.id.dot);
        eq=(Button) findViewById(R.id.eq);
        sub=(Button) findViewById(R.id.sub);
        div=(Button) findViewById(R.id.div);
        mul=(Button) findViewById(R.id.mul);
        add=(Button) findViewById(R.id.add);
        display=(TextView) findViewById(R.id.textView);
    }
}
