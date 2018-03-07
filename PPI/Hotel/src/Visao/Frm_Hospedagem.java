

package Visao;

import java.text.DecimalFormat;

import java.awt.Color;
import java.text.NumberFormat;

import javax.swing.*;
import Modelo.teclasPermitidas;




  


public class Frm_Hospedagem extends javax.swing.JFrame {

    /**
     * @return the total
     */
    public static double getTotal() {
        return total;
    }

    /**
     * @param aTotal the total to set
     */
    public static void setTotal(double aTotal) {
        total = aTotal;
    }

    public Frm_Hospedagem() {
        
      //  this.setIconImage(new ImageIcon(getClass().getResource("/imagem/icone.png")).getImage());  
        Color AzulBebe = new Color(206,224,231); 
        //Azul Bebe (206,224,231);  
        //(211,225,230)
       
        getContentPane().setBackground(AzulBebe);
        initComponents();
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoF = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        AgenciasGrupo = new javax.swing.ButtonGroup();
        Lbl_QuantidadeDiarias = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        LblQdt = new javax.swing.JLabel();
        Lbl_QuantidadeCrianca = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        lblQdtFrigo = new javax.swing.JLabel();
        RdNaoFrigobar = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jc3 = new javax.swing.JCheckBox();
        jc1 = new javax.swing.JCheckBox();
        jc2 = new javax.swing.JCheckBox();
        jc6 = new javax.swing.JCheckBox();
        jc4 = new javax.swing.JCheckBox();
        jc5 = new javax.swing.JCheckBox();
        BtnFinalizarPesquisa = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        BtnNovaPesquisa = new javax.swing.JButton();
        rd10 = new javax.swing.JRadioButton();
        rd15 = new javax.swing.JRadioButton();
        rd30 = new javax.swing.JRadioButton();
        rd40 = new javax.swing.JRadioButton();
        rd50 = new javax.swing.JRadioButton();
        rd0 = new javax.swing.JRadioButton();
        rd_meia = new javax.swing.JRadioButton();
        Txt_QdtEspecial1 = new javax.swing.JTextField();
        Txt_qdtDuplo1 = new javax.swing.JTextField();
        Txt_qdtTriplo1 = new javax.swing.JTextField();
        Txt_qdtQuadruplo1 = new javax.swing.JTextField();
        Txt_qdtQuintuplo1 = new javax.swing.JTextField();
        Txt_qdtSextuplo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Rd_Booking = new javax.swing.JRadioButton();
        Rd_trend = new javax.swing.JRadioButton();
        Rd_cvc = new javax.swing.JRadioButton();
        Rd_HotelUrbano = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Rd_phantom = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_Frigobar = new javax.swing.JLabel();
        TxtQdtFrigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservas");
        setBackground(new java.awt.Color(75, 146, 219));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_QuantidadeDiarias.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Lbl_QuantidadeDiarias.setText("Quantidade de Diárias");
        getContentPane().add(Lbl_QuantidadeDiarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, -1));

        txtD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });
        getContentPane().add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, -1));

        LblQdt.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        LblQdt.setText("Quantidade");
        getContentPane().add(LblQdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 70, -1));

        Lbl_QuantidadeCrianca.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Lbl_QuantidadeCrianca.setText("Quantidade de Crianças?");
        getContentPane().add(Lbl_QuantidadeCrianca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        txtC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC.setToolTipText("Crianças de até 5 anos é gratuito.");
        txtC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCFocusLost(evt);
            }
        });
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 50, -1));

        lblQdtFrigo.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblQdtFrigo.setText("Quantidade");
        getContentPane().add(lblQdtFrigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 70, 20));

        grupoF.add(RdNaoFrigobar);
        RdNaoFrigobar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        RdNaoFrigobar.setSelected(true);
        RdNaoFrigobar.setText("Não");
        RdNaoFrigobar.setOpaque(false);
        RdNaoFrigobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdNaoFrigobarActionPerformed(evt);
            }
        });
        getContentPane().add(RdNaoFrigobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        grupoF.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jRadioButton2.setText("Sim");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jc3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jc3.setText("Quadruplo");
        jc3.setOpaque(false);
        jc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc3ActionPerformed(evt);
            }
        });
        getContentPane().add(jc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 20));

        jc1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jc1.setText("Duplo");
        jc1.setOpaque(false);
        jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc1ActionPerformed(evt);
            }
        });
        getContentPane().add(jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 20));

        jc2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jc2.setText("Triplo");
        jc2.setOpaque(false);
        jc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc2ActionPerformed(evt);
            }
        });
        getContentPane().add(jc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 20));

        jc6.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jc6.setText("Especial");
        jc6.setOpaque(false);
        jc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc6ActionPerformed(evt);
            }
        });
        getContentPane().add(jc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 20));

        jc4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jc4.setText("Quintuplo");
        jc4.setOpaque(false);
        jc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc4ActionPerformed(evt);
            }
        });
        getContentPane().add(jc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 20));

        jc5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jc5.setText("Sextuplo");
        jc5.setOpaque(false);
        jc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc5ActionPerformed(evt);
            }
        });
        getContentPane().add(jc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 20));

        BtnFinalizarPesquisa.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        BtnFinalizarPesquisa.setText("Finalizar Pesquiza");
        BtnFinalizarPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFinalizarPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 140, -1));

        lbltotal.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 180, 30));

        BtnNovaPesquisa.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        BtnNovaPesquisa.setText("Nova Pesquisa");
        BtnNovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovaPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNovaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, -1));

        buttonGroup1.add(rd10);
        rd10.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rd10.setText("10%");
        rd10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rd10.setOpaque(false);
        rd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd10ActionPerformed(evt);
            }
        });
        getContentPane().add(rd10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        buttonGroup1.add(rd15);
        rd15.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rd15.setText("15%");
        rd15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rd15.setOpaque(false);
        rd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd15ActionPerformed(evt);
            }
        });
        getContentPane().add(rd15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        buttonGroup1.add(rd30);
        rd30.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rd30.setText("20%");
        rd30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rd30.setOpaque(false);
        rd30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd30ActionPerformed(evt);
            }
        });
        getContentPane().add(rd30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        buttonGroup1.add(rd40);
        rd40.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rd40.setText("40%");
        rd40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rd40.setOpaque(false);
        rd40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd40ActionPerformed(evt);
            }
        });
        getContentPane().add(rd40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        buttonGroup1.add(rd50);
        rd50.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rd50.setText("50%");
        rd50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rd50.setOpaque(false);
        rd50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd50ActionPerformed(evt);
            }
        });
        getContentPane().add(rd50, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        buttonGroup1.add(rd0);
        rd0.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rd0.setSelected(true);
        rd0.setText("0%");
        rd0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rd0.setOpaque(false);
        rd0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd0ActionPerformed(evt);
            }
        });
        getContentPane().add(rd0, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        rd_meia.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rd_meia.setText("Meia Diária");
        rd_meia.setOpaque(false);
        rd_meia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_meiaMouseClicked(evt);
            }
        });
        rd_meia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_meiaActionPerformed(evt);
            }
        });
        getContentPane().add(rd_meia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));
        getContentPane().add(Txt_QdtEspecial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 30, -1));

        Txt_qdtDuplo1.setText(" ");
        Txt_qdtDuplo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_qdtDuplo1ActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_qdtDuplo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 30, -1));
        getContentPane().add(Txt_qdtTriplo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 30, -1));
        getContentPane().add(Txt_qdtQuadruplo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 30, -1));

        Txt_qdtQuintuplo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_qdtQuintuplo1ActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_qdtQuintuplo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 30, -1));

        Txt_qdtSextuplo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_qdtSextuplo1ActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_qdtSextuplo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 30, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel5.setText("Agências");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        AgenciasGrupo.add(Rd_Booking);
        Rd_Booking.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Rd_Booking.setText("Booking");
        Rd_Booking.setOpaque(false);
        Rd_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_BookingActionPerformed(evt);
            }
        });
        getContentPane().add(Rd_Booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        AgenciasGrupo.add(Rd_trend);
        Rd_trend.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Rd_trend.setText("Trend");
        Rd_trend.setOpaque(false);
        Rd_trend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_trendActionPerformed(evt);
            }
        });
        getContentPane().add(Rd_trend, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        AgenciasGrupo.add(Rd_cvc);
        Rd_cvc.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Rd_cvc.setText("CVC");
        Rd_cvc.setOpaque(false);
        Rd_cvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_cvcActionPerformed(evt);
            }
        });
        getContentPane().add(Rd_cvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        AgenciasGrupo.add(Rd_HotelUrbano);
        Rd_HotelUrbano.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Rd_HotelUrbano.setText("Hotel Urbano");
        Rd_HotelUrbano.setOpaque(false);
        Rd_HotelUrbano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_HotelUrbanoActionPerformed(evt);
            }
        });
        getContentPane().add(Rd_HotelUrbano, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.black));
        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 190, 90));

        AgenciasGrupo.add(Rd_phantom);
        Rd_phantom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_phantomActionPerformed(evt);
            }
        });
        getContentPane().add(Rd_phantom, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel6.setText("Tipo de Apartamento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, -1));

        lbl_Frigobar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lbl_Frigobar.setText("Deseja Frigobar?");
        getContentPane().add(lbl_Frigobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 20));

        TxtQdtFrigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TxtQdtFrigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 30, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.black));
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setText("Desconto:");
        jPanel2.add(jLabel3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 180, 90));

        jMenuBar1.setForeground(java.awt.SystemColor.activeCaption);

        jMenu1.setText("Eventos");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(483, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
      metodoteclaspermitidas();
      limpacampos();
   
    }//GEN-LAST:event_formWindowOpened

    private void jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc1ActionPerformed
        Txt_qdtDuplo1.setVisible(true);
        LblQdt.setVisible(true);
     
}//GEN-LAST:event_jc1ActionPerformed

    private void jc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc2ActionPerformed
        Txt_qdtTriplo1.setVisible(true);
        LblQdt.setVisible(true);

}//GEN-LAST:event_jc2ActionPerformed

    private void jc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc3ActionPerformed
   
        Txt_qdtQuadruplo1.setVisible(true);
        LblQdt.setVisible(true);
     
}//GEN-LAST:event_jc3ActionPerformed

    private void jc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc4ActionPerformed
 
        Txt_qdtQuintuplo1.setVisible(true);
        LblQdt.setVisible(true);
       
}//GEN-LAST:event_jc4ActionPerformed

    private void jc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc5ActionPerformed
        Txt_qdtSextuplo1.setVisible(true);
        LblQdt.setVisible(true);
  
}//GEN-LAST:event_jc5ActionPerformed

    private void jc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc6ActionPerformed
       
        Txt_QdtEspecial1.setVisible(true);
        LblQdt.setVisible(true);

}//GEN-LAST:event_jc6ActionPerformed

    private void BtnFinalizarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarPesquisaActionPerformed
    qtdfrigobar = Integer.parseInt(TxtQdtFrigo.getText());
    frigobar=qtdfrigobar*frigobar;     
//Duplo
if (jc1.isSelected()){
    
qdtduplos = Integer.parseInt(Txt_qdtDuplo1.getText());     
}else{
Txt_qdtDuplo1.setVisible(false);
duplos=0;
}
   
//Triplo
if (jc2.isSelected()){
 
qdtTriplo = Integer.parseInt(Txt_qdtTriplo1.getText());    
}else{
Txt_qdtTriplo1.setVisible(false);
triplos=0;
} 

//Quádruplo
if (jc3.isSelected()) {
qdtQuadruplo = Integer.parseInt(Txt_qdtQuadruplo1.getText());

} else {
Txt_qdtQuadruplo1.setVisible(false);
quadruplos=0;
}
 
//Quíntuplo
if (jc4.isSelected()) {
    

} else {
Txt_qdtQuintuplo1.setVisible(false);
quintuplos=0;
}
       
//Sêxtuplo
if (jc5.isSelected()) {
    

} else {
Txt_qdtSextuplo1.setVisible(false);
sextuplos=0;
}
        
//Especial
if (jc6.isSelected()) {
    

} else {
Txt_QdtEspecial1.setVisible(false);
especials=0;
}       
        
      
         
        
        try {
           
            
             diaria = Integer.parseInt(txtD.getText());
            diaria = diaria+meia;
            
            
            qdtQuintuplo = Integer.parseInt(Txt_qdtQuintuplo1.getText());
            qdtSextuplo = Integer.parseInt(Txt_qdtSextuplo1.getText());
            qdtEspecial = Integer.parseInt(Txt_QdtEspecial1.getText());
            
            TotalDuplos = qdtduplos*duplos*diaria;
            TotalTriplos= qdtTriplo*triplos*diaria;
            TotalQuadruplos=qdtQuadruplo*quadruplos*diaria;
            TotalQuintuplos=qdtQuintuplo*quintuplos*diaria;
            TotalSextuplos=qdtSextuplo*sextuplos*diaria;
            TotalEspecial=qdtEspecial*especials*diaria;
            

            
            QtdCriancas = Integer.parseInt(txtC.getText())*58; // Valor por criança
        }   catch (Exception ex) {
            txtC.setText("0");
            QtdCriancas=0;
            diaria = 0;
            
        }
        
       
        total=((total+QtdCriancas)*diaria);
        
        TotalCriancas = Double.parseDouble(txtC.getText())*58*(desconto);
        
        QdtApartamentos = qdtduplos + qdtTriplo + qdtQuadruplo + qdtQuintuplo + qdtSextuplo + qdtEspecial;
        
        setTotal(getTotal() + TotalDuplos + TotalTriplos + TotalQuadruplos + TotalQuintuplos
                            + TotalSextuplos + TotalEspecial);
        setTotal(getTotal() - (getTotal() * desconto ));//Aplicando desconto
         
         VlrTotal = total;
         VlrTotal=getTotal()+frigobar;
         
         BtnFinalizarPesquisa.setEnabled(false);
           NumberFormat z = NumberFormat.getCurrencyInstance();
        lbltotal.setText(z.format((getTotal()+frigobar))); // Formatando o valor total
    
    }//GEN-LAST:event_BtnFinalizarPesquisaActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed

    }//GEN-LAST:event_txtDActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
     
    
    frigobar=50.00;
    
     lblQdtFrigo.setVisible(true);
     TxtQdtFrigo.setVisible(true);
     TxtQdtFrigo.setText("1");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void BtnNovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovaPesquisaActionPerformed
       limpacampos();
       BtnFinalizarPesquisa.setEnabled(true);

    }//GEN-LAST:event_BtnNovaPesquisaActionPerformed

    private void RdNaoFrigobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdNaoFrigobarActionPerformed
    frigobar=0;        // TODO add your handling code here:
    lblQdtFrigo.setVisible(false);
    TxtQdtFrigo.setVisible(false);
    }//GEN-LAST:event_RdNaoFrigobarActionPerformed

    private void rd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd15ActionPerformed
       
        
       
       try{
           PorcentagemDesconto = "15%";
            desconto =(0.15);
          
        }catch(Exception ex){}

       
     
    }//GEN-LAST:event_rd15ActionPerformed

    private void rd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd10ActionPerformed
        
        try{
           
            desconto =(0.1);
            PorcentagemDesconto = "10%";
      
        }catch(Exception ex){}
        
       

         
    }//GEN-LAST:event_rd10ActionPerformed

    private void rd0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd0ActionPerformed
          try{
           
            desconto =(0.0);
            PorcentagemDesconto = "0%";
      
        }catch(Exception ex){}
        
        
        
        
    }//GEN-LAST:event_rd0ActionPerformed

    private void rd30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd30ActionPerformed
        
     try{
           
            desconto =(0.20);
          
            PorcentagemDesconto = "20%";
        }catch(Exception ex){}

       
     
        
    
    }//GEN-LAST:event_rd30ActionPerformed

    private void rd40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd40ActionPerformed
        
       try{
           
            desconto =(0.40);
           PorcentagemDesconto = "40%";
        
        }catch(Exception ex){}

       
     
         
    }//GEN-LAST:event_rd40ActionPerformed

    private void rd50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd50ActionPerformed
        
      try{
           
            desconto =(0.50);
           
       PorcentagemDesconto = "50%";
        }catch(Exception ex){}

       
     
       
    }//GEN-LAST:event_rd50ActionPerformed

    private void txtCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCFocusGained
   
    }//GEN-LAST:event_txtCFocusGained

    private void txtCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCFocusLost
         
    }//GEN-LAST:event_txtCFocusLost

    private void rd_meiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_meiaActionPerformed
        
    }//GEN-LAST:event_rd_meiaActionPerformed

    private void rd_meiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_meiaMouseClicked
       
        try{
        
        
        if(rd_meia.isSelected()){
        
         meia = +0.5;
        
        }    
        
        
        else {
        
        meia = 0;
        
        }
        }
        
        catch(Exception e){}
        
       
              
          
    }//GEN-LAST:event_rd_meiaMouseClicked

    private void Txt_qdtQuintuplo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_qdtQuintuplo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_qdtQuintuplo1ActionPerformed

    private void Txt_qdtSextuplo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_qdtSextuplo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_qdtSextuplo1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new frm_Eventos().setVisible(true); 
dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void Rd_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_BookingActionPerformed
     TarifaBooking();
    }//GEN-LAST:event_Rd_BookingActionPerformed

    private void Txt_qdtDuplo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_qdtDuplo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_qdtDuplo1ActionPerformed

    private void Rd_phantomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_phantomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rd_phantomActionPerformed

    private void Rd_trendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_trendActionPerformed
    TarifaTrend();
    }//GEN-LAST:event_Rd_trendActionPerformed

    private void Rd_HotelUrbanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_HotelUrbanoActionPerformed
      TarifaHotelUrbano();
    }//GEN-LAST:event_Rd_HotelUrbanoActionPerformed

    private void Rd_cvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_cvcActionPerformed
         TarifaCvc();
    }//GEN-LAST:event_Rd_cvcActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Hospedagem().setVisible(true);
            }
        });
    }
    

    
    public void limpacampos()
            
    {
        
      txtD.requestFocus();
      setTotal(0);
        
      desconto=0;
      meia=0;
      frigobar=0;
      duplos=200.00;
      triplos=300.00;
      quadruplos=400.00;
      quintuplos=500.00;
      sextuplos=600.00;
      especials=600.00;
       
      Txt_qdtDuplo1.setText("1");
      Txt_qdtTriplo1.setText("1");
      Txt_qdtQuadruplo1.setText("1");
      Txt_qdtQuintuplo1.setText("1");
      Txt_qdtSextuplo1.setText("1");
      Txt_QdtEspecial1.setText("1");
      txtC.setText("0");
      txtD.setText("1");
      lbltotal.setText(null); 
      TxtQdtFrigo.setText("1");  
       
     
      Txt_qdtDuplo1.setVisible(false);
      Txt_qdtTriplo1.setVisible(false);
      Txt_qdtQuadruplo1.setVisible(false);
      Txt_qdtQuintuplo1.setVisible(false);
      Txt_qdtSextuplo1.setVisible(false);
      Txt_QdtEspecial1.setVisible(false);
      jc1.setVisible(true);
      jc2.setVisible(true);
      jc3.setVisible(true);
      jc4.setVisible(true);
      jc5.setVisible(true);
      jc6.setVisible(true);
      txtC.setVisible(true);
      rd_meia.setVisible(true);
      jRadioButton2.setVisible(true);
      Rd_phantom.setVisible(false);
      lblQdtFrigo.setVisible(false);
      TxtQdtFrigo.setVisible(false);      
      LblQdt.setVisible(false); 
      Lbl_QuantidadeCrianca.setVisible(true);
      lbl_Frigobar.setVisible(true);
      RdNaoFrigobar.setVisible(true);
           
      jc1.setSelected(false);
      jc2.setSelected(false);
      jc3.setSelected(false);
      jc4.setSelected(false);
      jc5.setSelected(false);
      jc6.setSelected(false);
      rd_meia.setSelected(false);
      rd0.setSelected(true);
      RdNaoFrigobar.setSelected(true);
      Rd_phantom.setSelected(true);  
    }
    
    public void TarifaCvc(){
     if(Rd_cvc.isSelected()){
           
           txtD.requestFocus();
           duplos=156.10;
           triplos=240.10;
           quadruplos=296.10;
           quintuplos=366.10;
           sextuplos=436.10;
           especials=197.40;
           
           jc4.setVisible(true);
           jc5.setVisible(true);
           Lbl_QuantidadeCrianca.setVisible(false);
           RdNaoFrigobar.setVisible(false);
           TxtQdtFrigo.setVisible(false);
           txtC.setVisible(false);
           lblQdtFrigo.setVisible(false);
           lbl_Frigobar.setVisible(false);
           jc6.setVisible(false);
           rd_meia.setVisible(false);
           jRadioButton2.setVisible(false);
       }
    }
    
    public void TarifaHotelUrbano(){
       if(Rd_HotelUrbano.isSelected()){
           txtD.requestFocus();
           duplos=189.55;
           triplos=291.55;
           quadruplos=359.55;
           quintuplos=444.55;
           sextuplos=529.55;
           especials=239.7;
           
           jc4.setVisible(true);
           jc5.setVisible(true);
           Lbl_QuantidadeCrianca.setVisible(false);
           RdNaoFrigobar.setVisible(false);
           TxtQdtFrigo.setVisible(false);
           txtC.setVisible(false);
           lblQdtFrigo.setVisible(false);
           lbl_Frigobar.setVisible(false);
           jc6.setVisible(false);
           rd_meia.setVisible(false);
           jRadioButton2.setVisible(false);
       }
    }
    
    public void TarifaTrend(){
          if(Rd_trend.isSelected()){
           
           txtD.requestFocus();
           duplos=178.40;
           triplos=274.40;
           quadruplos=338.40;
           
           Lbl_QuantidadeCrianca.setVisible(false);
           RdNaoFrigobar.setVisible(false);
           TxtQdtFrigo.setVisible(false);
           txtC.setVisible(false);
           lblQdtFrigo.setVisible(false);
           lbl_Frigobar.setVisible(false);
           jc4.setVisible(false);
           jc5.setVisible(false);
           jc6.setVisible(false);
           rd_meia.setVisible(false);
           jRadioButton2.setVisible(false);
       }
    }
    
    public void TarifaBooking(){
      if(Rd_Booking.isSelected()){
          txtD.requestFocus();
          
           duplos=189.55;
           triplos=291.55;
           quadruplos=359.55;
           quintuplos=444.55;
           sextuplos=529.55;
           especials=239.7;
           
           jc4.setVisible(true);
           jc5.setVisible(true);
           Lbl_QuantidadeCrianca.setVisible(false);
           RdNaoFrigobar.setVisible(false);
           TxtQdtFrigo.setVisible(false);
           txtC.setVisible(false);
           lblQdtFrigo.setVisible(false);
           lbl_Frigobar.setVisible(false);
           jc6.setVisible(false);
           rd_meia.setVisible(false);
           jRadioButton2.setVisible(false);
       }
    }
    
    public void metodoteclaspermitidas(){
    
        txtD.setDocument(new teclasPermitidas());
        txtC.setDocument(new teclasPermitidas());
        Txt_qdtTriplo1.setDocument(new teclasPermitidas());
        Txt_qdtSextuplo1.setDocument(new teclasPermitidas());
        Txt_qdtQuintuplo1.setDocument(new teclasPermitidas());
        Txt_qdtQuadruplo1.setDocument(new teclasPermitidas());
        Txt_qdtDuplo1.setDocument(new teclasPermitidas());
        Txt_QdtEspecial1.setDocument(new teclasPermitidas());
        TxtQdtFrigo.setDocument(new teclasPermitidas());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AgenciasGrupo;
    private javax.swing.JButton BtnFinalizarPesquisa;
    private javax.swing.JButton BtnNovaPesquisa;
    private javax.swing.JLabel LblQdt;
    private javax.swing.JLabel Lbl_QuantidadeCrianca;
    private javax.swing.JLabel Lbl_QuantidadeDiarias;
    private javax.swing.JRadioButton RdNaoFrigobar;
    private javax.swing.JRadioButton Rd_Booking;
    private javax.swing.JRadioButton Rd_HotelUrbano;
    private javax.swing.JRadioButton Rd_cvc;
    private javax.swing.JRadioButton Rd_phantom;
    private javax.swing.JRadioButton Rd_trend;
    private javax.swing.JTextField TxtQdtFrigo;
    private javax.swing.JTextField Txt_QdtEspecial1;
    private javax.swing.JTextField Txt_qdtDuplo1;
    private javax.swing.JTextField Txt_qdtQuadruplo1;
    private javax.swing.JTextField Txt_qdtQuintuplo1;
    private javax.swing.JTextField Txt_qdtSextuplo1;
    private javax.swing.JTextField Txt_qdtTriplo1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup grupoF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JCheckBox jc1;
    private javax.swing.JCheckBox jc2;
    private javax.swing.JCheckBox jc3;
    private javax.swing.JCheckBox jc4;
    private javax.swing.JCheckBox jc5;
    private javax.swing.JCheckBox jc6;
    private javax.swing.JLabel lblQdtFrigo;
    private javax.swing.JLabel lbl_Frigobar;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JRadioButton rd0;
    private javax.swing.JRadioButton rd10;
    private javax.swing.JRadioButton rd15;
    private javax.swing.JRadioButton rd30;
    private javax.swing.JRadioButton rd40;
    private javax.swing.JRadioButton rd50;
    private javax.swing.JRadioButton rd_meia;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    // End of variables declaration//GEN-END:variables
public static double  duplos=200.00, triplos=300.00, quadruplos=400.00, quintuplos=500.00,
        sextuplos=600.00, especials=600.00,frigobar, TotalDuplos, TotalTriplos,
        TotalQuadruplos, TotalQuintuplos,TotalSextuplos,TotalEspecial,diaria=0, TotalCriancas;

public static int     qdtTriplo, qdtQuadruplo,qdtduplos,
       qdtQuintuplo, qdtSextuplo, qdtEspecial, escolha,  qtdfrigobar,QtdCriancas=0, QdtApartamentos;

public static String PorcentagemDesconto;

public static double desconto = 0;

double meia=0;


private static double total;





DecimalFormat formata = new DecimalFormat("0.00"); // Formatar ,00

    /**
     *
     */
    public  static double VlrTotal;
    

//Frm_Hotel Hospedagem = new Frm_Hotel();


  
    

}


