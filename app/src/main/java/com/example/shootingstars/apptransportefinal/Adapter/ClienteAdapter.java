package com.example.shootingstars.apptransportefinal.Adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.shootingstars.apptransportefinal.Activity.MainActivity;
import com.example.shootingstars.apptransportefinal.Activity.NovoClienteActivity;
import com.example.shootingstars.apptransportefinal.Model.Cliente;
import com.example.shootingstars.apptransportefinal.R;
import com.example.shootingstars.apptransportefinal.Repository.ClienteRepository;

import static android.support.v4.content.ContextCompat.startActivity;

public class ClienteAdapter {

    private EditText editNomeCliente, editEmail, editSenha, editDataNascimento, editCpf, editTextDeficiencia;
    private ClienteRepository repository;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_cliente);

        editNomeCliente = findViewById(R.id.editNomeCliente);
        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
        editDataNascimento = findViewById(R.id.editDataNascimento);
        editCpf = findViewById(R.id.editCpf);
        editTextDeficiencia = findViewById(R.id.editTextDeficiencia);

        repository = new ClienteRepository(getApplicationContext());
    }

    public void salvarFilme(View view){
        Cliente cliente = new Cliente();
        cliente.setNomeCliente(editNomeCliente.getText().toString());
        cliente.setEmailCliente(editEmail.getText().toString());
        cliente.setSenhaCliente(editSenha.getText().toString());
        cliente.setCpfCliente(editCpf.getText().toString());
        cliente.setDeficiencia(editTextDeficiencia.getText().toString());


        repository.insert(cliente);
        callMainActivity();
    }

    private void callMainActivity() {
        Intent mainActivity = new Intent(NovoClienteActivity.this,MainActivity.class);
        startActivity(mainActivity);
        finish();
    }
}
