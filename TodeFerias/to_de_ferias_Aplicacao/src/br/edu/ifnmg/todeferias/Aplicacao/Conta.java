/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

import java.util.Objects;

/**
 *
 * @author fagner
 */
public class Conta implements Entidade {

    private int id;
    private String email;
    //private int tipoConta;
    private String senha;
    private String nome;

    public Conta() {

        this.id = 0;
    }

    public Conta(int id, String email,String senha, String nome) {
        this.id = id;
        this.email = email;
       // this.tipoConta = tipoConta;
        this.senha = senha;
        this.nome = nome;
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
        return "Conta{" + "nome=" + nome + '}';
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
