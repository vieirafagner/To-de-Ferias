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
import br.edu.ifnmg.todeferias.Aplicacao.Documentario;
import br.edu.ifnmg.todeferias.Aplicacao.DocumentarioRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Filme;
import br.edu.ifnmg.todeferias.Aplicacao.FilmeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Novela;
import br.edu.ifnmg.todeferias.Aplicacao.NovelaRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Administrador;
import br.edu.ifnmg.todeferias.Aplicacao.AdministradorRepositorio       ;
import br.edu.ifnmg.todeferias.Persistencia.AnimeDAO;
import br.edu.ifnmg.todeferias.Persistencia.ContaDAO;
import br.edu.ifnmg.todeferias.Persistencia.DocumentarioDAO;
import br.edu.ifnmg.todeferias.Persistencia.FilmeDAO;
import br.edu.ifnmg.todeferias.Persistencia.NovelaDAO;
import br.edu.ifnmg.todeferias.Persistencia.AdministradorDAO;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author fagner
 */
public class todeferiasApresentacao {
    public static void main(String [] args) throws ClassNotFoundException, SQLException{
       //SetConta();
       //SetFilme();
       //SetAnime();
       //SetNovela();
       //SetDocumentario();
       SetAdministrador();
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
    public static void SetNovela(){
        Novela n = new Novela(0,300,5,"televisa","Maria do Bairro");
        NovelaRepositorio bd_novela = new NovelaDAO();
        bd_novela.Salvar(n);
    }
    public static void SetDocumentario(){
        Documentario d = new Documentario(0,"febre amarela",5,100,"03/09/1995","fagner","caus");
        DocumentarioRepositorio bd_doc = new DocumentarioDAO();
        bd_doc.Salvar(d);
    }
    
    public static void SetAdministrador(){
        Administrador a = new Administrador(0,"04/02/1996","fagnervieira15@gmail.com","3631","fagner");
        AdministradorRepositorio bd_doc = new AdministradorDAO();
        bd_doc.Salvar(a);
    }
   
}
