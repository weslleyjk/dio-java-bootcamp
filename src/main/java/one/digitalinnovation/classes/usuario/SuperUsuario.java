package one.digitalinnovation.classes.usuario;

public class SuperUsuario {

     private String login;
     private String senha;
     String name; // consigo acessar o name porque é aberto. o default no caso

     public SuperUsuario(final String login, final String senha){
         this.login = login;
         this.senha = senha;
     }

     public String getLogin(){
         return login;
     }
     public String getSenha(){
         return senha;
     }

}
