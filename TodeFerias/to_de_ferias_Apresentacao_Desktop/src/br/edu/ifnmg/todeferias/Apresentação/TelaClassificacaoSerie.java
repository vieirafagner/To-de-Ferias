/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaSerie;
import br.edu.ifnmg.todeferias.Aplicacao.Serie;
import br.edu.ifnmg.todeferias.Aplicacao.SerieRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.ContaSerieDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author fagner
 */
public class TelaClassificacaoSerie extends javax.swing.JInternalFrame {

    Serie entidade = new Serie();
    SerieRepositorio dao;
    TelaListarSerie listagem;
    Conta usuario;
    public TelaClassificacaoSerie(Conta usuario) {
        initComponents();
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        lblQtdTemporadas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bxClassificacao = new javax.swing.JComboBox<>();
        btnClassificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSinopse = new javax.swing.JLabel();

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblQtdTemporadas.setText("Quantidade Temporadas");

        jLabel1.setText("Nome:");

        lblNome.setText("Nome");

        jLabel2.setText("Gênero");

        lblGenero.setText("Genero");

        jLabel3.setText("Quantidade de Temporadas");

        jLabel4.setText("Classificação");

        bxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btnClassificar.setText("Classificar");
        btnClassificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificarActionPerformed(evt);
            }
        });

        jLabel5.setText("Duração");

        lblDuracao.setText("Duracao");

        jLabel6.setText("Sinopse");

        lblSinopse.setText("Sinopse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClassificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblQtdTemporadas)
                            .addComponent(lblGenero)
                            .addComponent(lblDuracao)
                            .addComponent(lblSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblQtdTemporadas))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblDuracao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnClassificar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnClassificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificarActionPerformed
        ContaSerie contaSerie = new ContaSerie(usuario);
        ContaSerieDAO dao = new ContaSerieDAO();

        entidade.setClassificacao(bxClassificacao.getSelectedIndex()+1);
        usuario.addSeries(entidade);

        System.out.println(bxClassificacao.getSelectedIndex()+1);

        dao.Salvar(contaSerie);

        JOptionPane.showMessageDialog(this, "Classificado Com Sucesso !");
    }//GEN-LAST:event_btnClassificarActionPerformed
    private void preencheCampos(){
 
        lblNome.setText( entidade.getNome() );
        lblGenero.setText( entidade.getGenero());
        lblQtdTemporadas.setText( Integer.toString(entidade.getQtd_temp()));
        lblDuracao.setText( Integer.toString(entidade.getDuracao_ep()));
        lblSinopse.setText(entidade.getSinopse());
         
    }
    public Serie getEntidade() {
        return entidade;
    }
    public void setEntidade(Serie entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaListarSerie getListagem() {
        return listagem;
    }

    public void setListagem(TelaListarSerie listagem) {
        this.listagem = listagem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClassificar;
    private javax.swing.JComboBox<String> bxClassificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtdTemporadas;
    private javax.swing.JLabel lblSinopse;
    // End of variables declaration//GEN-END:variables
}
