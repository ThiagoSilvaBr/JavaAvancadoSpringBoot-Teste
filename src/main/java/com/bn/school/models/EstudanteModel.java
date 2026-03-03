package com.bn.school.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // mapeando como entidade da tabela do banco do projeto
public class EstudanteModel {

    @Id // identifica como id
    @GeneratedValue (strategy = GenerationType.IDENTITY)// gera o id automaticamente
    // atalho = GeneratedValue(), Ctrl+Space: strategy, Ctrl+Space: identity

    private Long id;
    private String nome;
    private String email;
    private Integer idade;

    public EstudanteModel(){//SpringBoot precisa de contrutor vazio
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmai(String emai) {
        this.email = emai;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmai() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

}