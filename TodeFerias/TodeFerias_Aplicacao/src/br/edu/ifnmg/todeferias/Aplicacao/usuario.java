/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Aplicacao;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fagner
 */
public class usuario implements Entidade{
    private int id;
    private String nome;
    private String email;
    private Date dataNasc;

    public usuario(int id, String nome, String email, Date dataNasc) {
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.dataNasc=dataNasc;
    }

    public usuario() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @throws br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao
     */
    public void setNome(String nome) throws ErroValidacao {
        if(nome.length() > 250)
            throw new ErroValidacao("O atributo nome deve ter no máximo 250 caracteres!");
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     * @return 
     */
    public static boolean validar(String email)
    {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
    
    public void setEmail(String email){
        if(validar(email)){
        this.email=email;
        }
    }

    /**
     * @return the dataNasc
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
}


