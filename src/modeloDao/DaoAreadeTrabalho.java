
package modeloDao;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloControle.ModeloAreadeTrabalho;
import modeloConection.ConexaoBD;

public class DaoAreadeTrabalho {
    ConexaoBD conec = new ConexaoBD();
    ModeloAreadeTrabalho aluno = new ModeloAreadeTrabalho();
    
    //salvando dados no BD
    public void Salvar(ModeloAreadeTrabalho aluno){
        conec.conexao();
        
        try {
            PreparedStatement pst = conec.conn.prepareStatement("INSERT INTO public.aluno(\"matricula_Aluno\", \"Nome_Aluno\", \"Placa_Aluno\",\"veiculo\", \"data\", \"horario_entrada\", \"horario_saida\", \"setor\", \"tipo\") values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1,aluno.getMatricula_Aluno());
            pst.setString(2,aluno.getNome_Aluno());
            pst.setString(3,aluno.getPlaca_Aluno());
            pst.setString(4,aluno.getVeiculo());
            pst.setString(5,aluno.getData());
            pst.setString(6,aluno.getHorario_entrada());
            pst.setString(7,aluno.getHoraio_saida());
            pst.setString(8,aluno.getSetor());
            pst.setString(9,aluno.getTipo());

            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados aluno inserido no banco com sucesso");

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Aluno!\n" + ex);
        }
        conec.desconecta();
    }
    //Auterando Dados
    public void Editar (ModeloAreadeTrabalho mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.aluno SET \"matricula_Aluno\"=?, \"Nome_Aluno\"=?, \"Placa_Aluno\"=?, \"veiculo\"=?, \"horario_entrada\"=?, \"horario_saida\"=?, \"data\"=?, \"setor\"=?, \"tipo\"=? where \"Id_aluno\"=? ");             
            
            pst.setString(1,mod.getMatricula_Aluno());      
            pst.setString(2,mod.getNome_Aluno());          
            pst.setString(3,mod.getPlaca_Aluno());
            pst.setString(4,mod.getVeiculo());           
            pst.setString(5,mod.getHorario_entrada());
            pst.setString(6,mod.getHoraio_saida());
            pst.setString(7,mod.getData());
            pst.setString(8,mod.getSetor());
            pst.setString(9,mod.getTipo());            
            pst.setInt(10,mod.getId_Aluno());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterado com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }

        conec.desconecta();
    }

    //Excluindo dados 
    public void Excluir(ModeloAreadeTrabalho mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("DELETE FROM public.aluno WHERE \"Id_aluno\" = ?");
            pst.setInt(1, mod.getId_Aluno());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar dados \n erro :" + ex);
        }

        conec.desconecta();
        
    }

    //Buscando dados no BD
    public ModeloAreadeTrabalho buscaAluno(ModeloAreadeTrabalho aluno){
       conec.conexao(); 
        
       conec.executasql("select  \"Id_aluno\", \"matricula_Aluno\", \"Nome_Aluno\",  \"Placa_Aluno\", \"veiculo\", \"data\", \"horario_entrada\", \"horario_saida\", \"setor\", \"tipo\" from aluno where \"Nome_Aluno\" like '%"+aluno.getPesquisa()+"%'");
       
       try {
           conec.rs.first();
 
           aluno.setId_Aluno(conec.rs.getInt("Id_aluno"));
           aluno.setMatricula_Aluno(conec.rs.getString("matricula_Aluno"));
           aluno.setNome_Aluno(conec.rs.getString("Nome_Aluno"));          
           aluno.setPlaca(conec.rs.getString("Placa_Aluno"));
           aluno.setVeiculo(conec.rs.getString("veiculo"));
           aluno.setData(conec.rs.getString("data"));
           aluno.setHorario_entrada(conec.rs.getString("horario_entrada"));
           aluno.setHoraio_saida(conec.rs.getString("horario_saida"));
           aluno.setSetor(conec.rs.getString("setor"));
           aluno.setTipo(conec.rs.getString("tipo"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"nome nao cadastrado no sistema" );
        }

      conec.desconecta();  
        return aluno;
    }
    
    public ModeloAreadeTrabalho buscaPlaca(ModeloAreadeTrabalho aluno){
       conec.conexao(); 
        
       conec.executasql("select  \"Id_aluno\", \"matricula_Aluno\", \"Nome_Aluno\",  \"Placa_Aluno\", \"veiculo\", \"data\", \"horario_entrada\", \"horario_saida\", \"setor\", \"tipo\" from aluno where \"Placa_Aluno\" like '%"+aluno.getPesquisa()+"%'");
       
       try {
           conec.rs.first();
 
           aluno.setId_Aluno(conec.rs.getInt("Id_aluno"));
           aluno.setMatricula_Aluno(conec.rs.getString("matricula_Aluno"));
           aluno.setNome_Aluno(conec.rs.getString("Nome_Aluno"));          
           aluno.setPlaca(conec.rs.getString("Placa_Aluno"));
           aluno.setVeiculo(conec.rs.getString("veiculo"));
           aluno.setData(conec.rs.getString("data"));
           aluno.setHorario_entrada(conec.rs.getString("horario_entrada"));
           aluno.setHoraio_saida(conec.rs.getString("horario_saida"));
           aluno.setSetor(conec.rs.getString("setor"));
           aluno.setTipo(conec.rs.getString("tipo"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"placa nao esta no sistema" );
        }

      conec.desconecta();  
        return aluno;
    }
    
}
