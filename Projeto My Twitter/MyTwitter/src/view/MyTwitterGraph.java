/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import view.CriarPerfil;
import view.AtualizarPerfil;
import exceptions.*;
import java.awt.CardLayout;
import java.util.Vector;
import javax.swing.JOptionPane;
import mytwitter.MyTwitter;
import mytwitter.Perfil;
import mytwitter.PessoaFisica;
import mytwitter.PessoaJuridica;
import mytwitter.RepositorioUsuario;
import mytwitter.Tweet;

/**
 *
 * @author Jarelio Filho
 */
public class MyTwitterGraph extends javax.swing.JFrame{
    
    private RepositorioUsuario rep = new RepositorioUsuario();
    private MyTwitter novo_twitter = new MyTwitter(rep);
    
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
            java.util.logging.Logger.getLogger(MyTwitterGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyTwitterGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyTwitterGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyTwitterGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTwitterGraph().setVisible(true);
            }
        });
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUser = new javax.swing.JMenu();
        jMenuTweetar = new javax.swing.JMenuItem();
        jMenuSeguir = new javax.swing.JMenuItem();
        jMenuSeguidores = new javax.swing.JMenuItem();
        jMenuTweets = new javax.swing.JMenuItem();
        jMenuNumSeguidores = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuCriarUser = new javax.swing.JMenuItem();
        jMenuCancelarUser = new javax.swing.JMenuItem();
        jMenuTimeline = new javax.swing.JMenuItem();
        jMenuAllInfo = new javax.swing.JMenuItem();
        jMenuAtualizarUser = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyTwitter");

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, "card4");

        jPanel2.setBackground(java.awt.SystemColor.controlDkShadow);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, "card2");

        jPanel3.setBackground(new java.awt.Color(51, 0, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, "card3");

        jMenuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jMenuUser.setText("Usuário");

        jMenuTweetar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/comment_add.png"))); // NOI18N
        jMenuTweetar.setText("Tweetar");
        jMenuTweetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTweetarActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuTweetar);

        jMenuSeguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_go.png"))); // NOI18N
        jMenuSeguir.setText("Seguir");
        jMenuSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSeguirActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuSeguir);

        jMenuSeguidores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group_go.png"))); // NOI18N
        jMenuSeguidores.setText("Seguidores");
        jMenuSeguidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSeguidoresActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuSeguidores);

        jMenuTweets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/page_white_stack.png"))); // NOI18N
        jMenuTweets.setText("Tweets");
        jMenuTweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTweetsActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuTweets);

        jMenuNumSeguidores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/text_list_numbers.png"))); // NOI18N
        jMenuNumSeguidores.setText("Número Seguidores");
        jMenuNumSeguidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNumSeguidoresActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuNumSeguidores);

        jMenuBar1.add(jMenuUser);

        jMenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_gray.png"))); // NOI18N
        jMenuAdmin.setText("Administrador");

        jMenuCriarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_add.png"))); // NOI18N
        jMenuCriarUser.setText("Criar Usuário");
        jMenuCriarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCriarUserActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuCriarUser);

        jMenuCancelarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_delete.png"))); // NOI18N
        jMenuCancelarUser.setText("Cancelar Usuário");
        jMenuCancelarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCancelarUserActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuCancelarUser);

        jMenuTimeline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/page_white_stack.png"))); // NOI18N
        jMenuTimeline.setText("Timeline");
        jMenuTimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTimelineActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuTimeline);

        jMenuAllInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N
        jMenuAllInfo.setText("Todas as Informações");
        jMenuAllInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAllInfoActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuAllInfo);

        jMenuAtualizarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_edit.png"))); // NOI18N
        jMenuAtualizarUser.setText("Atualizar Usuário");
        jMenuAtualizarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAtualizarUserActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuAtualizarUser);

        jMenuBar1.add(jMenuAdmin);

        jMenuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help.png"))); // NOI18N
        jMenuAbout.setText("Sobre");
        jMenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuCriarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCriarUserActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        CriarPerfil telaCad = new CriarPerfil(this,true);
        telaCad.setTitle("Criar Usuário");
        telaCad.setVisible(true);
        
        String nome = telaCad.nome_cad_perfil;
        String tipo = telaCad.tipo_cad_perfil;
        long cpf_cnpj = Long.parseLong(telaCad.cpf_cad_perfil);
        if(tipo.equals("CPF") && !(nome.equals(""))){
            PessoaFisica p = new PessoaFisica(nome);
            p.setCpf(cpf_cnpj);
            chamaCriarPerfil(p);
        }else if(tipo.equals("CNPJ") && !(nome.equals(""))){
            PessoaJuridica p = new PessoaJuridica(nome);
            p.setCnpj(cpf_cnpj);
            chamaCriarPerfil(p);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuCriarUserActionPerformed

    private void jMenuAllInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAllInfoActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        TodasInformacoes telaTodaInfo = new TodasInformacoes(this,true);
        telaTodaInfo.getButton1().setText("Ver Todas as Informações");
        telaTodaInfo.setTitle("Todas as Informações");
        telaTodaInfo.setVisible(true);
        
        String nome = telaTodaInfo.nome;
        if (!(nome.equals(""))){
            Perfil p = novo_twitter.getRepositorio().buscar(nome);
            if(p != null){
                JOptionPane.showMessageDialog(null, p.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Perfil não existe!");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuAllInfoActionPerformed

    private void jMenuCancelarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCancelarUserActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        TodasInformacoes telaCancelarPerfil = new TodasInformacoes(this, true);
        telaCancelarPerfil.getButton1().setText("Cancelar Perfil");
        telaCancelarPerfil.setTitle("Cancelar Usuário");
        telaCancelarPerfil.setVisible(true);
        
        String nome = telaCancelarPerfil.nome;
        if (!(nome.equals(""))){
            chamaCancelarPerfil(nome);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");   
    }//GEN-LAST:event_jMenuCancelarUserActionPerformed

    private void jMenuTimelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTimelineActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        TodasInformacoes telaTimeline = new TodasInformacoes(this,true);
        telaTimeline.getButton1().setText("Ver Timeline");
        telaTimeline.setTitle("Timeline");
        telaTimeline.setVisible(true);
        
        String nome = telaTimeline.nome;
        if (!(nome.equals(""))){
            chamaGetTimeline(nome);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuTimelineActionPerformed

    private void jMenuSeguidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSeguidoresActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        TodasInformacoes telaSeguidores = new TodasInformacoes(this,true);
        telaSeguidores.getButton1().setText("Ver Seguidores");
        telaSeguidores.setTitle("Seguidores");
        telaSeguidores.setVisible(true);
        
        String nome = telaSeguidores.nome;
        if (!(nome.equals(""))){
            chamaGetSeguidores(nome);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuSeguidoresActionPerformed

    private void jMenuTweetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTweetarActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        Tweetar telaTweetar = new Tweetar(this,true);
        telaTweetar.setVisible(true);
        String nome = telaTweetar.nome;
        String mensagem = telaTweetar.mensagem;
        if(!(nome.equals(""))){
            chamaTweetar(nome,mensagem);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuTweetarActionPerformed

    private void jMenuSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSeguirActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        Seguir telaSeguir = new Seguir(this,true);
        telaSeguir.setVisible(true);
        
        String seguidor = telaSeguir.seguidor;
        String seguido = telaSeguir.seguido;
        if(!(seguidor.equals("")) && !(seguido.equals(""))){
            chamaSeguir(seguidor,seguido);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuSeguirActionPerformed

    private void jMenuTweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTweetsActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        TodasInformacoes telaTweets = new TodasInformacoes(this,true);
        telaTweets.getButton1().setText("Ver Tweets");
        telaTweets.setTitle("Tweets");
        telaTweets.setVisible(true);
        
        String nome = telaTweets.nome;
        if (!(nome.equals(""))){
            chamaGetTweets(nome);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuTweetsActionPerformed

    private void jMenuNumSeguidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNumSeguidoresActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        TodasInformacoes telaNumSeguidores = new TodasInformacoes(this,true);
        telaNumSeguidores.getButton1().setText("Ver Nº Seguidores");
        telaNumSeguidores.setTitle("Número de Seguidores");
        telaNumSeguidores.setVisible(true);
        
        String nome = telaNumSeguidores.nome;
        if (!(nome.equals(""))){
            chamaGetNumSeguidores(nome);
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuNumSeguidoresActionPerformed

    private void jMenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutMouseClicked
       
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1,"card3");
        
        JOptionPane.showMessageDialog(null, "MyTwitter criado por: \n\n -Jarelio Filho");
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuAboutMouseClicked

    private void jMenuAtualizarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAtualizarUserActionPerformed
        
        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1, "card3");
        
        TodasInformacoes telaUsuarioAtualizar = new TodasInformacoes(this,true);
        telaUsuarioAtualizar.getButton1().setText("Ver Usuário");
        telaUsuarioAtualizar.setTitle("Usuário Atualizar");
        telaUsuarioAtualizar.setVisible(true);
        
        String nome = telaUsuarioAtualizar.nome;
        if (nome.equals("")){
            JOptionPane.showMessageDialog(null,"Operação cancelada!");
        }else {
            Perfil p = novo_twitter.getRepositorio().buscar(nome);
            if(p != null){
                AtualizarPerfil telaAtualizar = new AtualizarPerfil(this,true);
                telaAtualizar.nome = nome;
                telaAtualizar.retornaLabel().setText(nome);
                if(p.isAtivo()){
                    telaAtualizar.retornaRButton1().setSelected(true);
                }else{
                    telaAtualizar.retornaRButton2().setSelected(true);
                }
                Vector<Tweet> tweets_atualizar = new Vector<Tweet>();
                for(Tweet tweet_atualizar : p.getTimeline()){
                    if (tweet_atualizar.getUsuario().equals(nome)){
                        tweets_atualizar.add(tweet_atualizar);
                    }
                }
                telaAtualizar.tweets = tweets_atualizar;
                telaAtualizar.setVisible(true);
                
                nome = telaAtualizar.nome;
                if (nome.equals("")){
                    JOptionPane.showMessageDialog(null,"Operação Cancelada");
                }else{
                    Vector<Tweet> novo_vetor = new Vector<Tweet>();
                    Vector<String> novo_vetor_seguidores = new Vector<String>();
                    novo_vetor = telaAtualizar.tweets;
                    boolean ativo = telaAtualizar.ativo;
                    novo_vetor_seguidores = novo_twitter.getRepositorio().buscar(nome).getSeguidores();
                    PessoaFisica perfil_atualizar = new PessoaFisica(nome);
                    perfil_atualizar.setAtivo(ativo);
                    for(Tweet novo_tweet : novo_vetor){
                        perfil_atualizar.getTimeline().add(novo_tweet);
                    }
                    for(String seguidores : novo_vetor_seguidores){
                        perfil_atualizar.getSeguidores().add(seguidores);
                    }
                    PessoaFisica perfil = (PessoaFisica) novo_twitter.getRepositorio().buscar(nome);
                    perfil.getCpf();
                    perfil_atualizar.setCpf(perfil.getCpf());
                    chamaAtualizar(perfil_atualizar);
            
                        for(String seguidores : novo_vetor_seguidores){
                            for(int i = 0; i<(novo_twitter.getRepositorio().buscar(seguidores).getTimeline().size()); i++){
                                if(novo_twitter.getRepositorio().buscar(seguidores).getTimeline().elementAt(i).getUsuario().equals(nome)){
                                    novo_twitter.getRepositorio().buscar(seguidores).getTimeline().remove(i);
                                }
                            }
                        }
                    
                  
                }
               
            }else{
                JOptionPane.showMessageDialog(null,"Usuário não existe!");
            }
        }
        
        cl.show(jPanel1,"card2");
    }//GEN-LAST:event_jMenuAtualizarUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuItem jMenuAllInfo;
    private javax.swing.JMenuItem jMenuAtualizarUser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCancelarUser;
    private javax.swing.JMenuItem jMenuCriarUser;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuNumSeguidores;
    private javax.swing.JMenuItem jMenuSeguidores;
    private javax.swing.JMenuItem jMenuSeguir;
    private javax.swing.JMenuItem jMenuTimeline;
    private javax.swing.JMenuItem jMenuTweetar;
    private javax.swing.JMenuItem jMenuTweets;
    private javax.swing.JMenu jMenuUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
    
    public MyTwitterGraph() {
        initComponents();
    }
    public void chamaAtualizar(Perfil p){
        try{
            novo_twitter.getRepositorio().atualizar(p);
            JOptionPane.showMessageDialog(null, "Perfil Atualizado");
        }catch(UNCException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void chamaSeguir(String p, String q){
        try {
            novo_twitter.seguir(p,q);
            JOptionPane.showMessageDialog(null, "Você seguiu o usuário");
        } catch (SEException | PIException | PDException | SIException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void chamaGetNumSeguidores(String p){
        try {
            int n = novo_twitter.numeroSeguidores(p);
            JOptionPane.showMessageDialog(null, "Numero de seguidores: " + n);
        } catch (PIException | PDException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //Chama a função que pega os tweets de um determinado perfil P
    public void chamaGetTweets(String p){
        Vector<Tweet> your_tweets = new Vector<Tweet>();            
        String msg_tweets = "Os seus tweets são: \n";          
        try{
            your_tweets = novo_twitter.tweets(p);
            for (Tweet tweet : your_tweets) {
                msg_tweets += "[" + tweet.getMensagem() + "]" + "\n";
            }
            JOptionPane.showMessageDialog(null, msg_tweets);
        }catch(PIException | PDException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void chamaTweetar(String p, String mensagem){
        try{
            novo_twitter.tweetar(p, mensagem);
            JOptionPane.showMessageDialog(null, "Mensagem tweetada com sucesso!");
        }catch(PIException | MFPException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void chamaGetSeguidores(String p){
        Vector<Perfil> v_seg = new Vector<>();
        String txt_nomes = "Os seus seguidores são: \n";
        try {
            v_seg = novo_twitter.seguidores(p);
            for (Perfil perfil : v_seg) {
                txt_nomes +="- " + perfil.getUsuario() + " -\n";
            }
            JOptionPane.showMessageDialog(null, txt_nomes);
        } catch (PIException | PDException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void chamaGetTimeline(String p){
        Vector<Tweet> tweets_time = new Vector<Tweet>();
        String all_tweets = "Os tweets de sua timeline são: \n";
        try{
            tweets_time = novo_twitter.timeline(p);
            for (Tweet tweet : tweets_time) {
                all_tweets += tweet.getUsuario() + ": " + "[" + tweet.getMensagem() + "]" + "\n";
            }
            JOptionPane.showMessageDialog(null, all_tweets);
            }catch(PIException | PDException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
    public void chamaCriarPerfil(Perfil p){
        try{
            novo_twitter.criarPerfil(p);
            JOptionPane.showMessageDialog(null, "Perfil criado!");
        }catch(PEException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void chamaCancelarPerfil(String p){
        try{
            novo_twitter.cancelarPerfil(p);
            JOptionPane.showMessageDialog(null, "Perfil cancelado!");
        }catch(PIException | PDException e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
