package com.example.shootingstars.apptransportefinal.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity(tableName = "VIAGEM_TABLE",
        foreignKeys = {@ForeignKey(entity = Cliente.class, parentColumns = "ID_VIAGEM", childColumns = "ID_CLIENTE"),
                @ForeignKey(entity = Motorista.class, parentColumns = "ID_VIAGEM", childColumns = "ID_MOTORISTA")})
public class Viagem {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_VIAGEM")
    private long idViagem;
    private String enderecoSaida;
    private String enderecoChegada;
    private Date dataSaida;
    private Date dataChegada;
    private Float valorViagem;

    @ColumnInfo(name = "ID_MOTORISTA")
    private Motorista motorista;

    @ColumnInfo(name = "ID_CLIENTE")
    private Cliente cliente;

    public Viagem() {
    }

    public Viagem(long idViagem, String enderecoSaida, String enderecoChegada, Date dataSaida, Date dataChegada, Float valorViagem, Motorista motorista, Cliente cliente) {
        this.idViagem = idViagem;
        this.enderecoSaida = enderecoSaida;
        this.enderecoChegada = enderecoChegada;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.valorViagem = valorViagem;
        this.motorista = motorista;
        this.cliente = cliente;
    }

    public long getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(long idViagem) {
        this.idViagem = idViagem;
    }

    public String getEnderecoSaida() {
        return enderecoSaida;
    }

    public void setEnderecoSaida(String enderecoSaida) {
        this.enderecoSaida = enderecoSaida;
    }

    public String getEnderecoChegada() {
        return enderecoChegada;
    }

    public void setEnderecoChegada(String enderecoChegada) {
        this.enderecoChegada = enderecoChegada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Float getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(Float valorViagem) {
        this.valorViagem = valorViagem;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viagem viagem = (Viagem) o;
        return idViagem == viagem.idViagem &&
                Objects.equals(enderecoSaida, viagem.enderecoSaida) &&
                Objects.equals(enderecoChegada, viagem.enderecoChegada) &&
                Objects.equals(dataSaida, viagem.dataSaida) &&
                Objects.equals(dataChegada, viagem.dataChegada) &&
                Objects.equals(valorViagem, viagem.valorViagem) &&
                Objects.equals(motorista, viagem.motorista) &&
                Objects.equals(cliente, viagem.cliente);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {

        return Objects.hash(idViagem, enderecoSaida, enderecoChegada, dataSaida, dataChegada, valorViagem, motorista, cliente);
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "idViagem=" + idViagem +
                ", enderecoSaida='" + enderecoSaida + '\'' +
                ", enderecoChegada='" + enderecoChegada + '\'' +
                ", dataSaida=" + dataSaida +
                ", dataChegada=" + dataChegada +
                ", valorViagem=" + valorViagem +
                ", motorista=" + motorista +
                ", cliente=" + cliente +
                '}';
    }
}
