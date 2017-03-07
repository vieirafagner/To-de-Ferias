/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.ContaDocumentario;
import br.edu.ifnmg.todeferias.Aplicacao.ContaDocumentarioRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Documentario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class ContaDocumentarioDAO extends DAOGenerico<ContaDocumentario> implements ContaDocumentarioRepositorio {
    
     public ContaDocumentarioDAO() {
        setConsultaAbrir("select id,idConta,idDocumentario,classificacao,comentario FROM conta_documentario ");
        setConsultaInserir("INSERT INTO conta_documentario(idConta,idDocumentario,classificacao,comentario) VALUES(?,?,?,?)");
        setConsultaBusca("select id,idConta,idDocumentario,classificacao,comentario FROM conta_documentario ");
        setConsultaAlterar("UPDATE conta_documentario SET idConta = ?, idDocumentario = ?,classificacao = ?,comentario = ? WHERE id = ? ");
        
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, ContaDocumentario obj) {
      
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getConta().getId());
            sql.setInt(2, obj.getDocumentario().getId());
            //sql.setInt(2, obj.getConta().getDocumentarios().get(0).getId());//supondo q vou setar o 1º
            // teste
            //obj.getConta().getFilmes().get(0).setClassificacao(obj);
            sql.setInt(3, obj.getClassificacao());
            sql.setString(4, obj.getComentario());
            if(obj.getId() > 0) sql.setInt(5,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaDocumentarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }   
    }
    
     @Override
    public ContaDocumentario Abrir(int id){
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,idConta,idDocumentario,classificacao,comentario FROM conta_documentario "
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
    protected void preencheFiltros(ContaDocumentario filtro) {
        if(filtro == null) return;
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getConta().getId()>0) adicionarFiltro("idConta", " = ");
    }

    /**
     *
     * @param sql
     * @param filtro
     */
    @Override
    protected void preencheParametros(PreparedStatement sql, ContaDocumentario filtro) {
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
            Logger.getLogger(ContaDocumentarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected ContaDocumentario preencheObjeto(ResultSet resultado) {
        
        // Posso os dados do resultado para o objeto
                ContaDocumentario tmp = new ContaDocumentario();
                DocumentarioDAO daoDocumentario = new DocumentarioDAO();
                Documentario documentario = new Documentario();
               
        try {
            tmp.setId(resultado.getInt(1));
        
            
            //select id,idConta,idFilme,classificacao
            tmp.setClassificacao(resultado.getInt(4));
            tmp.getDocumentario().setId(resultado.getInt(3));
            tmp.setComentario(resultado.getString(5));
            tmp.setDocumentario(daoDocumentario.Abrir(tmp.getDocumentario().getId()));
                
            
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaDocumentarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
        
        
    }
}
