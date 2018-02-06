package mik.easj.skole.exercisecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Beregn(View view) {
        //inputs
        EditText input1 = (EditText) findViewById(R.id.Input1);
        EditText input2 = (EditText) findViewById(R.id.Input2);
        //vores set text
        TextView Resultat = (TextView) findViewById(R.id.Resultat);

        //udføre koden

       sum = Integer.parseInt(input1.getText().toString())+Integer.parseInt(input2.getText().toString());

       Resultat.setText(Integer.toString(sum));
    }
}
