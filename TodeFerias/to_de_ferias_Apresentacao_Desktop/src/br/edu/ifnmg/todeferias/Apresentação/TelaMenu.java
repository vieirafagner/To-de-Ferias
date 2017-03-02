/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaRepositorio;

/**
 *
 * @author fagner
 */
public class TelaMenu extends javax.swing.JFrame {

    public Conta usuario;
    TelaCadastrarConta editar;
    ContaRepositorio dao = GerenciadorReferencias.getConta();
    /**
     * Creates new form TelaMenu
     */
    public TelaMenu(Conta usuario) {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        this.usuario = usuario;
        
        System.out.println(usuario);
        
        if(this.usuario.getStatus() == 1){
            btnPerfil.setVisible(false);
        }
        else{
            menuCadastrarFilme.setEnabled(false);
            mnuCadastrarAnime.setEnabled(false);
            mnuCadastrarNovela.setEnabled(false);
            mnuCadastrarLivro.setEnabled(false);
            menuCadastrarSerie.setEnabled(false);
            mnuCadastrarDocumentario.setEnabled(false);
            ItmListarUsuarios.setVisible(false);
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        btnPerfil = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItmListarUsuarios = new javax.swing.JMenuItem();
        mnuMidias = new javax.swing.JMenu();
        mnuFilmes = new javax.swing.JMenu();
        menuCadastrarFilme = new javax.swing.JMenuItem();
        mnuListFilme = new javax.swing.JMenuItem();
        mnuNovelas = new javax.swing.JMenu();
        mnuCadastrarNovela = new javax.swing.JMenuItem();
        mnuListNovela = new javax.swing.JMenuItem();
        mnuAnime = new javax.swing.JMenu();
        mnuCadastrarAnime = new javax.swing.JMenuItem();
        mnuListarAnime = new javax.swing.JMenuItem();
        mnuLivros = new javax.swing.JMenu();
        mnuCadastrarLivro = new javax.swing.JMenuItem();
        mnuListarLivro = new javax.swing.JMenuItem();
        mnuDocumentario = new javax.swing.JMenu();
        mnuCadastrarDocumentario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuCadastrarSerie = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPerfil.setText("Perfil ");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        jMenu1.setText("Gerenciar");

        ItmListarUsuarios.setText("Listar Usuários");
        ItmListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmListarUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(ItmListarUsuarios);

        mnuMidias.setText("Midias");

        mnuFilmes.setText("Filmes");
        mnuFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFilmesActionPerformed(evt);
            }
        });

        menuCadastrarFilme.setText("Cadastrar");
        menuCadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFilmeActionPerformed(evt);
            }
        });
        mnuFilmes.add(menuCadastrarFilme);

        mnuListFilme.setText("Listar");
        mnuListFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListFilmeActionPerformed(evt);
            }
        });
        mnuFilmes.add(mnuListFilme);

        mnuMidias.add(mnuFilmes);

        mnuNovelas.setText("Novelas");

        mnuCadastrarNovela.setText("Cadastrar");
        mnuCadastrarNovela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarNovelaActionPerformed(evt);
            }
        });
        mnuNovelas.add(mnuCadastrarNovela);

        mnuListNovela.setText("Listar");
        mnuListNovela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListNovelaActionPerformed(evt);
            }
        });
        mnuNovelas.add(mnuListNovela);

        mnuMidias.add(mnuNovelas);

        mnuAnime.setText("Animes");

        mnuCadastrarAnime.setText("Cadastrar");
        mnuCadastrarAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarAnimeActionPerformed(evt);
            }
        });
        mnuAnime.add(mnuCadastrarAnime);

        mnuListarAnime.setText("Listar");
        mnuListarAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarAnimeActionPerformed(evt);
            }
        });
        mnuAnime.add(mnuListarAnime);

        mnuMidias.add(mnuAnime);

        mnuLivros.setText("Livros");

        mnuCadastrarLivro.setText("Cadastrar");
        mnuCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarLivroActionPerformed(evt);
            }
        });
        mnuLivros.add(mnuCadastrarLivro);

        mnuListarLivro.setText("Listar");
        mnuListarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarLivroActionPerformed(evt);
            }
        });
        mnuLivros.add(mnuListarLivro);

        mnuMidias.add(mnuLivros);

        mnuDocumentario.setText("Documentário");

        mnuCadastrarDocumentario.setText("Cadastrar");
        mnuCadastrarDocumentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarDocumentarioActionPerformed(evt);
            }
        });
        mnuDocumentario.add(mnuCadastrarDocumentario);

        jMenuItem2.setText("Listar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuDocumentario.add(jMenuItem2);

        mnuMidias.add(mnuDocumentario);

        jMenu3.setText("Série");

        menuCadastrarSerie.setText("Cadastrar");
        menuCadastrarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarSerieActionPerformed(evt);
            }
        });
        jMenu3.add(menuCadastrarSerie);

        jMenuItem4.setText("Listar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        mnuMidias.add(jMenu3);

        jMenu1.add(mnuMidias);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(btnPerfil)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPerfil)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
/*
        NewJFrame aa = new NewJFrame();
        aa.setVisible(rootPaneCheckingEnabled);
        */
        editarCliente(usuario.getId());
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void ItmListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmListarUsuariosActionPerformed
        new TelaListagemContas().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ItmListarUsuariosActionPerformed

    private void menuCadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFilmeActionPerformed
      TelaCadastroFilme tela = new TelaCadastroFilme();
      this.add(tela);
      tela.setVisible(true);
      
      
      
    }//GEN-LAST:event_menuCadastrarFilmeActionPerformed

    private void mnuFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFilmesActionPerformed
       
    }//GEN-LAST:event_mnuFilmesActionPerformed

    private void mnuListFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListFilmeActionPerformed
      TelaListarFilme tela = new TelaListarFilme(this.usuario);
      this.add(tela);
      tela.setVisible(true);
    }//GEN-LAST:event_mnuListFilmeActionPerformed

    private void mnuListNovelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListNovelaActionPerformed
       TelaListarNovelas tela = new TelaListarNovelas();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_mnuListNovelaActionPerformed

    private void mnuCadastrarNovelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarNovelaActionPerformed
        TelaCadastrarNovela tela = new TelaCadastrarNovela();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarNovelaActionPerformed

    private void mnuCadastrarAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarAnimeActionPerformed
        TelaCadastrarAnime tela = new TelaCadastrarAnime();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarAnimeActionPerformed

    private void mnuListarAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarAnimeActionPerformed
       TelaListarAnimes tela = new TelaListarAnimes();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_mnuListarAnimeActionPerformed

    private void mnuCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarLivroActionPerformed
        TelaCadastrarLivros tela = new TelaCadastrarLivros();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarLivroActionPerformed

    private void mnuListarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarLivroActionPerformed
       TelaListarLivros tela = new TelaListarLivros();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_mnuListarLivroActionPerformed

    private void mnuCadastrarDocumentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarDocumentarioActionPerformed
        TelaCadastrarDocumentario tela = new TelaCadastrarDocumentario();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarDocumentarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaListarDocumentarios tela = new TelaListarDocumentarios();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuCadastrarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarSerieActionPerformed
        TelaCadastrarSeries tela = new TelaCadastrarSeries();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuCadastrarSerieActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaListarSerie tela = new TelaListarSerie();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

     public void editarCliente(int id){
        Conta entidade;
     
        entidade = dao.Abrir(id);
        
        editar = new TelaCadastrarConta();
        
        editar.setEntidade(entidade);
        
       // editar.setListagem(this);
        
        this.add(editar);
        editar.setVisible(true);
        //this.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmListarUsuarios;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JMenuItem menuCadastrarFilme;
    private javax.swing.JMenuItem menuCadastrarSerie;
    private javax.swing.JMenu mnuAnime;
    private javax.swing.JMenuItem mnuCadastrarAnime;
    private javax.swing.JMenuItem mnuCadastrarDocumentario;
    private javax.swing.JMenuItem mnuCadastrarLivro;
    private javax.swing.JMenuItem mnuCadastrarNovela;
    private javax.swing.JMenu mnuDocumentario;
    private javax.swing.JMenu mnuFilmes;
    private javax.swing.JMenuItem mnuListFilme;
    private javax.swing.JMenuItem mnuListNovela;
    private javax.swing.JMenuItem mnuListarAnime;
    private javax.swing.JMenuItem mnuListarLivro;
    private javax.swing.JMenu mnuLivros;
    private javax.swing.JMenu mnuMidias;
    private javax.swing.JMenu mnuNovelas;
    // End of variables declaration//GEN-END:variables
}
