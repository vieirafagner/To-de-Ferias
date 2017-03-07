/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.ContaSerie;
import br.edu.ifnmg.todeferias.Aplicacao.ContaSerieRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Serie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class ContaSerieDAO extends DAOGenerico<ContaSerie> implements ContaSerieRepositorio{
    
        public ContaSerieDAO() {
        setConsultaAbrir("select id,idConta,idSerie,classificacao,comentario FROM conta_serie ");
        setConsultaInserir("INSERT INTO conta_serie(idConta,idSerie,classificacao,comentario) VALUES(?,?,?,?)");
        setConsultaBusca("select id,idConta,idSerie,classificacao,comentario FROM conta_serie ");
        setConsultaAlterar("UPDATE conta_serie SET idConta = ?, idSerie = ?,classificacao = ?,comentario = ? WHERE id = ? ");
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, ContaSerie obj) {
      
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getConta().getId());
            sql.setInt(2, obj.getSerie().getId());//supondo q vou setar o 1º
            // teste
            //obj.getConta().getFilmes().get(0).setClassificacao(obj);
            sql.setInt(3, obj.getClassificacao());
            sql.setString(4, obj.getComentario());
            
            if(obj.getId() > 0) sql.setInt(5,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaSerieDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           
            
        
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public ContaSerie Abrir(int id){
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,idConta,idSerie,classificacao,comentario FROM conta_serie "
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
    protected void preencheFiltros(ContaSerie filtro) {
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
    protected void preencheParametros(PreparedStatement sql, ContaSerie filtro) {
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
            Logger.getLogger(ContaSerieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected ContaSerie preencheObjeto(ResultSet resultado) {
        
        // Posso os dados do resultado para o objeto
                ContaSerie tmp = new ContaSerie();
               SerieDAO daoSerie = new SerieDAO();
                Serie serie = new Serie();
               
        try {
            tmp.setId(resultado.getInt(1));
        
            
            //select id,idConta,idFilme,classificacao
            tmp.setClassificacao(resultado.getInt(4));
            tmp.getSerie().setId(resultado.getInt(3));
            tmp.setComentario(resultado.getString(5));
            tmp.setSerie(daoSerie.Abrir(tmp.getSerie().getId()));
                
            
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaSerieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
        
        
    }
    
}
