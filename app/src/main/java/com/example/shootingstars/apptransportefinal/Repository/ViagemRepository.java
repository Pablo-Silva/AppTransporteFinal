package com.example.shootingstars.apptransportefinal.Repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.shootingstars.apptransportefinal.DAO.IViagemDAO;
import com.example.shootingstars.apptransportefinal.Database.ViagemRoomDatabase;
import com.example.shootingstars.apptransportefinal.Model.Viagem;

import java.util.List;

public class ViagemRepository {
    private IViagemDAO mIViagemDAO;
    private List<Viagem> mViagems;
    private List<IViagemDAO.ViagemJoin> mViagemsJoin;

    public ViagemRepository(Context context){
        ViagemRoomDatabase db = ViagemRoomDatabase.getDatabase(context);
        mIViagemDAO = db.viagemDAO();
    }

    public List<Viagem> getAllViagems(){
        mViagems = mIViagemDAO.loadViagens();
        return mViagems;
    }

    public List<IViagemDAO.ViagemJoin> getAllViagemsJoin(){
        mViagemsJoin = mIViagemDAO.loadViagensJoin();
        return mViagemsJoin;
    }

    public Viagem loadViagemByID(long ID) {
        return mIViagemDAO.loadViagemByID(ID);
    }

    public void insert(Viagem Viagem){
        new insertAsyncTask(mIViagemDAO).execute(Viagem);
    }
    public void delete(long id){mIViagemDAO.delete(id);}
    public void update(Viagem Viagem) {mIViagemDAO.update(Viagem);}

    private static class insertAsyncTask extends AsyncTask<Viagem,Void,Void> {

        private IViagemDAO mAsyncTaskDAO;

        insertAsyncTask(IViagemDAO dao){
            mAsyncTaskDAO = dao;
        }

        @Override
        protected Void doInBackground(final Viagem... params){
            mAsyncTaskDAO.insert(params[0]);
            return null;
        }
    }
}
