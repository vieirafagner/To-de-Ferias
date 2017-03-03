/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

/**
 *
 * @author cleiton rodrigues
 */
public class ContaLivro implements Entidade{
    private int id;
    private Conta conta;
    private int classificacao;
    private Livro livro;
    
    public ContaLivro(int id, Conta conta, int classificacao, Livro livro) {
        this.id = id;
        this.conta = conta;
        this.classificacao = classificacao;
        this.livro = livro;
    }
    
    public ContaLivro(){
        this.livro = new Livro();
    }
    
    public ContaLivro(Conta conta){
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
            
}
