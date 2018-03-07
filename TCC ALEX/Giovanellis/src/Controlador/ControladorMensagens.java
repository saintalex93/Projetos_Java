/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.ModeloMensagens;
import giovanellis.ConectaBanco;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author Alex
 */
public class ControladorMensagens {

    public ControladorMensagens(ConectaBanco conn, PreparedStatement pst, ResultSet rs) {
        this.conn = conn;
        
        this.rs = rs;
    }
    
    private ConectaBanco conn;
    private ResultSet rs;
    
    
    public void InserirMensagem(ModeloMensagens ModMensagem) throws SQLException, Exception
    {
        conn = new ConectaBanco();
        PreparedStatement pst = conn.getConexao().prepareCall("{call USP_JAVA_ENVIARMENSAGEM (?,?,?,?)}");
        pst.setInt(1, ModMensagem.getCodRemetente());
        pst.setInt(2, ModMensagem.getCodDestinatario());
        pst.setString(3,ModMensagem.getAssunto() );
        pst.setString(4, ModMensagem.getMensagem());
        pst.executeUpdate();

    }

    public void ResponderMensagem(ModeloMensagens ModMensagem) throws SQLException, Exception
    {
         conn = new ConectaBanco();
        PreparedStatement pst = conn.getConexao().prepareCall("{call USP_JAVA_RESPONDERMENSAGEM (?,?,?,?,?)}");
        pst.setInt(1, ModMensagem.getCodMensagem());
        pst.setString(2, ModMensagem.getMensagem());
        pst.setString(3, ModMensagem.getAssunto());
        pst.setInt(4, ModMensagem.getCodRemetente());
        pst.setInt(5, ModMensagem.getCodDestinatario());
        
        pst.executeUpdate();

    }
    
       public void EncaminharMensagem(ModeloMensagens ModMensagem) throws SQLException, Exception
    {
         conn = new ConectaBanco();
        PreparedStatement pst = conn.getConexao().prepareCall("{call USP_JAVA_ENCAMINHARMENSAGEM (?,?,?,?)}");
        pst.setInt(1, ModMensagem.getCodRemetente());
        pst.setInt(2, ModMensagem.getCodDestinatario());
        pst.setString(3,ModMensagem.getAssunto() );
        pst.setString(4, ModMensagem.getMensagem());        
        pst.executeUpdate();

    }
    
           
      public void DeletarMensagem(ModeloMensagens ModMensagem) throws SQLException, Exception
    {
         conn = new ConectaBanco();
        PreparedStatement pst = conn.getConexao().prepareCall("{call USP_JAVA_DELETARMENSAGEM (?)}");
        pst.setInt(1, ModMensagem.getCodMensagem());
        pst.executeUpdate();

    }

    
    public ConectaBanco getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(ConectaBanco conn) {
        this.conn = conn;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
}
