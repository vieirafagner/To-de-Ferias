/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Persistencia;

import br.edu.ifnmg.todeferias.Aplicacao.Administrador;
import br.edu.ifnmg.todeferias.Aplicacao.AdministradorRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aluno
 */
//id;dataNasc;emailsenha;nome;
public class AdministradorDAO extends DAOGenerico<Administrador> implements AdministradorRepositorio {
     public AdministradorDAO() {
        setConsultaAbrir("select id,dataNasc,email,senha,nome from Administrador where id = ?");
        setConsultaApagar("DELETE FROM Administrador WHERE id = ? ");
        setConsultaInserir("INSERT INTO Administrador(dataNasc,email,senha,nome) VALUES(?,?,?,?)");
        setConsultaAlterar("UPDATE Administrador SET nome = ?, "
                        + "senha = ?"
                        + "WHERE id = ?");
        setConsultaBusca("select id,dataNasc,email,senha,nome from Administrador ");
        setConsultaUltimoId("select max(id) from Administrador where dataNasc = ? and email = ? and senha = ? and nome = ?");
    }
     
     
     public boolean checkLogin(String email, String senha) throws SQLException{
         PreparedStatement stat = null;
         ResultSet rs = null;
         boolean check = false;
         try{
             stat=conn.prepareStatement("SELECT * FROM Administrador WHERE email = ? and senha = ?");
             stat.setString(1, email);
             stat.setString(2, senha);
              rs = stat.executeQuery();
              
              if(rs.next()){
                  check=true;
              }
         }catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
         return check;
        
         
     }
    
    @Override
    protected Administrador preencheObjeto(ResultSet resultado) {
        // Posso os dados do resultado para o objeto
                Administrador tmp = new Administrador();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setDataNasc(resultado.getString(3));
                tmp.setEmail(resultado.getString(2));            
                tmp.setSenha(resultado.getString(4));
                tmp.setNome(resultado.getString(5));
                
         } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ErroValidacao ex) {     
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, Administrador obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getDataNasc());
            sql.setString(2, obj.getEmail());
            sql.setString(3, obj.getSenha());
            sql.setString(4, obj.getNome());
            
            if(obj.getId() > 0) sql.setInt(5,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param nome
     * @return
     */
    @Override
    public Administrador Abrir(String nome) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select id,dataNasc,email,senha,nome "
                    + "from Administrador where nome = ?");
            
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
    protected void preencheFiltros(Administrador filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getEmail()!= null) adicionarFiltro("email", " like ");

    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Administrador filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDataNasc()!= null ){ sql.setString(cont, filtro.getDataNasc()); cont++; }
            if(filtro.getEmail() != null ){ sql.setString(cont, filtro.getEmail()); cont++; }
            if(filtro.getSenha() != null ){ sql.setString(cont, filtro.getSenha()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()); cont++; }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
