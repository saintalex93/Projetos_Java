/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import giovanellis.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.ModeloFuncionario;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class ControladorLancamentoFuncionario {
    private ConectaBanco conn;
    private ResultSet rs;
    public ControladorLancamentoFuncionario() throws Exception {
        
         
    }
    
    
    
    public void LancarPagamento (ModeloFuncionario fun) throws SQLException, Exception
    {
       conn = new ConectaBanco();
            //String sql = "Insert into Pagamento (ValorPagamento, DataExpedido, TipoPagamento, Cod_Funcionario)"
          //      +"values(?,?,?,?)";
        PreparedStatement pst = conn.getConexao().prepareCall("{call JAVA_USP_LancamentoFuncionario (?,?,?,?)}");
        pst.setDouble(1, fun.getValorPagamento()); 
        pst.setString(2, fun.getDataExpedido());
        pst.setString(3, fun.getTipodeDespesa());
        pst.setInt(4, fun.getCodFuncionario());
        pst.executeUpdate();
        conn.desconecta();
    } 
    
     public void AlterarPagamento (ModeloFuncionario fun) throws SQLException, Exception
    {
        conn = new ConectaBanco();
            //String sql = "Insert into Pagamento (ValorPagamento, DataExpedido, TipoPagamento, Cod_Funcionario)"
          //      +"values(?,?,?,?)";
        PreparedStatement pst = conn.getConexao().prepareCall("{call JAVA_USP_AlteracaoFuncionario (?,?,?,?,?)}");
        pst.setDouble(1, fun.getValorPagamento()); 
        pst.setString(2, fun.getDataExpedido());
        pst.setString(3, fun.getTipodeDespesa());
        pst.setInt(4, fun.getCodFuncionario());
        pst.setInt(5, fun.getCodDespesa());
        pst.executeUpdate();
         conn.desconecta();
    }
    
   
}
