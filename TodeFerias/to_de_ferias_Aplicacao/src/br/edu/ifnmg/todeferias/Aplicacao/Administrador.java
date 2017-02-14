/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class Administrador implements Entidade{

    private int id;
    private String dataNasc;
    private String email;
    private String senha;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws ErroValidacao {
        if (senha.length() < 8) {
            throw new ErroValidacao("O atributo senha deve ter no mínimo 8 caracteres!");
        }
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ErroValidacao {
        if (nome.length() > 250) {
            throw new ErroValidacao("O atributo nome deve ter no máximo 250 caracteres!");
        }
        this.nome = nome;
    }

    public Administrador() {
        this.id = 0;
    }

    public Administrador(int id, String dataNasc, String email, String senha, String nome) {
        this.id = id;
        this.dataNasc = dataNasc;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Administrador{" + "nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.dataNasc);
        hash = 11 * hash + Objects.hashCode(this.email);
        hash = 11 * hash + Objects.hashCode(this.senha);
        hash = 11 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrador other = (Administrador) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.dataNasc, other.dataNasc)) {
            return false;
        }
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

}
