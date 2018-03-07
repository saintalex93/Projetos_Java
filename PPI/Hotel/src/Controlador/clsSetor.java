/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelSetor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class clsSetor {
    
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
    
      public void Incluir(ModelSetor ObjSetor) throws Exception {
        Mysql con = new Mysql();

        try {

            PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_InsereSetor (?)}");
            ps.setString(1, ObjSetor.getNomeSetor());


            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Setor Inserido com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Setor " + e);
        }
    }
      
           public void Alterar(ModelSetor ObjSetor) throws Exception {
        Mysql con = new Mysql();

        try {

            PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_AlteraSetor (?,?)}");
            ps.setInt(1, ObjSetor.getCodSetor());
            ps.setString(2, ObjSetor.getNomeSetor());


            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Setor Alterado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Setor " + e);
        }
    }
      
}
