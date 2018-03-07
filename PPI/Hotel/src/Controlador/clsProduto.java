/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelProduto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class clsProduto {
        
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
    
      public void Incluir(ModelProduto ObjProduto) throws Exception {
        Mysql con = new Mysql();

        try {

            PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_InsereProduto (?,?,?,?)}");
            ps.setString(1, ObjProduto.getNomeProduto());
            ps.setDouble(2, ObjProduto.getValorProduto());
            ps.setString(3, ObjProduto.getSituacaoProduto());
            ps.setInt(4, ObjProduto.getCodSetor());


            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto Inserido com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Produto " + e);
        }
    }
      
           public void Alterar(ModelProduto ObjProduto) throws Exception {
        Mysql con = new Mysql();

        try {

            PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_AlteraProduto (?,?,?,?,?)}");
         
            ps.setInt(1, ObjProduto.getCodProduto());
            ps.setString(2, ObjProduto.getNomeProduto());
            ps.setDouble(3, ObjProduto.getValorProduto());
            ps.setString(4, ObjProduto.getSituacaoProduto());
            ps.setInt(5, ObjProduto.getCodSetor());
            
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Produto " + e);
        }
    }
}
