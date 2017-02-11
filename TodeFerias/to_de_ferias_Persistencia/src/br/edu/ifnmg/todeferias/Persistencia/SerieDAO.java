/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.Serie;
import br.edu.ifnmg.todeferias.Aplicacao.SerieRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class SerieDAO  extends DAOGenerico<Serie> implements SerieRepositorio {
        
    public SerieDAO() {
        setConsultaAbrir("select id,duracao_ep,genero,nome,classificacao,sinopse,qtd_temp from Serie where id = ?");
        setConsultaApagar("DELETE FROM Serie WHERE id = ? ");
        setConsultaInserir("INSERT INTO Serie(duracao_ep,genero,nome,classificacao,sinopse,qtd_temp) VALUES(?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE Serie SET nome = ?, "
                        + "sinopse = ?, genero = ? "
                        + "WHERE id = ?");
        setConsultaBusca("select id,duracao_ep,genero,nome,classificacao,sinopse,qtd_temp, from Serie ");
        setConsultaUltimoId("select max(id) from Serie where duracao_ep = ? and genero = ? and nome = ? and classificacao = ? and sinopse = ? and qtd_temp");
    }
    
    @Override
    protected Serie preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Serie tmp = new Serie();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setDuracao_ep(resultado.getInt(2));
                tmp.setGenero(resultado.getString(3));
                tmp.setNome(resultado.getString(4));
                tmp.setClassificacao(resultado.getInt(5));
                tmp.setSinopse(resultado.getString(6));
                tmp.setQtd_temp(resultado.getInt(7));
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ErroValidacao ex) {     
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
    
    protected void preencheConsulta(PreparedStatement sql, Serie obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getDuracao_ep());
            sql.setString(2, obj.getGenero());
            sql.setString(3, obj.getNome());
            sql.setInt(4, obj.getClassificacao());
            sql.setString(5, obj.getSinopse());
            sql.setInt(6, obj.getQtd_temp());
            
            if(obj.getId() > 0) sql.setInt(4,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param nome
     * @return
     */
    @Override
    public Serie Abrir(String nome) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,duracao_ep,genero,nome,classificacao,sinopse,qtd_temp "
                    + "from Serie where nome = ?");
            
            // Passo os parâmentros para a consulta sql
            sql.setString(1, nome);
            
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
    protected void preencheFiltros(Serie filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getDuracao_ep() > 0) adicionarFiltro("duracao_ep", "=");
        if(filtro.getGenero() != null) adicionarFiltro("genero", " like ");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getClassificacao() > 0) adicionarFiltro("classificacao", "=");
        if(filtro.getSinopse()!= null) adicionarFiltro("sinopse", " like ");
        if(filtro.getQtd_temp() > 0) adicionarFiltro("qtd_temp", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Serie filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDuracao_ep() > 0 ){ sql.setInt(cont, filtro.getDuracao_ep()); cont++; }
            if(filtro.getGenero()!= null ){ sql.setString(cont, filtro.getGenero()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()); cont++; }
            if(filtro.getClassificacao() > 0){ sql.setInt(cont, filtro.getClassificacao()); cont++; }
            if(filtro.getSinopse()!= null ){ sql.setString(cont, filtro.getSinopse()); cont++; }
            if(filtro.getQtd_temp() > 0 ){ sql.setInt(cont, filtro.getQtd_temp()); cont++; }
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(SerieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}

