/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author petronio
 */
public class DB {
       
    public static void Iniciar() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver"); 
    }
    
    public static Connection criarConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/DB_To_de_Ferias","root","");
    }
    
}
