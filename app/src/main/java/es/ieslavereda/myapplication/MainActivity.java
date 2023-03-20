package es.ieslavereda.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;
    private ConstraintLayout myTableLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Joaquin","Alonso Saiz"));
        usuarios.add(new Usuario("Pedro","Garcia Lopez"));


        spinner = findViewById(R.id.spinner);
        myTableLayout = findViewById(R.id.constraintLayout);
        textView = findViewById(R.id.textView);

//        TextView textView = new TextView(getApplicationContext());
//        textView.setText("TextView generado por código");


//        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sexo);
        ArrayAdapter<Usuario> myAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,usuarios);
        spinner.setAdapter(myAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(usuarios.get(i).toString());
//                adapterView.getItemIdAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}