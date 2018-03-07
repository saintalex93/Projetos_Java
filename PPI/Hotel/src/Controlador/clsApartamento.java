/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Mysql;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Modelo.ModelApartamento;

/**
 *
 * @author Alex
 */
public class clsApartamento {
    
       Mysql con;
        
        public void Incluir (ModelApartamento objApartamento) throws Exception {

       Mysql con = new Mysql();

           try {
       
       PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_InsereApartamento (?,?,?,?)}");
       ps.setString(1, objApartamento.getDescricao());
        ps.setInt(2, objApartamento.getCategoriaApartamento());
        ps.setInt(3, objApartamento.getMax_pax());
        ps.setString(4, objApartamento.getSituacao());

             
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Apartamento Inserido com Sucesso!");
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Erro ao Inserir Apartamento "+e);
           }
       }
        
        
            public void Alterar (ModelApartamento objApartamento) throws Exception {

       Mysql con = new Mysql();

           try {
       
       PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_AlteraApartamento (?,?,?,?,?)}");
        ps.setInt(1, objApartamento.getCodApartamento());
       ps.setString(2, objApartamento.getDescricao());
        ps.setDouble(3, objApartamento.getCategoriaApartamento());
        ps.setInt(4, objApartamento.getMax_pax());
        ps.setString(5, objApartamento.getSituacao());

             
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Apartamento Alterado com Sucesso!");
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Erro ao Alterar Apartamento "+e);
           }
       }
    
}
