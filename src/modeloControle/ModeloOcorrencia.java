
package modeloControle;

public class ModeloOcorrencia {
   private Integer iD;
   private String placa1;
   private String placa2;
   private String nome1;
   private String nome2;
   private String matricula1;
   private String matricula2;
   private String tipo;
   private String ocorrencia;
   private String pesquisa;
   private String data;
   private String setor;
   private Object ocorrenciacompleta;

    public Object getOcorrenciacompleta() {
        return ocorrenciacompleta;
    }

    public void setOcorrenciacompleta(Object ocorrenciacompleta) {
        this.ocorrenciacompleta = ocorrenciacompleta;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
   

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getPlaca1() {
        return placa1;
    }

    public void setPlaca1(String placa1) {
        this.placa1 = placa1;
    }

    public String getPlaca2() {
        return placa2;
    }

    public void setPlaca2(String placa2) {
        this.placa2 = placa2;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getMatricula1() {
        return matricula1;
    }

    public void setMatricula1(String matricula1) {
        this.matricula1 = matricula1;
    }

    public String getMatricula2() {
        return matricula2;
    }

    public void setMatricula2(String matricula2) {
        this.matricula2 = matricula2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
   
   
}
