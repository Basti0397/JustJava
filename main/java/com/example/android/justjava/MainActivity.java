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
        number=1;
        coffeePrize=2.99;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        number++;
        display(number);
        displayPrize();
    }

    public void displayPrize(){
        TextView prizeTextView = (TextView) findViewById(R.id.prize_text_view);
        prizeTextView.setText("$" + number*coffeePrize);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }
}
