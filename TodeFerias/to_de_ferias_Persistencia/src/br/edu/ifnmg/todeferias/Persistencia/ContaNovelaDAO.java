/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.ContaNovela;
import br.edu.ifnmg.todeferias.Aplicacao.ContaNovelaRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Novela;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class ContaNovelaDAO extends DAOGenerico<ContaNovela> implements ContaNovelaRepositorio {
    
    public ContaNovelaDAO() {
        setConsultaAbrir("select id,idConta,idNovela,classificacao FROM conta_novela ");
        setConsultaInserir("INSERT INTO conta_novela(idConta,idNovela,classificacao) VALUES(?,?,?)");
        setConsultaBusca("select id,idConta,idNovela,classificacao FROM conta_novela ");
        setConsultaAlterar("UPDATE conta_novela SET idConta = ?, idNovela = ?,classificacao = ? WHERE id = ? ");

    
        
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, ContaNovela obj) {
      
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getConta().getId());
            sql.setInt(2, obj.getNovela().getId());
            //sql.setInt(2, obj.getConta().getNovelas().get(0).getId());//supondo q vou setar o 1º
            // teste
            //obj.getConta().getFilmes().get(0).setClassificacao(obj);
            sql.setInt(3, obj.getConta().getNovelas().get(0).getClassificacao());
            
            if(obj.getId() > 0) sql.setInt(4,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaNovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }   
    }
    
    public ContaNovela Abrir(int id){
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,idConta,idNovela,classificacao FROM conta_novela"
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
    protected void preencheFiltros(ContaNovela filtro) {
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
    protected void preencheParametros(PreparedStatement sql, ContaNovela filtro) {
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
            Logger.getLogger(ContaNovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected ContaNovela preencheObjeto(ResultSet resultado) {
        
        // Posso os dados do resultado para o objeto
                ContaNovela tmp = new ContaNovela();
                NovelaDAO daoNovela = new NovelaDAO();
                Novela novela = new Novela();
                
               
        try {
            tmp.setId(resultado.getInt(1));
        
            
            //select id,idConta,idFilme,classificacao
            tmp.setClassificacao(resultado.getInt(4));
            tmp.getNovela().setId(resultado.getInt(3));
            tmp.setNovela(daoNovela.Abrir(tmp.getNovela().getId()));
                
            
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaNovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
        
        
    }
}
