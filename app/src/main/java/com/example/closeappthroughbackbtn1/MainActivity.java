package com.example.closeappthroughbackbtn1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/* Declaring and initializing the button from the layout file */
        button = findViewById(R.id.button);




    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("no",null)
                .show();
    }

/* When the user click on the Exit App button in the UI */
    public void alertMessageBox(View view)
    {
/* When the Button is click an alertDialog box is created and displayed */
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes",null)
                .setNegativeButton("No",null)
                .show();

/* Function for the positive button is programmed to exit  the application */
        Button mPositiveButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
        mPositiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}