
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloControle.ModeloUsuarioEstacionamento;

public class DaoUsuarioEstacionamento {
    
    ConexaoBD conec = new ConexaoBD();
    ModeloUsuarioEstacionamento mod = new ModeloUsuarioEstacionamento();
    
    //Salvando Usuario do sistema
    public void Salvar(ModeloUsuarioEstacionamento mod){
        conec.conexao();
        
        try {
            PreparedStatement pst = conec.conn.prepareStatement("INSERT INTO public.estacionamento(\"est_nome\", \"est_matricula\", \"est_tipo\") values(?,?,?)");
         
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getMatricula());
            pst.setString(3,mod.getTipoUsuarioEstacionamento());      
         
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados Usuario inserido no banco com sucesso");
        
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Usuario!\n" + ex);
        }
       
        conec.desconecta();
    }
    //Alterando Dados dos Usuarios
    public void Alterar (ModeloUsuarioEstacionamento mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.estacionamento SET \"est_nome\"=?, \"est_matricula\"=?, \"est_tipo\"=? where \"est_id\"=? ");             
            
            pst.setString(1,mod.getNome());      
            pst.setString(2,mod.getMatricula());
            pst.setString(3,mod.getTipoUsuarioEstacionamento());
            pst.setInt(4,mod.getIdEstacionamento());
           
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterado com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
        
        
        conec.desconecta();
    }
    
     
    //Excluido Usuario
    public void Excluir(ModeloUsuarioEstacionamento mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("DELETE FROM public.estacionamento WHERE \"est_id\" = ?");
            pst.setInt(1, mod.getIdEstacionamento());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar dados \n erro :" + ex);
        }
        
        
        
        conec.desconecta();
        
    }
    
    //Buscando usuario no DB
    public ModeloUsuarioEstacionamento buscaUsuarioEstacionamento(ModeloUsuarioEstacionamento mod){
       conec.conexao(); 
        
      conec.executasql("select \"est_id\", \"est_nome\", \"est_matricula\", \"est_tipo\" from estacionamento where \"est_nome\" like '%"+mod.getPesquisa()+"%'");
       
       try {
           conec.rs.first();
           
           mod.setIdEstacionamento(conec.rs.getInt("est_id"));
           mod.setNome(conec.rs.getString("est_nome"));
           mod.setMatricula(conec.rs.getString("est_matricula"));
           mod.setTipoUsuarioEstacionamento(conec.rs.getString("est_tipo"));
                    
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"usuario nao cadastrado\n");
        }
      
      conec.desconecta();  
        return mod;
    }
     public ModeloUsuarioEstacionamento buscaUsuarioMatricula(ModeloUsuarioEstacionamento mod){
       conec.conexao(); 
        
      conec.executasql("select \"est_id\", \"est_nome\", \"est_matricula\", \"est_tipo\" from estacionamento where \"est_matricula\" like '%"+mod.getPesquisa()+"%'");
       
       try {
           conec.rs.first();
          
           mod.setIdEstacionamento(conec.rs.getInt("est_id"));
           mod.setNome(conec.rs.getString("est_nome"));
           mod.setMatricula(conec.rs.getString("est_matricula"));
           mod.setTipoUsuarioEstacionamento(conec.rs.getString("est_tipo"));
                    
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"usuario nao cadastrado\n");
        }
      
      conec.desconecta();  
        return mod;
    }
}
