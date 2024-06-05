package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final Set<Dev> devsIncritos = new HashSet<>();
    private final Set<Conteudo> conteudos = new HashSet<>();

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}
