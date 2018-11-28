package com.example.shootingstars.apptransportefinal.Repository;

import android.content.Context;

import com.example.shootingstars.apptransportefinal.DAO.IMotoristaDAO;
import com.example.shootingstars.apptransportefinal.Database.ViagemRoomDatabase;
import com.example.shootingstars.apptransportefinal.Model.Motorista;

import java.util.List;

public class MoristaRepository {
    private IMotoristaDAO mMotoristaDAO;
    private List<Motorista> mMotoristas;

    public MoristaRepository(Context context){
        ViagemRoomDatabase db = ViagemRoomDatabase.getDatabase(context);
        mMotoristaDAO = db.motoristaDAO();
    }

    public List<Motorista> getAllMotoristas(){
        mMotoristas = mMotoristaDAO.loadMotoristas();
        return mMotoristas;
    }

    public void insert(Motorista motorista){
        mMotoristaDAO.insert(motorista);
    }
    public void update(Motorista motorista) {mMotoristaDAO.update(motorista);}
}
