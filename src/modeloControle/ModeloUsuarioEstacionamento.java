
package modeloControle;

public class ModeloUsuarioEstacionamento {
    
    private Integer IdEstacionamento;
    private String tipoUsuarioEstacionamento;
    private String matricula;
    private String nome;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Integer getIdEstacionamento() {
        return IdEstacionamento;
    }

    public void setIdEstacionamento(Integer IdEstacionamento) {
        this.IdEstacionamento = IdEstacionamento;
    }

    public String getTipoUsuarioEstacionamento() {
        return tipoUsuarioEstacionamento;
    }

    public void setTipoUsuarioEstacionamento(String tipoUsuarioEstacionamento) {
        this.tipoUsuarioEstacionamento = tipoUsuarioEstacionamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
