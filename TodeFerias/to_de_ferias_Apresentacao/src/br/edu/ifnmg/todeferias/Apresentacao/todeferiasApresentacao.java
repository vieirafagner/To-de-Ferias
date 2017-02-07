/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentacao;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.ContaDAO;
import java.sql.SQLException;

/**
 *
 * @author fagner
 */
public class todeferiasApresentacao {
    public static void main(String [] args) throws ClassNotFoundException, SQLException{
        Conta c = new Conta(0,"fagnervieira15@gmail.com",1,"123","fagner");
        ContaRepositorio bd_conta = new ContaDAO();
        bd_conta.Salvar(c);
    }
}
