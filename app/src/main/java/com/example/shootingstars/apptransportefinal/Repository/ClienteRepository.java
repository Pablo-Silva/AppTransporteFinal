package com.example.shootingstars.apptransportefinal.Repository;

import android.content.Context;

import com.example.shootingstars.apptransportefinal.DAO.ICLienteDAO;
import com.example.shootingstars.apptransportefinal.Database.ViagemRoomDatabase;
import com.example.shootingstars.apptransportefinal.Model.Cliente;

import java.util.List;

public class ClienteRepository {
    private ICLienteDAO mClienteDAO;
    private List<Cliente> mClientes;

    public ClienteRepository(Context context){
        ViagemRoomDatabase db = ViagemRoomDatabase.getDatabase(context);
        mClienteDAO = db.cLienteDAO();
    }

    public List<Cliente> getAllClientes(){
        mClientes = mClienteDAO.loadClientes();
        return mClientes;
    }

    public void insert(Cliente cliente){
        mClienteDAO.insert(cliente);
    }
    public void update(Cliente cliente) {mClienteDAO.update(cliente);}
}
