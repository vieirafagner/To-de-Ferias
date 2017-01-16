package br.edu.ifnmg.todeferias.Apresentacao;

import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.usuario;
import br.edu.ifnmg.todeferias.Aplicacao.usuarioRepositorio;
import br.edu.ifnmg.todeferias.persistencia.usuarioDao;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fagner
 */
public class Apresentacao {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
       usuario u = new usuario(0,"fagner","fagnervieira15gmailcom",new Date());
        usuarioRepositorio db_usuario= new usuarioDao();
        db_usuario.Salvar(u);
         
    }
    
}
