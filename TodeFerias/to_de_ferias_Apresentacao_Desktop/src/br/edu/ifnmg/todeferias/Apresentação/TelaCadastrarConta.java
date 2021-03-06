/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author fagner
 */
public class TelaCadastrarConta extends javax.swing.JInternalFrame {

    Conta entidade = new Conta();
    ContaRepositorio dao;
    Conta usuario = new Conta();
    TelaPrincipal principal;
    TelaMenu menu;
    public TelaCadastrarConta(TelaPrincipal principal) {
        initComponents();
         dao = GerenciadorReferencias.getConta();
        this.usuario = principal.usuario;
        this.principal=principal;
        
    }
    public TelaCadastrarConta(TelaMenu menu) {
        initComponents();
         dao = GerenciadorReferencias.getConta();
         this.usuario = menu.usuario;
        this.menu=menu;
    }
    
    TelaListarContas listagemContas;
    public TelaCadastrarConta(Conta usuario,TelaListarContas listagemContas) {
        initComponents();
         dao = GerenciadorReferencias.getConta();
         this.usuario = listagemContas.usuario;
        this.listagemContas=listagemContas;
        if(usuario.getId()==1){
            txtNome.setEnabled(false);
            txtEmail.setEnabled(false);
            txtSenha.setEnabled(false);
            btnSalvar.setEnabled(false);
            
        }
    }
      
    public TelaCadastrarConta(Conta usuario) {
        initComponents();
         dao = GerenciadorReferencias.getConta();
        this.usuario = usuario;
        if(usuario.getId()==1){
            txtNome.setEnabled(false);
            txtEmail.setEnabled(false);
            txtSenha.setEnabled(false);
            btnSalvar.setEnabled(false);
            
        }
    }
    public TelaCadastrarConta() {
        initComponents();
         dao = GerenciadorReferencias.getConta();
        this.usuario = usuario;
        this.principal=principal;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();

        jLabel1.setText("Nome");

        jLabel2.setText("Email");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel3.setText("Senha");

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/todeferias/imagens/1465692891_floppy.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/todeferias/imagens/iconDelete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Tela de Cadastro de Usuários");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/todeferias/imagens/iconClose.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         try {
              if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
                preencheObjeto();
                
                if(dao.Salvar(entidade)){
                    JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                    this.dispose();
                   if(usuario.getId() != 1){
                    principal.Aparece(true);
                   }
                  
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");
            
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
            }
        } catch (ErroValidacao ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){

            if(dao.Apagar(entidade)){
                JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                if(usuario.getId()!=1){
                    menu.ocultaBotaoPerfil();
                    TelaPrincipal tela = new TelaPrincipal();
                    tela.setVisible(true);
                    this.dispose();
                    menu.dispose();
                }
                else
                   this.dispose();
                    listagemContas.dispose();
                
                
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");

        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        if(usuario.getId() != 1)
        principal.Aparece(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){ // usar para chamar o enter
             try {
              if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
                preencheObjeto();
                
                if(dao.Salvar(entidade)){
                    JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");
            
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
            }
        } catch (ErroValidacao ex) {
            System.out.println(ex);
        }    
        
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if ((txtEmail.getText().contains("@")) && 
(txtEmail.getText().contains(".")) && 
(!txtEmail.getText().contains(" "))) {

String usuario = new String(txtEmail.getText().substring(0, 
txtEmail.getText().lastIndexOf('@')));

            String dominio = new String(txtEmail.getText().substring(txtEmail.getText().lastIndexOf
('@') + 1, txtEmail.getText().length()));

            if ((usuario.length() >=1) && (!usuario.contains("@")) && 
(dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".") >= 
1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {

            lblEmail.setText("");

            } else {

                lblEmail.setText("E-mail Inválido");

                txtEmail.requestFocus();

            }

        } else {

            lblEmail.setText("E-mail Inválido");

            txtEmail.requestFocus();

        }
    }//GEN-LAST:event_txtEmailFocusLost
 public Conta getEntidade() {
        return entidade;
    }

    public void setEntidade(Conta entidade) {
        this.entidade = entidade;
        preencheCampos();
    }

    private void preencheCampos(){
        //lblCodigo.setText(  Integer.toString( entidade.getId() ) );
        txtNome.setText( entidade.getNome() );
        txtEmail.setText( entidade.getEmail());
        txtSenha.setText( entidade.getSenha());
        
        
    }
    private void preencheObjeto() throws ErroValidacao {
        entidade.setNome( txtNome.getText());
        entidade.setEmail( txtEmail.getText() );
        entidade.setSenha(txtSenha.getText());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
