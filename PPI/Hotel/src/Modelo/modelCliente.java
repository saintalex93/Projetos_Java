/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alex
 */
public class modelCliente {

    public modelCliente() {
    }

    public modelCliente(String Cpf_Clien, String Nome_Clien, String Nasc_Clien, String Rua, String N_Resid, String Celular, String Complemento, String Cep_Clien, String Bairro, String Cidade, String UF, String CPFAltera, String Email, String Senha, String TelefoneResidencial) {
        this.Cpf_Clien = Cpf_Clien;
        this.Nome_Clien = Nome_Clien;
        this.Nasc_Clien = Nasc_Clien;
        this.Rua = Rua;
        this.N_Resid = N_Resid;
        this.Celular = Celular;
        this.Complemento = Complemento;
        this.Cep_Clien = Cep_Clien;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.UF = UF;
        this.CPFAltera = CPFAltera;
        this.Email = Email;
        this.Senha = Senha;
        this.TelefoneResidencial = TelefoneResidencial;
    }



private String Cpf_Clien; 
private String Nome_Clien;
private String Nasc_Clien;
private String Rua;
private String N_Resid;
private String Celular;
private String Complemento;
private String Cep_Clien;
private String Bairro;
private String Cidade;
private String UF;
private String CPFAltera;
private String Email;
private String Senha;
private String TelefoneResidencial;

    public String getTelefoneResidencial() {
        return TelefoneResidencial;
    }

    public void setTelefoneResidencial(String TelefoneResidencial) {
        this.TelefoneResidencial = TelefoneResidencial;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

                

    public String getCPFAltera() {
        return CPFAltera;
    }

    public void setCPFAltera(String CPFAltera) {
        this.CPFAltera = CPFAltera;
    }


    public String getCpf_Clien() {
        return Cpf_Clien;
    }

    public void setCpf_Clien(String Cpf_Clien) {
        this.Cpf_Clien = Cpf_Clien;
    }

    public String getNome_Clien() {
        return Nome_Clien;
    }

    public void setNome_Clien(String Nome_Clien) {
        this.Nome_Clien = Nome_Clien;
    }

    public String getNasc_Clien() {
        return Nasc_Clien;
    }

    public void setNasc_Clien(String Nasc_Clien) {
        this.Nasc_Clien = Nasc_Clien;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getN_Resid() {
        return N_Resid;
    }

    public void setN_Resid(String N_Resid) {
        this.N_Resid = N_Resid;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCep_Clien() {
        return Cep_Clien;
    }

    public void setCep_Clien(String Cep_Clien) {
        this.Cep_Clien = Cep_Clien;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
}
