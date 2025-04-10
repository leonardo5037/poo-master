import java.io.*;

//entre el archivo y el programa hay un stream/flujo
//un input, significa que viene de afuera hacia el programa, dentro se mueven bytes.
//el input es de donde te vas a servir

//un output, significa que la salida es del programa y va a almacenarse al archivo, sigue siendo un stream

public class DemoArchivosTexto {
    public static void main(String[] args) throws Exception {
        File arch = new File("./src/miArchivo.txt");
        FileReader fr = new FileReader(arch);
        FileWriter fw = new FileWriter("./src/copia.txt");

        int c;
        while((c = fr.read())!=-1){
            System.out.print((char)c);
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
