/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;

/**
 *
 * @author Aluno
 */
public interface NovelaRepositorio extends Repositorio<Novela> {
     public Novela Abrir(String nome);
}
