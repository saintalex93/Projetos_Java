/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controlador.Mysql;

import Controlador.clsComanda;
import Modelo.ModeloTabelas;
import Modelo.modelComanda;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Alex
 */
public class frm_comanda extends javax.swing.JFrame {

    Mysql conecta;
    clsComanda controlComanda;
    modelComanda objComanda;
    Mysql connCombo;
    SimpleDateFormat fmt;

    /**
     * Creates new form frm_cliente
     */
    public frm_comanda() throws Exception {
        initComponents();
            fmt = new SimpleDateFormat("dd/MM/yyyy");
        conecta = new Mysql();
        controlComanda = new clsComanda();
        objComanda = new modelComanda();
        connCombo = new Mysql();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtComanda = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbProduto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbApartamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtableResumo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtableComanda = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código Comanda:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 20));

        txtComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComandaActionPerformed(evt);
            }
        });
        getContentPane().add(txtComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, -1));

        jButton2.setText("Lançar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Apartamento:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 20));

        cmbProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Produto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 20));

        cmbApartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbApartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbApartamentoItemStateChanged(evt);
            }
        });
        cmbApartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbApartamentoFocusLost(evt);
            }
        });
        cmbApartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbApartamentoMouseClicked(evt);
            }
        });
        cmbApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbApartamentoActionPerformed(evt);
            }
        });
        cmbApartamento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbApartamentoPropertyChange(evt);
            }
        });
        getContentPane().add(cmbApartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(75, 146, 219));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Resumo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 490, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(75, 146, 219));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Comandas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 40));

        JtableResumo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JtableResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JtableResumo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 460, 90));

        JtableComanda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JtableComanda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JtableComanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableComandaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JtableComanda);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 460, 80));

        setSize(new java.awt.Dimension(501, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComandaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String apartamento = cmbApartamento.getSelectedItem().toString().substring(53).replace("</span></html>", "");
            conecta.executaSql("select * from Apartamento as ap join Reserva as r on r.Cod_Apto = ap.Cod_AP join Comanda as c on c.Cod_Reserva = r.Cod_Reserva and Cod_AP = '" + apartamento + "'");

            conecta.rs.first();
             comanda = (conecta.rs.getInt("Cod_Comanda"));
            
            
            txtComanda.setText(comanda + "");
        } catch (SQLException ex) {
            System.out.println("Comanda não encontrado");
            ex.printStackTrace();
        }     
        
                try {
            String Produto = cmbProduto.getSelectedItem().toString().substring(53).replace("</span></html>", "");
            conecta.executaSql("select * from Produto where Nome_Produto = '" + Produto + "'");
            
            conecta.rs.first();
             Codproduto = (conecta.rs.getInt("Cod_Produto"));
            
                    System.out.println(Codproduto);
       
        } catch (SQLException ex) {
            System.out.println("Produto não encontrado");
            ex.printStackTrace();
        }   
                
                
                if (preencheObjeto())
                {
            try {
                controlComanda.Incluir(objComanda);
                        preencherTabelaComanda("select distinct * from comanda as c inner join reserva as r on r.Cod_Reserva = c.Cod_Reserva join cliente as cl on cl.Cpf_Cliente = r.Cpf_Cliente join comanda_produto as cp on cp.Cod_Comanda = c.Cod_Comanda join usuario as u on u.CodUsuario = cp.Cod_Usuario group by(DT_Comanda);");

                
            } catch (Exception ex) {
                Logger.getLogger(frm_comanda.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        codUsuario = frmLogin.getCodFuncionario();
      //   preencherTabelaComanda("select distinct * from comanda as c inner join reserva as r on r.Cod_Reserva = c.Cod_Reserva join cliente as cl on cl.Cpf_Cliente = r.Cpf_Cliente join comanda_produto as cp on cp.Cod_Comanda = c.Cod_Comanda join usuario as u on u.CodUsuario = cp.Cod_Usuario group by(DT_Comanda);");
        preencherCombo();
        preencherComboProduto();
        preencherComboBuscar();
    }//GEN-LAST:event_formWindowOpened

    private void cmbApartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbApartamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbApartamentoMouseClicked

    private void cmbApartamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbApartamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbApartamentoFocusLost

    private void cmbApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbApartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbApartamentoActionPerformed

    private void cmbApartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbApartamentoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbApartamentoItemStateChanged

    private void cmbApartamentoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbApartamentoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbApartamentoPropertyChange

    private void JtableComandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableComandaMouseClicked
        int linha_selecionada = JtableComanda.getSelectedRow(); // Pega a linha selecionada.
        int CodigoComanda = Integer.parseInt((JtableComanda.getValueAt(linha_selecionada, 0).toString()));  
        preencherTabelaComandaResumo("select * from comanda as c join comanda_produto as cp on cp.Cod_Comanda = c.Cod_Comanda join produto as p on p.Cod_Produto = cp.Cod_Produto join usuario as u on u.CodUsuario = cp.Cod_Usuario where c.cod_Comanda = '"+CodigoComanda+"';");
    }//GEN-LAST:event_JtableComandaMouseClicked
    int comanda, Codproduto, codUsuario;
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
            java.util.logging.Logger.getLogger(frm_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frm_comanda().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(frm_comanda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableComanda;
    private javax.swing.JTable JtableResumo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbApartamento;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtComanda;
    // End of variables declaration//GEN-END:variables

    public void preencherTabelaComanda(String Sql) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{
            "<html><span style='color:#4b92db;font-weight: bold;'>Comanda</span></html>",
            "<html><span style='color:#4b92db;font-weight: bold;'>Hóspede</span></html>",
            "<html><span style='color:#4b92db;font-weight: bold;'>Total</span></html>",
            "<html><span style='color:#4b92db;font-weight: bold;'>Apto</span></html>",
            "<html><span style='color:#4b92db;font-weight: bold;'>Data</span></html>",};

        NumberFormat z = NumberFormat.getCurrencyInstance();
        conecta.executaSql(Sql);
        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{conecta.rs.getInt("Cod_Comanda"), conecta.rs.getString("Nome_Clien"), z.format(conecta.rs.getDouble("Total_Comanda")),
                    conecta.rs.getInt("Cod_Apto"), fmt.format(conecta.rs.getDate("DT_Comanda"))});
            } while (conecta.rs.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher a Tabela" + e);

        }

        ModeloTabelas modelo = new ModeloTabelas(dados, Colunas); //Instacia a classe do modelo da Tabela.
        JtableComanda.setModel(modelo);
        JtableComanda.getColumnModel().getColumn(0).setPreferredWidth(65); // Tamanho em pixel da coluna
        JtableComanda.getColumnModel().getColumn(0).setResizable(false);
        JtableComanda.getColumnModel().getColumn(1).setPreferredWidth(162);
        JtableComanda.getColumnModel().getColumn(1).setResizable(false);
        JtableComanda.getColumnModel().getColumn(2).setPreferredWidth(90);
        JtableComanda.getColumnModel().getColumn(2).setResizable(false);
        JtableComanda.getColumnModel().getColumn(3).setPreferredWidth(55);
        JtableComanda.getColumnModel().getColumn(3).setResizable(false);
        JtableComanda.getColumnModel().getColumn(4).setPreferredWidth(80);
        JtableComanda.getColumnModel().getColumn(4).setResizable(false);

        JtableComanda.setAutoResizeMode(JtableComanda.AUTO_RESIZE_OFF);//Não pode ser redimensionada
        JtableComanda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    
        public void preencherTabelaComandaResumo(String Sql) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{
            "<html><span style='color:#4b92db;font-weight: bold;'>Item</span></html>",
            "<html><span style='color:#4b92db;font-weight: bold;'>Produto</span></html>",
            "<html><span style='color:#4b92db;font-weight: bold;'>Valor</span></html>",
            "<html><span style='color:#4b92db;font-weight: bold;'>Usuario</span></html>",
            };

        NumberFormat z = NumberFormat.getCurrencyInstance();
        conecta.executaSql(Sql);
        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{conecta.rs.getInt("Cod_Item"), conecta.rs.getString("Nome_Produto"), z.format(conecta.rs.getDouble("Valor_Produto")),
                    conecta.rs.getString("NomeUsuario")});
            } while (conecta.rs.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher a Tabela" + e);

        }

        ModeloTabelas modelo = new ModeloTabelas(dados, Colunas); //Instacia a classe do modelo da Tabela.
        JtableResumo.setModel(modelo);
        JtableResumo.getColumnModel().getColumn(0).setPreferredWidth(70); // Tamanho em pixel da coluna
        JtableResumo.getColumnModel().getColumn(0).setResizable(false);
        JtableResumo.getColumnModel().getColumn(1).setPreferredWidth(162);
        JtableResumo.getColumnModel().getColumn(1).setResizable(false);
        JtableResumo.getColumnModel().getColumn(2).setPreferredWidth(90);
        JtableResumo.getColumnModel().getColumn(2).setResizable(false);
        JtableResumo.getColumnModel().getColumn(3).setPreferredWidth(130);
        JtableResumo.getColumnModel().getColumn(3).setResizable(false);

        JtableResumo.setAutoResizeMode(JtableResumo.AUTO_RESIZE_OFF);//Não pode ser redimensionada
        JtableResumo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    

    public void preencherCombo() {

        connCombo.getCon();
        connCombo.executaSql("select a.Cod_AP from reserva as r join apartamento as a on r.Cod_Apto = a.Cod_AP ");

        try {

            cmbApartamento.removeAllItems();
            connCombo.rs.first();
            cmbApartamento.addItem("<html><span style='color:#4b92db;font-weight: bold;'>Selecione o Apartamento...</span></html>");

            do {
                cmbApartamento.addItem("<html><span style='color:#4b92db;font-weight: bold;'>" + (connCombo.rs.getInt("Cod_AP") + "</span></html>"));

            } while (connCombo.rs.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ComboBox" + e);
        }
    }

    public void preencherComboBuscar() {

        connCombo.getCon();
        connCombo.executaSql("select a.Cod_AP from reserva as r join apartamento as a on r.Cod_Apto = a.Cod_AP ");

        try {

            cmbApartamento.removeAllItems();
            connCombo.rs.first();
            cmbApartamento.addItem("<html><span style='color:#4b92db;font-weight: bold;'>Selecione o Apartamento...</span></html>");

            do {
                cmbApartamento.addItem("<html><span style='color:#4b92db;font-weight: bold;'>" + (connCombo.rs.getInt("Cod_AP") + "</span></html>"));

            } while (connCombo.rs.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ComboBox" + e);
        }
    }

    public void preencherComboProduto() {

        connCombo.getCon();
        connCombo.executaSql("select * from Produto");

        try {

            cmbProduto.removeAllItems();
            connCombo.rs.first();
            cmbProduto.addItem("<html><span style='color:#4b92db;font-weight: bold;'>Selecione o Produto...</span></html>");

            do {
                cmbProduto.addItem("<html><span style='color:#4b92db;font-weight: bold;'>" + (connCombo.rs.getString("Nome_Produto") + "</span></html>"));

            } while (connCombo.rs.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ComboBox" + e);
        }
    }

    
        public boolean preencheObjeto() {

        objComanda.setCodComanda(Integer.parseInt(txtComanda.getText()));
        objComanda.setCodProduto(Codproduto);
        objComanda.setCodUsuario(codUsuario);


        
        return true;
    }
    
}
