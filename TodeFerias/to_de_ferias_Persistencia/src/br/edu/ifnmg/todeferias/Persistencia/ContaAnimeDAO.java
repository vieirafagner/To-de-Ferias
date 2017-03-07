/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Anime;
import br.edu.ifnmg.todeferias.Aplicacao.ContaAnime;
import br.edu.ifnmg.todeferias.Aplicacao.ContaAnimeRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class ContaAnimeDAO extends DAOGenerico<ContaAnime> implements ContaAnimeRepositorio {
    
    public ContaAnimeDAO() {
        setConsultaAbrir("select id,idConta,idAnime,classificacao,comentario FROM conta_anime ");
        setConsultaInserir("INSERT INTO conta_anime(idConta,idAnime,classificacao,comentario) VALUES(?,?,?,?)");
        setConsultaBusca("select id,idConta,idAnime,classificacao,comentario FROM conta_anime ");
        setConsultaAlterar("UPDATE conta_anime SET idConta = ?, idAnime = ?,classificacao = ?,comentario = ? WHERE id = ? ");
        
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, ContaAnime obj) {
      
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getConta().getId());
            sql.setInt(2, obj.getAnime().getId());//supondo q vou setar o 1º
            // teste
            //obj.getConta().getFilmes().get(0).setClassificacao(obj);
            sql.setInt(3, obj.getClassificacao());
            sql.setString(4, obj.getComentario());
            if(obj.getId() > 0) sql.setInt(5,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaAnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           
            
        
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public ContaAnime Abrir(int id){
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,idConta,idAnime,classificacao,comentario FROM conta_anime "
                    + "where id = ?");
            
            // Passo os parâmentros para a consulta sql
            sql.setInt(1, id);
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
            
            // Verifica se algum registro foi retornado na consulta
            if(resultado.next()){
                
                return preencheObjeto(resultado);
            }            
        }  catch(SQLException ex){
            System.out.println(ex);
        }
        
        return null;
    
    }
    @Override
    protected void preencheFiltros(ContaAnime filtro) {
        if(filtro == null) return;
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getConta().getId()>0) adicionarFiltro("idConta", " = ");
        
        
        
        
        //setConsultaBusca("select id,idConta,idFilme,classificacao FROM conta_filme");
    
    }

    /**
     *
     * @param sql
     * @param filtro
     */
    @Override
    protected void preencheParametros(PreparedStatement sql, ContaAnime filtro) {
        try {
            int cont = 1;
            if(filtro == null) return;
            if(filtro.getId() > 0){ 
                sql.setInt(cont, filtro.getId()); 
                cont++; 
            }
            
            if(filtro.getConta().getId() > 0){ 
                sql.setInt(cont, filtro.getConta().getId()); 
                cont++; 
            }
            
            
            
            
            
            //if(filtro.getConta().getId() >0 ){ sql.setInt(cont, filtro.getConta().getId()); cont++; }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ContaAnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected ContaAnime preencheObjeto(ResultSet resultado) {
        
        // Posso os dados do resultado para o objeto
                ContaAnime tmp = new ContaAnime();
                AnimeDAO daoAnime = new AnimeDAO();
                Anime anime = new Anime();
               
        try {
            tmp.setId(resultado.getInt(1));
        
            
            //select id,idConta,idFilme,classificacao
            tmp.setClassificacao(resultado.getInt(4));
            tmp.getAnime().setId(resultado.getInt(3));
            tmp.setComentario(resultado.getString(5));
            tmp.setAnime(daoAnime.Abrir(tmp.getAnime().getId()));
            
            
                
            
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaAnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
        
        
    }
}
