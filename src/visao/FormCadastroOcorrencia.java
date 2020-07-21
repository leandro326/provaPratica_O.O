
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloControle.ModeloAreadeTrabalho;
import modeloControle.ModeloOcorrencia;
import modeloDao.DaoAreadeTrabalho;
import modeloDao.DaoOcorrencia;
import modeloDao.DaoTabela;

public class FormCadastroOcorrencia extends javax.swing.JFrame {
   
    ModeloOcorrencia mod = new ModeloOcorrencia();
    ConexaoBD conec = new ConexaoBD();
    DaoOcorrencia dao = new DaoOcorrencia();
    DaoTabela tabela = new DaoTabela();
    ModeloAreadeTrabalho modAreadeTrabalho = new ModeloAreadeTrabalho();
    DaoAreadeTrabalho cont = new DaoAreadeTrabalho();
   
    
    public FormCadastroOcorrencia() {
        initComponents();
        conec.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFiematricula1 = new javax.swing.JTextField();
        jTextFieldOcorrencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonSalvar1 = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        Nome1 = new javax.swing.JLabel();
        jTextFielnome1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldplaca1 = new javax.swing.JTextField();
        jComboBoxtipodeocorrencia1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldplaca2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldmatricula2 = new javax.swing.JTextField();
        Nome2 = new javax.swing.JLabel();
        jTextFieldnome2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxSetor = new javax.swing.JComboBox<>();
        jButtonBucarplaca1 = new javax.swing.JButton();
        jButtonBuscarPlaca2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Ocorrencia");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Data da ocorrencia ");

        jTextFiematricula1.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Descrição");

        jButtonSalvar1.setText("Salvar");
        jButtonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar1ActionPerformed(evt);
            }
        });

        jButtonCancelar1.setText("Cancelar");
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Matricula");

        Nome1.setText("Nome");

        jTextFielnome1.setEnabled(false);

        jLabel9.setText("Placa");

        jTextFieldplaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldplaca1ActionPerformed(evt);
            }
        });

        jComboBoxtipodeocorrencia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de ocorrencia", "Batidas", "Estacionamento indevido", "Furto", "Roubo", "Inundação", "Dano ao Veiculo", "Outros.", " " }));

        jLabel10.setText("Placa");

        jLabel11.setText("Matricula");

        jTextFieldmatricula2.setEnabled(false);

        Nome2.setText("Nome");

        jTextFieldnome2.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Envolvidos");

        jComboBoxSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setor", "Bloco A", "Bloco B", "Bloco C", "Bloco D", "Visitantes" }));

        jButtonBucarplaca1.setText("Buscar");
        jButtonBucarplaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBucarplaca1ActionPerformed(evt);
            }
        });

        jButtonBuscarPlaca2.setText("Buscar");
        jButtonBuscarPlaca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPlaca2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonBucarplaca1)
                                            .addComponent(jButtonBuscarPlaca2)))
                                    .addComponent(jComboBoxtipodeocorrencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFiematricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Nome1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFielnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jTextFieldOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldplaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldplaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(137, 137, 137)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldmatricula2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Nome2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldnome2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxtipodeocorrencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldplaca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFiematricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome1)
                    .addComponent(jTextFielnome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBucarplaca1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarPlaca2)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldplaca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldmatricula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome2)
                    .addComponent(jTextFieldnome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar1)
                    .addComponent(jButtonCancelar1))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(745, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        jTextFieldData.setText("");
        jTextFiematricula1.setText("");
        jTextFieldmatricula2.setText("");
        jTextFieldOcorrencia.setText("");
        jTextFieldnome2.setText("");
        jTextFielnome1.setText("");
        jTextFieldplaca1.setText("");
        jTextFieldplaca2.setText("");
        jComboBoxSetor.setSelectedItem("Setor");
        jComboBoxtipodeocorrencia1.setSelectedItem("Tipo de ocorrencia");
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jButtonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar1ActionPerformed
                mod.setData(jTextFieldData.getText());
                mod.setMatricula1(jTextFiematricula1.getText());
                mod.setMatricula2(jTextFieldmatricula2.getText());
                mod.setNome1(jTextFielnome1.getText());
                mod.setNome2(jTextFieldnome2.getText());
                mod.setPlaca1(jTextFieldplaca1.getText());
                mod.setPlaca2(jTextFieldplaca2.getText());
                mod.setSetor((String) jComboBoxSetor.getSelectedItem());
                mod.setTipo((String)jComboBoxtipodeocorrencia1.getSelectedItem());
                mod.setOcorrencia(jTextFieldOcorrencia.getText());

                dao.Salvar(mod);
                
                jTextFieldData.setText("");
                jTextFiematricula1.setText("");
                jTextFieldmatricula2.setText("");
                jTextFieldOcorrencia.setText("");
                jTextFieldnome2.setText("");
                jTextFielnome1.setText("");
                jTextFieldplaca1.setText("");
                jTextFieldplaca2.setText("");
                jComboBoxSetor.setSelectedItem("setor");
                jComboBoxtipodeocorrencia1.setSelectedItem("Tipo de ocorrencia");
    }//GEN-LAST:event_jButtonSalvar1ActionPerformed

    private void jTextFieldplaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldplaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldplaca1ActionPerformed

    private void jButtonBucarplaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBucarplaca1ActionPerformed
          try {
            conec.executasql("select *from aluno where \"Placa_Aluno\" = '"+ jTextFieldplaca1.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("Placa_Aluno").equals(jTextFieldplaca1.getText())){
                modAreadeTrabalho.setPesquisa(jTextFieldplaca1.getText());
        ModeloAreadeTrabalho model = cont.buscaPlaca(modAreadeTrabalho);

              jTextFiematricula1.setText(model.getMatricula_Aluno());
              jTextFielnome1.setText(model.getNome_Aluno());
               
            }
            else{
                JOptionPane.showMessageDialog(null,"veiculo não encontra-se no estacionamento");
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"veiculo não encontra-se no estacionamento");
        }
    }//GEN-LAST:event_jButtonBucarplaca1ActionPerformed

    private void jButtonBuscarPlaca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPlaca2ActionPerformed
        try {
            conec.executasql("select *from aluno where \"Placa_Aluno\" = '"+ jTextFieldplaca2.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("Placa_Aluno").equals(jTextFieldplaca2.getText())){
                modAreadeTrabalho.setPesquisa(jTextFieldplaca2.getText());
        ModeloAreadeTrabalho model = cont.buscaPlaca(modAreadeTrabalho);

              jTextFieldmatricula2.setText(model.getMatricula_Aluno());
              jTextFieldnome2.setText(model.getNome_Aluno());
               
            }
            else{
                JOptionPane.showMessageDialog(null,"veiculo não encontra-se no estacionamento");
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"veiculo não encontra-se no estacionamento");
        }
    }//GEN-LAST:event_jButtonBuscarPlaca2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroOcorrencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome1;
    private javax.swing.JLabel Nome2;
    private javax.swing.JButton jButtonBucarplaca1;
    private javax.swing.JButton jButtonBuscarPlaca2;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonSalvar1;
    private javax.swing.JComboBox<String> jComboBoxSetor;
    private javax.swing.JComboBox<String> jComboBoxtipodeocorrencia1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldOcorrencia;
    private javax.swing.JTextField jTextFieldmatricula2;
    private javax.swing.JTextField jTextFieldnome2;
    private javax.swing.JTextField jTextFieldplaca1;
    private javax.swing.JTextField jTextFieldplaca2;
    private javax.swing.JTextField jTextFielnome1;
    private javax.swing.JTextField jTextFiematricula1;
    // End of variables declaration//GEN-END:variables
}
