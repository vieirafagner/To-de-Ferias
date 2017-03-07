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
public class ContaNovela implements Entidade {
    
    private int  id;
    private Conta conta;
    private int classificacao;
    private String comentario;
    private Novela novela;
    
    public ContaNovela(){
        this.novela = new Novela();
    }

    public ContaNovela(int id, Conta conta, int classificacao, Novela novela,String comentario) {
        this.id = id;
        this.conta = conta;
        this.classificacao = classificacao;
        this.novela = novela;
        this.comentario=comentario;
    }
    
    public ContaNovela(Conta conta) {
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

    public Novela getNovela() {
        return novela;
    }

    public void setNovela(Novela novela) {
        this.novela = novela;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}
