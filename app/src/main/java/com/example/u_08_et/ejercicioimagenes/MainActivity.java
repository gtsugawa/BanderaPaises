package com.example.u_08_et.ejercicioimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    ImageView i;
    RadioGroup g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = findViewById(R.id.imageView);
        g = findViewById(R.id.grupo);
        g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int pais) {
                switch (pais)
                {
                    case R.id.radioArgentina:
                        i.setImageResource(R.drawable.argentina);
                        break;
                    case R.id.radioPeru:
                        i.setImageResource(R.drawable.peru);
                        break;
                    case R.id.radioChile:
                        i.setImageResource(R.drawable.chile);
                        break;
                    case R.id.radioColombia:
                        i.setImageResource(R.drawable.colombia);
                        break;

                }
            }
        });
    }
}
