/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.Filme;
import br.edu.ifnmg.todeferias.Aplicacao.FilmeRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author fagner
 */
public class TelaCadastroFilme extends javax.swing.JFrame {

     Filme entidade = new Filme();
    FilmeRepositorio dao;
    
    /**
     * Creates new form TelaCadastroFilme
     */
    public TelaCadastroFilme() {
        initComponents();
        dao = GerenciadorReferencias.getFilme();
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
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnClassificacao1 = new javax.swing.JRadioButton();
        btnClassificacao2 = new javax.swing.JRadioButton();
        btnClassificacao3 = new javax.swing.JRadioButton();
        btnClassificacao4 = new javax.swing.JRadioButton();
        btnClassificacao5 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSinopse = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("IdFilme");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Diretor");

        txtDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiretorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Duração");

        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Classificação");

        btnClassificacao1.setText("1");
        btnClassificacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacao1ActionPerformed(evt);
            }
        });

        btnClassificacao2.setText("2");
        btnClassificacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacao2ActionPerformed(evt);
            }
        });

        btnClassificacao3.setText("3");
        btnClassificacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacao3ActionPerformed(evt);
            }
        });

        btnClassificacao4.setText("4");
        btnClassificacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacao4ActionPerformed(evt);
            }
        });

        btnClassificacao5.setText("5");
        btnClassificacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacao5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Gênero");

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Sinopse");

        txtSinopse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSinopseActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Cadastro de Filmes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtGenero)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtDuracao)
                        .addGap(250, 250, 250))
                    .addComponent(txtSinopse)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClassificacao1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClassificacao2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClassificacao3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClassificacao4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClassificacao5))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnClassificacao1)
                    .addComponent(btnClassificacao2)
                    .addComponent(btnClassificacao3)
                    .addComponent(btnClassificacao4)
                    .addComponent(btnClassificacao5))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(jButton2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiretorActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnClassificacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao5ActionPerformed
        Integer classificacao5 = Integer.parseInt(btnClassificacao5.getText());
        if(!classificacao5.equals(""))
            entidade.setClassificacao(classificacao5);
    }//GEN-LAST:event_btnClassificacao5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
              if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
                this.recuperaCampos();
                
                if(dao.Salvar(entidade))
                    JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                else
                    JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");
            
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
            }
        } catch (ErroValidacao ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnClassificacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao1ActionPerformed
        Integer classificacao = Integer.parseInt(btnClassificacao1.getText());
        if(!classificacao.equals(""))
            entidade.setClassificacao(classificacao);
    }//GEN-LAST:event_btnClassificacao1ActionPerformed

    private void btnClassificacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao2ActionPerformed
        Integer classificacao2 = Integer.parseInt(btnClassificacao2.getText());
        if(!classificacao2.equals(""))
            entidade.setClassificacao(classificacao2);
    }//GEN-LAST:event_btnClassificacao2ActionPerformed

    private void btnClassificacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao3ActionPerformed
         Integer classificacao3 = Integer.parseInt(btnClassificacao3.getText());
        if(!classificacao3.equals(""))
            entidade.setClassificacao(classificacao3);
    }//GEN-LAST:event_btnClassificacao3ActionPerformed

    private void btnClassificacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao4ActionPerformed
        Integer classificacao4 = Integer.parseInt(btnClassificacao4.getText());
        if(!classificacao4.equals(""))
            entidade.setClassificacao(classificacao4);
    }//GEN-LAST:event_btnClassificacao4ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void txtSinopseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSinopseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSinopseActionPerformed

    public void recuperaCampos() throws ErroValidacao{
        String nome = txtNome.getText().trim();
        if(!nome.equals(""))
            entidade.setNome(nome);
        
        String diretor = txtDiretor.getText().trim();
        if(!diretor.equals(""))
            entidade.setDiretor(diretor);
        
        Integer duracao = Integer.parseInt(txtDuracao.getText());
        if(!duracao.equals(""))
            entidade.setDuracao(duracao);
        
        String genero = txtGenero.getText().trim();
        if(!genero.equals(""))
            entidade.setGenero(genero);
        
        String sinopse = txtSinopse.getText().trim();
        if(!sinopse.equals(""))
            entidade.setSinopse(sinopse);
    }
    
    /*private void preencheObjeto() throws ErroValidacao {
        entidade.setNome( txtNome.getText()  );
        entidade.setEmail( txtEmail.getText() );
        entidade.setSenha(txtSenha.getText());
        
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnClassificacao1;
    private javax.swing.JRadioButton btnClassificacao2;
    private javax.swing.JRadioButton btnClassificacao3;
    private javax.swing.JRadioButton btnClassificacao4;
    private javax.swing.JRadioButton btnClassificacao5;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSinopse;
    // End of variables declaration//GEN-END:variables
}
