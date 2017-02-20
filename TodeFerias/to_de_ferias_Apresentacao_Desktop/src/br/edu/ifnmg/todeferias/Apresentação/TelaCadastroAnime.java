/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Anime;
import br.edu.ifnmg.todeferias.Aplicacao.AnimeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fagner
 */
public class TelaCadastroAnime extends javax.swing.JFrame {

     Anime entidade = new Anime();
    AnimeRepositorio dao;
    
    
    /**
     * Creates new form TelaCadastroAnime
     */
    public TelaCadastroAnime() {
        initComponents();
         dao = GerenciadorReferencias.getAnime();
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
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDuracao_ep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQtd_temp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSinopse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnClassificacao1 = new javax.swing.JRadioButton();
        btnClassificacao2 = new javax.swing.JRadioButton();
        btnClassificacao3 = new javax.swing.JRadioButton();
        btnClassificacao4 = new javax.swing.JRadioButton();
        btnClassificacao5 = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Animes");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Duração do Episódio");

        txtDuracao_ep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracao_epActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade de Temporadas");

        txtQtd_temp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtd_tempActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Sinopse");

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

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDuracao_ep, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(btnClassificacao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClassificacao2)
                        .addGap(2, 2, 2)
                        .addComponent(btnClassificacao3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClassificacao4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClassificacao5)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDuracao_ep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQtd_temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnClassificacao1)
                    .addComponent(btnClassificacao2)
                    .addComponent(btnClassificacao3)
                    .addComponent(btnClassificacao4)
                    .addComponent(btnClassificacao5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDuracao_epActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracao_epActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracao_epActionPerformed

    private void txtQtd_tempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtd_tempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtd_tempActionPerformed

    private void btnClassificacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao4ActionPerformed
       Integer classificacao4 = Integer.parseInt(btnClassificacao4.getText());
        if(!classificacao4.equals(""))
            entidade.setClassificacao(classificacao4);
    }//GEN-LAST:event_btnClassificacao4ActionPerformed

    private void btnClassificacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao5ActionPerformed
         Integer classificacao5 = Integer.parseInt(btnClassificacao5.getText());
        if(!classificacao5.equals(""))
            entidade.setClassificacao(classificacao5);
    }//GEN-LAST:event_btnClassificacao5ActionPerformed

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

    private void btnClassificacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao1ActionPerformed
        Integer classificacao = Integer.parseInt(btnClassificacao1.getText());
        if(!classificacao.equals(""))
            entidade.setClassificacao(classificacao);
    }//GEN-LAST:event_btnClassificacao1ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
             try {
                 this.recuperaCampos();
             } catch (ErroValidacao ex) {
                 Logger.getLogger(TelaCadastroAnime.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            if(dao.Salvar(entidade))
                JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
            else
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

     public void recuperaCampos() throws ErroValidacao{
        String nome = txtNome.getText().trim();
        if(!nome.equals(""))
            entidade.setNome(nome);
      
        Integer duracao_ep = Integer.parseInt(txtDuracao_ep.getText());
        if(!duracao_ep.equals(""))
            entidade.setDuracao_ep(duracao_ep);
        
        Integer qtd_temp = Integer.parseInt(txtQtd_temp.getText());
        if(!qtd_temp.equals(""))
            entidade.setQtd_temp(qtd_temp);
        
        String sinopse = txtSinopse.getText().trim();
        if(!sinopse.equals(""))
            entidade.setSinopse(sinopse);
    }
    
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
            java.util.logging.Logger.getLogger(TelaCadastroAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAnime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnClassificacao1;
    private javax.swing.JRadioButton btnClassificacao2;
    private javax.swing.JRadioButton btnClassificacao3;
    private javax.swing.JRadioButton btnClassificacao4;
    private javax.swing.JRadioButton btnClassificacao5;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDuracao_ep;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtd_temp;
    private javax.swing.JTextField txtSinopse;
    // End of variables declaration//GEN-END:variables
}
