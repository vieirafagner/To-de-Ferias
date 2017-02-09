/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.Novela;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.NovelaRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
 
public class NovelaDAO  extends DAOGenerico<Novela> implements NovelaRepositorio {
        public NovelaDAO() {
        setConsultaAbrir("select id,qtdCap,classificacao,comentario,diretor,nome from Novela where id = ?");
        setConsultaApagar("DELETE FROM Novela WHERE id = ? ");
        setConsultaInserir("INSERT INTO Novela(id,qtdCap,classificacao,comentario,diretor,nome) VALUES(?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE Novela SET nome = ?, "
                        + "Diretor = ?"
                        + "WHERE id = ?");
        setConsultaBusca("select id,qdtCap,classificacao,comentario,diretor,nome from Novela ");
        setConsultaUltimoId("select max(id) from Novela where qdtCap = ? and Classificacao = ? and comentario = ? and diretor = ? and nome = ? ");
    }
   
    @Override
    protected Novela preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Novela tmp = new Novela();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setQdtCap(resultado.getInt(2));
                tmp.setClassificacao(resultado.getInt(3));
                tmp.setComentario(resultado.getString(4));
                tmp.setDiretor(resultado.getString(5));
                tmp.setNome(resultado.getString(6));
                
                
         } catch (SQLException ex) {
            Logger.getLogger(NovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ErroValidacao ex) {     
            Logger.getLogger(NovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
  
    @Override
    protected void preencheConsulta(PreparedStatement sql, Novela obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setInt(1, obj.getQdtCap());
            sql.setInt(2, obj.getClassificacao());
            sql.setString(3, obj.getComentario());
            sql.setString(4, obj.getDiretor());
            sql.setString(5, obj.getNome());
            
            if(obj.getId() > 0) sql.setInt(4,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(NovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param nome
     * @return
     */

    @Override
    public Novela Abrir(String nome) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,qtdCap,classificacao,comentario,diretor,nome "
                    + "from Novela where nome = ?");
            
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
    protected void preencheFiltros(Novela filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getQdtCap() > 0) adicionarFiltro("qtdCap", "=");
        if(filtro.getClassificacao()> 0) adicionarFiltro("classificacao", "=");
        if(filtro.getComentario()!= null) adicionarFiltro("comentario", " like ");
        if(filtro.getDiretor()!= null) adicionarFiltro("diretor", " like ");
        if(filtro.getNome()!= null) adicionarFiltro("nome", " like ");
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Novela filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getQdtCap() > 0){ sql.setInt(cont, filtro.getQdtCap()); cont++; }
            if(filtro.getClassificacao()> 0 ){ sql.setInt(cont, filtro.getClassificacao()); cont++; }
            if(filtro.getComentario()!= null ){ sql.setString(cont, filtro.getComentario()); cont++; }
            if(filtro.getDiretor()!= null ){ sql.setString(cont, filtro.getDiretor()); cont++; }
            if(filtro.getNome()!= null ){ sql.setString(cont, filtro.getNome()); cont++; }
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(NovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
