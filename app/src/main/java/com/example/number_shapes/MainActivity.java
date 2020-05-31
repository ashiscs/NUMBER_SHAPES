package com.example.number_shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot)) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isTriangular() {
            int x=1;
            int triangularNumber = 1;
            while(triangularNumber < number) {
                x++;
                triangularNumber += x;
            }
            if(triangularNumber == number) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public void clicked(View view){

        EditText num = (EditText) findViewById(R.id.num);
        //Log.i("Value: ",num.getText().toString());
        Number myNumber = new Number();
        myNumber.number = Integer.parseInt(num.getText().toString());
        //System.out.println(myNumber.isSquare());
        //System.out.println(myNumber.isTriangular());
        if(myNumber.isSquare() && myNumber.isTriangular()){
            Toast.makeText(MainActivity.this,"Square as well as Triangular Number !!",Toast.LENGTH_SHORT).show();
        } else if(myNumber.isTriangular()){
           Toast.makeText(MainActivity.this,"Triangular Number !!",Toast.LENGTH_SHORT).show();
        } else if(myNumber.isSquare()){
            Toast.makeText(MainActivity.this,"Square Number !!",Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(MainActivity.this,"Neither of them !!",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
