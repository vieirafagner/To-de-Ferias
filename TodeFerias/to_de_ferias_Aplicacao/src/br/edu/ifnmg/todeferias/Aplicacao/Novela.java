/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class Novela implements Entidade {
    private int id;
    private int qtdCap;
    private int classificacao;
    private String diretor;
    private String comentario;
    private String nome;
    
    public Novela(){
        
    }

    public Novela(int id, int qtdCap, int classificacao, String diretor, String nome) {
        this.id = id;
        this.qtdCap = qtdCap;
        this.classificacao = classificacao;
        this.diretor = diretor;
        this.nome = nome;
    }

   

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the qtdCap
     */
    public int getQtdCap() {
        return qtdCap;
    }

    
    public void setQtdCap(int qtdCap) {
        this.qtdCap = qtdCap;
    }

    /**
     * @return the classificacao
     */
    public int getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) throws ErroValidacao {
        if (nome.length() > 250) {
            throw new ErroValidacao("O atributo nome deve ter no máximo 250 caracteres!");
        }
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + this.qtdCap;
       // hash = 17 * hash + this.classificacao;
        hash = 17 * hash + Objects.hashCode(this.diretor);
        hash = 17 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Novela other = (Novela) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.qtdCap != other.qtdCap) {
            return false;
        }
        /*if (this.classificacao != other.classificacao) {
            return false;
        }*/
        if (!Objects.equals(this.diretor, other.diretor)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Novela{" + "nome=" + nome + '}';
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
