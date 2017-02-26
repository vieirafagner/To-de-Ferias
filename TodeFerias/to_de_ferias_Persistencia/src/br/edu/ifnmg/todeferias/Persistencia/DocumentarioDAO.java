/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Documentario;
import br.edu.ifnmg.todeferias.Aplicacao.DocumentarioRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */

public class DocumentarioDAO  extends DAOGenerico<Documentario> implements DocumentarioRepositorio {
        public DocumentarioDAO() {
        setConsultaAbrir("select id,sinopse,classificacao,duracao,data,autor,nome from Documentario where id = ?");
        setConsultaApagar("DELETE FROM Documentario WHERE id = ? ");
        setConsultaInserir("INSERT INTO Documentario(sinopse,classificacao,duracao,data,autor,nome) VALUES(?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE Documentario SET sinopse = ?,classificacao = ?, duracao = ?, data = ?, autor = ?,"
                        + "nome = ?"
                        + "WHERE id = ?");
        setConsultaBusca("select id,sinopse,classificacao,duracao,data,autor,nome from Documentario ");
        setConsultaUltimoId("select max(id) from Documentario where sinopse = ? and classificacao = ? and duracao = ? and data = ? and autor = ? and nome = ? ");
    }
   
    @Override
    protected Documentario preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Documentario tmp = new Documentario();
        try {
                tmp.setId(resultado.getInt(1));
        
                tmp.setSinopse(resultado.getString(2));
                tmp.setClassificacao(resultado.getInt(3));
                tmp.setDuracao(resultado.getInt(4));
                tmp.setData(resultado.getString(5));
                tmp.setAutor(resultado.getString(6));
                tmp.setNome(resultado.getString(7));
                
                
         } catch (SQLException ex) {
            Logger.getLogger(DocumentarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
  
    @Override
    protected void preencheConsulta(PreparedStatement sql, Documentario obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getSinopse());
            sql.setInt(2, obj.getClassificacao());
            sql.setInt(3, obj.getDuracao());
            sql.setString(4,obj.getData());
            sql.setString(5, obj.getAutor());
             sql.setString(6, obj.getNome());
            
            
            if(obj.getId() > 0) sql.setInt(7,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(DocumentarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param nome
     * @return
     */

    @Override
    public Documentario Abrir(String nome) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,sinopse,classificacao,duracao,data,autor,nome "
                    + "from Documentario where nome = ?");
            
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
      // id; qdtCap;classificacao;comentario;diretor;nome;     
    @Override
    protected void preencheFiltros(Documentario filtro) {
        if(filtro ==null) return;
        if(filtro.getId() > 0) adicionarFiltro("id", "=");        
        if(filtro.getNome()!= null) adicionarFiltro("nome", " like ");
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Documentario filtro) {
        try {
            int cont = 1;
            if(filtro == null) return;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getSinopse() != null){ sql.setString(cont, filtro.getSinopse()); cont++; }
            if(filtro.getClassificacao()> 0 ){ sql.setInt(cont, filtro.getClassificacao()); cont++; }
            if(filtro.getDuracao() > 0){ sql.setInt(cont, filtro.getDuracao()); cont++; }
            if(filtro.getAutor()!= null ){ sql.setString(cont, filtro.getAutor()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()+ "%"); cont++; }
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(DocumentarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

