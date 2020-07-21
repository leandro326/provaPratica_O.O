
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloControle.ModeloUsuario;
import modeloConection.ConexaoBD;

public class DaoUsuario {
    
    ConexaoBD conec = new ConexaoBD();
    ModeloUsuario mod = new ModeloUsuario();
    
    //Salvando Usuario do sistema
    public void Salvar(ModeloUsuario mod){
        conec.conexao();
        
        try {
            PreparedStatement pst = conec.conn.prepareStatement("INSERT INTO public.usuarios(\"usu_nome\", \"usu_senha\", \"usu_tipo\") values(?,?,?)");
         
            pst.setString(1,mod.getUsuNome());
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3,mod.getUsuTipo());      
         
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados Usuario inserido no banco com sucesso");
        
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Usuario!\n" + ex);
        }
       
        conec.desconecta();
    }
    //Alterando Dados dos Usuarios
    public void Alterar (ModeloUsuario mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.usuarios SET \"usu_nome\"=?, \"usu_senha\"=?, \"usu_tipo\"=? where \"usu_id\"=? ");             
            
            pst.setString(1,mod.getUsuNome());      
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3,mod.getUsuTipo());
            pst.setInt(4,mod.getUsuId());
           
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterado com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
        
        
        conec.desconecta();
    }
    
     
    //Excluido Usuario
    public void Excluir(ModeloUsuario mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("DELETE FROM public.usuarios WHERE \"usu_id\" = ?");
            pst.setInt(1, mod.getUsuId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar dados \n erro :" + ex);
        }
        
        
        
        conec.desconecta();
        
    }
    
    //Buscando usuario no DB
    public ModeloUsuario buscaUsuario(ModeloUsuario mod){
       conec.conexao(); 
        
      conec.executasql("select \"usu_id\", \"usu_nome\", \"usu_senha\", \"usu_tipo\" from usuarios where \"usu_nome\" like '%"+mod.getUsuPesquisa()+"%'");
       
       try {
           conec.rs.first();
           
           mod.setUsuId(conec.rs.getInt("usu_id"));
           mod.setUsuNome(conec.rs.getString("usu_nome"));
           mod.setUsuSenha(conec.rs.getString("usu_senha"));
           mod.setUsuTipo(conec.rs.getString("usu_tipo"));         
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"usuario nao cadastrado\n");
        }
      
      conec.desconecta();  
        return mod;
    }
    
}
    

