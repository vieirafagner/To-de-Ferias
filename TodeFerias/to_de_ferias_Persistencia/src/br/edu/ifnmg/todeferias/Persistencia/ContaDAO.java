/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Entidade;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import java.sql.Connection;
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
        setConsultaAbrir("select id,email,senha,nome from Conta where id = ?");
        setConsultaApagar("DELETE FROM Conta WHERE id = ? ");
        setConsultaInserir("INSERT INTO Conta(email,senha,nome) VALUES(?,?,?)");
        setConsultaAlterar("UPDATE Conta SET nome = ?, "
                        + "senha = ?"
                        + "WHERE id = ?");
        setConsultaBusca("select id,email,senha,nome from Conta ");
        setConsultaUltimoId("select max(id) from Conta where email = ? and senha = ? and nome = ?");
    }
    
    /**
     *
     * @param email
     * @param senha
     * @return
     */
     public boolean checkLogin(String email, String senha) throws SQLException{
         PreparedStatement stat = null;
         ResultSet rs = null;
         boolean check = false;
         try{
             stat=conn.prepareStatement("SELECT * FROM Conta WHERE email = ? and senha = ?");
             stat.setString(1, email);
             stat.setString(2, senha);
              rs = stat.executeQuery();
              
              if(rs.next()){
                  check=true;
              }
         }catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
         return check;
        
         
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
            PreparedStatement sql = conn.prepareStatement("select id,email,senha,nome "
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
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getEmail() != null) adicionarFiltro("email", " like ");
        //if(filtro.getTipoConta() > 0) adicionarFiltro("tipoConta", "=");
        if(filtro.getSenha() != null) adicionarFiltro("senha", " like ");
        if(filtro.getNome() != null) adicionarFiltro("nome", "like");
    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Conta filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getEmail() != null ){ sql.setString(cont, filtro.getEmail()); cont++; }
           // if(filtro.getTipoConta() > 0 ){ sql.setInt(cont, filtro.getTipoConta()); cont++; }
            if(filtro.getSenha() != null ){ sql.setString(cont, filtro.getSenha()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()); cont++; }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
