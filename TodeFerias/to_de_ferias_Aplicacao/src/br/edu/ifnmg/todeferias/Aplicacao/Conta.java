/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author fagner
 */
public class Conta implements Entidade {

    private int id;
    private String email;
    private String senha;
    private String nome;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
   
   
    private LinkedList<Anime> animes;
    private LinkedList<Filme> filmes;
    private LinkedList<Serie> series;
    private LinkedList<Livro> livros;
    private LinkedList<Novela> novelas;
    private LinkedList<Documentario> documentarios;
    

    public Conta() {

        this.id = 0;
        this.status = 1;
        this.filmes = new LinkedList<>();
        this.novelas = new LinkedList<>();
        this.animes = new LinkedList<>();
        this.series = new LinkedList<>();
        this.livros = new LinkedList<>();
        this.documentarios = new LinkedList<>();
    }

    public Conta(int id, String email,String senha, String nome,int status) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.status=status;
        this.filmes = new LinkedList<>();
        this.novelas = new LinkedList<>();
        this.animes = new LinkedList<>();
        this.series = new LinkedList<>();
        this.livros = new LinkedList<>();
        this.documentarios = new LinkedList<>();
    }
   
    public void addAnime(Anime anime){
        animes.add(anime);
    }
    public void addFilmes(Filme filme){
        filmes.add(filme);
    }
    public void addSeries(Serie serie){
        series.add(serie);
    }
    public void addLivros(Livro livro){
        livros.add(livro);
    }
    public void addNovelas(Novela novela){
        novelas.add(novela);
    }
    public void addDocumentarios(Documentario documentario){
        documentarios.add(documentario);
    }
        
    public void removeAnimes(Anime anime){
        animes.remove(anime);
    }
    public void removeNovela(Novela novela){
        animes.remove(novela);
    }
    
    public void removeDocumentarios(Documentario documentario){
        animes.remove(documentario);
    }
    public void removeFilme(Filme filme){
        animes.remove(filme);
    }
    public void removeLivros(Livro livro){
        animes.remove(livro);
    }

    public LinkedList<Anime> getAnimes() {
        return animes;
    }

    public void setAnimes(LinkedList<Anime> animes) {
        this.animes = animes;
    }

    public LinkedList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(LinkedList<Filme> filmes) {
        this.filmes = filmes;
    }

    public LinkedList<Serie> getSeries() {
        return series;
    }

    public void setSeries(LinkedList<Serie> series) {
        this.series = series;
    }

    public LinkedList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(LinkedList<Livro> livros) {
        this.livros = livros;
    }

    public LinkedList<Novela> getNovelas() {
        return novelas;
    }

    public void setNovelas(LinkedList<Novela> novelas) {
        this.novelas = novelas;
    }

    public LinkedList<Documentario> getDocumentarios() {
        return documentarios;
    }

    public void setDocumentarios(LinkedList<Documentario> documentarios) {
        this.documentarios = documentarios;
    }
    
    
    public void addFilme(Filme filme){
        this.filmes.add(filme);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.email);
        //hash = 73 * hash + this.tipoConta;
        hash = 73 * hash + Objects.hashCode(this.senha);
        hash = 73 * hash + Objects.hashCode(this.nome);
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
        final Conta other = (Conta) obj;
        if (this.id != other.id) {
            return false;
        }
        //if (this.tipoConta != other.tipoConta) {
        //    return false;
        //}
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", email=" + email + ", senha=" + senha + ", nome=" + nome + ", animes=" + animes + ", filmes=" + filmes + ", series=" + series + ", livros=" + livros + ", novelas=" + novelas + ", documentarios=" + documentarios + ", status=" + status + '}';
    }

    

    @Override
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tipoConta
     */
    //public int getTipoConta() {
    //    return tipoConta;
    //}

    /**
     * @param tipoConta the tipoConta to set
     */
    /*public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }*/

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     * @throws br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao
     */
    public void setSenha(String senha) throws ErroValidacao {
        if (senha.length() < 8) {
            throw new ErroValidacao("O atributo senha deve ter no mínimo 8 caracteres!");
        }
        this.senha = senha;
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
        if (nome.length() > 25) {
            throw new ErroValidacao("O atributo nome deve ter no máximo 25 caracteres!");
        }
        this.nome = nome;

    }

}
