package es.ieslavereda.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TableLayout myTableLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTableLayout = findViewById(R.id.myTableLayout);

        TextView textView = new TextView(getApplicationContext());
        textView.setText("TextView generado por código");

        TableRow row = new TableRow(getApplicationContext());
        row.addView(textView);

        myTableLayout.addView(row);

    }
}