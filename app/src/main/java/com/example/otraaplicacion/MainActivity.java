package com.example.otraaplicacion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edadedit = findViewById(R.id.edad_id);
        TextView resulttext = findViewById(R.id.resultado_texto);
        Button button = findViewById(R.id.boton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edadedit.getText().toString();
                int edadint = Integer.parseInt(edad);
                int resultado = edadint*7;
                String resultadostring = "La edad del canino es: " + resultado + " años";
                resulttext.setText(resultadostring);
            }
        });
    }
}