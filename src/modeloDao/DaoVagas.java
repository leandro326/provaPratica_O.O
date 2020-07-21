
package modeloDao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloControle.ModeloVagas;

public class DaoVagas {
    ConexaoBD conec = new ConexaoBD();
    ModeloVagas mod = new ModeloVagas();
    Date data = new Date(System.currentTimeMillis());
    SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");
    
    //salvando qtd de vagas no BD
    public void Salvar(ModeloVagas mod){
        conec.conexao();
        
        try {
            PreparedStatement pst = conec.conn.prepareStatement("INSERT INTO public.vagas(\"especiais\", \"motos\", \"gerais\",\"setor\") values(?,?,?,?)");
         
            pst.setInt(1,mod.getVagaEspeciais());
            pst.setInt(2,mod.getVagaMoto());
            pst.setInt(3,mod.getVagaGerais());
            pst.setString(4,mod.getSetor());
         
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Vagas inseridas no banco com sucesso");
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Cadastrar VagasS!\n" + ex);
        }
       
        conec.desconecta();
    }
    //Alterando Qtd de vagas
    public void Alterar (ModeloVagas mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.vagas SET \"especiais\"=?, \"motos\"=?, \"gerais\"=?, \"setor\"=? where \"id_vaga\"=? ");             
            
            pst.setInt(1,mod.getVagaEspeciais());
            pst.setInt(2,mod.getVagaMoto());
            pst.setInt(3,mod.getVagaGerais());
            pst.setString(4,mod.getSetor());
            pst.setInt(5,mod.getId_vaga());
          
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterado com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
         
        conec.desconecta();
    }
    
   //Excluindo as vagas
   public void Excluir(ModeloVagas mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("DELETE FROM public.vagas WHERE \"id_vaga\" = ?");
            pst.setInt(1, mod.getId_vaga());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar dados \n erro :" + ex);
        }    
        conec.desconecta();        
    }
    //busca qtd vagas
  
     public ModeloVagas buscaVagas(String setor){
       conec.conexao(); 
        
      conec.executasql("select \"id_vaga\", \"especiais\", \"motos\", \"gerais\",\"setor\" from vagas where \"setor\" like '%"+setor+"%' order by  \"id_vaga\" desc ");
       
       try {
           conec.rs.first();
           
           mod.setId_vaga(conec.rs.getInt("id_vaga"));
           mod.setVagaEspeciais(conec.rs.getInt("especiais"));
           mod.setVagaMoto(conec.rs.getInt("motos"));
           mod.setVagaGerais(conec.rs.getInt("gerais"));
           mod.setSetor(conec.rs.getString("setor"));
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"nao ha vagas no sistema\n");
        }
        return mod;
     }
     public void QTDVagaMoto (ModeloVagas mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.vagas SET  \"motos\"=? where \"setor\"=?");             
            pst.setInt(1,mod.getVagaMoto());
            pst.setString(2,mod.getSetor());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterado entrda e saida com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
         
        conec.desconecta();
    }
    
     public void QTDvagaCarro (ModeloVagas mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.vagas SET  \"gerais\"=? where \"setor\"=?");             
            pst.setInt(1,mod.getVagaGerais());
            pst.setString(2,mod.getSetor());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterado entrada e saida com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
         
        conec.desconecta();
    }
      public void QTDvagaEspeciais (ModeloVagas mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.vagas SET  \"especiais\"=? where \"setor\"=?");             
            pst.setInt(1,mod.getVagaEspeciais());
            pst.setString(2,mod.getSetor());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterado entrada e saida com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
         
        conec.desconecta();
    }

      public ModeloVagas buscaVagasEvento(String setor){
       conec.conexao(); 
        
      conec.executasql("select \"v.gerais\", \"e.qtd_vagas\" , \"v.gerais\"- \"e.qtd_vagas\" as vagasdisponivel, \"v.setor\", \"e.setor\" , \"e.data_inicial\", \"e.data_final\" FROM public.vagas v inner join eventos e on \"v.setor\" = \"e.setor\" and \"e.data_inicial\" >= '"+formatarDate+"' and  \"e.data_final\"  <= '"+formatarDate+"' where \"v.setor\" like '%"+setor+"%'");             

       
       try {
           conec.rs.first();
           mod.setVagaEvento(conec.rs.getInt("vagasdisponivel"));
           mod.setId_vaga(conec.rs.getInt("id_vaga"));
           mod.setVagaEspeciais(conec.rs.getInt("especiais"));
           mod.setVagaMoto(conec.rs.getInt("motos"));
           mod.setVagaGerais(conec.rs.getInt("gerais"));
           mod.setSetor(conec.rs.getString("setor"));
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"nao ha vagas no sistema\n");
        }
        return mod;
            
      }
}
