
package mytwitter;
import exceptions.*;
import java.util.Vector;

public class RepositorioUsuario implements IRepositorioUsuario {
    
    private Vector<Perfil> repositorio = new Vector<Perfil>();
    
    //Cadastra o usuário no repositório caso ele não exista
    @Override
    public void cadastrar(Perfil usuario) {
        Perfil resultado = this.buscar(usuario.getUsuario());
        if(resultado != null){
            throw new UJCException();
        }else{
            repositorio.add(usuario);
        }
        
    }
    //Busca determinado perfil de um usuário passado como parâmetro
    @Override
    public Perfil buscar(String usuario) {
         for(Perfil novoPerfil : repositorio){
            if(novoPerfil.getUsuario().equals(usuario)){
                return novoPerfil;
            }
        }
        return null;
    }
    //Atualiza determinado usuário com base no parâmetro passado
    @Override
    public void atualizar(Perfil usuario) {
     for (int cont = 0; cont < this.repositorio.size(); cont++){
            if(repositorio.get(cont).getUsuario().equals(usuario.getUsuario())){
                repositorio.set(cont,usuario);
            }
            if(buscar(usuario.getUsuario()) == null){
                throw new UNCException();
            }
        }
    }
        
}
