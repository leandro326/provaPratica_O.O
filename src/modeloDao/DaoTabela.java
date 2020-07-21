
package modeloDao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modeloControle.ModeloAreadeTrabalho;
import modeloControle.ModeloUsuario;
import modeloControle.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloControle.ModeloVagas;

public class DaoTabela {
  ConexaoBD conec = new ConexaoBD();
  ModeloAreadeTrabalho aluno = new ModeloAreadeTrabalho(); 
  ModeloUsuario usuario = new ModeloUsuario();
  ModeloVagas vagas = new ModeloVagas();
  

  // preenchendo relatorio de veiculos que usou o estacionamento
  public ModeloTabela preencherTabelaAluno(String Sql){
    conec.conexao();
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Matricula", "Nome", "Placa", "Veiculo", "Setor", "Tipo de usuario", "Horario Entrada", "Horario Saida","Data"};
        conec.conexao();
        conec.executasql(Sql);
        
            try {
                conec.rs.first();
                do{
                    dados.add(new Object[]{conec.rs.getInt("Id_aluno"),conec.rs.getString("matricula_Aluno"),conec.rs.getString("Nome_Aluno"),conec.rs.getString("Placa_Aluno"),conec.rs.getString("veiculo"),conec.rs.getString("setor"),conec.rs.getString("tipo"),conec.rs.getString("horario_entrada"),conec.rs.getString("horario_saida"),conec.rs.getString("data")});
                    
                }while(conec.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao criar Tabela Aluno" + ex);
            }
         ModeloTabela modelo = new ModeloTabela(dados,colunas);
         
    conec.desconecta();
    
    return modelo;
  }

 //preenchendo tabela de usuario do sistemas
 public ModeloTabela preencherTabelaUsuario(String Sql){
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Nome", "Tipo"};
        conec.conexao();
        conec.executasql(Sql);
        
            try {
                conec.rs.first();
                do{
                    dados.add(new Object[]{conec.rs.getInt("usu_id"),conec.rs.getString("usu_nome"),conec.rs.getString("usu_tipo")});
                    
                }while(conec.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao criar Tabela usuario\n" + ex);
            }
        
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
        conec.desconecta();
        return modelo;

 }
 
  public ModeloTabela preencherTabelaEventos(String Sql){
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Nome do evento", "Vagas Usadas","Setor","Data Inicio","Data fim","Hora inicio","Hora Fim"};
        conec.conexao();
        conec.executasql(Sql);
        
            try {
                conec.rs.first();
                do{
                    dados.add(new Object[]{conec.rs.getInt("id_evento"),conec.rs.getString("nome_evento"),conec.rs.getInt("qtd_vagas"),conec.rs.getString("setor"),conec.rs.getString("data_inicial"),conec.rs.getString("data_final"),conec.rs.getString("hora_inicio"),conec.rs.getString("hora_final")});
                    
                }while(conec.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"não há eventos cadastrado\n" );
            }
        
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
        conec.desconecta();
        return modelo;

 }
   public ModeloTabela preencherTabelaEstacionamento(String Sql){
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Nome","Matricula" ,"Tipo"};
        conec.conexao();
        conec.executasql(Sql);
        
            try {
                if (conec.rs.first()){
                    do{
                        dados.add(new Object[]{conec.rs.getInt("est_id"),conec.rs.getString("Est_nome"),conec.rs.getString("Est_matricula"),conec.rs.getString("est_tipo")});

                    }while(conec.rs.next());
                }
                else{
                    JOptionPane.showMessageDialog(null,"dados Invalido\n");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao criar Tabela usuario\n" + ex);
            }
        
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
        conec.desconecta();
        return modelo;

 }
    public ModeloTabela preencherTabelaVagas(String Sql){
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Setor","Carro" ,"Moto","Especiais"};
        conec.conexao();
        conec.executasql(Sql);
        
            try {
                conec.rs.first();
                do{
                    dados.add(new Object[]{conec.rs.getInt("id_vaga"),conec.rs.getString("setor"),conec.rs.getInt("gerais"),conec.rs.getInt("motos"),conec.rs.getInt("Especiais")});
                    
                }while(conec.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao criar Tabela vagas\n" + ex);
            }
        
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
        conec.desconecta();
        return modelo;

 }
    public ModeloTabela preencherTabelaOcorrencia(String Sql){
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Setor","Tipo de ocorrencia" ,"Data"};
        conec.conexao();
        conec.executasql(Sql);
        
            try {
                conec.rs.first();
                do{
                    dados.add(new Object[]{conec.rs.getInt("Id_oc"),conec.rs.getString("setor"),conec.rs.getString("tipo"),conec.rs.getString("data")});
                    
                }while(conec.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Verifique se degito correto a pesquisa\n" );
            }
        
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
        conec.desconecta();
        return modelo;

 }
    
}