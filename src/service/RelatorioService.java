
package service;

import java.io.File;
import java.util.HashMap;
import modeloConection.ConexaoBD;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

public class RelatorioService {
    private static final long serialVersionUID = 1L;
    
    private static final String FOLDER_RELATORIOS = "\\relatorios";
    private String caminhoArquivoRelatorio = "C:\\Users\\Uso Pessoal\\Documents\\NetBeansProjects\\project-iesp\\build\\classes\\relatorios";
    private JRExporter exporter = null;
    private File arquivoGerado = null;
    
    ConexaoBD conec = new ConexaoBD();
    
     public String gerarRelatorio(HashMap parametroRelatorio, String nomeRelatorioJasper, String tipoExportar)throws Exception{
        conec.conexao();
        
        String caminhoRelatorio = caminhoArquivoRelatorio;
        
        //caminho completo até o arquivo
        String caminhoArquivosJasper = "C:\\Users\\Uso Pessoal\\Documents\\NetBeansProjects\\project-iesp\\build\\classes\\relatorios\\"+ nomeRelatorioJasper + ".jasper";
        
        //faz o carregamento do relatorio
        JasperReport relatorioJasper = (JasperReport)JRLoader.loadObjectFromFile(caminhoArquivosJasper);
        
        //carrega o arquivo
        
        JasperPrint impressoraJasper = JasperFillManager.fillReport(relatorioJasper, parametroRelatorio);
        
        if(tipoExportar.equalsIgnoreCase("pdf")){
            exporter = new JRPdfExporter();
        }
        else if (tipoExportar.equalsIgnoreCase("xls")){
            exporter = new JRPdfExporter();
        
        }
        //caminho relatorio exportado
        caminhoArquivoRelatorio = caminhoRelatorio + File.separator + nomeRelatorioJasper + "." + tipoExportar;
        
        // criar novo arquivo Exportado
        arquivoGerado = new File(caminhoArquivoRelatorio);
        
        //prepara a impressão
        exporter.setParameter(JRExporterParameter.JASPER_PRINT,impressoraJasper);
        
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE,arquivoGerado);
        
        //executa a exportação
        exporter.exportReport();
      
        return caminhoArquivoRelatorio;
           
        
    }
}
