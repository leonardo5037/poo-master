import java.util.ArrayList;
import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) throws NoExisteUsuario {
        Login login = new Login();
        login.registrarme(new Usuario("Leonardo","1234"));

        Scanner entradaDatos = new Scanner(System.in);
        String miUsuario = entradaDatos.nextLine();
        String miPassword = entradaDatos.nextLine();

        try {
            login.verificaAcceso(miUsuario, miPassword);
            System.out.println("Acceco concedido");
        }catch(NoExisteUsuario e) {
            System.out.println("Acceso denegado " + e.getMessage());
        }
    }
}
class NoExisteUsuario extends Exception{
    public NoExisteUsuario(String mensaje) {
        super(mensaje);
    }
}

class Login {
    ArrayList<Usuario> listaUsuarios;

    public Login() {
        listaUsuarios = new ArrayList();
    }

    public void registrarme(Usuario user) {
        listaUsuarios.add(user);
    }

    public void verificaAcceso(String user, String pwd) throws NoExisteUsuario {
        for (Usuario usuario:listaUsuarios)
            if (usuario.getUsuario().equals(user) && usuario.getPassword().equals(pwd)) {
            return;
            }
        throw new NoExisteUsuario("Usuario no encontrado");
    }
}

class Usuario {

    private String Usuario;
    private String Password;

    public String getUsuario() {
        return Usuario;
    }
    public String getPassword() {
        return Password;
    }

    public Usuario(String user, String pwd) {
        this.Usuario = user;
        this.Password = pwd;
    }

}