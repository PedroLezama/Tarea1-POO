import ico.fes.LeerArchivo;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeerArchivo lectura = new LeerArchivo();
        try {
            lectura.metodoUno("datos2.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}