/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author Uso Pessoal
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    ConexaoBD conec = new ConexaoBD();
    
    public TelaPrincipal(String usuario) {
        initComponents();
         conec.conexao();
        jLabelUsuario.setText(usuario);
       
    }

    TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAreaTrabalho = new javax.swing.JMenu();
        jMenuItemTelaBenvindo = new javax.swing.JMenuItem();
        jMenuCadEventos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemcadVagas = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItemEventos = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jM = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUsuario.setText("Bem-Vindo:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(90, 10, 170, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Bem-Vindo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 70, 15);

        jMenuAreaTrabalho.setText("Area de Trabalho");

        jMenuItemTelaBenvindo.setText("Tela Inicial");
        jMenuItemTelaBenvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenvindoActionPerformed(evt);
            }
        });
        jMenuAreaTrabalho.add(jMenuItemTelaBenvindo);

        jMenuBar1.add(jMenuAreaTrabalho);

        jMenuCadEventos.setText("Cadastro");

        jMenuItem1.setText("Eventos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadEventos.add(jMenuItem1);

        jMenuItem5.setText("Usuario do Estacionamento ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuCadEventos.add(jMenuItem5);

        jMenuItem2.setText("Usuarios do Sistema");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCadEventos.add(jMenuItem2);

        jMenuItemcadVagas.setText("Vagas");
        jMenuItemcadVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcadVagasActionPerformed(evt);
            }
        });
        jMenuCadEventos.add(jMenuItemcadVagas);

        jMenuItem8.setText("Ocorrencia");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenuCadEventos.add(jMenuItem8);

        jMenuBar1.add(jMenuCadEventos);

        jMenuRelatorio.setText("Relatorios");

        jMenuItem3.setText("Entrada e Saida de veiculos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItem3);

        jMenuItemEventos.setText("Eventos");
        jMenuItemEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEventosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemEventos);

        jMenuItem4.setText("Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItem4);

        jMenuItem6.setText("Usuario do Estacionamento");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItem6);

        jMenuItem7.setText("Ocorrencia");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItem7);

        jMenuBar1.add(jMenuRelatorio);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jM.add(jMenuItemSair);

        jMenuBar1.add(jM);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(772, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conec.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBenvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenvindoActionPerformed
        try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")||conec.rs.getString("usu_tipo").equals("Controlador")){
                FormAreaTrabalho tela = new FormAreaTrabalho();
                tela.setVisible(true); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }


             
    }//GEN-LAST:event_jMenuItemTelaBenvindoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")){
                FormUsuario tela = new FormUsuario();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemcadVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcadVagasActionPerformed
         try {
             conec.conexao();
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")){
                FormVagas tela = new FormVagas();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }
        
        
    }//GEN-LAST:event_jMenuItemcadVagasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")||conec.rs.getString("usu_tipo").equals("Controlador")){
                FormEventos tela = new FormEventos();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")||conec.rs.getString("usu_tipo").equals("RH")){
                FormUsuarioEstacionamento tela = new FormUsuarioEstacionamento();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();

            if(conec.rs.getString("usu_tipo").equals("Administrador")){
                FormRelatorioUsuarioEstacionamento tela = new FormRelatorioUsuarioEstacionamento();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        } 
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();

            if(conec.rs.getString("usu_tipo").equals("Administrador")){
                FormRelatorioUsuario tela = new FormRelatorioUsuario();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEventosActionPerformed
         try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")){
                FormRelatorioEventos tela = new FormRelatorioEventos();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }
        
        
    }//GEN-LAST:event_jMenuItemEventosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")){
                FormRelatorioEntradaSaida tela = new FormRelatorioEntradaSaida();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();
            
            if(conec.rs.getString("usu_tipo").equals("Administrador")||conec.rs.getString("usu_tipo").equals("Controlador")){
                FormCadastroOcorrencia tela = new FormCadastroOcorrencia();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        }

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            conec.executasql("select  \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" = '"+ jLabelUsuario.getText() +"'");
            conec.rs.first();

            if(conec.rs.getString("usu_tipo").equals("Administrador")){
                FormRelatorioOcorrencia tela = new FormRelatorioOcorrencia();
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Você não tem permição para essa funcionalidade\n contate o Administrador do sistema\n"+ ex);
        } 
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jM;
    private javax.swing.JMenu jMenuAreaTrabalho;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadEventos;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemEventos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBenvindo;
    private javax.swing.JMenuItem jMenuItemcadVagas;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
