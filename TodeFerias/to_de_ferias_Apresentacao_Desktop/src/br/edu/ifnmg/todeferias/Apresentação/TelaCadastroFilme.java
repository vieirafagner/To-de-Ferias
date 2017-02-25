/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.ErroValidacao;
import br.edu.ifnmg.todeferias.Aplicacao.Filme;
import br.edu.ifnmg.todeferias.Aplicacao.FilmeRepositorio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fagner
 */
public class TelaCadastroFilme extends javax.swing.JInternalFrame {

    Filme entidade = new Filme();
    FilmeRepositorio dao;
    TelaListarFilme listagem;
    
    public TelaCadastroFilme() {
        initComponents();
        dao = GerenciadorReferencias.getFilme();
        //this.filme = filme;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bxClassificacao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopse = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("Nome");

        jLabel2.setText("Diretor");

        jLabel3.setText("Duração");

        jLabel4.setText("Classificação");

        bxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        bxClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxClassificacaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Gênero");

        jLabel6.setText("Sinopse");

        txtSinopse.setColumns(20);
        txtSinopse.setRows(5);
        jScrollPane1.setViewportView(txtSinopse);

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Tela de cadastro de filmes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiretor)
                    .addComponent(txtNome)
                    .addComponent(txtDuracao)
                    .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente salvar as alterações?") == 0){
            
            try {
                preencheObjeto();
            } catch (ErroValidacao ex) {
                Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE, null, ex);
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
                entidade = new Filme(0,"",0,"", 0, "", "");
                preencheCampos();
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante a execução! Procure o administrador do sistema.");

        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void bxClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxClassificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxClassificacaoActionPerformed

    private void preencheObjeto() throws ErroValidacao {
        
        entidade.setNome( txtNome.getText()  );
        entidade.setDiretor(txtDiretor.getText() );
        entidade.setDuracao( Integer.parseInt(txtDuracao.getText()));
        entidade.setClassificacao(bxClassificacao.getSelectedIndex());
        entidade.setGenero(txtGenero.getText());
        entidade.setSinopse( txtSinopse.getText());
    }
    private void preencheCampos(){
 
        txtNome.setText( entidade.getNome() );
        txtDiretor.setText( entidade.getDiretor());
        txtDuracao.setText( Integer.toString(entidade.getDuracao()));
        bxClassificacao.setSelectedItem( entidade.getClassificacao());
        txtGenero.setText(entidade.getGenero());
        txtSinopse.setText(entidade.getSinopse());    
    }
    public Filme getEntidade() {
        return entidade;
    }
    public void setEntidade(Filme entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaListarFilme getListagem() {
        return listagem;
    }

    public void setListagem(TelaListarFilme listagem) {
        this.listagem = listagem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> bxClassificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtSinopse;
    // End of variables declaration//GEN-END:variables
}
