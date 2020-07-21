
package visao;

import java.io.File;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloControle.ModeloAreadeTrabalho;
import modeloControle.ModeloTabela;
import modeloControle.ModeloUsuarioEstacionamento;
import modeloDao.DaoAreadeTrabalho;
import modeloDao.DaoTabela;
import modeloDao.DaoUsuarioEstacionamento;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

public class FormRelatorioEntradaSaida extends javax.swing.JFrame {

    DaoAreadeTrabalho estacionamento = new DaoAreadeTrabalho();
    ConexaoBD conec = new ConexaoBD();
    DaoTabela tabela = new DaoTabela();
    DaoAreadeTrabalho dao= new DaoAreadeTrabalho();
    ModeloAreadeTrabalho mod = new ModeloAreadeTrabalho();

    public FormRelatorioEntradaSaida() {
        initComponents();
        preencherTabela("SELECT * FROM public.aluno order by \"Nome_Aluno\"");
    }

    public void preencherTabela(String Sql){
        
            ModeloTabela modelo = tabela.preencherTabelaAluno(Sql);  
             jTablerRelatorioEntadaSaida.setModel(modelo);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(0).setPreferredWidth(33);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(0).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(1).setPreferredWidth(80);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(1).setResizable(false);      
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(2).setPreferredWidth(110);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(2).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(3).setPreferredWidth(90);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(3).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(4).setPreferredWidth(90);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(4).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(5).setPreferredWidth(80);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(5).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(6).setPreferredWidth(100);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(6).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(7).setPreferredWidth(100);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(7).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(8).setPreferredWidth(90);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(8).setResizable(false);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(9).setPreferredWidth(90);
             jTablerRelatorioEntadaSaida.getColumnModel().getColumn(9).setResizable(false);
            
             jTablerRelatorioEntadaSaida.getTableHeader().setReorderingAllowed(false);
             jTablerRelatorioEntadaSaida.setAutoResizeMode( jTablerRelatorioEntadaSaida.AUTO_RESIZE_OFF);
             jTablerRelatorioEntadaSaida.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFielddataInicio = new javax.swing.JTextField();
        jTextFielddataFim = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablerRelatorioEntadaSaida = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatorio de entrada e saida de Veiculos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Data inicio");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Data Fim");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTablerRelatorioEntadaSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablerRelatorioEntadaSaida);

        jLabel4.setText("Matricula");

        jLabel5.setText("Nome");

        jLabel6.setText("Placa");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFielddataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFielddataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFielddataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFielddataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(801, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(!jTextFielddataInicio.getText().isEmpty() && !jTextFielddataFim.getText().isEmpty()){
           
           // mod.setData(jTextFielddataInicio.getText());
            //mod.setData(jTextFielddataFim.getText());
            
            jButtonCancelar.setEnabled(true);
            
            preencherTabela("select *from aluno where to_date(\"data\",'DD-MM-YYYY') between '"+ jTextFielddataInicio.getText()+"' and " + "'"+jTextFielddataFim.getText()+"'");
        } 
             
        
        
            else if(jTextFieldMatricula.getText().isEmpty()||jTextFieldNome.getText().isEmpty()&&jTextFieldPlaca.getText().isEmpty()){
            
                if(!jTextFieldMatricula.getText().isEmpty()){
                mod.setMatricula_Aluno(jTextFieldMatricula.getText());
                jButtonCancelar.setEnabled(true);

                preencherTabela("SELECT *from aluno where \"matricula_Aluno\" = '"+mod.getMatricula_Aluno()+"'");

                } 
                else if(!jTextFieldNome.getText().isEmpty()){
                mod.setNome_Aluno(jTextFieldNome.getText());
                jButtonCancelar.setEnabled(true);

                preencherTabela("SELECT *from aluno where \"Nome_Aluno\" like '%"+mod.getNome_Aluno()+"%'");                                                                                
                }    
               else if(!jTextFieldPlaca.getText().isEmpty()){
                mod.setPlaca(jTextFieldPlaca.getText());
                jButtonCancelar.setEnabled(true);

                preencherTabela("SELECT *from aluno where \"Placa_Aluno\" = '"+mod.getPlaca_Aluno()+"'");
                jButtonCancelar.setEnabled(true);
                }  
          }
        else{
            JOptionPane.showMessageDialog(null,"Preencha o campo nome ou data inicial ou final para pequisar");
            jTextFieldMatricula.requestFocus();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldMatricula.setText("");
        jTextFieldNome.setText("");
        jTextFieldPlaca.setText("");
        jTextFielddataFim.setText("");
        jTextFielddataFim.setText("");
        preencherTabela("SELECT * FROM public.aluno order by \"Nome_Aluno\"");
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
   
    
    
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
            java.util.logging.Logger.getLogger(FormRelatorioEntradaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioEntradaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioEntradaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioEntradaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelatorioEntradaSaida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablerRelatorioEntadaSaida;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFielddataFim;
    private javax.swing.JTextField jTextFielddataInicio;
    // End of variables declaration//GEN-END:variables
}
