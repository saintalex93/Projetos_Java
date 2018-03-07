
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giovanellis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class ConectaBanco {

    private Connection con;
    public Statement stm;
    public ResultSet rs;
    private String driver = "net.sourceforge.jtds.jdbc.Driver";// responsavél por identificar o serviço de banco de dados
    String usuario = "sa", senha = "123", url = "jdbc:jtds:sqlserver://SANTOSDESKTOP:1433/Pizzaria";

    public ConectaBanco() throws Exception {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        con = DriverManager.getConnection(url, usuario, senha);
//          String usuario = "sa", senha = "123456", url = "jdbc:jtds:sqlserver://10.67.74.38:1433/Pizzaria";
//        Class.forName("net.sourceforge.jtds.jdbc.Driver");
//        con = DriverManager.getConnection(url, usuario, senha);
    }


    public void conectar() throws SQLException {
        System.out.println("COnectado ao banco conectar");
        con = DriverManager.getConnection(url, usuario, senha);
        
    }

    public void executaSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao executar linha de comando sql "+e);
            e.printStackTrace();
        }

    }

    /**
     * @return the con
     */
    public Connection getConexao() {
        
          System.out.println("Conectado com GetConexão");
        return con;
      
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;

    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void desconecta() {

        try {
            System.out.println("Desconectado");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco de dados" + ex);
            ex.printStackTrace();
        }

    }

}
