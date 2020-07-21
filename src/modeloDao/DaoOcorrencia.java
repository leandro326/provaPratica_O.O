
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloControle.ModeloOcorrencia;


public class DaoOcorrencia {
    ConexaoBD conec = new ConexaoBD();
    ModeloOcorrencia mod = new ModeloOcorrencia();
    
    //Salvando Usuario do sistema
    public void Salvar(ModeloOcorrencia mod){
        conec.conexao();
        
        try {
            PreparedStatement pst = conec.conn.prepareStatement("INSERT INTO public.Ocorrencia(\"nome_1\",\"nome_2\", \"matricula_1\", \"matricula_2\", \"placa_1\", \"placa_2\", \"tipo\", \"data\",\"ocorrencia\",\"setor\") values(?,?,?,?,?,?,?,?,?,?)");
         
            pst.setString(1,mod.getNome1());
            pst.setString(2,mod.getNome2());
            pst.setString(3,mod.getMatricula1()); 
            pst.setString(4,mod.getMatricula2());
            pst.setString(5,mod.getPlaca1());
            pst.setString(6,mod.getPlaca2());
            pst.setString(7,mod.getTipo());
            pst.setString(8,mod.getData());
            pst.setString(9,mod.getOcorrencia());
            pst.setString(10,mod.getSetor());
            
            pst.setString(9,mod.getOcorrencia());
         
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados da Ocorrencia inserido no banco com sucesso");
        
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Ocorrencia!\n" + ex);
        }
       
        conec.desconecta();
    }
    //Alterando Dados dos Usuarios
    public void Alterar (ModeloOcorrencia mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.Ocorrencia SET \"nome_1\"=?, \"nome_2\"=?,\"matricula_1\"=?, \"matricula_2\"=?, \"placa_1\"=?, \"placa_2\"=?, \"tipo\"=?, \"ocorrencia\"=?, \"data\"=?, \"setor\"=? where \"matricula1\"=? and \"matricula1\"=? ");             
                                                                                                                                                            
            pst.setString(1,mod.getNome1());
            pst.setString(2,mod.getNome2());
            pst.setString(3,mod.getMatricula1()); 
            pst.setString(4,mod.getMatricula2());
            pst.setString(5,mod.getPlaca1());
            pst.setString(6,mod.getPlaca2());
            pst.setString(7,mod.getTipo());
            pst.setString(8,mod.getOcorrencia());
            pst.setString(9,mod.getData());
            pst.setString(10, mod.getSetor());
            pst.setInt(11,mod.getiD());
           
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterado com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
        
        
        conec.desconecta();
    }
    
     
    //Excluido Usuario
    public void Excluir(ModeloOcorrencia mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("DELETE FROM public.Ocorrencia  WHERE \"id_oc\" = ?");
            pst.setInt(1, mod.getiD());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar dados \n erro :" + ex);
        }
        
        
        
        conec.desconecta();
        
    }
    
    //Buscando usuario no DB
    public ModeloOcorrencia buscaModeloOcorrencia(ModeloOcorrencia mod){
       conec.conexao(); 
       
      conec.executasql("select \"id_oc\",\"nome_1\",\"nome_2\", \"matricula_1\", \"matricula_2\", \"placa_1\", \"placa_2\", \"tipo\",\"data\", \"ocorrencia\", \"setor\" from ocorrencia where \"setor\" like '%"+mod.getPesquisa()+"%'");
      
       
       try {
           conec.rs.first();
           
           mod.setiD(conec.rs.getInt("id_oc"));
           mod.setNome1(conec.rs.getString("nome_1"));
           mod.setNome2(conec.rs.getString("nome_2"));
           mod.setMatricula1(conec.rs.getString("matricula_1"));
           mod.setMatricula2(conec.rs.getString("matricula_2"));
           mod.setPlaca1(conec.rs.getString("placa_1")); 
           mod.setPlaca2(conec.rs.getString("placa_2")); 
           mod.setTipo(conec.rs.getString("tipo"));
           mod.setData((conec.rs.getString("data")));
           mod.setOcorrencia(conec.rs.getString("ocorrencia"));
           mod.setSetor(conec.rs.getString("setor"));
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ocorrencia nao cadastrada\n");
        }
      
      conec.desconecta();  
        return mod;
    }
    
}
