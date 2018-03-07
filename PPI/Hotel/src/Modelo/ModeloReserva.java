/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alex
 */
public class ModeloReserva {

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public int getCodApto() {
        return codApto;
    }

    public void setCodApto(int codApto) {
        this.codApto = codApto;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public double getTotalreserva() {
        return totalreserva;
    }

    public void setTotalreserva(double totalreserva) {
        this.totalreserva = totalreserva;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public double getTotalComanda() {
        return totalComanda;
    }

    public void setTotalComanda(double totalComanda) {
        this.totalComanda = totalComanda;
    }

    public String getNomeAssociado() {
        return NomeAssociado;
    }

    public void setNomeAssociado(String NomeAssociado) {
        this.NomeAssociado = NomeAssociado;
    }

    public String getCpfAssociado() {
        return cpfAssociado;
    }

    public void setCpfAssociado(String cpfAssociado) {
        this.cpfAssociado = cpfAssociado;
    }

    public String getNascAssociado() {
        return nascAssociado;
    }

    public void setNascAssociado(String nascAssociado) {
        this.nascAssociado = nascAssociado;
    }

    public int getCodAssociado() {
        return codAssociado;
    }

    public void setCodAssociado(int codAssociado) {
        this.codAssociado = codAssociado;
    }

    public ModeloReserva(String cpf, int codReserva, int codApto, int codUsuario, double totalreserva, String checkin, String checkout, double totalComanda, String NomeAssociado, String cpfAssociado, String nascAssociado, int codAssociado) {
        this.cpf = cpf;
        this.codReserva = codReserva;
        this.codApto = codApto;
        this.codUsuario = codUsuario;
        this.totalreserva = totalreserva;
        this.checkin = checkin;
        this.checkout = checkout;
        this.totalComanda = totalComanda;
        this.NomeAssociado = NomeAssociado;
        this.cpfAssociado = cpfAssociado;
        this.nascAssociado = nascAssociado;
        this.codAssociado = codAssociado;
    }
    
    

    public ModeloReserva() {
    }
    private String cpf;
    private int codReserva;
    private int codApto;
    private int codUsuario;
    private double totalreserva;
    private String checkin;
    private String checkout;
    private double totalComanda;

    private String NomeAssociado;
    private String cpfAssociado;
    private String nascAssociado;
    private int codAssociado;
    
    
}
