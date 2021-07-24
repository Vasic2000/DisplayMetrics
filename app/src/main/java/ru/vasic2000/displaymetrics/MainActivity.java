package ru.vasic2000.displaymetrics;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textX;
    TextView textY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Deprecated
//        Display display = getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//        int width = size.x;
//        int height = size.y;

        // Deprecated
//        WindowMetrics metrics = getWindowManager().getCurrentWindowMetrics();
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        textX = findViewById(R.id.textX);
        textY = findViewById(R.id.textY);

        textX.setText("Ширина = " + getResources().getDisplayMetrics().heightPixels + " px");
        textY.setText("Высота = " + getResources().getDisplayMetrics().widthPixels + " px");

    }
}