/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class clsCliente {
        //ConexaoMySQL con;
        Mysql con;
        
        public void Incluir (modelCliente objCliente) throws Exception {
       
       //Connection con =  ConexaoMySQL.getConnection();
       Mysql con = new Mysql();
       
        //PreparedStatement stmt = null;
        
           try {
       //String Sql = "Insert into Despesa(TipoDespesa, ValorDespesa, DataPagamento, DataVencimento) values (?,?,?,?)";
       //PreparedStatement ps = con.getCon().prepareCall("{call JAVA_USP_CadastrarCliente (?,?,?,?,?,?,?,?,?,?,?)}");
       PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_CadastrarCliente (?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        ps.setString(1, objCliente.getCpf_Clien());
        ps.setString(2, objCliente.getNome_Clien());
        ps.setString(3, objCliente.getNasc_Clien());
        ps.setString(4, objCliente.getCelular());
        ps.setString(5, objCliente.getTelefoneResidencial());
        ps.setString(6, objCliente.getRua());
        ps.setString(7, objCliente.getN_Resid());        
        ps.setString(8, objCliente.getComplemento());
        ps.setString(9, objCliente.getCep_Clien());
        ps.setString(10, objCliente.getBairro());
        ps.setString(11, objCliente.getCidade());
        ps.setString(12, objCliente.getUF());
        ps.setString(13, objCliente.getEmail());
        ps.setString(14, objCliente.getSenha());
        
             
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Hóspede incluido com Sucesso!");
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Erro ao Inserir Hospede"+e);
           }
       }
        
        
                public void Alterar (modelCliente objCliente) throws Exception {
       
       //Connection con =  ConexaoMySQL.getConnection();
       Mysql con = new Mysql();
       
        //PreparedStatement stmt = null;
        
           try {
       //String Sql = "Insert into Despesa(TipoDespesa, ValorDespesa, DataPagamento, DataVencimento) values (?,?,?,?)";
       //PreparedStatement ps = con.getCon().prepareCall("{call JAVA_USP_CadastrarCliente (?,?,?,?,?,?,?,?,?,?,?)}");
       PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_AlteraCliente (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
       
       ps.setString(15, objCliente.getCPFAltera());
        ps.setString(1, objCliente.getCpf_Clien());
        ps.setString(2, objCliente.getNome_Clien());
        ps.setString(3, objCliente.getNasc_Clien());
        ps.setString(4, objCliente.getCelular());
        ps.setString(5, objCliente.getTelefoneResidencial());
        ps.setString(6, objCliente.getRua());
        ps.setString(7, objCliente.getN_Resid());        
        ps.setString(8, objCliente.getComplemento());
        ps.setString(9, objCliente.getCep_Clien());
        ps.setString(10, objCliente.getBairro());
        ps.setString(11, objCliente.getCidade());
        ps.setString(12, objCliente.getUF());
        ps.setString(13, objCliente.getEmail());
        ps.setString(14, objCliente.getSenha());
        
             
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Hóspede Alterado com Sucesso!");
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Erro ao Alterar Hóspede "+e);
           }
       }
       
       
       
//       public void Alterar (modelCliente objCliente) throws Exception {
//       
//         ConexaoMySQL con = new ConexaoMySQL();
//        con.conectar();
//        
//           try {
//      
//       PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_AlteraDespesa (?,?,?,?)}");
//        ps.setInt(1, objCliente.getCodigo());
//        ps.setDouble(2, objCliente.getValor());
//        ps.setString(3, objCliente.getDataPagamento());
//        ps.setString(4, objCliente.getDataVencimento());
//        ps.executeUpdate();
//        
//     
//           } catch (Exception e) {
//               
//           }
//       }
}
