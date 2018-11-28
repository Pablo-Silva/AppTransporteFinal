package com.example.shootingstars.apptransportefinal.DAO;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.shootingstars.apptransportefinal.Model.Cliente;
import com.example.shootingstars.apptransportefinal.Model.Motorista;
import com.example.shootingstars.apptransportefinal.Model.Viagem;

import java.util.List;

public interface IViagemDAO {

    @Insert
    void insert(Viagem viagem);

    @Update
    void update(Viagem viagem);

    @Query("SELECT * FROM VIAGEM_TABLE WHERE VIAGEM_TABLE.ID_VIAGEM == :id")
    Viagem loadViagemByID(Long id);

    @Query("DELETE FROM VIAGEM_TABLE where VIAGEM_TABLE.ID_VIAGEM == :id")
    void delete(long id);

    @Query("SELECT * from VIAGEM_TABLE")
    List<Viagem> loadViagens();

    @Query("SELECT VIAGEM_TABLE.ID_VIAGEM,VIAGEM_TABLE.enderecoSaida,VIAGEM_TABLE.enderecoChegada, CLIENTE_TABLE.ID_CLIENTE as cliente_ID ,CLIENTE_TABLE.nomeCliente as cliente_nome, MOTORISTA_TABLE.ID_MOTORISTA as motorista_ID, MOTORISTA_TABLE.nomeMotorista as motorista_nome from VIAGEM_TABLE INNER JOIN CLIENTE_TABLE ON VIAGEM_TABLE.viagem_id = CLIENTE_TABLE.ID_CLIENTE INNER JOIN MOTORISTA_TABLE ON VIAGEM_TABLE.viagem_id = MOTORISTA_TABLE.ID_MOTORISTA  ORDER BY valorViagem DESC")
    List<ViagemJoin> loadViagensJoin();

    @Query("SELECT enderecoChegada, enderecoSaida from VIAGEM_TABLE")
    List<String> loadViagemEndereco();

    static class ViagemJoin{
        @Embedded
        public Viagem viagem;
        @Embedded(prefix = "cliente_")
        public Cliente cliente;

        @Embedded(prefix = "motorista_")
        public Motorista motorista;
    }
}
