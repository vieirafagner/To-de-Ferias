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
public class ContaDocumentario implements Entidade {
    
    private int id;
    private Conta conta;
    private int classificacao;
    private String comentario;
    private Documentario documentario;

    public ContaDocumentario(int id, Conta conta, int classificacao, Documentario documentario,String comentario) {
        this.id = id;
        this.conta = conta;
        this.classificacao = classificacao;
        this.documentario = documentario;
        this.comentario=comentario;
    }
    
    public ContaDocumentario(){
        this.documentario = new Documentario();
    }
    
    public ContaDocumentario(Conta conta) {
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

    public Documentario getDocumentario() {
        return documentario;
    }

    public void setDocumentario(Documentario documentario) {
        this.documentario = documentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
