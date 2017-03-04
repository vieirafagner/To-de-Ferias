package br.edu.ifnmg.todeferias.Apresentação;


import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaSerie;
import br.edu.ifnmg.todeferias.Aplicacao.Serie;
import br.edu.ifnmg.todeferias.Aplicacao.SerieRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.SerieDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cleiton rodrigues
 */
public class TelaListarSerie extends javax.swing.JInternalFrame {

    SerieRepositorio dao = GerenciadorReferencias.getSerie();
    TelaCadastrarSeries editar;
    TelaClassificacaoSerie Classificar;
    Conta usuario;
    
    public TelaListarSerie(Conta usuario) {
        initComponents();
          List<Serie> busca = dao.Buscar(null);
          preencheTabela(busca);
          this.usuario = usuario;
    }

  private void preencheTabela(List<Serie> lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        
        for(Serie s : lista){
            Vector linha = new Vector();
            linha.add(s.getId());
            linha.add(s.getNome());
            modelo.addRow(linha);
        }
        
        tblBusca.setModel(modelo);
    }
    
    
    public void buscar(String nome){
        Serie filtro = new Serie(0,0,null,nome,0,null,0);
        
        List<Serie> busca = dao.Buscar(filtro);
        
        preencheTabela(busca);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusca = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        tblBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/todeferias/imagens/iconClose.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/todeferias/imagens/iconSearch.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaMouseClicked
        int selecionada = tblBusca.getSelectedRow();

        int id = Integer.parseInt( tblBusca.getModel().getValueAt(selecionada, 0).toString() );
        if (usuario.getStatus() != 1) {
            ClassificarSerie(id);
            this.dispose();
        }
        else{
            editarSerie(id);
            this.dispose();
        }
    }//GEN-LAST:event_tblBuscaMouseClicked

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar( txtBusca.getText() );
    }//GEN-LAST:event_btnBuscarActionPerformed
 public void editarSerie(int id){
        Serie entidade;
        
        entidade = dao.Abrir(id);
        
        editar = new TelaCadastrarSeries(usuario);
        
        editar.setEntidade(entidade);
        
        editar.setListagem(this);
        
        this.getParent().add(editar);
        editar.setVisible(true);
        this.setVisible(true);
    }
      public void ClassificarSerie(int id){
        ContaSerie entidade = new ContaSerie();
        
        SerieDAO daoSerie = new SerieDAO();
        entidade.setSerie(dao.Abrir(id));
        
        Classificar = new TelaClassificacaoSerie(usuario,false);
        
        Classificar.setEntidade(entidade);
        
        //Classificar.setListagem(this);
        
        this.getParent().add(Classificar);
        Classificar.setVisible(true);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusca;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
