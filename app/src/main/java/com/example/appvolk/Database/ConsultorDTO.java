package com.example.appvolk.Database;

public class ConsultorDTO {
    private int id, cargoId;
    private String nome, usuario, senha;

    public ConsultorDTO() {

    }

    public ConsultorDTO(String nome, int cargoId, String usuario, String senha) {
        this.nome = nome;
        this.cargoId = cargoId;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargo(int cargoId) {
        this.cargoId = cargoId;
    }
}
