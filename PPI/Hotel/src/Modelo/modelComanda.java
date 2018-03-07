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
public class modelComanda {

    public modelComanda(int CodComanda, int codProduto, int codUsuario) {
        this.CodComanda = CodComanda;
        this.codProduto = codProduto;
        this.codUsuario = codUsuario;
    }

    public int getCodComanda() {
        return CodComanda;
    }

    public modelComanda() {
    }

    public void setCodComanda(int CodComanda) {
        this.CodComanda = CodComanda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }
    int CodComanda, codProduto, codUsuario;
}
