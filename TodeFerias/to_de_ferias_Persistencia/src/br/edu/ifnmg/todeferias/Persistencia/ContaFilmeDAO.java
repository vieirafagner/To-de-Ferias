/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;


import br.edu.ifnmg.todeferias.Aplicacao.ContaFilme;
import br.edu.ifnmg.todeferias.Aplicacao.ContaFilmeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Filme;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author fagner
 */
public class ContaFilmeDAO extends DAOGenerico<ContaFilme> implements ContaFilmeRepositorio{

    public ContaFilmeDAO() {
        setConsultaAbrir("select id,idConta,idFilme,classificacao FROM conta_filme ");
        setConsultaInserir("INSERT INTO conta_filme(idConta,idFilme,classificacao) VALUES(?,?,?)");
        setConsultaBusca("select id,idConta,idFilme,classificacao FROM conta_filme ");
        setConsultaAlterar("UPDATE conta_filme SET idConta = ?, idFilme = ?,classificacao = ? WHERE id = ? ");

        
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, ContaFilme obj) {
      
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getConta().getId());
            //sql.setInt(2, obj.getConta().getFilmes().get(0).getId());//supondo q vou setar o 1º "ta serta"
            sql.setInt(2, obj.getFilme().getId());//supondo q vou setar o 1º
            // teste
            //obj.getConta().getFilmes().get(0).setClassificacao(obj);
            sql.setInt(3, obj.getClassificacao());
            
            if(obj.getId() > 0) sql.setInt(4,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaFilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           
            
        
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public ContaFilme Abrir(int id){
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,idConta,idFilme,classificacao FROM conta_filme "
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
    protected void preencheFiltros(ContaFilme filtro) {
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
    protected void preencheParametros(PreparedStatement sql, ContaFilme filtro) {
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
            Logger.getLogger(ContaFilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected ContaFilme preencheObjeto(ResultSet resultado) {
        
        // Posso os dados do resultado para o objeto
                ContaFilme tmp = new ContaFilme();
                FilmeDAO daoFilme = new FilmeDAO();
                Filme filme = new Filme();
               
        try {
            tmp.setId(resultado.getInt(1));
        
            
            //select id,idConta,idFilme,classificacao
            tmp.setClassificacao(resultado.getInt(4));
            tmp.getFilme().setId(resultado.getInt(3));
            tmp.setFilme(daoFilme.Abrir(tmp.getFilme().getId()));// recebe o filme
                
            
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaFilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
        
        
    }
    
 }