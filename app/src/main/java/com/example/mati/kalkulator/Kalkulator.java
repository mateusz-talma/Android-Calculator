package com.example.mati.kalkulator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Kalkulator extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }

    private EditText Display = (EditText) findViewById(R.id.editText);
    float Number;
    String Operation;
    private ButtonClickListener buttonClick;

    int idList[] = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4,
            R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9,
            R.id.buttonDot, R.id.buttonDiv, R.id.buttonMn, R.id.buttonMin, R.id.buttonPl, R.id.buttonEq
    };

    {
        for (int id : idList) {
            View v = (View) findViewById(id);
            v.setOnClickListener(buttonClick);

        }
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

public void mMath (String str){
    Number = Float.parseFloat(Display.getText().toString()); // save number of display
    Operation = str; // save operation
    Display.setText("0"); // clear display
}
    // new class ButtonClickListener
public void getKeyboard(String str)
{
    String DisplayCurrent = Display.getText().toString();
    DisplayCurrent += Display;
    Display.setText(DisplayCurrent);
}

    public void mResult()
    {
        float Num = Float.parseFloat(Display.getText().toString());
        float result=0;
        if (Operation.equals("+")){
            result = Num + Number;
        }
        if (Operation.equals("-")){
            result = Num - Number;
        }
        if (Operation.equals("*")){
            result = Num * Number;
        }
        if (Operation.equals("/")){
            result = Num / Number;
        }
        Display.setText(String.valueOf(result));
    }

    private class ButtonClickListener implements View.OnClickListener {
        public void onClick(View v){
            switch (v.getId()){
                case R.id.buttonPl: // function add
                    mMath("+");
                    break;
                case R.id.buttonMin:
                    mMath("-");
                    break;
                case R.id.buttonMn:
                    mMath("*");
                    break;
                case R.id.buttonDiv:
                    mMath("/");
                    break;
                case R.id.buttonEq:
                    mResult();
                    break;
            /*    default:
                    String n = ((Button) v).getText().toString();
                    getKeyboard(n);
*/
            }

        }

    }
}
