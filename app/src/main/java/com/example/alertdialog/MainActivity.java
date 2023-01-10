package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Ll.
     */
    LinearLayout Ll;
    /**
     * The Abd.
     */
    AlertDialog.Builder abd;

    /**
     * The Rnd.
     */
    AlertDialog.Builder abd2;
    /**
     * The Abd 3.
     */
    AlertDialog.Builder abd3;
    /**
     * The Abd 4.
     */
    AlertDialog.Builder abd4;
    /**
     * The Abd 5.
     */
    AlertDialog.Builder abd5;
    /**
     * The Rnd.
     */
    Random rnd = new Random();
    /**
     * The Red.
     */
    int RED  = 0 ;
    /**
     * The Green.
     */
    int Green = 0;
    /**
     * The Blue.
     */
    int Blue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abd = new AlertDialog.Builder(this);
        abd2 = new AlertDialog.Builder(this);
        abd3 = new AlertDialog.Builder(this);
        abd4 = new AlertDialog.Builder(this);
        abd5 = new AlertDialog.Builder(this);
        Ll = findViewById( R.id.Ll);
    }

    /**
     * Go 1.
     *
     * @param view the view
     */
    public void go1(View view) {
        abd.setTitle("only text");
        abd.setMessage("not working");
        AlertDialog ad = abd.create();
        ad.show();
    }

    /**
     * Go 2.
     *
     * @param view the view
     */
    public void go2(View view) {
        abd2.setTitle("only text");
        abd2.setMessage("not working");
        abd2.setIcon(R.drawable.albert);
        AlertDialog ad = abd2.create();

        ad.show();
    }

    /**
     * Go 3.
     *
     * @param view the view
     */
    public void go3(View view) {
        abd3.setTitle("only text");
        abd3.setMessage("not working");
        abd3.setIcon(R.drawable.albert);
        abd3.setNegativeButton("closure", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ad = abd3.create();
        ad.show();
    }

    /**
     * Go 4.
     *
     * @param view the view
     */
    public void go4(View view) {
        abd4.setTitle("only text");
        abd4.setMessage("not working");
        abd4.setIcon(R.drawable.albert);
        abd4.setNegativeButton("closure", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        abd4.setPositiveButton("Change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                RED = rnd.nextInt(254);
                Green = rnd.nextInt(254);
                Blue = rnd.nextInt(254);
                Ll.setBackgroundColor(Color.rgb(RED,Green,Blue));
            }
        });
        AlertDialog ad = abd4.create();
        ad.show();
    }

    /**
     * Go 5.
     *
     * @param view the view
     */
    public void go5(View view) {
        abd5.setTitle("only text");
        abd5.setMessage("not working");
        abd5.setIcon(R.drawable.albert);
        abd5.setNegativeButton("closure", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        abd5.setPositiveButton("Change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                RED = rnd.nextInt(254);
                Green = rnd.nextInt(254);
                Blue = rnd.nextInt(254);
                Ll.setBackgroundColor(Color.rgb(RED,Green,Blue));
            }
        });
        abd5.setNeutralButton("Change color to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Ll.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad = abd5.create();
        ad.show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 100, "Credits");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str = menuItem.getTitle().toString();

        if (str.equals("Credits")) {
            Intent si = new Intent(this, MainActivity2.class);
            startActivity(si);
        }
        return true;
    }
}