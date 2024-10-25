public class Viagem {
    protected Veiculo veiculo;
    protected Motorista motorista;
    protected String localPartida;
    protected String localChegada;
    protected String tempoViagem;
    protected String horaPartida;

    public Viagem() {
    }


    public Viagem(Veiculo veiculo, Motorista motorista, String localPartida, String localChegada, String tempoViagem,
            String horaPartida) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.tempoViagem = tempoViagem;
        this.horaPartida = horaPartida;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }


    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


    public Motorista getMotorista() {
        return motorista;
    }


    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }


    public String getLocalPartida() {
        return localPartida;
    }


    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }


    public String getLocalChegada() {
        return localChegada;
    }


    public void setLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }


    public String getTempoViagem() {
        return tempoViagem;
    }


    public void setTempoViagem(String tempoViagem) {
        this.tempoViagem = tempoViagem;
    }


    public String getHoraPartida() {
        return horaPartida;
    }


    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    
}
