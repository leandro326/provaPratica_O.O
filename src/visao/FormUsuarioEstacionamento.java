
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloControle.ModeloTabela;
import modeloControle.ModeloUsuarioEstacionamento;
import modeloDao.DaoTabela;
import modeloDao.DaoUsuarioEstacionamento;

public class FormUsuarioEstacionamento extends javax.swing.JFrame {
        ModeloUsuarioEstacionamento mod = new ModeloUsuarioEstacionamento();
        ConexaoBD conec = new ConexaoBD();
        DaoUsuarioEstacionamento dao = new DaoUsuarioEstacionamento();
        DaoTabela tabela = new DaoTabela();
        int flag = 0;

    public FormUsuarioEstacionamento() {
        initComponents();
        conec.conexao();
        preencherTabela("SELECT * FROM public.estacionamento order by \"est_nome\"");
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxUsuario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarioEstacionamento = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Usuario do Estacionamento");

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

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
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

        jLabel2.setText("Id");

        jTextFieldId.setEnabled(false);

        jLabel3.setText("Matricula");

        jTextFieldMatricula.setEnabled(false);

        jLabel4.setText("Nome");

        jTextFieldNome.setEnabled(false);

        jLabel5.setText("Tipo Usuario");

        jComboBoxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Professor", "Aluno", " " }));
        jComboBoxUsuario.setEnabled(false);

        jTableUsuarioEstacionamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarioEstacionamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioEstacionamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarioEstacionamento);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonBuscar))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 237, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNovo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(824, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       flag = 1;
       jTextFieldId.setText("");
       jTextFieldMatricula.setText("");
       jTextFieldNome.setText("");
       jComboBoxUsuario.setSelectedItem("");
       jTextFieldNome.setEnabled(true);
       jComboBoxUsuario.setEnabled(true);
       jTextFieldMatricula.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o usuario para continuar");
            jTextFieldNome.requestFocus();
        } 
        else if(jTextFieldMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo confirmar Senha para continuar");
            jTextFieldMatricula.requestFocus();
        }
        /*else if(jComboBoxUsuario.getSelectedItem().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo Senha para continuar");
            jPasswordFieldSenha.requestFocus();
        }*/
        
        else{
            
                if(flag == 1){
                mod.setNome(jTextFieldNome.getText());
                mod.setMatricula(jTextFieldMatricula.getText());
                mod.setTipoUsuarioEstacionamento((String) jComboBoxUsuario.getSelectedItem());
                
                dao.Salvar(mod);
                jButtonAlterar.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonExcluir.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jTextFieldNome.setText("");
                jTextFieldMatricula.setText("");                
                jComboBoxUsuario.setSelectedItem("");
                jTextFieldNome.setEnabled(false);
                jTextFieldMatricula.setEnabled(false);                
                jComboBoxUsuario.setEnabled(false);
                preencherTabela("SELECT * FROM public.estacionamento order by \"est_nome\""); 
            }else{
                 if(flag == 2){
                mod.setIdEstacionamento(Integer.parseInt(jTextFieldId.getText()));
                mod.setNome(jTextFieldNome.getText());           
                mod.setMatricula(jTextFieldMatricula.getText());
                mod.setTipoUsuarioEstacionamento((String)jComboBoxUsuario.getSelectedItem());
                dao.Alterar(mod);
                jTextFieldNome.setText("");
                jTextFieldMatricula.setText("");                
                jComboBoxUsuario.setSelectedItem("");
                jTextFieldNome.setEnabled(false);
                jTextFieldMatricula.setEnabled(false);                
                jComboBoxUsuario.setEnabled(false);
                preencherTabela("SELECT * FROM public.estacionamento order by \"est_nome\"");
                }    
             } 
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(false);
        jTextFieldMatricula.setEnabled(false);
        jComboBoxUsuario.setSelectedItem(false);
        jButtonExcluir.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jComboBoxUsuario.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldMatricula.setText("");
        jComboBoxUsuario.setSelectedItem("");
        jTextFieldId.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        mod.setPesquisa(jTextFieldPesquisa.getText());
        ModeloUsuarioEstacionamento model = dao.buscaUsuarioEstacionamento(mod);      
        jTextFieldId.setText(String.valueOf(model.getIdEstacionamento()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldMatricula.setText(model.getMatricula());
        jComboBoxUsuario.setSelectedItem(model.getTipoUsuarioEstacionamento());
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
  
       preencherTabela("select  \"est_id\", \"est_nome\",\"est_matricula\", \"est_tipo\"from estacionamento where \"est_nome\" like '%"+mod.getPesquisa()+"%'");

        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
                
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTableUsuarioEstacionamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioEstacionamentoMouseClicked
        String nome_usuario = ""+jTableUsuarioEstacionamento.getValueAt(jTableUsuarioEstacionamento.getSelectedRow(), 1);
        conec.conexao();
        conec.executasql("select  \"est_id\", \"est_nome\", \"est_matricula\", \"est_tipo\" from estacionamento where \"est_nome\" = '"+ nome_usuario +"'");
        try {
            conec.rs.first();
            jTextFieldId.setText(String.valueOf(conec.rs.getInt("est_id")));
            jTextFieldNome.setText(conec.rs.getString("est_nome"));
            jTextFieldMatricula.setText(conec.rs.getString("est_matricula"));      
            jComboBoxUsuario.setSelectedItem(conec.rs.getString("est_tipo"));
            jButtonNovo.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonAlterar.setEnabled(true);
            } catch (SQLException ex) {
            Logger.getLogger(FormAreaTrabalho.class.getName()).log(Level.SEVERE, null, ex);
        }           
           conec.desconecta();
    }//GEN-LAST:event_jTableUsuarioEstacionamentoMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
         int resposta;
       resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente exluir");
               
       if (resposta == JOptionPane.YES_OPTION){
           mod.setIdEstacionamento(Integer.parseInt(jTextFieldId.getText()));
           dao.Excluir(mod);
           jButtonAlterar.setEnabled(false);
           jButtonExcluir.setEnabled(false);
           jButtonCancelar.setEnabled(false);
           jButtonNovo.setEnabled(true);
           
           jTextFieldId.setText("");
           jTextFieldNome.setText("");
           jTextFieldMatricula.setText("");
           jComboBoxUsuario.setSelectedItem("");
           preencherTabela("SELECT * FROM public.estacionamento order by \"est_nome\"");
       }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
      flag =2;
       jTextFieldMatricula.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jComboBoxUsuario.setEnabled(true);
       jButtonExcluir.setEnabled(false);
       jButtonSalvar.setEnabled(true);
       jButtonAlterar.setEnabled(false);
       jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed
     public void preencherTabela(String Sql){
        
       
            ModeloTabela modelo = tabela.preencherTabelaEstacionamento(Sql);
       
            jTableUsuarioEstacionamento.setModel(modelo);
            jTableUsuarioEstacionamento.getColumnModel().getColumn(0).setPreferredWidth(63);
            jTableUsuarioEstacionamento.getColumnModel().getColumn(0).setResizable(false);
            jTableUsuarioEstacionamento.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTableUsuarioEstacionamento.getColumnModel().getColumn(1).setResizable(false);      
            jTableUsuarioEstacionamento.getColumnModel().getColumn(2).setPreferredWidth(210);
            jTableUsuarioEstacionamento.getColumnModel().getColumn(2).setResizable(false);
            jTableUsuarioEstacionamento.getColumnModel().getColumn(3).setPreferredWidth(210);
            jTableUsuarioEstacionamento.getColumnModel().getColumn(3).setResizable(false);
            
            jTableUsuarioEstacionamento.getTableHeader().setReorderingAllowed(false);
            jTableUsuarioEstacionamento.setAutoResizeMode(jTableUsuarioEstacionamento.AUTO_RESIZE_OFF);
            jTableUsuarioEstacionamento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
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
            java.util.logging.Logger.getLogger(FormUsuarioEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuarioEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuarioEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuarioEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuarioEstacionamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarioEstacionamento;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
