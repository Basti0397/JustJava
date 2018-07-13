package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int number;
    double coffeePrize;

    public MainActivity(){
        number=0;
        coffeePrize=2.99;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOrder(View view) {
        number++;
        display(number);
        displayPrize();
    }

    public void removeOrder(View view){
        number--;
        display(number);
        displayPrize();
    }

    public void submitOrder(View view){

    }

    public void displayPrize(){
        TextView prizeTextView = (TextView) findViewById(R.id.prize_text_view);
        String s = String.format("%.2f", number*coffeePrize);
        prizeTextView.setText("$" + s);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }
}
