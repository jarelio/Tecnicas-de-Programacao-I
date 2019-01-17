
package mytwitter;
import exceptions.*;
import java.awt.JobAttributes;
import java.util.Vector;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MyTwitter implements ITwitter{
 
    private IRepositorioUsuario repositorio;
    
    public MyTwitter(IRepositorioUsuario repositorio){
        this.repositorio = repositorio;
    }

    @Override
    public void criarPerfil(Perfil usuario) {
        if(repositorio.buscar(usuario.getUsuario())!= null){
            throw new PEException();
        }
        try{
            repositorio.cadastrar(usuario);
        }catch(UJCException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void cancelarPerfil(String usuario) {
        if(repositorio.buscar(usuario) == null){
            throw new PIException();
        }
        if(!(repositorio.buscar(usuario).isAtivo())){
            throw new PDException();
        }     
        repositorio.buscar(usuario).setAtivo(false);
        
    }

    @Override
    public void tweetar(String usuario, String mensagem) {
        if(repositorio.buscar(usuario) == null){
            throw new PIException();
        }
        if(mensagem.length()<1 || mensagem.length()>140){
            throw new MFPException();
        }
        //Cria um novo tweet
        Tweet novo_tweet = new Tweet();
        novo_tweet.setUsuario(usuario);
        novo_tweet.setMensagem(mensagem);
        
        //Adiciona esse tweet ao usuário 
        Perfil aux_usuario = repositorio.buscar(usuario);
        aux_usuario.addTweet(novo_tweet);
        
        //Pega os seguidores desse usuário e adiciona o tweet em cada timeline de cada seguidor
        Vector<String> seguidores = repositorio.buscar(usuario).getSeguidores();
        if(seguidores != null){
            for(String seguidor : seguidores){
                if(repositorio.buscar(seguidor) != null && repositorio.buscar(seguidor).isAtivo()){
                    (repositorio.buscar(seguidor).getTimeline()).add(novo_tweet);
                }
            }
        }
    }

    @Override
    public Vector<Tweet> timeline(String usuario) {
        if(repositorio.buscar(usuario) == null){
            throw new PIException();
        }
        if(!(repositorio.buscar(usuario).isAtivo())){
            throw new PDException();
        }
        return repositorio.buscar(usuario).getTimeline();
        
    }

    @Override
    public Vector<Tweet> tweets(String usuario) {
        if(repositorio.buscar(usuario) == null){
            throw new PIException();
        }
        if(!(repositorio.buscar(usuario).isAtivo())){
            throw new PDException();
        }
        //Cria um vetor de tweets apenas de determinado usuário passado como parâmetro e o retorna
        if((repositorio.buscar(usuario).getTimeline()) != null){
            Vector<Tweet> vetor_tweets_usuario = new Vector<Tweet>();
            for (Tweet tweets_usuario : repositorio.buscar(usuario).getTimeline()){
                if(tweets_usuario != null && (tweets_usuario.getUsuario().equals(usuario))){
                    vetor_tweets_usuario.add(tweets_usuario);
                }
            }
            return vetor_tweets_usuario;
        }
        return null;
    }

    @Override
    public void seguir(String seguidor, String seguido) {
        if(repositorio.buscar(seguidor) == null || repositorio.buscar(seguido) == null){
            throw new PIException();
        }
        if(!(repositorio.buscar(seguidor).isAtivo()) || !(repositorio.buscar(seguido).isAtivo()) ){
            throw new PDException();
        }
        if(repositorio.buscar(seguidor).getUsuario().equals(repositorio.buscar(seguido).getUsuario())){
            throw new SIException();
        }
        //Adiciona o seguidor aos seguidores do seguido caso ele já não esteja lá
        if(repositorio.buscar(seguido).getSeguidores().contains(seguidor)){
            throw new SEException();
        }else{
            (repositorio.buscar(seguido).getSeguidores()).add(seguidor);
        }
        
        //Passa os tweets do seguido para a timeline do seguidor
        Vector<Tweet> t = new Vector<>();
        t = repositorio.buscar(seguido).getTimeline();
       
        for (Tweet tweet : t) {
            if(tweet.getUsuario().equals(seguido)){
                repositorio.buscar(seguidor).addTweet(tweet);
            }
        }
    }


    @Override
    public int numeroSeguidores(String usuario) {
        if(repositorio.buscar(usuario) == null){
            throw new PIException();
        }
        if(!(repositorio.buscar(usuario).isAtivo())){
            throw new PDException();
        }
        //Cria e retorna um vetor de seguidores no qual os seguidores de um usuário estejam ativos
        Vector<String> numero_seguidores = new Vector<String>();
        Vector<String> seguidores_aux = repositorio.buscar(usuario).getSeguidores();
        for (String seguidor : seguidores_aux){
            if(repositorio.buscar(seguidor)!= null && repositorio.buscar(seguidor).isAtivo()){
                numero_seguidores.add(seguidor);
            }
        }
        return numero_seguidores.size();
    }

    @Override
    public Vector<Perfil> seguidores(String usuario) {
        if(repositorio.buscar(usuario) == null){
            throw new PIException();
        }
        if(!(repositorio.buscar(usuario).isAtivo())){
            throw new PDException();
        }
        //Cria e retorna um vetor com os seguidores de determinado usuário no qual estão ativos
        Vector<Perfil> seguidores_perfil = new Vector<Perfil>();
        Vector<String> seguidores_aux = repositorio.buscar(usuario).getSeguidores();
        for (String seguidor : seguidores_aux){
            if(repositorio.buscar(seguidor)!= null && repositorio.buscar(seguidor).isAtivo()){
                seguidores_perfil.add(repositorio.buscar(seguidor));
            }
        }
        return seguidores_perfil;
    } 
    //Retorna o repositório para ser usado na interface gráfica
    public IRepositorioUsuario getRepositorio(){
        return this.repositorio;
    }
    
}
