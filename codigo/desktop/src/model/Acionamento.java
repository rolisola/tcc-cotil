package model;

public class Acionamento {

    private int cpf;
    private int idDrone;
    private int idAtendente;
    private String dataHora;
    private String local;
    private String horaPartida;
    private String horaChegada;
    private String horaRetorno;
    private String tipoOcorrencia;
    private String estadoPaciente;

    public Acionamento(int cpf, int idDrone, int idAtendente, String dataHora, String local, String horaPartida, String horaChegada, String horaRetorno, String tipoOcorrencia, String estadoPaciente) {
        this.cpf = cpf;
        this.idDrone = idDrone;
        this.idAtendente = idAtendente;
        this.dataHora = dataHora;
        this.local = local;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.horaRetorno = horaRetorno;
        this.tipoOcorrencia = tipoOcorrencia;
        this.estadoPaciente = estadoPaciente;

    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdDrone() {
        return idDrone;
    }

    public void setIdDrone(int idDrone) {
        this.idDrone = idDrone;
    }

    public int getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(String horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

    public String getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(String tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

}
