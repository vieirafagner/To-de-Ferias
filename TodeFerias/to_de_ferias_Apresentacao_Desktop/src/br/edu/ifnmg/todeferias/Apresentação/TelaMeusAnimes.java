/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaAnime;
import br.edu.ifnmg.todeferias.Persistencia.AnimeDAO;
import br.edu.ifnmg.todeferias.Persistencia.ContaAnimeDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fagner
 */
public class TelaMeusAnimes extends javax.swing.JInternalFrame {

   private Conta usuario;
   List<ContaAnime>lista;
   TelaClassificacaoAnime Classificar;
    public TelaMeusAnimes(Conta usuario) {
        initComponents();
        
         this.usuario = usuario;
        ContaAnimeDAO  dao = new ContaAnimeDAO();
        ContaAnime contaAnime = new ContaAnime(usuario);
        
        this.lista = dao.Buscar(contaAnime);
        AnimeDAO daoAnime = new AnimeDAO();

        
        
         for(ContaAnime f :lista){
           
            
            daoAnime.Abrir(f.getId()); 
            
        
        }
        
        preencheTabela(lista);
    }

   private void preencheTabela(List<ContaAnime> lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        modelo.addColumn("classificacao");
        
        for(ContaAnime ca : lista){
            Vector linha = new Vector();
            linha.add(ca.getId());
            linha.add(ca.getAnime().getNome());
            linha.add(ca.getClassificacao());
            modelo.addRow(linha);
        }
        
        tblBusca.setModel(modelo);
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusca = new javax.swing.JTable();

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        tblBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Classificação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void tblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaMouseClicked
        int selecionada = tblBusca.getSelectedRow();
        
        int id = Integer.parseInt( tblBusca.getModel().getValueAt(selecionada, 0).toString());
         if(usuario.getStatus()!=1){
            ClassificarAnime(id);
            this.dispose();
        }
    }//GEN-LAST:event_tblBuscaMouseClicked
    
    public void ClassificarAnime(int id){
        
        ContaAnime entidade;
        
        ContaAnimeDAO daoContaFilme = new ContaAnimeDAO();
        
        
        
        entidade = daoContaFilme.Abrir(id);
        
        
        Classificar = new TelaClassificacaoAnime(usuario,true);
        
        entidade.getAnime().setClassificacao(entidade.getClassificacao());
        Classificar.setEntidade(entidade);
        
        
        
        this.getParent().add(Classificar);
        Classificar.setVisible(true);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusca;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
