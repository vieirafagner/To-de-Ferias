/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Livro;
import br.edu.ifnmg.todeferias.Aplicacao.LivroRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class LivroDAO  extends DAOGenerico<Livro> implements LivroRepositorio {
        
    public LivroDAO() {
        setConsultaAbrir("select id,titulo,resumo,autor,qtd_pag from Livro where id = ? and status = 1");
        setConsultaApagar("UPDATE Livro set status = 0 WHERE id = ? ");
        setConsultaInserir("INSERT INTO Livro(titulo,resumo,autor,qtd_pag,status) VALUES(?,?,?,?,?)");
        setConsultaAlterar("UPDATE Livro SET titulo = ?, resumo = ?, autor = ?,"
                        + "qtd_pag = ? WHERE id = ?");
        setConsultaBusca("select id,titulo,resumo,autor,qtd_pag from Livro where status = 1 ");
        setConsultaUltimoId("select max(id) from Livro where titulo = ? and resumo = ? and autor = ? and qtd_pag = ? and status = ?");
    }
    
    @Override
    protected Livro preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Livro tmp = new Livro();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setTitulo(resultado.getString(2));
                //tmp.setClassificacao(resultado.getInt(3));
                tmp.setResumo(resultado.getString(3));
                tmp.setAutor(resultado.getString(4));
                tmp.setQtd_pag(resultado.getInt(5));
                
         } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
    
    protected void preencheConsulta(PreparedStatement sql, Livro obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getTitulo());
            //sql.setInt(2, obj.getClassificacao());
            sql.setString(2, obj.getResumo());
            sql.setString(3, obj.getAutor());
            sql.setInt(4, obj.getQtd_pag());
            sql.setInt(5, 1);
            
            if(obj.getId() > 0) sql.setInt(5,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param nome
     * @return
     */
    @Override
    public Livro Abrir(String titulo) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,titulo,resumo,autor,qtd_pag "
                    + "from Livro where titulo = ?");
            
            // Passo os parâmentros para a consulta sql
            sql.setString(1,titulo );
            
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
    protected void preencheFiltros(Livro filtro) {
        if(filtro == null) return;
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getTitulo()!= null) adicionarFiltro("titulo", " like ");
        
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Livro filtro) {
        try {
            int cont = 1;
            if(filtro == null) return;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getTitulo()!= null ){ sql.setString(cont, filtro.getTitulo()+ "%"); cont++; }
             //if(filtro.getClassificacao() > 0){ sql.setInt(cont, filtro.getClassificacao()); cont++; }
            if(filtro.getResumo()!= null ){ sql.setString(cont, filtro.getResumo()); cont++; }
            if(filtro.getAutor()!= null ){ sql.setString(cont, filtro.getAutor()); cont++; }
            if(filtro.getQtd_pag()> 0  ){ sql.setInt(cont, filtro.getQtd_pag()); cont++; }
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    
    
}

