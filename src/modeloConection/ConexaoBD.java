/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

public class ConexaoBD {
    //dados para acessar o B.D
    public Statement stn;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/estacionamentoIesp";
    private String usuario = "postgres";
    private String senha = "1234";
    public Connection conn;
    
    //Conectando com o banco
    public void conexao(){
       
        try {
            System.setProperty("jdbc.Drivers", driver); // seta a propiedade de conecção
        conn = DriverManager.getConnection(caminho, usuario,senha );
            //JOptionPane.showMessageDialog(null, "conectado com sucesso");
                    
        } catch (SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "erro ao se conectar com o banco de dados:\n " + ex);
            
        }
    
}
    //execução do comando desejado
    public void executasql(String sql){
        try {
            stn = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stn.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao ao executar o sql:\n " + ex);
        }
    }
    //desconectando com o BD
    public void desconecta(){
        try {
            conn.close();
           // JOptionPane.showMessageDialog(null, "banco de dados Desconectdo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se desconectar com o banco");
        }
    }
}
