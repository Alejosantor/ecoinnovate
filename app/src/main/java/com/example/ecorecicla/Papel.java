package com.example.ecorecicla;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

impo
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Papel extends AppCompatActivity {
    Button retroButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_papel);

        retroButton = (Button) findViewById(R.id.btn_atrasPapel);


    }


}