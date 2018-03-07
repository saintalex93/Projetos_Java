/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelCategoria;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class clsCategoria {
      Mysql con;
        
        public void Incluir (ModelCategoria objTarifario) throws Exception {

       Mysql con = new Mysql();

           try {
       
       PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_InsereCategoria (?,?,?)}");
       ps.setString(1, objTarifario.getCategoriaApartamento());
       ps.setInt(2, objTarifario.getMaxPax());
        ps.setDouble(3, objTarifario.getValorDiaria());


             
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Categoria Inserida com Sucesso!");
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Erro ao Inserir Categoria "+e);
           }
       }
        
        
            public void Alterar (ModelCategoria ObjAlteraCategoria) throws Exception {

       Mysql con = new Mysql();

           try {
       
       PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_AlteraCategoria (?,?,?,?)}");
        ps.setInt(1, ObjAlteraCategoria.getCodCategoria());
       ps.setString(2, ObjAlteraCategoria.getCategoriaApartamento());
       ps.setInt(3, ObjAlteraCategoria.getMaxPax());
        ps.setDouble(4, ObjAlteraCategoria.getValorDiaria());


             
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Categoria Alterada com Sucesso!");
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Erro ao Alterar Categoria "+e);
           }
       }
    
}
