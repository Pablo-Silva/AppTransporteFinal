package com.example.shootingstars.apptransportefinal.DAO;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.shootingstars.apptransportefinal.Model.Cliente;

import java.util.List;

public interface ICLienteDAO {
    @Insert
    void insert(Cliente cliente);

    @Update
    void update(Cliente cliente);

    @Query("SELECT * from CLIENTE_TABLE ORDER BY nomeCliente DESC")
    List<Cliente> loadClientes();

    @Query("SELECT nomeCliente from CLIENTE_TABLE")
    List<String> loadClientesNames();
}
