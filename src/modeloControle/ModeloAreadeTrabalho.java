
package modeloControle;
public class ModeloAreadeTrabalho {
    
    private int id_Aluno;
    private String matricula_Aluno;
    private String nome_Aluno;
    private String tipo;
    private String Placa_Aluno;
    private String Pesquisa;
    private String veiculo;
    private String data;
    private String horario_entrada;
    private String horaio_saida;
    private String setor;
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
   

    public String getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the horario_entrada
     */
    public String getHorario_entrada() {
        return horario_entrada;
    }

    /**
     * @param horario_entrada the horario_entrada to set
     */
    public void setHorario_entrada(String horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    /**
     * @return the horaio_saida
     */
    public String getHoraio_saida() {
        return horaio_saida;
    }

    /**
     * @param horaio_saida the horaio_saida to set
     */
    public void setHoraio_saida(String horaio_saida) {
        this.horaio_saida = horaio_saida;
    }

    /**
     * @return the Pesquisa
     */
    public String getPesquisa() {
        return Pesquisa;
    }

    /**
     * @param Pesquisa the Pesquisa to set
     */
    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }
   
    

    public int getId_Aluno() {
        return id_Aluno;
    }

    public void setId_Aluno(int id_Aluno) {
        this.id_Aluno = id_Aluno;
    }

    public String getMatricula_Aluno() {
        return matricula_Aluno;
    }

    public void setMatricula_Aluno(String matricula_Aluno) {
        this.matricula_Aluno = matricula_Aluno;
    }

    public String getNome_Aluno() {
        return nome_Aluno;
    }

    public void setNome_Aluno(String nome_Aluno) {
        this.nome_Aluno = nome_Aluno;
    }

 
    public String getPlaca_Aluno() {
        return Placa_Aluno;
    }

    public void setPlaca(String Placa_Aluno) {
        this.Placa_Aluno = Placa_Aluno;
    }

    public Object getEntrada_Saida(int vaga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
