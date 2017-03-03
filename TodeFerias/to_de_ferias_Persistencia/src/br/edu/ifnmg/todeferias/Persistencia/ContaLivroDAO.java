/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.ContaLivro;
import br.edu.ifnmg.todeferias.Aplicacao.ContaLivroRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleiton rodrigues
 */
public class ContaLivroDAO extends DAOGenerico<ContaLivro> implements ContaLivroRepositorio{
    public ContaLivroDAO() {
        setConsultaAbrir("select id,idConta,idLivro,classificacao FROM conta_livro ");
        setConsultaInserir("INSERT INTO conta_livro(idConta,idLivro,classificacao) VALUES(?,?,?)");
        setConsultaBusca("select id,idConta,idLivro,classificacao FROM conta_livro ");
        
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, ContaLivro obj) {
      
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getConta().getId());
            sql.setInt(2, obj.getConta().getLivros().get(0).getId());//supondo q vou setar o 1º
            // teste
            //obj.getConta().getFilmes().get(0).setClassificacao(obj);
            sql.setInt(3, obj.getConta().getLivros().get(0).getClassificacao());
            
        } catch (SQLException ex) {
            Logger.getLogger(ContaLivroDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           
            
        
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public ContaLivro Abrir(int id){
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,idConta,idLivro,classificacao FROM conta_livro"
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
    protected void preencheFiltros(ContaLivro filtro) {
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
    protected void preencheParametros(PreparedStatement sql, ContaLivro filtro) {
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
            Logger.getLogger(ContaLivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected ContaLivro preencheObjeto(ResultSet resultado) {
        
        // Posso os dados do resultado para o objeto
                ContaLivro tmp = new ContaLivro();
               
        try {
            tmp.setId(resultado.getInt(1));
        
            
            //select id,idConta,idFilme,classificacao
            tmp.setClassificacao(resultado.getInt(4));
            tmp.getLivro().setId(resultado.getInt(3));
                
            
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaLivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
        
        
    }
}
