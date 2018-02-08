package mik.easj.skole.exercisecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private int sum;
private static String tegn;

private int regnemetode(){
    //inputs
    EditText input1 = (EditText) findViewById(R.id.Input1);
    EditText input2 = (EditText) findViewById(R.id.Input2);


    //udføre koden

    if (tegn == "+"){
        sum = Integer.parseInt(input1.getText().toString())+Integer.parseInt(input2.getText().toString());
    }
    if (tegn == "*"){
        sum = Integer.parseInt(input1.getText().toString())*Integer.parseInt(input2.getText().toString());
        }
    if (tegn == "-"){
        sum = Integer.parseInt(input1.getText().toString())-Integer.parseInt(input2.getText().toString());
    }
    if (tegn == "/"){
        sum = Integer.parseInt(input1.getText().toString())/Integer.parseInt(input2.getText().toString());
    }
    else
        Toast.makeText(this, "vælg hvad du ønsker at regne med", Toast.LENGTH_SHORT).show();

    return sum;

}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusbtn(View view) {
       tegn = "+";
    }

    public void minusbtn(View view) {
        tegn = "-";
    }

    public void gangebtn(View view) {
        tegn = "*";
    }

    public void dividerebtn(View view) {
        tegn = "/";
    }

    public void LigmedBtn(View view) {
        //vores set text
        TextView Resultat = (TextView) findViewById(R.id.Resultat);

    int sum = regnemetode();
        Resultat.setText(Integer.toString(sum));


    }
}
