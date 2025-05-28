import java.util.ArrayList;
import java.util.Scanner;

class Usuarioo{
    String nombre;
    String contrasena;
    int logcontrasena;

    public Usuarioo(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
        logcontrasena = contrasena.length();
    }

    public String getNombre() {return nombre;}

    public String getContrasena() {return contrasena;}

    public int getLogcontrasena() {return logcontrasena;}

}

class Login {
    ArrayList<Usuarioo> usuarios;

    public Login(){usuarios = new ArrayList<>();}

    public void agregarUsuario(Usuarioo usuario){
        usuarios.add(usuario);
    }

    public void validarUsuario(Usuarioo usuario){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNombre().equals(usuario.nombre)){
                if (usuarios.get(i).getContrasena().equals(usuario.contrasena)){
                    System.out.println("El usuario es valido");
                }else{
                    System.out.println("El usuario no es valido");
                }
            }else{
                System.out.println("El usuario no es valido");
            }
        }
    }
    public void validadLongitudUsuario(int longitud){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getLogcontrasena() == longitud){
                System.out.println("La longitud de la contraseña es valida");
            }else{
                System.out.println("La longitud de la contraseña no es valida");
            }
        }
    }
}
public class EjercicioLogin {
    public static void main(String[] args) {
        Login login = new Login();
        login.agregarUsuario(new Usuarioo("Juan", "1234"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario y despues tu contraseña");
        String nombre = sc.nextLine();
        String contrasena = sc.nextLine();
        Usuarioo usuarioAVerificar = new Usuarioo(nombre, contrasena);
        int logcontrasenaAVerificar = usuarioAVerificar.getLogcontrasena();

        login.validarUsuario(usuarioAVerificar);
        login.validadLongitudUsuario(logcontrasenaAVerificar);


    }
}
