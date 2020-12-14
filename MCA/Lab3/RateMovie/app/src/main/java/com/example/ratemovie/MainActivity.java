package com.example.ratemovie;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    RatingBar rb1, rb2, rb3, rb4, rb5;
    Button btn;

    TextView tv1, tv2, tv3, tv4, tv5, tvt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvt = (TextView) findViewById(R.id.text);

        rb1 = (RatingBar) findViewById(R.id.rb1);
        rb2 = (RatingBar) findViewById(R.id.rb2);
        rb3 = (RatingBar) findViewById(R.id.rb3);
        rb4 = (RatingBar) findViewById(R.id.rb4);
        rb5 = (RatingBar) findViewById(R.id.rb5);
        btn = (Button) findViewById(R.id.btn);

        Calendar calendar = Calendar.getInstance();
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        final int monthz = calendar.get(Calendar.MONTH);
        final int year = calendar.get(Calendar.YEAR);

        tvt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthz, int day)
                    {
                        monthz = monthz + 1;
                        String date = day + "/" + monthz + "/" + year;
                        tvt.setText(date);
                    }
                }, year, monthz, day);
                datePickerDialog.show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1 = Double.parseDouble(String.valueOf(rb1.getRating()));
                double x2 = Double.parseDouble(String.valueOf(rb2.getRating()));
                double x3 = Double.parseDouble(String.valueOf(rb3.getRating()));
                double x4 = Double.parseDouble(String.valueOf(rb4.getRating()));
                double x5 = Double.parseDouble(String.valueOf(rb5.getRating()));
                double a=(x1+x2+x3+x4+x5)/5;

                if ((x1 > x2) && (x1 > x3) && (x1 > x4) && (x1 > x5))
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Review Status\n");
                    alertDialog.setMessage("Highest rated movie - Iron Man\n\nAverage Rating - "+a);
                    alertDialog.show();


                }

                else if ((x2 > x3) && (x2 > x4) && (x2 > x5))
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Review Status\n");
                    alertDialog.setMessage("Highest rated movie - Notebook\n\nAverage Rating - "+a);
                    alertDialog.show();

                }
                else if ((x3 > x4) && (x3 > x5))
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Review Status\n");
                    alertDialog.setMessage("Highest rated movie - KGF\n\nAverage Rating - "+a);
                    alertDialog.show();
                }
                else if ((x4 > x5))
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Review Status\n");
                    alertDialog.setMessage("Highest rated movie - Wolf\n\nAverage Rating - "+a);
                    alertDialog.show();
                }
                else
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Review Status\n");
                    alertDialog.setMessage("Highest rated movie - Lion King\n\nAverage Rating - "+a);
                    alertDialog.show();
                }
            }
        });
    }
}
