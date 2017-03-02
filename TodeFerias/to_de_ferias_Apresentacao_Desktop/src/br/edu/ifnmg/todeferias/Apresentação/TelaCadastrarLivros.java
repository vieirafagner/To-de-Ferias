/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.Livro;
import br.edu.ifnmg.todeferias.Aplicacao.LivroRepositorio;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fagner
 */
public class TelaCadastrarLivros extends javax.swing.JInternalFrame {

    Livro entidade = new Livro();
    LivroRepositorio dao;
    TelaListarLivros listagem;
    Conta usuario;
   
    public TelaCadastrarLivros(Conta usuario) {
        initComponents();
        dao = GerenciadorReferencias.getLivro();
        this.usuario=usuario;
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
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQtd_pag = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtResumo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Tela de Cadastro de Livros");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Título");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Autor");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Número de Páginas");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Resumo");

        txtResumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResumoKeyPressed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtd_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQtd_pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnExcluir))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
            try {
                preencheObjeto();
            } catch (ErroValidacao ex) {
                Logger.getLogger(TelaCadastrarLivros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(dao.Salvar(entidade)){
                JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                this.dispose();
            } 
            else
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){

            if(dao.Apagar(entidade)){
                JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                entidade = new Livro(0,"",0,"", "",0);
                preencheCampos();
                TelaListarLivros tela = new TelaListarLivros(usuario);
                this.getParent().add(tela);
                tela.setVisible(true);
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");

        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtResumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResumoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
            try {
                preencheObjeto();
            } catch (ErroValidacao ex) {
                Logger.getLogger(TelaCadastrarLivros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(dao.Salvar(entidade)){
                JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                this.dispose();
            } 
            else
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }
        }
    }//GEN-LAST:event_txtResumoKeyPressed
  private void preencheObjeto() throws ErroValidacao {
        
        entidade.setTitulo(txtTitulo.getText()  );
        entidade.setAutor(txtAutor.getText());
        entidade.setQtd_pag(Integer.parseInt(txtQtd_pag.getText()));
        //entidade.setClassificacao(bxClassificacao.getSelectedIndex());
        entidade.setResumo(txtResumo.getText());
    }
  private void preencheCampos(){
        txtTitulo.setText(entidade.getTitulo());
        txtAutor.setText( entidade.getAutor());
        txtQtd_pag.setText(Integer.toString(entidade.getQtd_pag()));
       // bxClassificacao.setSelectedItem( entidade.getClassificacao());
        txtResumo.setText(entidade.getResumo());    
    }
  public Livro getEntidade() {
        return entidade;
    }
    public void setEntidade(Livro entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaListarLivros getListagem() {
        return listagem;
    }

    public void setListagem(TelaListarLivros listagem) {
        this.listagem = listagem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtQtd_pag;
    private javax.swing.JTextField txtResumo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
