package com.example.shootingstars.apptransportefinal.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity(tableName = "CLIENTE_TABLE")
public class Cliente {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_CLIENTE")
    private long idCliente;
    private String nomeCliente;
    private String emailCliente;
    private String senhaCliente;
    private Date dataNascimentoCliente;
    private Character sexoCliente;
    private String cpfCliente;
    private String deficiencia;
    private Date dataCadastroCliente;
    private List<Viagem> viagems;

    public Cliente() {
    }

    public Cliente(long idCliente, String nomeCliente, String emailCliente, String senhaCliente, Date dataNascimentoCliente, Character sexoCliente, String cpfCliente, String deficiencia, Date dataCadastroCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.senhaCliente = senhaCliente;
        this.dataNascimentoCliente = dataNascimentoCliente;
        this.sexoCliente = sexoCliente;
        this.cpfCliente = cpfCliente;
        this.deficiencia = deficiencia;
        this.dataCadastroCliente = dataCadastroCliente;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }

    public Date getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(Date dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    public Character getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(Character sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public Date getDataCadastroCliente() {
        return dataCadastroCliente;
    }

    public void setDataCadastroCliente(Date dataCadastroCliente) {
        this.dataCadastroCliente = dataCadastroCliente;
    }

    public List<Viagem> getViagems() {
        return viagems;
    }

    public void setViagems(List<Viagem> viagems) {
        this.viagems = viagems;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente == cliente.idCliente &&
                Objects.equals(nomeCliente, cliente.nomeCliente) &&
                Objects.equals(emailCliente, cliente.emailCliente) &&
                Objects.equals(senhaCliente, cliente.senhaCliente) &&
                Objects.equals(dataNascimentoCliente, cliente.dataNascimentoCliente) &&
                Objects.equals(sexoCliente, cliente.sexoCliente) &&
                Objects.equals(cpfCliente, cliente.cpfCliente) &&
                Objects.equals(deficiencia, cliente.deficiencia) &&
                Objects.equals(dataCadastroCliente, cliente.dataCadastroCliente);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {

        return Objects.hash(idCliente, nomeCliente, emailCliente, senhaCliente, dataNascimentoCliente, sexoCliente, cpfCliente, deficiencia, dataCadastroCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", emailCliente='" + emailCliente + '\'' +
                ", senhaCliente='" + senhaCliente + '\'' +
                ", dataNascimentoCliente=" + dataNascimentoCliente +
                ", sexoCliente=" + sexoCliente +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", deficiencia='" + deficiencia + '\'' +
                ", dataCadastroCliente=" + dataCadastroCliente +
                '}';
    }
}
