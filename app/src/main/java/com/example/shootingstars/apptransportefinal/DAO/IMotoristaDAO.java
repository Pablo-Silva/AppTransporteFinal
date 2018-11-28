package com.example.shootingstars.apptransportefinal.DAO;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.shootingstars.apptransportefinal.Model.Motorista;

import java.util.List;

public interface IMotoristaDAO {

    @Insert
    void insert(Motorista motorista);

    @Update
    void update(Motorista motorista);

    @Query("SELECT * from MOTORISTA_TABLE ORDER BY nomeMotorista DESC")
    List<Motorista> loadMotoristas();

    @Query("SELECT nomeMotorista from MOTORISTA_TABLE")
    List<String> loadMotoristasNames();
}
