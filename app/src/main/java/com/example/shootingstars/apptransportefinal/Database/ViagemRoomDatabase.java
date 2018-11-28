package com.example.shootingstars.apptransportefinal.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.shootingstars.apptransportefinal.DAO.ICLienteDAO;
import com.example.shootingstars.apptransportefinal.DAO.IMotoristaDAO;
import com.example.shootingstars.apptransportefinal.DAO.IViagemDAO;
import com.example.shootingstars.apptransportefinal.Model.Cliente;
import com.example.shootingstars.apptransportefinal.Model.Motorista;
import com.example.shootingstars.apptransportefinal.Model.Viagem;

@Database(entities = {Viagem.class,Cliente.class, Motorista.class},version = 1)
public abstract class ViagemRoomDatabase  extends RoomDatabase {
    private static volatile ViagemRoomDatabase INSTANCE;
    public abstract IViagemDAO viagemDAO();
    public abstract ICLienteDAO cLienteDAO();
    public  abstract IMotoristaDAO motoristaDAO();

    public static ViagemRoomDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (ViagemRoomDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),ViagemRoomDatabase.class,"viagem_database").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }

}
