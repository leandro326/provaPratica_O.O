/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloControle.ModeloTabela;
import modeloControle.ModeloVagas;
import modeloDao.DaoTabela;
import modeloDao.DaoVagas;

/**
 *
 * @author Uso Pessoal
 */
public class FormVagas extends javax.swing.JFrame {
    ModeloVagas mod = new ModeloVagas();
    ConexaoBD conec = new ConexaoBD();
    DaoVagas dao = new DaoVagas();
    DaoTabela tabela = new DaoTabela();
    int flag = 0;
   
    public FormVagas() {
        initComponents();
        conec.conexao();
        preencherTabela("SELECT * FROM public.vagas order by \"setor\"");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEspecial = new javax.swing.JTextField();
        jTextFieldmotos = new javax.swing.JTextField();
        jTextFieldgerais = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxBloco = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablevagas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade vagas Especiais");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantidade de Vagas Motos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade de Vagas gerais");

        jTextFieldEspecial.setEnabled(false);

        jTextFieldmotos.setEnabled(false);

        jTextFieldgerais.setEnabled(false);

        jTextFieldId.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID VAGAS");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Bloco");

        jComboBoxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloco A", "Bloco B", "Bloco C", "Bloco D", "Visitantes" }));
        jComboBoxBloco.setEnabled(false);

        jTablevagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablevagas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablevagasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablevagas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEspecial)
                            .addComponent(jTextFieldmotos)
                            .addComponent(jTextFieldgerais, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNovo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldmotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldgerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Vagas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(779, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       flag = 1;
       jTextFieldEspecial.setEnabled(true);
       jTextFieldmotos.setEnabled(true);
       jTextFieldgerais.setEnabled(true);
       jComboBoxBloco.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonAlterar.setEnabled(false);
       jButtonExcluir.setEnabled(false);
       jButtonCancelar.setEnabled(true);
       
       
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
        if(jTextFieldEspecial.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha Quantidade de vagas Especiais");
            jTextFieldEspecial.requestFocus();
        } 
        else if(jTextFieldmotos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha Quantidade de vagas de Motos");
            jTextFieldmotos.requestFocus();
        }
        else if(jTextFieldgerais.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha Quantidade de vagas Gerais");
            jTextFieldgerais.requestFocus();
        }
        
        else{
                   
                if(flag == 1){
                mod.setVagaEspeciais(Integer.parseInt(jTextFieldEspecial.getText()));    
                mod.setVagaMoto(Integer.parseInt(jTextFieldmotos.getText())); 
                mod.setVagaGerais(Integer.parseInt(jTextFieldgerais.getText())); 
                mod.setSetor((String) jComboBoxBloco.getSelectedItem());
                dao.Salvar(mod);
                jTextFieldEspecial.setEnabled(false);
                jTextFieldmotos.setEnabled(false);
                jTextFieldgerais.setEnabled(false);
                jComboBoxBloco.setEnabled(false);
                jButtonAlterar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jTextFieldEspecial.setText("");
                jTextFieldId.setText("");
                jTextFieldgerais.setText("");
                jTextFieldmotos.setText("");
                jComboBoxBloco.setSelectedItem("");
                
                preencherTabela("SELECT * FROM public.vagas order by \"setor\"");
            
                }
                else {
                    if(flag == 2){
                        mod.setVagaEspeciais(Integer.parseInt(jTextFieldEspecial.getText()));    
                        mod.setVagaMoto(Integer.parseInt(jTextFieldmotos.getText())); 
                        mod.setVagaGerais(Integer.parseInt(jTextFieldgerais.getText()));
                        mod.setSetor((String) jComboBoxBloco.getSelectedItem());
                        dao.Alterar(mod);
                        jTextFieldEspecial.setEnabled(false);
                        jTextFieldmotos.setEnabled(false);
                        jTextFieldgerais.setEnabled(false);
                        jComboBoxBloco.setEnabled(false);
                        jTextFieldEspecial.setText("");
                        jTextFieldId.setText("");
                        jTextFieldgerais.setText("");
                        jTextFieldmotos.setText("");
                        jComboBoxBloco.setSelectedItem("");
                        
                preencherTabela("SELECT * FROM public.vagas order by \"setor\"");
                     }
                 }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       flag = 2;
       jButtonExcluir.setEnabled(false);
       jTextFieldEspecial.setEnabled(true);
       jTextFieldmotos.setEnabled(true);
       jTextFieldgerais.setEnabled(true);
       jComboBoxBloco.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonAlterar.setEnabled(false);
       jButtonNovo.setEnabled(false);
       
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       jTextFieldEspecial.setEnabled(!true);
       jTextFieldmotos.setEnabled(!true);
       jTextFieldgerais.setEnabled(!true);
       jComboBoxBloco.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jTextFieldEspecial.setText("");
       jTextFieldId.setText("");
       jTextFieldgerais.setText("");
       jTextFieldmotos.setText("");
       jComboBoxBloco.setSelectedItem("");
       jButtonAlterar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonExcluir.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        String setor = jTextFieldPesquisa.getText();
        mod.setPesquisa(jTextFieldPesquisa.getText());
        ModeloVagas model = dao.buscaVagas(setor);
        
        jTextFieldId.setText(String.valueOf(model.getId_vaga()));
        jComboBoxBloco.setSelectedItem(model.getSetor());
        jTextFieldEspecial.setText(String.valueOf(model.getVagaEspeciais()));
        jTextFieldgerais.setText(String.valueOf(model.getVagaGerais()));
        jTextFieldmotos.setText(String.valueOf(model.getVagaMoto()));
        
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
  
       preencherTabela("select  \"id_vaga\", \"setor\", \"gerais\", \"motos\", \"especiais\" from vagas where \"setor\" like '%"+mod.getPesquisa()+"%'");
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta;
       resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente exluir");
               
       if (resposta == JOptionPane.YES_OPTION){
           mod.setId_vaga(Integer.parseInt(jTextFieldId.getText()));
           dao.Excluir(mod);
           jButtonAlterar.setEnabled(false);
           jButtonExcluir.setEnabled(false);
           jButtonCancelar.setEnabled(false);
           
           jButtonNovo.setEnabled(true);
           jButtonSalvar.setEnabled(false);
            jTextFieldEspecial.setText("");
            jTextFieldId.setText("");
            jTextFieldgerais.setText("");
            jTextFieldmotos.setText("");
            jComboBoxBloco.setSelectedItem("");
           preencherTabela("SELECT * FROM public.vagas order by \"setor\"");
       } 
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTablevagasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablevagasMouseClicked
         String setor = ""+jTablevagas.getValueAt(jTablevagas.getSelectedRow(), 1);
        conec.conexao();
        conec.executasql("select  \"id_vaga\", \"setor\", \"gerais\", \"motos\", \"especiais\" from vagas where \"setor\" = '"+ setor +"'");
        try {
            conec.rs.first();
            jTextFieldId.setText(String.valueOf(conec.rs.getInt("id_vaga")));
            jComboBoxBloco.setSelectedItem(conec.rs.getString("setor"));
            jTextFieldgerais.setText(conec.rs.getString("gerais"));      
            jTextFieldmotos.setText(conec.rs.getString("motos"));
            jTextFieldEspecial.setText(conec.rs.getString("especiais"));
            
            jButtonExcluir.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonAlterar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonNovo.setEnabled(false);
            
            } catch (SQLException ex) {
            Logger.getLogger(FormAreaTrabalho.class.getName()).log(Level.SEVERE, null, ex);
        }           
           conec.desconecta();
    }//GEN-LAST:event_jTablevagasMouseClicked
    public void preencherTabela(String Sql){
        
       
            ModeloTabela modelo = tabela.preencherTabelaVagas(Sql);
       
            jTablevagas.setModel(modelo);
            jTablevagas.getColumnModel().getColumn(0).setPreferredWidth(63);
            jTablevagas.getColumnModel().getColumn(0).setResizable(false);
            jTablevagas.getColumnModel().getColumn(1).setPreferredWidth(140);
            jTablevagas.getColumnModel().getColumn(1).setResizable(false);      
            jTablevagas.getColumnModel().getColumn(2).setPreferredWidth(140);
            jTablevagas.getColumnModel().getColumn(2).setResizable(false);
            jTablevagas.getColumnModel().getColumn(3).setPreferredWidth(140);
            jTablevagas.getColumnModel().getColumn(3).setResizable(false);
            jTablevagas.getColumnModel().getColumn(4).setPreferredWidth(140);
            jTablevagas.getColumnModel().getColumn(4).setResizable(false);
            
            jTablevagas.getTableHeader().setReorderingAllowed(false);
            jTablevagas.setAutoResizeMode(jTablevagas.AUTO_RESIZE_OFF);
            jTablevagas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
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
            java.util.logging.Logger.getLogger(FormVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVagas().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxBloco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablevagas;
    private javax.swing.JTextField jTextFieldEspecial;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldgerais;
    private javax.swing.JTextField jTextFieldmotos;
    // End of variables declaration//GEN-END:variables
}
