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
public class Livro implements Entidade {

    private int id;
    private String titulo;
    private int classificacao;
    private String resumo;
    private String autor;
    private int qtd_pag;
    private String comentario;

    public Livro(){
        this.id=0;
    }
    public Livro(int id, String titulo,int classificacao,String resumo,String autor, int qtd_pag){
        this.id=id;
        this.titulo=titulo;
        this.classificacao=classificacao;
        this.resumo=resumo;
        this.autor=autor;
        this.qtd_pag=qtd_pag;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the qtd_pag
     */
    public int getQtd_pag() {
        return qtd_pag;
    }

    public void setQtd_pag(int qtd_pag) {
        this.qtd_pag = qtd_pag;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
