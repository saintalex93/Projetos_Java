/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ETESP
 */
public class modeloContatos {
    
    private int id;
    private String nome;
    private String fone;
    
    
    
    //**********Métodos******************//
    public void setId (int id)
    {
    
    this.id = id;
    
    }
    
    public int getId()
            
    {
    
    return id;
    
    }

     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
    
}
