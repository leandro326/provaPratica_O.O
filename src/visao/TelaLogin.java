
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;


public class TelaLogin extends javax.swing.JFrame {
    ConexaoBD conec = new ConexaoBD();

    public TelaLogin() {
        initComponents();
        conec.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSenha = new javax.swing.JLabel();
        buttonEntrar = new java.awt.Button();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(40, 130, 50, 14);

        buttonEntrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonEntrar.setLabel("ENTRAR");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEntrar);
        buttonEntrar.setBounds(170, 180, 72, 38);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(120, 130, 210, 30);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(120, 90, 210, 30);

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLogin.setText("Usuario");
        getContentPane().add(jLabelLogin);
        jLabelLogin.setBounds(40, 100, 60, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONTROLE DE ESTACIONAMENTO  IESP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 380, 30);

        jLabelTelaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTelaLogin);
        jLabelTelaLogin.setBounds(0, 0, 410, 320);

        setSize(new java.awt.Dimension(425, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
       
        try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jTextFieldUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_senha").equals(jPasswordFieldSenha.getText())){
              
               TelaPrincipal tela = new TelaPrincipal(jTextFieldUsuario.getText());
                tela.setVisible(true);
               dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Senha ou Usuario invalido");
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Senha ou Usuario invalido");
        }
   
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelaLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
