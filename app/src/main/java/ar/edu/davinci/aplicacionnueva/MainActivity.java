package ar.edu.davinci.aplicacionnueva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add layout
        LinearLayout myLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);
        //add textView
        TextView myText = new TextView(this);
        myText.setText("Hola a todos");
        //add textView on Layout
        myLayout.addView(myText);
        setContentView(myLayout);
        Log.d("test", "testing app");
    }
}