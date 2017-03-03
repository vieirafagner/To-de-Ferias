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
public class ContaAnime implements Entidade {
    
    private int id;
    private Conta conta;
    private int classificacao;
    private Anime anime;

    public ContaAnime(int id, Conta conta, int classificacao, Anime anime) {
        this.id = id;
        this.conta = conta;
        this.classificacao = classificacao;
        this.anime = anime;
    }
    
    public ContaAnime(){
        this.anime = new Anime();
    }
    
    public ContaAnime(Conta conta){
        this.conta=conta;
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

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }
    
}
