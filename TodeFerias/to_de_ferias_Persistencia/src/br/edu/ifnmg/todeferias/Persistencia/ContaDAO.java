/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaRepositorio;
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
public class ContaDAO extends DAOGenerico<Conta> implements ContaRepositorio {
    
    public ContaDAO() {
        setConsultaAbrir("select id,email,senha,nome,status from Conta where id = ?");
        setConsultaApagar("DELETE FROM Conta WHERE id = ? ");
        setConsultaInserir("INSERT INTO Conta(email,senha,nome,status) VALUES(?,?,?,?)");
        setConsultaAlterar("UPDATE Conta SET email = ?, "
                        + "senha = ?, nome=?"
                        + "WHERE id = ?");
        setConsultaBusca("select id,email,senha,nome,status from Conta ");
        setConsultaUltimoId("select max(id) from Conta where email = ? and senha = ? and nome = ? and status = ?");
    }
    
    /**
     *
     * @param email
     * @param senha
     * @return
     */
     public Conta checkLogin(String email, String senha) throws SQLException, ErroValidacao{
         PreparedStatement stat = null;
         ResultSet rs = null;
         Conta usuario = null;
         try{
             stat=conn.prepareStatement("SELECT * FROM Conta WHERE email = ? and senha = ?");
             stat.setString(1, email);
             stat.setString(2, senha);
              rs = stat.executeQuery();
              
              //rs.i
              if(rs.next()){
                  usuario = new Conta();
                  usuario.setId(rs.getInt(1));
                  usuario.setEmail(rs.getString(2));
                  usuario.setSenha(rs.getString(3));
                  usuario.setNome(rs.getString(4));
                  usuario.setStatus(rs.getInt(5));
              }
         }catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
         return usuario;
        
         
     }
    
    @Override
    protected Conta preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Conta tmp = new Conta();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setEmail(resultado.getString(2));
                tmp.setSenha(resultado.getString(3));
                tmp.setNome(resultado.getString(4));
                tmp.setStatus(resultado.getInt(5));
                
         } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ErroValidacao ex) {     
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, Conta obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getEmail());
            sql.setString(2, obj.getSenha());
            sql.setString(3, obj.getNome());
            sql.setInt(4, obj.getStatus());
            
            
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
    public Conta Abrir(String nome) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,email,senha,nome,status "
                    + "from Conta where nome = ?");
            
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
    protected void preencheFiltros(Conta filtro) {
        if(filtro==null) return;
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", "like");
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Conta filtro) {
        try {
            int cont = 1;
            if(filtro == null) return;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getEmail() != null ){ sql.setString(cont, filtro.getEmail()); cont++; }
            if(filtro.getSenha() != null ){ sql.setString(cont, filtro.getSenha()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()+ "%"); cont++; }
            if(filtro.getStatus()> 0 ){ sql.setInt(cont, filtro.getStatus()); cont++; }
           
        
        } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
