/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.usuario;
import br.edu.ifnmg.todeferias.Aplicacao.usuarioRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleiton rodrigues
 */
public class usuarioDao extends DaoGenerico<usuario> implements usuarioRepositorio {

    
    public usuarioDao() {
        setConsultaAbrir("select id,nome,email,dataNasc from usuario where id = ?");
        setConsultaApagar("DELETE FROM usuario WHERE id = ? ");
        setConsultaInserir("INSERT INTO usuario(nome,email,dataNasc) VALUES(?,?,?)");
        setConsultaAlterar("UPDATE usuario SET nome = ?, "
                        + "email = ?, dataNasc = ? "
                        + "WHERE id = ?");
        setConsultaBusca("select id,nome,email,dataNasc from usuario ");
        setConsultaUltimoId("select max(id) from usuario where nome = ? and email = ? and dataNasc = ?");
    }
    
    @Override
    protected usuario preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                usuario tmp = new usuario();
        try {
            tmp.setId(resultado.getInt(1));
        
                    try {
                        tmp.setNome(resultado.getString(2));
                    } catch (ErroValidacao ex) {
                        Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                tmp.setEmail(resultado.getString(3));
                tmp.setDataNasc(resultado.getDate(4));
         } catch (SQLException ex) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, usuario obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getEmail());
            sql.setDate(3, new java.sql.Date(obj.getDataNasc().getTime()));
            
            if(obj.getId() > 0) sql.setInt(4,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public usuario Abrir(String cpf) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,nome,email,dataNascimento "
                    + "from usuario where email = ?");
            
            // Passo os parâmentros para a consulta sql
            sql.setString(1, cpf);
            
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
    protected void preencheFiltros(usuario filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getEmail() != null) adicionarFiltro("email", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, usuario filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()); cont++; }
            if(filtro.getEmail() != null){ sql.setString(cont, filtro.getEmail()); cont++; }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*@Override
    protected void preencheConsulta(PreparedStatement sql, usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheFiltros(usuario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, usuario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
    
}
