/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloReserva;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class clsReserva {

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

    public void Incluir(ModeloReserva ObjetoAcompanhante) throws Exception {
        Mysql con = new Mysql();

        try {

            PreparedStatement ps = con.getConexao().prepareCall("{call USP_JAVA_INSEREACOMPANHANTE (?,?,?,?)}");
            ps.setString(1, ObjetoAcompanhante.getCpfAssociado());
            ps.setString(2, ObjetoAcompanhante.getNomeAssociado());
            ps.setString(3, ObjetoAcompanhante.getNascAssociado());
            ps.setInt(4, ObjetoAcompanhante.getCodReserva());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Acompanhante Inserido com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Acompanhante " + e);
        }
    }

    public void IncluirReserva(ModeloReserva ObjetoReserva) throws Exception {
        Mysql con = new Mysql();

        try {

            PreparedStatement ps = con.getConexao().prepareCall("{call JAVA_USP_INSERERESERVACOMANDA (?,?,?,?,?,?,?)}");
            ps.setString(1, ObjetoReserva.getCheckin());
            ps.setString(2, ObjetoReserva.getCheckout());
            ps.setDouble(3, ObjetoReserva.getTotalreserva());
            ps.setString(4, ObjetoReserva.getCpf());
            ps.setInt(5, ObjetoReserva.getCodApto());
            ps.setInt(6, ObjetoReserva.getCodUsuario());
            ps.setDouble(7, ObjetoReserva.getTotalComanda());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Reserva Inserido com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Acompanhante " + e);
        }
    }

}
// stmt.close();

