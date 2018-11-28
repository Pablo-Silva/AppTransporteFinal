package com.example.shootingstars.apptransportefinal.Repository;

import android.content.Context;

public class Repository {

    private ViagemRepository viagemRepository;
    private ClienteRepository clienteRepository;
    private MoristaRepository moristaRepository;

    public Repository(Context context){
        viagemRepository = new ViagemRepository(context);
        clienteRepository = new ClienteRepository(context);
        moristaRepository = new MoristaRepository(context);
    }

    public ViagemRepository getViagemRepository() {
        return viagemRepository;
    }

    public ClienteRepository getClienteRepository(){return clienteRepository;}

    public MoristaRepository getMoristaRepository(){return moristaRepository;}
}
