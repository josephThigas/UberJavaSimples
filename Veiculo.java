public class Veiculo extends Motorista {
    protected Motorista motorista;
    protected String tipoVeiculo;
    protected String modelo;
    protected String placa;
    protected String anoFabricacao;
    
    public Veiculo() {
    }

    public Veiculo(Motorista motorista, String tipoVeiculo, String modelo, String placa, String anoFabricacao) {
        this.motorista = motorista;
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    
}
