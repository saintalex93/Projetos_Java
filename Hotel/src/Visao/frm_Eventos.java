/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;


import java.text.DecimalFormat;

import java.awt.Color;
import java.text.NumberFormat;

import javax.swing.*;
import Modelo.teclasPermitidas;

/**
 *
 * @author Alex
 */
public class frm_Eventos extends javax.swing.JFrame {
    

    /**
     * Creates new form frm_Eventos
     */
    public frm_Eventos() {
        
        
        
        
         Color AzulBebe = new Color(206,224,231); 
        //(206,224,231);  
        //(211,225,230)
      this.setIconImage(new ImageIcon(getClass().getResource("/imagem/icone.png")).getImage());   
        getContentPane().setBackground(AzulBebe);
        initComponents();
        txtValorSalao.setDocument(new teclasPermitidas());
        txtExtras.setDocument(new teclasPermitidas());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jc7 = new javax.swing.JCheckBox();
        Jc4 = new javax.swing.JCheckBox();
        Jc2 = new javax.swing.JCheckBox();
        Jc3 = new javax.swing.JCheckBox();
        Jc1 = new javax.swing.JCheckBox();
        Jc5 = new javax.swing.JCheckBox();
        Jc6 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        Lbl_Total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Jc8Todos = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Lbl_TotalGeral = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtExtras = new javax.swing.JTextField();
        rbaltera = new javax.swing.JRadioButton();
        txtValorSalao = new javax.swing.JTextField();
        lblAlteraSalao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eventos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logonovoo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 520, 160));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel1.setText("Salão");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setText("Cozinha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setText("Geleira");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setText("Freezer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel5.setText("Telão");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 40, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel6.setText("Projetor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel7.setText("Som e microfone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        Jc7.setOpaque(false);
        Jc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc7ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 277, -1, -1));

        Jc4.setOpaque(false);
        Jc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc4ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 277, -1, -1));

        Jc2.setOpaque(false);
        Jc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc2ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 197, -1, -1));

        Jc3.setOpaque(false);
        Jc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc3ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 237, -1, -1));

        Jc1.setOpaque(false);
        Jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 197, -1, -1));

        Jc5.setOpaque(false);
        Jc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc5ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 197, -1, -1));

        Jc6.setOpaque(false);
        Jc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc6ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 237, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel8.setText("ACS © 2014");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 70, -1));

        Lbl_Total.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(Lbl_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 180, 40));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel9.setText("Todos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 310, 40, -1));

        Jc8Todos.setOpaque(false);
        Jc8Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc8TodosActionPerformed(evt);
            }
        });
        getContentPane().add(Jc8Todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 307, -1, -1));

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel10.setText("Total Salão:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel11.setText("Total Pacote:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        Lbl_TotalGeral.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Lbl_TotalGeral.setToolTipText("Total das Hospedagens mais Salão");
        getContentPane().add(Lbl_TotalGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 180, 40));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel12.setText("Extra");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, -1, -1));

        txtExtras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 70, -1));

        rbaltera.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        rbaltera.setText("Alterar Preço?");
        rbaltera.setOpaque(false);
        rbaltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbalteraActionPerformed(evt);
            }
        });
        getContentPane().add(rbaltera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtValorSalao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorSalao.setToolTipText("Separar centavos por PONTOS (.)");
        getContentPane().add(txtValorSalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 70, -1));

        lblAlteraSalao.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblAlteraSalao.setText("R$");
        getContentPane().add(lblAlteraSalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 273, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 310, 160));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Hotels.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -20, 1060, 770));

        jMenu1.setText("Reservas");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(573, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Jc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc7ActionPerformed
 if (Jc7.isSelected()){
    
        totalSalao = totalSalao+som;
        
     }else{
  
    totalSalao = totalSalao - som;
}       
    }//GEN-LAST:event_Jc7ActionPerformed

    private void Jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc1ActionPerformed
    rbaltera.setVisible(true);
        
        
        
        
        if (Jc1.isSelected()){
           
            
            
           totalSalao = totalSalao+salao;}
            
    
     else{
            
    totalSalao = totalSalao - salao;
        
       
        
}
        
         
    }//GEN-LAST:event_Jc1ActionPerformed

    private void Jc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc5ActionPerformed
         if (Jc5.isSelected()){
    
        totalSalao = totalSalao+telao;
        
     }else{
  
    totalSalao = totalSalao - telao;
}
    }//GEN-LAST:event_Jc5ActionPerformed

    private void Jc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc6ActionPerformed
         if (Jc6.isSelected()){
    
        totalSalao = totalSalao+projetor;
        
     }else{
  
    totalSalao = totalSalao - projetor;
}
    }//GEN-LAST:event_Jc6ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
         new Frm_Hospedagem().setVisible(true); 
dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void Jc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc2ActionPerformed
         if (Jc2.isSelected()){
    
        totalSalao = totalSalao+cozinha;
        
     }else{
  
    totalSalao = totalSalao - cozinha;
}
    }//GEN-LAST:event_Jc2ActionPerformed

    private void Jc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc3ActionPerformed
         if (Jc3.isSelected()){
    
        totalSalao = totalSalao+geladeira;
        
     }else{
  
    totalSalao = totalSalao - geladeira;
}
    }//GEN-LAST:event_Jc3ActionPerformed

    private void Jc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc4ActionPerformed
          if (Jc4.isSelected()){
    
        totalSalao = totalSalao+freezer;
        
     }else{
  
    totalSalao = totalSalao - freezer;
}
    }//GEN-LAST:event_Jc4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if(rbaltera.isSelected())
        {
            try{
            totalSalao = totalSalao-salao;
        salao = Double.parseDouble(txtValorSalao.getText());
        totalSalao = totalSalao+salao;
            }catch(Exception e){}
        }
        
       
            try{
       extras = Double.parseDouble(txtExtras.getText());
            }catch(Exception e){}
            
            
       totalSalao=totalSalao+extras;     
       Totalx =  Frm_Hospedagem.VlrTotal+totalSalao;
              NumberFormat z = NumberFormat.getCurrencyInstance();
        Lbl_TotalGeral.setText(z.format((Totalx)));
        Lbl_Total.setText(z.format((totalSalao))); // Formatando o valor total
        
        jButton1.setEnabled(false);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Jc8TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc8TodosActionPerformed
        
       
        Jc2.setSelected(true);
        Jc3.setSelected(true);
        Jc4.setSelected(true);
        Jc5.setSelected(true);
        Jc6.setSelected(true);
        Jc7.setSelected(true);
        
      totalSalao = totalSalao+freezer+cozinha+geladeira+telao+projetor+som;
     
        
        
        
    }//GEN-LAST:event_Jc8TodosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Lbl_Total.setText(null);
        totalSalao=0;
        salao=1400;
        extras=0.00;
        txtExtras.setText("0.00");
        txtValorSalao.setText("");
        lblAlteraSalao.setVisible(false);
        txtValorSalao.setVisible(false);
        Lbl_TotalGeral.setText("");
        rbaltera.setSelected(false);
        Jc1.setSelected(false);
        Jc2.setSelected(false);
        Jc3.setSelected(false);
        Jc4.setSelected(false);
        Jc5.setSelected(false);
        Jc6.setSelected(false);
        Jc7.setSelected(false);
        Jc8Todos.setSelected(false);
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbalteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbalteraActionPerformed
         
        txtValorSalao.setVisible(true);
        lblAlteraSalao.setVisible(true);
    //totalSalao=totalSalao-salao;
    
    
   
   
    }//GEN-LAST:event_rbalteraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       rbaltera.setVisible(false);
       txtExtras.setText("0.00");
       lblAlteraSalao.setVisible(false);
       txtValorSalao.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    new frm_sobre().setVisible(true);
       dispose();       
    }//GEN-LAST:event_jMenu2MouseClicked

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(frm_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Eventos().setVisible(true);
            }
            
        });
        
        
        
        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Jc1;
    private javax.swing.JCheckBox Jc2;
    private javax.swing.JCheckBox Jc3;
    private javax.swing.JCheckBox Jc4;
    private javax.swing.JCheckBox Jc5;
    private javax.swing.JCheckBox Jc6;
    private javax.swing.JCheckBox Jc7;
    private javax.swing.JCheckBox Jc8Todos;
    private javax.swing.JLabel Lbl_Total;
    private javax.swing.JLabel Lbl_TotalGeral;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlteraSalao;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton rbaltera;
    private javax.swing.JTextField txtExtras;
    private javax.swing.JTextField txtValorSalao;
    // End of variables declaration//GEN-END:variables

public static double salao=1400.00, cozinha=250.00, geladeira=200.00, freezer=200.00,
        telao=250.00, projetor=400.00, som=100.00, totalSalao, totalHosp, Totalx, extras;



DecimalFormat formata = new DecimalFormat("0.00"); // Formatar ,00
}




