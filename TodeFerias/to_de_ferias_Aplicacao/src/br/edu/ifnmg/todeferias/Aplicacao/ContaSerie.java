/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

/**
 *
 * @author fagner
 */
public class ContaSerie implements Entidade{
    
    private int id;
    private Conta conta;
    private int classificacao;
    private String comentario;
    private Serie serie;

    public ContaSerie(int id, Conta conta, int classificacao, Serie serie,String comentario) {
        this.id = id;
        this.conta = conta;
        this.classificacao = classificacao;
        this.serie = serie;
        this.comentario=comentario;
    }
    
    public ContaSerie(){
        this.serie = new Serie();
    }
    
    public ContaSerie(Conta conta){
        this.conta = conta;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
