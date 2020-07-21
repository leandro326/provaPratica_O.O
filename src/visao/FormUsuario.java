/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloControle.ModeloUsuario;
import modeloControle.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoTabela;
import modeloDao.DaoUsuario;

/**
 *
 * @author Uso Pessoal
 */
public class FormUsuario extends javax.swing.JFrame {

    ModeloUsuario mod = new ModeloUsuario();
    ConexaoBD conec = new ConexaoBD();
    DaoUsuario dao = new DaoUsuario();
    DaoTabela tabela = new DaoTabela();
    int flag = 0;
   
    public FormUsuario() {
        initComponents();
        conec.conexao();
        preencherTabela("SELECT * FROM public.usuarios order by \"usu_nome\"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmaSenha = new javax.swing.JPasswordField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Confirmar Senha:");

        jLabel6.setText("Tipo de Usuario");
        jLabel6.setEnabled(false);

        jTextFieldUsuario.setEnabled(false);

        jPasswordFieldSenha.setEnabled(false);

        jPasswordFieldConfirmaSenha.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "RH", "Controlador", " " }));
        jComboBoxTipo.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuario);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Id:");

        jTextFieldId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPasswordFieldConfirmaSenha))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNovo)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jPasswordFieldConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExcluir)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(748, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       flag = 1;
       jTextFieldUsuario.setEnabled(true);
       jComboBoxTipo.setEnabled(true);
       jPasswordFieldSenha.setEnabled(true);
       jPasswordFieldConfirmaSenha.setEnabled(true);
       jButtonCancelar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o usuario para continuar");
            jTextFieldUsuario.requestFocus();
        } 
        else if(jPasswordFieldConfirmaSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo confirmar Senha para continuar");
            jPasswordFieldConfirmaSenha.requestFocus();
        }
        else if(jPasswordFieldSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo Senha para continuar");
            jPasswordFieldSenha.requestFocus();
        }
        
        else{
            if (jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmaSenha.getText())){
                if(flag == 1){
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                mod.setUsuTipo((String)jComboBoxTipo.getSelectedItem());
                dao.Salvar(mod);
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmaSenha.setText("");
                jComboBoxTipo.setSelectedItem("");
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jPasswordFieldConfirmaSenha.setEnabled(false);
                jComboBoxTipo.setEnabled(false);
                jButtonAlterar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                preencherTabela("SELECT * FROM public.usuarios order by \"usu_nome\""); 
            }else{
                 if(flag == 2){
                mod.setUsuId(Integer.parseInt(jTextFieldId.getText()));
                mod.setUsuNome(jTextFieldUsuario.getText());           
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                mod.setUsuTipo((String)jComboBoxTipo.getSelectedItem());
                dao.Alterar(mod);
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmaSenha.setText("");
                jComboBoxTipo.setSelectedItem("");
                jButtonNovo.setEnabled(true);
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jPasswordFieldConfirmaSenha.setEnabled(false);
                jComboBoxTipo.setEnabled(false);
                jButtonAlterar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                preencherTabela("SELECT * FROM public.usuarios order by \"usu_nome\"");
                }    
             } 
        }
        else{
                JOptionPane.showMessageDialog(null,"senha nao confere");
                jPasswordFieldSenha.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
      
        mod.setUsuPesquisa(jTextFieldPesquisa.getText());
        ModeloUsuario model = dao.buscaUsuario(mod);      
        jTextFieldId.setText(String.valueOf(model.getUsuId()));
        jTextFieldUsuario.setText(model.getUsuNome());
        jPasswordFieldSenha.setText(model.getUsuSenha());
        jPasswordFieldConfirmaSenha.setText(model.getUsuSenha());
        jComboBoxTipo.setSelectedItem(model.getUsuTipo());
        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
  
       preencherTabela("select  \"usu_id\", \"usu_nome\", \"usu_tipo\"from usuarios where \"usu_nome\" like '%"+mod.getUsuPesquisa()+"%'");
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       flag = 2;
       
       jTextFieldUsuario.setEnabled(true);
       jComboBoxTipo.setEnabled(true);
       jPasswordFieldSenha.setEnabled(true);
       jPasswordFieldConfirmaSenha.setEnabled(true);
       jButtonExcluir.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(true);
       
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       int resposta;
       resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente exluir");
               
       if (resposta == JOptionPane.YES_OPTION){
           mod.setUsuId(Integer.parseInt(jTextFieldId.getText()));
           dao.Excluir(mod);
           jButtonAlterar.setEnabled(false);
           jButtonExcluir.setEnabled(false);
           jButtonCancelar.setEnabled(false);
           jButtonSalvar.setEnabled(false);
           jButtonNovo.setEnabled(true);
           
           jTextFieldId.setText("");
           jTextFieldUsuario.setText("");
           jPasswordFieldSenha.setText("");
           jPasswordFieldConfirmaSenha.setText("");
           jComboBoxTipo.setSelectedItem("");
           
           
          preencherTabela("SELECT * FROM public.usuarios order by \"usu_nome\"");
       }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
           jButtonAlterar.setEnabled(false);
           jButtonExcluir.setEnabled(false);
           jButtonCancelar.setEnabled(false);
           jButtonSalvar.setEnabled(false);
           jButtonNovo.setEnabled(true);
           
           jPasswordFieldConfirmaSenha.setEnabled(false);
           jPasswordFieldSenha.setEnabled(false);
           jTextFieldUsuario.setEnabled(false);
           jComboBoxTipo.setSelectedItem("");
           
           jTextFieldId.setText("");
           jTextFieldUsuario.setText("");
           jPasswordFieldSenha.setText("");
           jPasswordFieldConfirmaSenha.setText("");
           jComboBoxTipo.setEnabled(false);
           
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        String nome_usuario = ""+jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
        conec.conexao();
        conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ nome_usuario +"'");
        try {
            conec.rs.first();
            jTextFieldId.setText(String.valueOf(conec.rs.getInt("usu_id")));
            jTextFieldUsuario.setText(conec.rs.getString("usu_nome"));
            jPasswordFieldSenha.setText(conec.rs.getString("usu_senha"));
            jPasswordFieldConfirmaSenha.setText(conec.rs.getString("usu_senha"));
            jComboBoxTipo.setSelectedItem(conec.rs.getString("usu_tipo"));
            jButtonNovo.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(true);
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            
            } catch (SQLException ex) {
            Logger.getLogger(FormAreaTrabalho.class.getName()).log(Level.SEVERE, null, ex);
        }           
           conec.desconecta();
        
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    public void preencherTabela(String Sql){
        
       
            ModeloTabela modelo = tabela.preencherTabelaUsuario(Sql);
       
            jTableUsuario.setModel(modelo);
            jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(63);
            jTableUsuario.getColumnModel().getColumn(0).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTableUsuario.getColumnModel().getColumn(1).setResizable(false);      
            jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(210);
            jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
            
            jTableUsuario.getTableHeader().setReorderingAllowed(false);
            jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF);
            jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    }
    
    
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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
