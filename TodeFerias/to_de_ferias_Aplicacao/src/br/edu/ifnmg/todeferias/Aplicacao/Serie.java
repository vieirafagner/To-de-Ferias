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
public class Serie implements Entidade {
    
        private int id;
        private int duracao_ep;
        private String genero;
        private String nome;
        //private int classificacao;
        private String sinopse;
        private int qtd_temp;
            
        public Serie(){
            this.id=0;
        }
        
        
    public Serie(int id, int duracao_ep, String genero, String nome, int classificacao, String sinopse, int qtd_temp) {
        this.id = id;
        this.duracao_ep = duracao_ep;
        this.genero = genero;
        this.nome = nome;
       // this.classificacao = classificacao;
        this.sinopse = sinopse;
        this.qtd_temp = qtd_temp;
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
     * @return the duracao_ep
     */
    public int getDuracao_ep() {
        return duracao_ep;
    }

    /**
     * @param duracao_ep the duracao_ep to set
     */
    public void setDuracao_ep(int duracao_ep) {
        this.duracao_ep = duracao_ep;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @throws br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao
     */
    public void setNome(String nome) throws ErroValidacao {
        if(nome.length() > 250)
            throw new ErroValidacao("O atributo nome deve ter no máximo 250 caracteres!");
        this.nome = nome;
    }

    /**
     * @return the classificacao
     */
    /*public int getClassificacao() {
        return classificacao;
    }*/

    /**
     * @param classificacao the classificacao to set
     */
    /*public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }*/

    /**
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * @return the qtd_temp
     */
    public int getQtd_temp() {
        return qtd_temp;
    }

    /**
     * @param qtd_temp the qtd_temp to set
     */
    public void setQtd_temp(int qtd_temp) {
        this.qtd_temp = qtd_temp;
    }
}
