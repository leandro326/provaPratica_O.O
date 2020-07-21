
package modeloControle;

public class ModeloUsuario {
    private Integer usuId;
    private String usuNome;
    private String usuSenha;
    private String usuPesquisa;
    

    public String getUsuPesquisa() {
        return usuPesquisa;
    }

    public void setUsuPesquisa(String usuPesquisa) {
        this.usuPesquisa = usuPesquisa;
    }

    public String getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
    }
    private String usuTipo;

    public Integer getUsuId() {
        return usuId;
    }

    public void setUsuId(Integer usuId) {
        this.usuId = usuId;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }
    
    
}
