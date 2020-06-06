package model;

public class Atendente {

    private int id;
    private String nome;
    private String senha;
    private String cpf;
    private String coren;

    public Atendente() {
    }

    public Atendente(String nome, String senha, String cpf, String coren) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.coren = coren;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
