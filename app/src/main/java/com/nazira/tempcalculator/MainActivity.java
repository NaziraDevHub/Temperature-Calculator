package com.nazira.tempcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edCelcious,edFahrenheit;
    Button bToast,bToast2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCelcious = findViewById(R.id.edCelcious);
        edFahrenheit = findViewById(R.id.edFahrenheit);
        bToast = findViewById(R.id.bToast);
        bToast2 = findViewById(R.id.bToast2);

        bToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                float celcis = Float.parseFloat(edCelcious.getText().toString());
                float fahenhit = (celcis * 9/5) + 32;

                Toast.makeText(MainActivity.this, celcis + "°C is " + fahenhit + "°F", Toast.LENGTH_LONG).show();

            }
        });

        bToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                float fahenhit = Float.parseFloat(edFahrenheit.getText().toString());
                float celcis = (fahenhit - 32) * 5/9;

                Toast.makeText(MainActivity.this, fahenhit + "°F is " + celcis + "°C", Toast.LENGTH_SHORT).show();

            }
        });



    }
}