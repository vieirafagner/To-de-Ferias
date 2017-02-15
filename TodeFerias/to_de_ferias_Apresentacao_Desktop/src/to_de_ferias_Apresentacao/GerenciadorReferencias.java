/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to_de_ferias_Apresentacao;

import br.edu.ifnmg.todeferias.Aplicacao.AdministradorRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.AnimeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.ContaRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.DocumentarioRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.FilmeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.LivroRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.NovelaRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.SerieRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.AdministradorDAO;
import br.edu.ifnmg.todeferias.Persistencia.AnimeDAO;
import br.edu.ifnmg.todeferias.Persistencia.ContaDAO;
import br.edu.ifnmg.todeferias.Persistencia.DocumentarioDAO;
import br.edu.ifnmg.todeferias.Persistencia.FilmeDAO;
import br.edu.ifnmg.todeferias.Persistencia.LivroDAO;
import br.edu.ifnmg.todeferias.Persistencia.NovelaDAO;
import br.edu.ifnmg.todeferias.Persistencia.SerieDAO;

/**
 *
 * @author fagner
 */
public class GerenciadorReferencias {
 
    private static ContaRepositorio daoConta;

    public static ContaRepositorio getConta() {
        if(daoConta == null)
            daoConta = new ContaDAO();
        return daoConta;
    }
    
    private static AdministradorRepositorio daoAdministrador;

    public static AdministradorRepositorio getAministrador() {
        if(daoAdministrador == null)
            daoAdministrador = new AdministradorDAO();
        return daoAdministrador;
    }
    
    private static AnimeRepositorio daoAnime;

    public static AnimeRepositorio getAnime() {
        if(daoAnime == null)
            daoAnime = new AnimeDAO();
        return daoAnime;
    }
    
    private static DocumentarioRepositorio daoDocumentario;

    public static DocumentarioRepositorio getDocumentario() {
        if(daoDocumentario == null)
            daoDocumentario = new DocumentarioDAO();
        return daoDocumentario;
    }
    
    private static FilmeRepositorio daoFilme;

    public static FilmeRepositorio getFilme() {
        if(daoFilme == null)
            daoFilme = new FilmeDAO();
        return daoFilme;
    }
    
    private static LivroRepositorio daoLivro;

    public static LivroRepositorio getLivro() {
        if(daoLivro == null)
            daoLivro = new LivroDAO();
        return daoLivro;
    }
    
    private static NovelaRepositorio daoNovela;

    public static NovelaRepositorio getNovela() {
        if(daoNovela == null)
            daoNovela = new NovelaDAO();
        return daoNovela;
    }
    
    private static SerieRepositorio daoSerie;

    public static SerieRepositorio getSerie() {
        if(daoSerie  == null)
            daoSerie = new SerieDAO();
        return daoSerie;
    }
}
