/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Anime;
import br.edu.ifnmg.todeferias.Aplicacao.AnimeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class AnimeDAO extends DAOGenerico<Anime> implements AnimeRepositorio {

    
    public AnimeDAO() {
        setConsultaAbrir("select id,duracao_ep,sinopse,nome,qtd_temp from Anime where id = ? and status = 1");
        setConsultaApagar("UPDATE Anime set status = 0  WHERE id = ? ");
        setConsultaInserir("INSERT INTO Anime(duracao_ep,sinopse,nome,qtd_temp,status) VALUES(?,?,?,?,?)");
        setConsultaAlterar("UPDATE Anime SET duracao_ep = ?, sinopse = ?, nome = ?, "
                        + "qtd_temp = ?, "
                        + "WHERE id = ?");
        setConsultaBusca("select id,duracao_ep,sinopse,nome,qtd_temp from Anime where status = 1 ");
        setConsultaUltimoId("select max(id) from Anime where duracao_ep = ? and sinopse = ? and nome = ? and qtd_temp = ? and status = ?");
    }
    
    @Override
    protected Anime preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Anime tmp = new Anime();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setDuracao_ep(resultado.getInt(2));
                tmp.setSinopse(resultado.getString(3));
                tmp.setNome(resultado.getString(4));
                tmp.setQtd_temp(resultado.getInt(5));
                //tmp.setClassificacao(resultado.getInt(6));
                
         } catch (SQLException ex) {
            Logger.getLogger(AnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, Anime obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getDuracao_ep());
            sql.setString(2, obj.getSinopse());
            sql.setString(3, obj.getNome());
            sql.setInt(4, obj.getQtd_temp());
            sql.setInt(5, 1);
            if(obj.getId() > 0) sql.setInt(5,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(AnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param nome
     * @return
     */
    @Override
    
    public Anime Abrir(String nome) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,duracao_ep,sinopse,nome,qtd_temp "
                    + "from Anime where nome = ?");
            
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
    protected void preencheFiltros(Anime filtro) {
        if(filtro == null) return;
        if(filtro.getId() > 0) adicionarFiltro("id", "=");  
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Anime filtro) {
        try {
            int cont = 1;
            if(filtro == null) return;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDuracao_ep() > 0 ){ sql.setInt(cont, filtro.getDuracao_ep()); cont++; }
            if(filtro.getSinopse() != null ){ sql.setString(cont, filtro.getSinopse()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()+ "%"); cont++; }
            if(filtro.getQtd_temp() > 0 ){ sql.setInt(cont, filtro.getQtd_temp()); cont++; }
            //if(filtro.getClassificacao() > 0 ){ sql.setInt(cont, filtro.getClassificacao()); cont++; }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(AnimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}

