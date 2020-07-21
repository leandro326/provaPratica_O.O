
package modeloDao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloControle.ModeloEvento;

public class DaoEventos {
    
    ConexaoBD conec = new ConexaoBD();
    ModeloEvento mod = new ModeloEvento();
    Date data = new Date(System.currentTimeMillis());
    SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
    //salvando evento
    public void Salvar(ModeloEvento mod){
        conec.conexao();
        
        try {
            PreparedStatement pst = conec.conn.prepareStatement("INSERT INTO public.eventos(\"nome_evento\", \"data_inicial\", \"data_final\", \"hora_inicio\", \"hora_final\", \"qtd_vagas\", \"setor\") values(?,?,?,?,?,?,?)");
                                                                                                                                                                                                                                                                                                                                           
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getDataInicial());
            pst.setString(3,mod.getDataFinal());
            pst.setString(4,mod.getHoraInicial());
            pst.setString(5,mod.getHoraFinal());
            pst.setInt(6,mod.getQtdVagas());
            pst.setString(7,mod.getSetor());
         
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Evento inserido com sucesso");
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Cadastrar evento!\n" + ex);
        }
       
        conec.desconecta();
    }
    //Alterando dados do evento
    public void Alterar (ModeloEvento mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.eventos SET \"nome_evento\"=?, \"data_inicial\"=?, \"data_final\"=?, \"hora_inicio\"=?, \"hora_final\"=?, \"qtd_vagas\"=?, \"setor\"=? where \"id_evento\"=? ");             
            
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getDataInicial());
            pst.setString(3,mod.getDataFinal());
            pst.setString(4,mod.getHoraInicial());
            pst.setString(5,mod.getHoraFinal());
            pst.setInt(6,mod.getQtdVagas());
            pst.setString(7, mod.getSetor());
            pst.setInt(8,mod.getId_evento());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterado com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
         
        conec.desconecta();
    }
    
   //Excluindo evento
   public void Excluir(ModeloEvento mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("DELETE FROM public.eventos WHERE \"id_evento\" = ?");
            pst.setInt(1, mod.getId_evento());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar dados \n erro :" + ex);
        }    
        conec.desconecta();        
    }
    //busca evento
    public ModeloEvento buscaEvento(ModeloEvento mod){
      conec.conexao(); 
        
      conec.executasql("select \"id_evento\", \"nome_evento\", \"data_inicial\", \"data_final\", \"hora_inicio\", \"hora_final\", \"qtd_vagas\", \"setor\" from eventos where  \"nome_evento\" like '%"+mod.getPesquisa()+"%'");
     
       try {                                                                                                                                                                   
           conec.rs.first();
           
           mod.setId_evento(conec.rs.getInt("id_evento"));        
           mod.setNome(conec.rs.getString("nome_evento"));
           mod.setDataInicial(conec.rs.getString("data_inicial"));
           mod.setDataFinal(conec.rs.getString("data_final")); 
           mod.setHoraInicio(conec.rs.getString("hora_inicio"));
           mod.setHoraFinal(conec.rs.getString("hora_final"));
           mod.setQtdVagas(conec.rs.getInt("qtd_vagas"));
           mod.setSetor(conec.rs.getString("setor"));
           
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"não há eventos cadastrado no sistema \n" );
        }
      conec.desconecta();  
        return mod;
    }

    public ModeloEvento buscaEventodata(ModeloEvento mod){
       conec.conexao();                                                                                                                          
            conec.executasql("select \"id_evento\", \"nome_evento\", \"data_inicial\", \"data_final\", \"hora_inicio\", \"hora_final\", \"qtd_vagas\", \"setor\" from eventos where \"data_inicial\" >= '"+ mod.getDataInicial()+"' and \"data_final\" <= '"+ mod.getDataFinal()+"'");
         try {
            
            conec.rs.first();
            mod.setId_evento(conec.rs.getInt("id_evento"));        
            mod.setNome(conec.rs.getString("nome_evento"));
            mod.setDataInicial(conec.rs.getString("data_inicial"));
            mod.setDataFinal(conec.rs.getString("data_final")); 
            mod.setHoraInicio(conec.rs.getString("hora_inicio"));
            mod.setHoraFinal(conec.rs.getString("hora_final"));
            mod.setQtdVagas(conec.rs.getInt("qtd_vagas"));
            mod.setSetor(conec.rs.getString("setor"));
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data nao existe no sistema \n" + ex);
        }
      
      conec.desconecta();  
        return mod;
    }

     public ModeloEvento buscaEventoSetor(String setor){
      conec.conexao(); 
        
      conec.executasql("select \"id_evento\", \"nome_evento\", \"data_inicial\", \"data_final\", \"hora_inicio\", \"hora_final\", \"qtd_vagas\", \"setor\" from eventos where  \"setor\" like '%"+setor+"%' and \"data_inicial\" >= '"+formatarDate.format(data)+"'");
     
       try {                                                                                                                                                                   
          if ( conec.rs.first() )
          {
            mod.setId_evento(conec.rs.getInt("id_evento"));        
            mod.setNome(conec.rs.getString("nome_evento"));
            mod.setDataInicial(conec.rs.getString("data_inicial"));
            mod.setDataFinal(conec.rs.getString("data_final")); 
            mod.setHoraInicio(conec.rs.getString("hora_inicio"));
            mod.setHoraFinal(conec.rs.getString("hora_final"));
            mod.setQtdVagas(conec.rs.getInt("qtd_vagas"));
            mod.setSetor(conec.rs.getString("setor"));
          }
          else
          {
            mod.setId_evento(0);        
            mod.setNome("");
            mod.setDataInicial("");
            mod.setDataFinal(""); 
            mod.setHoraInicio("");
            mod.setHoraFinal("");
            mod.setQtdVagas(0);
            mod.setSetor("");
              
          }
           
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"não há eventos cadastrado no sistema \n" );
        }
      conec.desconecta();  
        return mod;
    }
      public void QTDvagaEvento (ModeloEvento mod){
        conec.conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("UPDATE public.eventos SET  \"qtd_vagas\"=? where \"setor\"=?");             
            pst.setInt(1,mod.getQtdVagas());
            pst.setString(2,mod.getSetor());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterado entrada e saida com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados \n erro :" + ex);
        }
         
        conec.desconecta();
    }
     
     
    
}
