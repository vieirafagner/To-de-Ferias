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
public class ContaFilme implements Entidade{

    private int id;
    private Conta conta;
    private int classificacao;
    private Filme filme;

    public ContaFilme() {
        this.filme = new Filme();
    }

    public ContaFilme(int id, Conta conta, int classificacao, Filme filme) {
        this.id = id;
        this.conta = conta;
        this.classificacao = classificacao;
        this.filme = filme;
    }
    
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public ContaFilme(Conta conta) {
        this.conta = conta;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
    
      
}
