/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

import java.util.Objects;

/**
 *
 * @author fagner
 */
public class Documentario implements Entidade {

    private int id;
    private String sinopse;
    private int classificacao;
    private int duracao;
    private String data;
    private String autor;
    private String nome;

    public Documentario() {
        this.id=0;
    }

    public Documentario(int id, String sinopse, int classificacao, int duracao, String data, String autor, String nome) {
        this.id = id;
        this.sinopse = sinopse;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.data = data;
        this.autor = autor;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.sinopse);
        hash = 11 * hash + this.classificacao;
        hash = 11 * hash + this.duracao;
        hash = 11 * hash + Objects.hashCode(this.data);
        hash = 11 * hash + Objects.hashCode(this.autor);
        hash = 11 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Documentario other = (Documentario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.classificacao != other.classificacao) {
            return false;
        }
        if (this.duracao != other.duracao) {
            return false;
        }
        if (!Objects.equals(this.sinopse, other.sinopse)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Documentario{" + "nome=" + nome + '}';
    }

}
