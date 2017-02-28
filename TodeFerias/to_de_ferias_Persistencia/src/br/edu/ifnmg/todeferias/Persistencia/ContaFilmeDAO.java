/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;


import br.edu.ifnmg.todeferias.Aplicacao.ContaFilme;
import br.edu.ifnmg.todeferias.Aplicacao.ContaFilmeRepositorio;
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
        setConsultaInserir("INSERT INTO conta_filme(idConta,idFilme,classificacao) VALUES(?,?,?)");
    
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, ContaFilme obj) {
      
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getConta().getId());
            sql.setInt(2, obj.getConta().getFilmes().get(0).getId());//supondo q vou setar o 1º
            // teste
            //obj.getConta().getFilmes().get(0).setClassificacao(obj);
            sql.setInt(3, obj.getConta().getFilmes().get(0).getClassificacao());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaFilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           
            
        
    }

    

    @Override
    protected void preencheFiltros(ContaFilme filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, ContaFilme filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected ContaFilme preencheObjeto(ResultSet resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
 }