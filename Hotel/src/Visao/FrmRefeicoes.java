/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.text.NumberFormat;
import Modelo.ModeloRefeicoes;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class FrmRefeicoes extends javax.swing.JFrame {
    FrmRelatorio relatorio;
    ModeloRefeicoes Refeicao;
     
    /**
     * Creates new form FrmRefeiçõews
     */
    public FrmRefeicoes() {
        
        this.setIconImage(new ImageIcon(getClass().getResource("/imagem/icone.png")).getImage());  
        relatorio = new FrmRelatorio();
        initComponents();
        Refeicao = new ModeloRefeicoes();

    }
    
    FrmRelatorio rel = new FrmRelatorio();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkAlacarteInfantil = new javax.swing.JCheckBox();
        chkCafeAdulto = new javax.swing.JCheckBox();
        chkCafeInfantil = new javax.swing.JCheckBox();
        chkExecutivoAdulto = new javax.swing.JCheckBox();
        chkExecutivoInfantil = new javax.swing.JCheckBox();
        chkAlacarteAdulto = new javax.swing.JCheckBox();
        txtAlacarteInfantil = new javax.swing.JTextField();
        txtCafeAdulto = new javax.swing.JTextField();
        txtCafeInfantil = new javax.swing.JTextField();
        txtExecutivoAdulto = new javax.swing.JTextField();
        txtExecutivoInfantil = new javax.swing.JTextField();
        txtAlacarteAdulto = new javax.swing.JTextField();
        PanelCafe = new javax.swing.JPanel();
        lblTotalCafe = new javax.swing.JLabel();
        PanelAlacarte = new javax.swing.JPanel();
        lblTotalAlacarte = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PanelExecutivo = new javax.swing.JPanel();
        lblTotalExec = new javax.swing.JLabel();
        rdSelfServiceInfantil = new javax.swing.JRadioButton();
        rdSerlServiceAdulto = new javax.swing.JRadioButton();
        txtSelfServiceInfantil = new javax.swing.JTextField();
        txtSelfServiceAdulto = new javax.swing.JTextField();
        PanelSelf = new javax.swing.JPanel();
        lblTotalSelf = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalQuantidadesRefeicao = new javax.swing.JLabel();
        lblQuantidadeCafe = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalGeral = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setOpaque(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 820, 80, 30));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logonovoo.png"))); // NOI18N
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 170));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton2.setText("Limpar");
        jButton2.setOpaque(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 820, 80, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setText("Totais por Refeição");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setText("Tipo de Refeições");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        chkAlacarteInfantil.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        chkAlacarteInfantil.setText("A LaCarte Infantil");
        chkAlacarteInfantil.setOpaque(false);
        chkAlacarteInfantil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkAlacarteInfantilItemStateChanged(evt);
            }
        });
        chkAlacarteInfantil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAlacarteInfantilActionPerformed(evt);
            }
        });
        getContentPane().add(chkAlacarteInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        chkCafeAdulto.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        chkCafeAdulto.setText("Café Adulto");
        chkCafeAdulto.setOpaque(false);
        chkCafeAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCafeAdultoActionPerformed(evt);
            }
        });
        getContentPane().add(chkCafeAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        chkCafeInfantil.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        chkCafeInfantil.setText("Café Infantil");
        chkCafeInfantil.setOpaque(false);
        chkCafeInfantil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCafeInfantilActionPerformed(evt);
            }
        });
        getContentPane().add(chkCafeInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        chkExecutivoAdulto.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        chkExecutivoAdulto.setText("Executivo Adulto");
        chkExecutivoAdulto.setOpaque(false);
        chkExecutivoAdulto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkExecutivoAdultoItemStateChanged(evt);
            }
        });
        getContentPane().add(chkExecutivoAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        chkExecutivoInfantil.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        chkExecutivoInfantil.setText("Executivo Infantil");
        chkExecutivoInfantil.setOpaque(false);
        chkExecutivoInfantil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkExecutivoInfantilItemStateChanged(evt);
            }
        });
        getContentPane().add(chkExecutivoInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        chkAlacarteAdulto.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        chkAlacarteAdulto.setText("A LaCarte Adulto");
        chkAlacarteAdulto.setOpaque(false);
        chkAlacarteAdulto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkAlacarteAdultoItemStateChanged(evt);
            }
        });
        getContentPane().add(chkAlacarteAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));
        getContentPane().add(txtAlacarteInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 60, -1));
        getContentPane().add(txtCafeAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 60, -1));
        getContentPane().add(txtCafeInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 60, -1));

        txtExecutivoAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExecutivoAdultoActionPerformed(evt);
            }
        });
        getContentPane().add(txtExecutivoAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 60, -1));
        getContentPane().add(txtExecutivoInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 60, -1));
        getContentPane().add(txtAlacarteAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 60, -1));

        PanelCafe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelCafe.setOpaque(false);

        lblTotalCafe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTotalCafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalCafe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelCafeLayout = new javax.swing.GroupLayout(PanelCafe);
        PanelCafe.setLayout(PanelCafeLayout);
        PanelCafeLayout.setHorizontalGroup(
            PanelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCafeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalCafe, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCafeLayout.setVerticalGroup(
            PanelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCafeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalCafe, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 120, 50));

        PanelAlacarte.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelAlacarte.setOpaque(false);
        PanelAlacarte.setPreferredSize(new java.awt.Dimension(112, 54));

        lblTotalAlacarte.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTotalAlacarte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalAlacarte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelAlacarteLayout = new javax.swing.GroupLayout(PanelAlacarte);
        PanelAlacarte.setLayout(PanelAlacarteLayout);
        PanelAlacarteLayout.setHorizontalGroup(
            PanelAlacarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlacarteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalAlacarte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelAlacarteLayout.setVerticalGroup(
            PanelAlacarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlacarteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalAlacarte, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelAlacarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 120, 50));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel10.setText("Quantidade");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        PanelExecutivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelExecutivo.setOpaque(false);
        PanelExecutivo.setPreferredSize(new java.awt.Dimension(112, 54));

        lblTotalExec.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTotalExec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalExec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelExecutivoLayout = new javax.swing.GroupLayout(PanelExecutivo);
        PanelExecutivo.setLayout(PanelExecutivoLayout);
        PanelExecutivoLayout.setHorizontalGroup(
            PanelExecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelExecutivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalExec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelExecutivoLayout.setVerticalGroup(
            PanelExecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExecutivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalExec, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelExecutivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 120, 50));

        rdSelfServiceInfantil.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rdSelfServiceInfantil.setText("Self Service Infantil:");
        rdSelfServiceInfantil.setOpaque(false);
        rdSelfServiceInfantil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdSelfServiceInfantilItemStateChanged(evt);
            }
        });
        getContentPane().add(rdSelfServiceInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        rdSerlServiceAdulto.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rdSerlServiceAdulto.setText("Self Service Adulto:");
        rdSerlServiceAdulto.setOpaque(false);
        rdSerlServiceAdulto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdSerlServiceAdultoItemStateChanged(evt);
            }
        });
        getContentPane().add(rdSerlServiceAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, -1));
        getContentPane().add(txtSelfServiceInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 60, -1));
        getContentPane().add(txtSelfServiceAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 60, -1));

        PanelSelf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelSelf.setOpaque(false);
        PanelSelf.setPreferredSize(new java.awt.Dimension(112, 54));

        lblTotalSelf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTotalSelf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalSelf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelSelfLayout = new javax.swing.GroupLayout(PanelSelf);
        PanelSelf.setLayout(PanelSelfLayout);
        PanelSelfLayout.setHorizontalGroup(
            PanelSelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSelfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalSelf, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelSelfLayout.setVerticalGroup(
            PanelSelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSelfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalSelf, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelSelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 120, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel2.setText("Quantidade de Refeições:");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel1.setText("Quantidade de Cafés:");

        lblTotalQuantidadesRefeicao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        lblQuantidadeCafe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel5.setText("Total Geral:");

        lblTotalGeral.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTotalQuantidadesRefeicao, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(lblQuantidadeCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblTotalGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(lblTotalQuantidadesRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblQuantidadeCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTotalGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 530, 80));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 90, -1));

        jLabel6.setText("Quantidade de pessoas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Hotels.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 570, 890));

        setSize(new java.awt.Dimension(567, 905));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtExecutivoAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExecutivoAdultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExecutivoAdultoActionPerformed

    private void chkCafeAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCafeAdultoActionPerformed
        if (chkCafeAdulto.isSelected()) {
            CafeAdulto = 14.50;
            txtCafeAdulto.setVisible(true);

        } else {
            CafeAdulto = 0;
            txtCafeAdulto.setVisible(false);
            txtCafeAdulto.setText("0");
        }

    }//GEN-LAST:event_chkCafeAdultoActionPerformed

    private void chkCafeInfantilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCafeInfantilActionPerformed

        if (chkCafeInfantil.isSelected()) {
            CafeInfantil = 7.00;
            txtCafeInfantil.setVisible(true);

        } else {
            CafeInfantil = 0;
            txtCafeInfantil.setVisible(false);
            txtCafeInfantil.setText("0");

        }
    }//GEN-LAST:event_chkCafeInfantilActionPerformed

    private void chkAlacarteInfantilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAlacarteInfantilActionPerformed


    }//GEN-LAST:event_chkAlacarteInfantilActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        if (rdSerlServiceAdulto.isSelected()) {
            
            Refeicao.setQuantidadeCafeAdulto(QuantidadeCafeAdulto);
QuantidadeExecutivoAdulto =0;QuantidadeExecutivoInfantil = 0;QuantidadeExecutivoTotal =0;RelTotalExecutivo =0;
                
QuantidadeAlacarteAdulto =0; QuantidadeAlacarteInfantil =0;QuantidadeAlacarteTotal = 0; RelTotalAlacarte = 0;

            QuantidadeSelfServiceAdult = Integer.parseInt(txtSelfServiceAdulto.getText());
            QuantidadeSelfServiceInfantil = Integer.parseInt(txtSelfServiceInfantil.getText());
            QuantidadeSelfServiceTotal = QuantidadeSelfServiceAdult+QuantidadeSelfServiceInfantil;
            
            QuantidadeCafeAdulto = Integer.parseInt(txtCafeAdulto.getText());
            QuantidadeCafeInfantil = Integer.parseInt(txtCafeInfantil.getText());
            QuantidadeCafeTotal = QuantidadeCafeAdulto+QuantidadeCafeInfantil;
            
            QuantidadeTotal = QuantidadeSelfServiceTotal+QuantidadeCafeTotal;
            
            RelTotalGeral = (QuantidadeSelfServiceAdult * selfServiceAdulto) + (QuantidadeSelfServiceInfantil * SelfServiceInfantil)
                    + (QuantidadeCafeAdulto * CafeAdulto) + (QuantidadeCafeInfantil * CafeInfantil);
            RelTotalCafe = (QuantidadeCafeAdulto * CafeAdulto);
            RelTotalSelfService = (QuantidadeSelfServiceAdult * selfServiceAdulto) + (QuantidadeSelfServiceInfantil * SelfServiceInfantil);

            lblTotalQuantidadesRefeicao.setText(QuantidadeSelfServiceAdult + QuantidadeSelfServiceInfantil + "");
            lblQuantidadeCafe.setText(QuantidadeCafeAdulto + QuantidadeCafeInfantil + "");
            lblTotalCafe.setText(z.format(RelTotalCafe));
            lblTotalSelf.setText(z.format(RelTotalSelfService));
            lblTotalGeral.setText(z.format(RelTotalGeral));

            RelTotalSelfService = (QuantidadeSelfServiceAdult * selfServiceAdulto) + (QuantidadeSelfServiceInfantil * SelfServiceInfantil);

        } 
        
        else {
            
             Refeicao.setQuantidadeCafeAdulto(QuantidadeCafeAdulto);
            
QuantidadeSelfServiceAdult =0; QuantidadeSelfServiceInfantil =0; QuantidadeSelfServiceTotal =0; RelTotalSelfService =0;
            
            QuantidadeCafeAdulto = Integer.parseInt(txtCafeAdulto.getText());
            QuantidadeCafeInfantil = Integer.parseInt(txtCafeInfantil.getText());
            QuantidadeCafeTotal = QuantidadeCafeAdulto+QuantidadeCafeInfantil;
            
            QuantidadeExecutivoAdulto = Integer.parseInt(txtExecutivoAdulto.getText());
            QuantidadeExecutivoInfantil = Integer.parseInt(txtExecutivoInfantil.getText());
            QuantidadeExecutivoTotal = QuantidadeExecutivoAdulto+QuantidadeExecutivoInfantil;
            
            QuantidadeAlacarteAdulto = Integer.parseInt(txtAlacarteAdulto.getText());
            QuantidadeAlacarteInfantil = Integer.parseInt(txtAlacarteInfantil.getText());
            QuantidadeAlacarteTotal = QuantidadeAlacarteAdulto+QuantidadeAlacarteInfantil;
            
            QuantidadeTotal = QuantidadeCafeTotal+QuantidadeExecutivoTotal+QuantidadeAlacarteTotal;
            
            RelTotalGeral = (QuantidadeAlacarteAdulto * AlacarteAdulto) + (QuantidadeAlacarteInfantil * AlacarteInfantil)
                    + (QuantidadeCafeAdulto * CafeAdulto) + (QuantidadeCafeInfantil * CafeInfantil)
                    + (QuantidadeExecutivoAdulto * ExecutivoAdulto) + (QuantidadeExecutivoInfantil * ExecutivoInfantil);

            lblTotalQuantidadesRefeicao.setText (QuantidadeExecutivoAdulto + QuantidadeExecutivoInfantil
                    + QuantidadeAlacarteAdulto + QuantidadeAlacarteInfantil + "");
            lblQuantidadeCafe.setText(QuantidadeCafeAdulto + QuantidadeCafeInfantil + "");
            lblTotalGeral.setText(z.format(RelTotalGeral));

            RelTotalCafe = (QuantidadeCafeAdulto * CafeAdulto) + (QuantidadeCafeInfantil * CafeInfantil);
            RelTotalExecutivo = (QuantidadeExecutivoAdulto * ExecutivoAdulto) + (QuantidadeExecutivoInfantil * ExecutivoInfantil);
            RelTotalAlacarte = (QuantidadeAlacarteAdulto * AlacarteAdulto) + (QuantidadeAlacarteInfantil * AlacarteInfantil);
            
            lblTotalCafe.setText(z.format(RelTotalCafe));
            lblTotalExec.setText(z.format(RelTotalExecutivo));
            lblTotalAlacarte.setText(z.format(RelTotalAlacarte));
            
            
           
        }
        
           rel.AtualizaRELL(this,1);

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Rikimaru();
    }//GEN-LAST:event_formWindowOpened

    private void rdSelfServiceInfantilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdSelfServiceInfantilItemStateChanged
        if (rdSelfServiceInfantil.isSelected()) {
            SelfServiceInfantil = 13.50;
            txtSelfServiceInfantil.setVisible(true);
            rdSerlServiceAdulto.setSelected(true);
        } else {
            SelfServiceInfantil = 0;
            rdSerlServiceAdulto.setSelected(false);
            txtSelfServiceInfantil.setVisible(false);
            txtSelfServiceInfantil.setText("0");
        }

    }//GEN-LAST:event_rdSelfServiceInfantilItemStateChanged

    private void rdSerlServiceAdultoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdSerlServiceAdultoItemStateChanged
        if (rdSerlServiceAdulto.isSelected()) {
            txtSelfServiceInfantil.setEnabled(true);
            chkAlacarteAdulto.setEnabled(false);
            chkExecutivoAdulto.setEnabled(false);
            chkAlacarteAdulto.setSelected(false);
            chkExecutivoAdulto.setSelected(false);
            chkAlacarteInfantil.setSelected(false);
            chkExecutivoInfantil.setSelected(false);
            chkAlacarteInfantil.setEnabled(false);
            chkExecutivoInfantil.setEnabled(false);
            rdSelfServiceInfantil.setSelected(true);
            selfServiceAdulto = 27.50;
            txtSelfServiceAdulto.setVisible(true);
            PanelAlacarte.setVisible(false);
            PanelExecutivo.setVisible(false);
            PanelSelf.setVisible(true);

        } else {
            txtSelfServiceInfantil.setEnabled(false);
            chkAlacarteAdulto.setEnabled(true);
            chkExecutivoAdulto.setEnabled(true);
            chkAlacarteInfantil.setEnabled(true);
            chkExecutivoInfantil.setEnabled(true);
            selfServiceAdulto = 0;
            txtSelfServiceAdulto.setVisible(false);
            PanelAlacarte.setVisible(true);
            PanelExecutivo.setVisible(true);
            PanelSelf.setVisible(false);
            txtSelfServiceAdulto.setText("0");
            rdSelfServiceInfantil.setSelected(false);
        }

    }//GEN-LAST:event_rdSerlServiceAdultoItemStateChanged

    private void chkExecutivoAdultoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkExecutivoAdultoItemStateChanged

        if (chkExecutivoAdulto.isSelected()) {
            ExecutivoAdulto = 13.00;
            txtExecutivoAdulto.setVisible(true);

        } else {
            ExecutivoAdulto = 0;
            txtExecutivoAdulto.setVisible(false);
            txtExecutivoAdulto.setText("0");

        }
    }//GEN-LAST:event_chkExecutivoAdultoItemStateChanged

    private void chkExecutivoInfantilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkExecutivoInfantilItemStateChanged
        if (chkExecutivoInfantil.isSelected()) {
            ExecutivoInfantil = 6.50;
            txtExecutivoInfantil.setVisible(true);

        } else {
            ExecutivoInfantil = 0;
            txtExecutivoInfantil.setVisible(false);
            txtExecutivoInfantil.setText("0");

        }
    }//GEN-LAST:event_chkExecutivoInfantilItemStateChanged

    private void chkAlacarteAdultoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkAlacarteAdultoItemStateChanged
        if (chkAlacarteAdulto.isSelected()) {
            AlacarteAdulto = 21.00;
            txtAlacarteAdulto.setVisible(true);

        } else {
            AlacarteAdulto = 0;
            txtAlacarteAdulto.setVisible(false);
            txtAlacarteAdulto.setText("0");

        }
    }//GEN-LAST:event_chkAlacarteAdultoItemStateChanged

    private void chkAlacarteInfantilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkAlacarteInfantilItemStateChanged
        if (chkAlacarteInfantil.isSelected()) {
            AlacarteInfantil = 10.50;
            txtAlacarteInfantil.setVisible(true);

        } else {
            AlacarteInfantil = 0;
            txtAlacarteInfantil.setVisible(false);
            txtAlacarteInfantil.setText("0");
        }
    }//GEN-LAST:event_chkAlacarteInfantilItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    FrmRelatorio Rel = new FrmRelatorio();
    Rel.AtualizaRelatorio();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRefeicoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAlacarte;
    private javax.swing.JPanel PanelCafe;
    private javax.swing.JPanel PanelExecutivo;
    private javax.swing.JPanel PanelSelf;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JCheckBox chkAlacarteAdulto;
    private javax.swing.JCheckBox chkAlacarteInfantil;
    private javax.swing.JCheckBox chkCafeAdulto;
    private javax.swing.JCheckBox chkCafeInfantil;
    private javax.swing.JCheckBox chkExecutivoAdulto;
    private javax.swing.JCheckBox chkExecutivoInfantil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblQuantidadeCafe;
    private javax.swing.JLabel lblTotalAlacarte;
    private javax.swing.JLabel lblTotalCafe;
    private javax.swing.JLabel lblTotalExec;
    private javax.swing.JLabel lblTotalGeral;
    private javax.swing.JLabel lblTotalQuantidadesRefeicao;
    private javax.swing.JLabel lblTotalSelf;
    private javax.swing.JRadioButton rdSelfServiceInfantil;
    private javax.swing.JRadioButton rdSerlServiceAdulto;
    private javax.swing.JTextField txtAlacarteAdulto;
    private javax.swing.JTextField txtAlacarteInfantil;
    private javax.swing.JTextField txtCafeAdulto;
    private javax.swing.JTextField txtCafeInfantil;
    private javax.swing.JTextField txtExecutivoAdulto;
    private javax.swing.JTextField txtExecutivoInfantil;
    private javax.swing.JTextField txtSelfServiceAdulto;
    private javax.swing.JTextField txtSelfServiceInfantil;
    // End of variables declaration//GEN-END:variables
    NumberFormat z = NumberFormat.getCurrencyInstance();
    double ExecutivoAdulto = 0, ExecutivoInfantil = 0, AlacarteAdulto = 0, AlacarteInfantil = 0, CafeAdulto = 0,
            CafeInfantil = 0, selfServiceAdulto = 0, SelfServiceInfantil = 0;
    double total = 0;
    public static int QuantidadeTotal, QuantidadeExecutivoAdulto, QuantidadeExecutivoInfantil, QuantidadeAlacarteAdulto,
            QuantidadeAlacarteInfantil, QuantidadeCafeAdulto, QuantidadeCafeInfantil, QuantidadeSelfServiceAdult, QuantidadeSelfServiceInfantil,
            QuantidadeSelfServiceTotal, QuantidadeAlacarteTotal, QuantidadeExecutivoTotal,QuantidadeRefeicoesTotal, QuantidadeCafeTotal, teste;

    public static double RelTotalCafe, RelTotalAlacarte, RelTotalSelfService, RelTotalExecutivo, RelTotalGeral;
    
    
    public void Rikimaru() {
        txtAlacarteAdulto.setVisible(false);
        txtAlacarteInfantil.setVisible(false);
        txtCafeAdulto.setVisible(false);
        txtCafeInfantil.setVisible(false);
        txtExecutivoAdulto.setVisible(false);
        txtExecutivoInfantil.setVisible(false);
        txtSelfServiceAdulto.setVisible(false);
        txtSelfServiceInfantil.setVisible(false);
        PanelSelf.setVisible(false);

        txtAlacarteAdulto.setText("0");
        txtAlacarteInfantil.setText("0");
        txtCafeAdulto.setText("0");
        txtCafeInfantil.setText("0");
        txtExecutivoAdulto.setText("0");
        txtExecutivoInfantil.setText("0");
        txtSelfServiceAdulto.setText("0");
        txtSelfServiceInfantil.setText("0");
    }

}
