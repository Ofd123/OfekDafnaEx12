package com.example.ofekdafnaex12;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    AlertDialog.Builder ab1,ab2,ab4;//last time i gave them long names which confused me... since we have 4 buttons i think it will be easier that way
    LinearLayout main;

    final String[] colors = {"RED", "GREEN", "BLUE"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        ab1 = new AlertDialog.Builder(this);        //first button
        ab2 = new AlertDialog.Builder(this);        // second button
        ab4 = new AlertDialog.Builder(this);        // fourth button

    }

    /**
     * this it the first button, it will open an alert dialog which will let the user to choose the screen background between 3 basic colors
     * @param view
     */
    public void button1Click(View view)
    {
        ab1.setCancelable(false);

        int[] color = new int[] {0, 0, 0};
        ab1.setTitle("choose background color:");
        ab1.setItems(colors, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                color[which] = 255;
                main.setBackgroundColor(Color.rgb(color[0], color[1], color[2]));
            }
        });
        ab1.setPositiveButton("Exit", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                dialog.cancel();
            }
        });

        AlertDialog ad = ab1.create();
        ad.show();
    }

    //----------------------------------------------------------------------------------------------

    /**
     * the function opens the dialog which lets the user select the background color
     * @param view
     */
    public void button2Click(View view)
    {

        ab2.setCancelable(false);

        int[] color = new int[] {0, 0, 0};

        ab2.setTitle("Change multiple colors");
        ab2.setMultiChoiceItems(colors, null, new DialogInterface.OnMultiChoiceClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked)
            {
                if(isChecked)
                {
                    color[which] = 255;
                }
                else if (color[which] == 255)
                {
                    color[which] = 0;
                }
            }
        });

        ab2.setPositiveButton("Exit", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                dialog.cancel();
            }
        });

        ab2.setNeutralButton("OK", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                main.setBackgroundColor(Color.rgb(color[0], color[1], color[2]));
            }
        });

        AlertDialog dialog = ab2.create();
        dialog.show();
    }

    //----------------------------------------------------------------------------------------------

    /**
     * reset button
     * @param view
     */
    public void button3Click(View view)
    {
        main.setBackgroundColor(Color.WHITE);
    }
    //----------------------------------------------------------------------------------------------

    /**
     *
     * @param view
     */
    public void button4Click(View view)
    {

    }
    //----------------------------------------------------------------------------------------------

    public void seeCredits(View view)
    {

    }
    //----------------------------------------------------------------------------------------------
}