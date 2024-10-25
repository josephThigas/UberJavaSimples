public class Motorista {
    protected String nome;
    protected String numCarteira;
    protected String genero;
    protected Boolean status;
    protected String tipoCarteira;


    public Motorista() {
    }
    
    public Motorista(String nome, String numCarteira, String genero, Boolean status, String tipoCarteira) {
        this.nome = nome;
        this.numCarteira = numCarteira;
        this.genero = genero;
        this.status = status;
        this.tipoCarteira = tipoCarteira;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumCarteira() {
        return numCarteira;
    }
    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getTipoCarteira() {
        return tipoCarteira;
    }
    public void setTipoCarteira(String tipoCarteira) {
        this.tipoCarteira = tipoCarteira;
    }
        
}
