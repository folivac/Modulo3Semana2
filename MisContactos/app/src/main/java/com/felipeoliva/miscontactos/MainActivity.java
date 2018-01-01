package com.felipeoliva.miscontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText nombreInput = (EditText) findViewById(R.id.etNombre);
    public EditText fechaInput = (EditText) findViewById(R.id.etFecha);
    public EditText telefonoInput = (EditText) findViewById(R.id.etTelefono);
    public EditText emailInput = (EditText) findViewById(R.id.etEmail);
    public EditText descripcionInput = (EditText) findViewById(R.id.etDescripcion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nombre = nombreInput.getText().toString();
        String fecha = fechaInput.getText().toString();
        String telefono = telefonoInput.getText().toString();
        String email = emailInput.getText().toString();
        String descripcion = descripcionInput.getText().toString();

    }

}
