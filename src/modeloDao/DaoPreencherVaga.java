
package modeloDao;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloControle.ModeloEvento;
import modeloControle.ModeloVagas;

public class DaoPreencherVaga {
    ConexaoBD conec = new ConexaoBD();
    ModeloVagas modVaga = new ModeloVagas();
    ModeloEvento modEvento = new ModeloEvento();
    Date data = new Date(System.currentTimeMillis());
    SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");
    
  public ModeloVagas buscaVagas(String setor){
      conec.conexao(); 
      
      
conec.executasql("select \"v.gerais\", \"e.qtd_vagas\" , \"v.gerais\"- \"e.qtd_vagas\" as vagasdisponivel, \"v.setor\", \"e.setor\" , \"e.data_inicial\", \"e.data_final\" FROM public.vagas v inner join eventos e on \"v.setor\" = \"e.setor\" where \"e.data_inicial\" >= '11/04/2020' and  \"e.data_final\"  <= '12/04/2020'");
        
      conec.executasql("select \"gerais\",\"setor\" from vagas where \"setor\" like '%"+setor+"%' order by  \"id_vaga\" desc ");
      conec.executasql("select \"id_evento\",\"qtd_vagas\", \"setor\" from event-os where  \"data_inicial\" like '%"+formatarDate+"%'"); 
       try {
           
           
           if(conec.rs.getString("setor") ==  conec.rs.getString("setor")){
               
           }
           conec.rs.first();
           modVaga.setId_vaga(conec.rs.getInt("id_vaga"));          
           modVaga.setVagaGerais(conec.rs.getInt("gerais"));
           modVaga.setSetor(conec.rs.getString("setor"));
           
           conec.rs.first();
           modEvento.setId_evento(conec.rs.getInt("id_evento"));
           modEvento.setQtdVagas(conec.rs.getInt("qtd_vagas"));
           modEvento.setSetor(conec.rs.getString("setor"));
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"nao ha vagas no sistema\n");
        }
        return modVaga;
     }  
}
