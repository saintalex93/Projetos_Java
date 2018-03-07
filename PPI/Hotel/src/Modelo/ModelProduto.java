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
public class ModelProduto {

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getSituacaoProduto() {
        return situacaoProduto;
    }

    public void setSituacaoProduto(String situacaoProduto) {
        this.situacaoProduto = situacaoProduto;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }


    private int codProduto;
    private String nomeProduto;
    private String situacaoProduto;
    private int codSetor;

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public ModelProduto(int codProduto, String nomeProduto, String situacaoProduto, int codSetor, double valorProduto) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.situacaoProduto = situacaoProduto;
        this.codSetor = codSetor;
        this.valorProduto = valorProduto;
    }
    private double valorProduto;

    public ModelProduto() {
    }
    
}
