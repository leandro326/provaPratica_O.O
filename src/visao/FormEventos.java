
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloControle.ModeloEvento;
import modeloControle.ModeloTabela;
import modeloControle.ModeloUsuario;
import modeloDao.DaoEventos;
import modeloDao.DaoTabela;

public class FormEventos extends javax.swing.JFrame {
    ModeloEvento mod = new ModeloEvento();
    ConexaoBD conec = new ConexaoBD();
    DaoEventos dao = new DaoEventos();
    DaoTabela tabela = new DaoTabela();
    int flag = 0;
    
  
    public FormEventos() {
        initComponents();
        conec.conexao();
        preencherTabela("SELECT * FROM public.eventos order by \"nome_evento\"");
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMome = new javax.swing.JTextField();
        jTextFieldDataInicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDataFim = new javax.swing.JTextField();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEvento = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldHorarioInicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHorarioFim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldqtdVagas = new javax.swing.JTextField();
        jComboBoxBloco = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Eventos");

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

        jLabel2.setText("Nome do evento");

        jLabel3.setText("Data Inicio");

        jTextFieldMome.setEnabled(false);

        jTextFieldDataInicio.setEnabled(false);

        jLabel4.setText("Data Fim");

        jTextFieldDataFim.setEnabled(false);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEventoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEvento);

        jLabel5.setText("Horario Inicio");

        jTextFieldHorarioInicio.setEnabled(false);

        jLabel6.setText("Horario Fim");

        jTextFieldHorarioFim.setEnabled(false);

        jLabel7.setText("Id");

        jTextFieldId.setEnabled(false);

        jLabel8.setText("Quantas Vagas");

        jTextFieldqtdVagas.setEnabled(false);

        jComboBoxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloco A", "Bloco B", "Bloco C", "Bloco D", "Visitntes" }));

        jLabel9.setText("Bloco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCancelar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldPesquisar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextFieldDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                                    .addComponent(jTextFieldHorarioInicio))
                                                .addGap(126, 126, 126)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel8))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextFieldDataFim, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                    .addComponent(jTextFieldHorarioFim)
                                                    .addComponent(jTextFieldqtdVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldMome, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(283, 283, 283))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addGap(28, 28, 28)
                                                .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jButtonNovo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldqtdVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextFieldHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTextFieldHorarioFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(745, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       flag = 1;
       jTextFieldMome.setEnabled(true);
       jTextFieldDataInicio.setEnabled(true);
       jTextFieldDataFim.setEnabled(true);
       jTextFieldHorarioInicio.setEnabled(true);
       jTextFieldHorarioFim.setEnabled(true);
       jTextFieldqtdVagas.setEnabled(true);
       jComboBoxBloco.setEnabled(true);
       
       jButtonSalvar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldMome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo Nome");
            jTextFieldMome.requestFocus();
        } 
        else if(jTextFieldqtdVagas.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo Quantidade de vagas");
            jTextFieldqtdVagas.requestFocus();
        }
        else if(jTextFieldDataInicio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo data Inicio");
            jTextFieldDataInicio.requestFocus();
        }
        else if(jTextFieldDataFim.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo data fim");
            jTextFieldDataFim.requestFocus();
        }
        else if(jTextFieldHorarioInicio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo data fim");
            jTextFieldHorarioInicio.requestFocus();
        }
        else if(jTextFieldHorarioFim.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo data fim");
            jTextFieldHorarioFim.requestFocus();
        }
         else{           
                if(flag == 1){
                mod.setNome(jTextFieldMome.getText());
                mod.setDataInicial(jTextFieldDataInicio.getText());
                mod.setDataFinal(jTextFieldDataFim.getText());
                mod.setHoraInicio(jTextFieldHorarioInicio.getText());
                mod.setHoraFinal(jTextFieldHorarioFim.getText());
                mod.setQtdVagas(Integer.parseInt(jTextFieldqtdVagas.getText()));
                mod.setSetor((String)jComboBoxBloco.getSelectedItem());
                
                
                dao.Salvar(mod);
                jTextFieldMome.setText("");
                jTextFieldDataInicio.setText("");
                jTextFieldDataFim.setText("");
                jTextFieldHorarioInicio.setText("");
                jTextFieldHorarioFim.setText("");
                jTextFieldqtdVagas.setText("");
                
                jTextFieldMome.setEnabled(false);
                jTextFieldDataInicio.setEnabled(false);
                jTextFieldDataFim.setEnabled(false);
                jTextFieldHorarioInicio.setEnabled(false);
                jTextFieldHorarioFim.setEnabled(false);
                jTextFieldqtdVagas.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonSalvar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonAlterar.setEnabled(false);
                
              preencherTabela("SELECT * FROM public.eventos order by \"nome_evento\""); 
             }
               else{
                if(flag == 2){
                mod.setId_evento(Integer.parseInt(jTextFieldId.getText()));
                mod.setNome(jTextFieldMome.getText());
                mod.setDataInicial(jTextFieldDataInicio.getText());
                mod.setDataFinal(jTextFieldDataFim.getText());
                mod.setHoraInicio(jTextFieldHorarioInicio.getText());
                mod.setHoraFinal(jTextFieldHorarioFim.getText());
                mod.setQtdVagas(Integer.parseInt(jTextFieldqtdVagas.getText()));
                mod.setSetor((String)jComboBoxBloco.getSelectedItem());
                        
                dao.Alterar(mod);
                
                jTextFieldId.setText("");
                jTextFieldMome.setText("");
                jTextFieldDataInicio.setText("");
                jTextFieldDataFim.setText("");
                jTextFieldHorarioInicio.setText("");
                jTextFieldHorarioFim.setText("");
                jTextFieldqtdVagas.setText("");
                jComboBoxBloco.setSelectedItem("");
                               
                jComboBoxBloco.setEnabled(false);
                jTextFieldMome.setEnabled(false);
                jTextFieldDataInicio.setEnabled(false);
                jTextFieldDataFim.setEnabled(false);
                jTextFieldHorarioInicio.setEnabled(false);
                jTextFieldHorarioFim.setEnabled(false);
                jTextFieldqtdVagas.setEnabled(false);
                
                 preencherTabela("SELECT * FROM public.eventos order by \"nome_evento\"");
                }    
             }  
                
                
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
                jTextFieldMome.setText("");
                jTextFieldDataInicio.setText("");
                jTextFieldDataFim.setText("");
                jTextFieldHorarioInicio.setText("");
                jTextFieldHorarioFim.setText("");
                jTextFieldqtdVagas.setText("");
                jTextFieldId.setText("");
                jComboBoxBloco.setSelectedItem("");
                
                
                jTextFieldqtdVagas.setEnabled(false);
                jTextFieldMome.setEnabled(false);
                jTextFieldDataInicio.setEnabled(false);
                jTextFieldDataFim.setEnabled(false);
                jTextFieldHorarioInicio.setEnabled(false);
                jTextFieldHorarioFim.setEnabled(false);
                jComboBoxBloco.setEnabled(false);
                
                jButtonAlterar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonCancelar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
            jTextFieldqtdVagas.setEnabled(true);
            jComboBoxBloco.setEnabled(true);
            jTextFieldMome.setEnabled(!false);
            jTextFieldDataInicio.setEnabled(!false);
            jTextFieldDataFim.setEnabled(!false);
            jTextFieldHorarioInicio.setEnabled(!false);
            jTextFieldHorarioFim.setEnabled(!false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(true);
            jButtonSalvar.setEnabled(true);
            preencherTabela("SELECT * FROM public.eventos order by \"nome_evento\"");
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
         int resposta;
       resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente exluir");
               
       if (resposta == JOptionPane.YES_OPTION){
           mod.setId_evento(Integer.parseInt(jTextFieldId.getText()));
           dao.Excluir(mod);
           jTextFieldqtdVagas.setEnabled(false);
           jTextFieldMome.setEnabled(false);
           jTextFieldDataInicio.setEnabled(false);
           jTextFieldDataFim.setEnabled(false);
           jTextFieldHorarioInicio.setEnabled(false);
           jTextFieldHorarioFim.setEnabled(false);
           jComboBoxBloco.setEnabled(false);
           jTextFieldDataFim.setText("");
           jTextFieldDataInicio.setText("");
           jTextFieldHorarioFim.setText("");
           jTextFieldHorarioInicio.setText("");
           jTextFieldId.setText("");
           jTextFieldqtdVagas.setText("");
           jTextFieldPesquisar.setText("");
           jComboBoxBloco.setSelectedItem("");
          
          preencherTabela("SELECT * FROM public.eventos order by \"nome_evento\"");
       }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisar.getText());
        ModeloEvento model = dao.buscaEvento(mod);      
        jTextFieldId.setText(String.valueOf(model.getId_evento()));
        jTextFieldMome.setText(model.getNome());
        jTextFieldDataInicio.setText(model.getDataInicial());
        jTextFieldDataFim.setText(model.getDataFinal());
        jTextFieldHorarioInicio.setText(model.getHoraInicial());
        jTextFieldHorarioFim.setText(model.getHoraFinal());
        jTextFieldqtdVagas.setText(String.valueOf(model.getQtdVagas()));
        jComboBoxBloco.setSelectedItem(model.getSetor());
         
        jTextFieldqtdVagas.setEnabled(false);
        jTextFieldMome.setEnabled(false);
        jTextFieldDataInicio.setEnabled(false);
        jTextFieldDataFim.setEnabled(false);
        jTextFieldHorarioInicio.setEnabled(false);
        jTextFieldHorarioFim.setEnabled(false);
        jComboBoxBloco.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        preencherTabela("select  \"id_evento\", \"nome_evento\", \"data_inicial\", \"data_final\", \"hora_inicio\", \"hora_final\", \"qtd_vagas\", \"setor\" from eventos where \"nome_evento\" like '%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventoMouseClicked
        String nome_usuario = ""+jTableEvento.getValueAt(jTableEvento.getSelectedRow(), 1);
        conec.conexao();
        
        conec.executasql("select  \"id_evento\", \"nome_evento\", \"data_inicial\", \"data_final\", \"hora_inicio\", \"hora_final\", \"qtd_vagas\", \"setor\" from eventos where \"nome_evento\" = '"+ nome_usuario +"'");
        
        try {
            conec.rs.first();
            jTextFieldId.setText(String.valueOf(conec.rs.getInt("id_evento")));
            jTextFieldMome.setText(conec.rs.getString("nome_evento"));
            jTextFieldDataInicio.setText(conec.rs.getString("data_inicial"));
            jTextFieldDataFim.setText(conec.rs.getString("data_final"));
            jTextFieldHorarioInicio.setText(conec.rs.getString("hora_inicio"));
            jTextFieldHorarioFim.setText(conec.rs.getString("hora_final"));
            jTextFieldqtdVagas.setText(String.valueOf(conec.rs.getInt("qtd_vagas")));
            jComboBoxBloco.setSelectedItem((String)conec.rs.getString("setor"));
           
            jButtonNovo.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(true);
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            
            } catch (SQLException ex) {
            Logger.getLogger(FormAreaTrabalho.class.getName()).log(Level.SEVERE, null, ex);
        }           
           conec.desconecta();
        
    }//GEN-LAST:event_jTableEventoMouseClicked

    public void preencherTabela(String Sql){
        
       
            ModeloTabela modelo = tabela.preencherTabelaEventos(Sql);
       
            jTableEvento.setModel(modelo);
            jTableEvento.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(0).setResizable(false);
            jTableEvento.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(1).setResizable(false);      
            jTableEvento.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(2).setResizable(false);
            jTableEvento.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(3).setResizable(false);      
            jTableEvento.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(4).setResizable(false);
            jTableEvento.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(5).setResizable(false);
            jTableEvento.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(6).setResizable(false);
            jTableEvento.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTableEvento.getColumnModel().getColumn(6).setResizable(false);
            
            jTableEvento.getTableHeader().setReorderingAllowed(false);
            jTableEvento.setAutoResizeMode(jTableEvento.AUTO_RESIZE_OFF);
            jTableEvento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    }
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
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEventos().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEvento;
    private javax.swing.JTextField jTextFieldDataFim;
    private javax.swing.JTextField jTextFieldDataInicio;
    private javax.swing.JTextField jTextFieldHorarioFim;
    private javax.swing.JTextField jTextFieldHorarioInicio;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldqtdVagas;
    // End of variables declaration//GEN-END:variables
}
