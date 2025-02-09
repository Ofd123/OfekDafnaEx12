package com.example.ofekdafnaex12;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    AlertDialog.Builder ab1,ab2,ab3,ab4;//last time i gave them long names which confused me... since we have 4 buttons i think it will be easier that way
    LinearLayout main;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        rnd = new Random();
        ab1 = new AlertDialog.Builder(this);        //first button
        ab2 = new AlertDialog.Builder(this);        // second button
        ab3 = new AlertDialog.Builder(this);        // third button
        ab4 = new AlertDialog.Builder(this);        // fourth button

    }

    /**
     * this it the first button, it will open an alert dialog which will let the user to choose the screen background between 3 basic colors
     * @param view
     */
    public void button1Click(View view)
    {
        ab1.setTitle("choose background");
        ab1.setMessage("choose your background color:");
        ab1.setNegativeButton("blue", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                main.setBackgroundColor(Color.BLUE);
                dialog.cancel();
            }
        });
        //------------------------------------------------------------------------------------------
        ab1.setPositiveButton("red", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                main.setBackgroundColor(Color.RED);
                dialog.cancel();
            }
        });
        //------------------------------------------------------------------------------------------
        ab1.setNeutralButton("yellow", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                main.setBackgroundColor(Color.YELLOW);
                dialog.cancel();
            }
        });
        //------------------------------------------------------------------------------------------
        AlertDialog showText = ab1.create();
        showText.show();
    }
    //----------------------------------------------------------------------------------------------

    public void button2Click(View view) {
    }
    //----------------------------------------------------------------------------------------------

    public void button3Click(View view) {
    }
    //----------------------------------------------------------------------------------------------

    public void button4Click(View view) {
    }
    //----------------------------------------------------------------------------------------------

    public void seeCredits(View view)
    {

    }
    //----------------------------------------------------------------------------------------------
}