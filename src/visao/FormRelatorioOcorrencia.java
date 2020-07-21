package visao;

import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloControle.ModeloOcorrencia;
import modeloControle.ModeloTabela;
import modeloDao.DaoEventos;
import modeloDao.DaoOcorrencia;
import modeloDao.DaoTabela;

/**
 *
 * @author Uso Pessoal
 */
public class FormRelatorioOcorrencia extends javax.swing.JFrame {

    ConexaoBD conec = new ConexaoBD();
    DaoTabela tabela = new DaoTabela();
    ModeloOcorrencia mod = new ModeloOcorrencia();
    DaoOcorrencia dao = new DaoOcorrencia();
    
    int oco;
    
     
    public FormRelatorioOcorrencia() {
        initComponents();
          conec.conexao();
        preencherTabela("SELECT * FROM public.ocorrencia order by \"setor\"");
    }
 public void preencherTabela(String Sql){
        
            ModeloTabela modelo = tabela.preencherTabelaOcorrencia(Sql);
       
            jTablesetor.setModel(modelo);
            jTablesetor.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTablesetor.getColumnModel().getColumn(0).setResizable(false);
            jTablesetor.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTablesetor.getColumnModel().getColumn(1).setResizable(false);      
            jTablesetor.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTablesetor.getColumnModel().getColumn(2).setResizable(false);
            jTablesetor.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTablesetor.getColumnModel().getColumn(3).setResizable(false);
            
            jTablesetor.getTableHeader().setReorderingAllowed(false);
            jTablesetor.setAutoResizeMode(jTablesetor.AUTO_RESIZE_OFF);
            jTablesetor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablesetor = new javax.swing.JTable();
        jTextFieldpesquisar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatório de Ocorrências");

        jTablesetor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablesetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablesetor);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Setor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButtonBuscar)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(827, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
           
        mod.setPesquisa(jTextFieldpesquisar.getText());
        
        preencherTabela("SELECT \"Id_oc\",\"tipo\",\"setor\",\"data\" from ocorrencia where \"setor\" like '%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTablesetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesetorMouseClicked

       String id = ""+ jTablesetor.getValueAt(jTablesetor.getSelectedRow(), 0);
       mod.setiD(Integer.valueOf(id)); 
   
        FormRelatorioOcorrenciaCompleto tela = new FormRelatorioOcorrenciaCompleto(Integer.valueOf(id));
        tela.setVisible(true); 
    }//GEN-LAST:event_jTablesetorMouseClicked

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
            java.util.logging.Logger.getLogger(FormRelatorioOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelatorioOcorrencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablesetor;
    private javax.swing.JTextField jTextFieldpesquisar;
    // End of variables declaration//GEN-END:variables
}
