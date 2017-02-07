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
public class Conta implements Entidade {
    
    private int id;
    private String email;
    private int tipoConta;
    private String senha;
    private String nome;

    /**
     * @return the id
     */
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
    public int getTipoConta() {
        return tipoConta;
    }

    /**
     * @param tipoConta the tipoConta to set
     */
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

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
        if(senha.length()< 8)
            throw new ErroValidacao("O atributo senha deve ter no mínimo 8 caracteres!");
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
        if(nome.length() > 250)
            throw new ErroValidacao("O atributo nome deve ter no máximo 250 caracteres!");
        this.nome = nome;
     
    }

   
}
