package com.example.a01_mvvm.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.a01_mvvm.R;
import com.example.a01_mvvm.viewModel.AlCuadradoViewModel;

public class MainActivity extends AppCompatActivity {

    private EditText etAlCuadrado;
    private Button btAlCuadrado;
    private TextView tvAlCuadrado;
    private AlCuadradoViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        configView();
    }

    private void initialize() {
        tvAlCuadrado = findViewById(R.id.tvAlCuadrado);
        btAlCuadrado = findViewById(R.id.btCalcular);
        etAlCuadrado = findViewById(R.id.edAlCuadrado);
        viewModel = ViewModelProviders.of(this).get(AlCuadradoViewModel.class);
    }

    private void configView() {
        btAlCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.alCuadrado(etAlCuadrado.getText().toString());
            }
        });
        final Observer<String> observer = new Observer<String>() {
            @Override
            public void onChanged(String resultado) {
                tvAlCuadrado.setText(resultado);
            }
        };

        viewModel.getResultado().observe(this, observer);
    }
}
