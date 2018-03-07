/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.clsLogin;
import giovanellis.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alex
 */
public class ControladorLogin extends ConectaBanco{
    
    PreparedStatement ps;
    
    
    public ControladorLogin() throws Exception {}
    
    public clsLogin existe(String usuario) throws Exception{
      
        
        clsLogin obj = null;
        String sql = "select * from Funcionario where Login_Funcionario = ?";
      ps = getConexao().prepareStatement(sql);
        
        ps.setString(1, usuario);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            obj = new clsLogin();
            obj.setSenha(rs.getString("Senha_Funcionario"));
           
        }
        //System.out.println("Conectado no controlador");
      
        return obj;
        
        
        
    }

     
    
    
    }
    
    
  


