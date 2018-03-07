/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelComanda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class clsComanda {
    
            
    Mysql con;
    private ResultSet rs;

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Mysql getCon() {
        return con;
    }

    public void setCon(Mysql con) {
        this.con = con;
    }
    
      public void Incluir(modelComanda ObjComanda) throws Exception {
        Mysql con = new Mysql();

        try {

            PreparedStatement ps = con.getConexao().prepareCall("{call USP_JAVA_InsereComanda_Produto (?,?,?)}");
            ps.setInt(1, ObjComanda.getCodComanda());
            ps.setInt(2, ObjComanda.getCodProduto());
            ps.setInt(3, ObjComanda.getCodUsuario());
          


            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto Lançado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Lançado Produto " + e);
        }
    }
    
}
