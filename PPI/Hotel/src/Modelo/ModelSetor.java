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
public class ModelSetor {

    public ModelSetor() {
    }

    public ModelSetor(int codSetor, String NomeSetor) {
        this.codSetor = codSetor;
        this.NomeSetor = NomeSetor;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public String getNomeSetor() {
        return NomeSetor;
    }

    public void setNomeSetor(String NomeSetor) {
        this.NomeSetor = NomeSetor;
    }
    
    private int codSetor;
    private String NomeSetor;
    
}
