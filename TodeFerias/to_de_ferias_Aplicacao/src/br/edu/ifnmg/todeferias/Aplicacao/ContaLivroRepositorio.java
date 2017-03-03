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
public interface ContaLivroRepositorio extends Repositorio<ContaLivro>{
    public ContaLivro Abrir(int id);    
}
