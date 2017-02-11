/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentacao;

import br.edu.ifnmg.todeferias.Aplicacao.Anime;
import br.edu.ifnmg.todeferias.Aplicacao.AnimeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Filme;
import br.edu.ifnmg.todeferias.Aplicacao.FilmeRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.AnimeDAO;
import br.edu.ifnmg.todeferias.Persistencia.ContaDAO;
import br.edu.ifnmg.todeferias.Persistencia.FilmeDAO;
import java.sql.SQLException;

/**
 *
 * @author fagner
 */
public class todeferiasApresentacao {
    public static void main(String [] args) throws ClassNotFoundException, SQLException{
       SetConta();
       SetFilme();
       SetAnime();
    }
    public static void SetConta(){
         Conta c = new Conta(0,"fagnervieira15@gmail.com",1,"123","fagner");
        ContaRepositorio bd_conta = new ContaDAO();
        bd_conta.Salvar(c);
    }
    
    public static void SetFilme(){
        Filme f = new Filme(0,"teste",230,"piratas do caribe",5,"aventura","aventuras de jack");
        FilmeRepositorio bd_filme = new FilmeDAO();
        bd_filme.Salvar(f);
    }
    public static void SetAnime(){
        Anime a= new Anime(0,20,"aventuras de goku","dragonball z",5,5);
        AnimeRepositorio bd_anime = new AnimeDAO();
        bd_anime.Salvar(a);
    }
}
