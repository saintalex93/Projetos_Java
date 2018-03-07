
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
public class Mysql {

    private Connection con;
    public Statement stm;
    public ResultSet rs;

    public Mysql() throws Exception {
//          String usuario = "sa", senha = "12345", url = "jdbc:jtds:sqlserver://169.254.128.171:1433/Pizzaria";
//        Class.forName("net.sourceforge.jtds.jdbc.Driver");
//        con = DriverManager.getConnection(url, usuario, senha);
        

        String usuario = "root", senha = "123", url = "jdbc:mysql://localhost:3306/hotel";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, usuario, senha);
        
        
//           String usuario = "sa", senha = "12345", url = "jdbc:jtds:sqlserver://169.254.128.171/Pizzaria";
//        Class.forName("net.sourceforge.jtds.jdbc.Driver");
//        con = DriverManager.getConnection(url, usuario, senha);


    }

    public Connection getConexao() {
        return getCon();
    }

    public void conectar() {

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
    public Connection getCon() {
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

//    public void desconecta() {
//
//        try {
//            System.out.println("Desconectado");
//            con.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco de dados" + ex);
//            ex.printStackTrace();
//        }
//
//    } 
    
}
