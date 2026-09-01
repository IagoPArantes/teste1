package com.example.teste1.Dto;

public class PessoaDto {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;

    public PessoaDto(String nome, int idade, String dataNascimento, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
