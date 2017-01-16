package br.edu.ifnmg.todeferias.Apresentacao;

import br.edu.ifnmg.todeferias.Aplicacao.usuario;
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
        
        usuario teste = new usuario(0, "cleiton", "keu@gay.com", new Date());
        
       // usuario teste = new usuario();
        //usuarioDao dao = new usuarioDao();
        //dao.Salvar(teste);
         
    }
    
}
