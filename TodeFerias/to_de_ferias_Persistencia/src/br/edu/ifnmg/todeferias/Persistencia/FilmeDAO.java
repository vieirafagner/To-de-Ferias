/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Filme;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.FilmeRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fagner
 */
public class FilmeDAO  extends DAOGenerico<Filme> implements FilmeRepositorio {
        
    public FilmeDAO() {
        setConsultaAbrir("select id,diretor,duracao,nome,classificacao,genero,sinopse from Filme where id = ?");
        setConsultaApagar("DELETE FROM Filme WHERE id = ? ");
        setConsultaInserir("INSERT INTO Filme(id,diretor,duracao,nome,classificacao,genero,sinopse) VALUES(?,?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE Filme SET nome = ?, "
                        + "sinopse = ?, genero = ? "
                        + "WHERE id = ?");
        setConsultaBusca("select id,diretor,duracao,nome,classificacao,genero,sinopse, from Filme ");
        setConsultaUltimoId("select max(id) from Filme where diretor = ? and duracao = ? and nome = ? and classificacao = ? and genero = ? and sinopse = ?");
    }
    
    @Override
    protected Filme preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Filme tmp = new Filme();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setDiretor(resultado.getString(2));
                tmp.setDuracao(resultado.getInt(3));
                tmp.setNome(resultado.getString(4));
                tmp.setClassificacao(resultado.getInt(5));
                tmp.setGenero(resultado.getString(6));
                tmp.setSinopse(resultado.getString(7));
                
         } catch (SQLException ex) {
            Logger.getLogger(FilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ErroValidacao ex) {     
            Logger.getLogger(FilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, Filme obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getDiretor());
            sql.setInt(2, obj.getDuracao());
            sql.setString(3, obj.getNome());
            sql.setInt(4, obj.getClassificacao());
            sql.setString(5, obj.getGenero());
            sql.setString(6, obj.getSinopse());
            
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
    public Filme Abrir(String nome) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,diretor,duracao,nome,classificacao,genero,sinopse "
                    + "from Filme where nome = ?");
            
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
    protected void preencheFiltros(Filme filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getDiretor()!= null) adicionarFiltro("diretor", " like ");
        if(filtro.getDuracao()> 0) adicionarFiltro("duracao", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getClassificacao() > 0) adicionarFiltro("classificacao", "=");
        if(filtro.getGenero() != null) adicionarFiltro("genero", " like ");
        if(filtro.getSinopse()!= null) adicionarFiltro("sinopse", " like ");
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Filme filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDiretor() != null ){ sql.setString(cont, filtro.getDiretor()); cont++; }
            if(filtro.getDuracao()> 0 ){ sql.setInt(cont, filtro.getDuracao()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()); cont++; }
            if(filtro.getClassificacao() > 0){ sql.setInt(cont, filtro.getClassificacao()); cont++; }
            if(filtro.getGenero()!= null ){ sql.setString(cont, filtro.getGenero()); cont++; }
            if(filtro.getSinopse()!= null ){ sql.setString(cont, filtro.getSinopse()); cont++; }
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(FilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
