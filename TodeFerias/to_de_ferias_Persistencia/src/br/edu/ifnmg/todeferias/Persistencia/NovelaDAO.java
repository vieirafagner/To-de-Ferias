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
        setConsultaAbrir("select id,qtdCap,diretor,nome from Novela where id = ? and status = 1");
        setConsultaApagar("UPDATE Novela set status = 0 WHERE id = ? ");
        setConsultaInserir("INSERT INTO Novela(qtdCap,diretor,nome,status) VALUES(?,?,?,?)");
        setConsultaAlterar("UPDATE Novela SET qtdCap = ?, diretor = ?, "
                        + "nome = ?"
                        + "WHERE id = ?");
        setConsultaBusca("select id,qtdCap,diretor,nome from Novela where status = 1 ");
        setConsultaUltimoId("select max(id) from Novela where qtdCap = ? and diretor = ? and nome = ? and status = ? ");
    }
   
    @Override
    protected Novela preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Novela tmp = new Novela();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setQtdCap(resultado.getInt(2));
               // tmp.setClassificacao(resultado.getInt(3));
                tmp.setDiretor(resultado.getString(3));
                tmp.setNome(resultado.getString(4));
                
                
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
            sql.setInt(1, obj.getQtdCap());
            //sql.setInt(2, obj.getClassificacao());
            sql.setString(2, obj.getDiretor());
            sql.setString(3, obj.getNome());
            sql.setInt(4, 1);
            
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
            PreparedStatement sql = conn.prepareStatement("select id,qtdCap,diretor,nome "
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
        if(filtro == null) return;
        if(filtro.getId() > 0) adicionarFiltro("id", "=");        
        if(filtro.getDiretor()!= null) adicionarFiltro("diretor", " like ");
        if(filtro.getNome()!= null) adicionarFiltro("nome", " like ");
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Novela filtro) {
        try {
            int cont = 1;
            if(filtro == null) return;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getQtdCap() > 0){ sql.setInt(cont, filtro.getQtdCap()); cont++; }
            //if(filtro.getClassificacao()> 0 ){ sql.setInt(cont, filtro.getClassificacao()); cont++; }
         
            if(filtro.getDiretor()!= null ){ sql.setString(cont, filtro.getDiretor()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()+ "%"); cont++; }
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(NovelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
