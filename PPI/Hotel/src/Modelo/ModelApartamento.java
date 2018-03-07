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
public class ModelApartamento {

       public ModelApartamento() {
    }
    
    public ModelApartamento(int CodApartamento, String Descricao, int CategoriaApartamento, int Max_pax, String Situacao) {
        this.CodApartamento = CodApartamento;
        this.Descricao = Descricao;
        this.CategoriaApartamento = CategoriaApartamento;
        this.Max_pax = Max_pax;
        this.Situacao = Situacao;
        
    }

    public int getCategoriaApartamento() {
        return CategoriaApartamento;
    }

    public void setCategoriaApartamento(int CategoriaApartamento) {
        this.CategoriaApartamento = CategoriaApartamento;
    }



    public int getCodApartamento() {
        return CodApartamento;
    }

    public void setCodApartamento(int CodApartamento) {
        this.CodApartamento = CodApartamento;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double CategoriaApartamento() {
        return CategoriaApartamento;
    }

    public void CategoriaApartamento(int CategoriaApartamento) {
        this.CategoriaApartamento = CategoriaApartamento;
    }

    public int getMax_pax() {
        return Max_pax;
    }

    public void setMax_pax(int Max_pax) {
        this.Max_pax = Max_pax;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }
    
    private int CodApartamento;
    private String Descricao;
    private int CategoriaApartamento;
    private int Max_pax;
    private String Situacao;
    
    
}
