package br.com.alura.dominio;

public class Abrigo {

    public Abrigo(){

    }

    public Abrigo(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pet[] getPets() {
        return pets;
    }
}
