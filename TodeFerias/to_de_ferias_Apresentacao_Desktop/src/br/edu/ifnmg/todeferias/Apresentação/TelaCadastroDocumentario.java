/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Documentario;
import br.edu.ifnmg.todeferias.Aplicacao.DocumentarioRepositorio;
import javax.swing.JOptionPane;


/**
 *
 * @author cleiton rodrigues
 */
public class TelaCadastroDocumentario extends javax.swing.JFrame {
       Documentario entidade = new Documentario();
       DocumentarioRepositorio dao; 
    /**
     * Creates new form TelaCadastroDocumentarios
     */
    public TelaCadastroDocumentario() {
        initComponents();
        dao = GerenciadorReferencias.getDocumentario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        btnClassificacao1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnClassificacao2 = new javax.swing.JRadioButton();
        btnClassificacao3 = new javax.swing.JRadioButton();
        btnClassificacao4 = new javax.swing.JRadioButton();
        btnClassificacao5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtSinopse = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Cadastro de Documentários");

        jLabel1.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Autor");

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        jLabel3.setText("Data");

        jLabel4.setText("Duração");

        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });

        btnClassificacao1.setText("1");
        btnClassificacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacao1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Classificação");

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

        jLabel6.setText("Sinopse");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnClassificacao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClassificacao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClassificacao3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClassificacao4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClassificacao5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtData)
                                        .addComponent(txtDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtSinopse, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClassificacao1)
                    .addComponent(jLabel5)
                    .addComponent(btnClassificacao2)
                    .addComponent(btnClassificacao3)
                    .addComponent(btnClassificacao4)
                    .addComponent(btnClassificacao5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

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

    private void btnClassificacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacao5ActionPerformed
        Integer classificacao5 = Integer.parseInt(btnClassificacao5.getText());
        if(!classificacao5.equals(""))
            entidade.setClassificacao(classificacao5);
    }//GEN-LAST:event_btnClassificacao5ActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
            this.recuperaCampos();
            
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

    /**
     * @param args the command line arguments
     */
    

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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSinopse;
    // End of variables declaration//GEN-END:variables

    private void recuperaCampos() {
        String sinopse = txtSinopse.getText().trim();
        if(!sinopse.equals(""))
            entidade.setSinopse(sinopse);
        
        Integer duracao = Integer.parseInt(txtDuracao.getText());
        if(!duracao.equals(""))
            entidade.setDuracao(duracao);
        
        String data = txtData.getText().trim();
        if(!data.equals(""))
            entidade.setData(data);
        
        String autor = txtAutor.getText().trim();
        if(!autor.equals(""))
            entidade.setAutor(autor);
        
        String nome = txtNome.getText().trim();
        if(!nome.equals(""))
            entidade.setNome(nome);
        
    }
}
