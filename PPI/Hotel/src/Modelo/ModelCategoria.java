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
public class ModelCategoria {

    public ModelCategoria() {
    }

    public ModelCategoria(int codCategoria, String CategoriaApartamento, double ValorDiaria) {
        this.codCategoria = codCategoria;
        this.CategoriaApartamento = CategoriaApartamento;
        this.ValorDiaria = ValorDiaria;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getCategoriaApartamento() {
        return CategoriaApartamento;
    }

    public void setCategoriaApartamento(String CategoriaApartamento) {
        this.CategoriaApartamento = CategoriaApartamento;
    }

    public double getValorDiaria() {
        return ValorDiaria;
    }

    public void setValorDiaria(double ValorDiaria) {
        this.ValorDiaria = ValorDiaria;
    }
    
    private int codCategoria;
    private String CategoriaApartamento;
    private double ValorDiaria;

    public int getMaxPax() {
        return maxPax;
    }

    public void setMaxPax(int maxPax) {
        this.maxPax = maxPax;
    }
    private int maxPax;
    
}
