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
public class Anime implements Entidade {
    
    private int id;
    private int duracao_ep;
    private String sinopse;
    private String nome;
    private int qtd_temp;
    private int classificacao;
    
    public Anime(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracao_ep() {
        return duracao_ep;
    }

    public void setDuracao_ep(int duracao_ep) {
        this.duracao_ep = duracao_ep;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_temp() {
        return qtd_temp;
    }

    public void setQtd_temp(int qtd_temp) {
        this.qtd_temp = qtd_temp;
    }

   
    
    public Anime(int id, int duracao_ep, String sinopse, String nome, int qtd_temp, int classificacao) {
        this.id = id;
        this.duracao_ep = duracao_ep;
        this.sinopse = sinopse;
        this.nome = nome;
        this.qtd_temp = qtd_temp;
        //this.classificacao = classificacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        hash = 41 * hash + this.duracao_ep;
        hash = 41 * hash + Objects.hashCode(this.sinopse);
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + this.qtd_temp;
        //hash = 41 * hash + this.classificacao;
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
        final Anime other = (Anime) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.duracao_ep != other.duracao_ep) {
            return false;
        }
        if (this.qtd_temp != other.qtd_temp) {
            return false;
        }
       
        if (!Objects.equals(this.sinopse, other.sinopse)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
