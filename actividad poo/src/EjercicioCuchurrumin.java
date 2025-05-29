import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;

abstract class Cacatorra {
    kint ki;
    kstr ks;
    kdouble kd;

    public kint getKi() {return ki;}
    public void setKi(kint ki) {this.ki = ki;}

    public kstr getKs() {return ks;}
    public void setKs(kstr ks) {this.ks = ks;}

    public kdouble getKd() {return kd;}
    public void setKd(kdouble kd) {this.kd = kd;}

    public Cacatorra(kint ki, kstr ks, kdouble kd) {
        this.ki = ki;
        this.ks = ks;
        this.kd = kd;
    }
}

class kdouble {
    double kd;      public kdouble(double kd) {this.kd = kd;}
}
class kstr{
    String ks;     public kstr(String ks) {this.ks = ks;}
}
class kint {
    int ki;        public kint(int ki) {this.ki = ki;}
}

class Cuchurrumin extends Cacatorra {
    String nombre;
    String apellido;

    public Cuchurrumin(String nombre, kint ki, kstr ks, kdouble kd) {
       super (ki, ks, kd);
       this.nombre = nombre;
    }
    public Cuchurrumin(kint ki, kstr ks, kdouble kd, String nombre, String apellido) {
        super(ki, ks, kd);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String toString() {return nombre + " " + apellido + " " + super.getKs() + " " + super.getKd()  + " " + super.getKs();}
}


public class EjercicioCuchurrumin {
    public static void main(String[] args) {
        ArrayList<Cuchurrumin> listado = new ArrayList<>();
        Cuchurrumin c1 = new Cuchurrumin("Pepito", new kint(1), new kstr("miano"), new kdouble(1.2));
        Cuchurrumin c2 = new Cuchurrumin(new kint(12), new kstr("Hola"), new kdouble(100.34), "marco", "barradas");
        Cuchurrumin c3 = new Cuchurrumin("Santiago", new kint(876543), new kstr("Guatemala"), new kdouble(1035.2132310));

        listado.add(c1);
        listado.add(c2);
        listado.add(c3);

        for (int i = 0; i < 3; i++) {
            System.out.println(listado.get(i));
        }

    }
}
