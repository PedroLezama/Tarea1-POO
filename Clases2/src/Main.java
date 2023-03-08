import ico.fes.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Balon balon1 = new Balon("Basquetbol","WILSON",351.12F);
        System.out.println(balon1);
        balon1.bota();
        balon1.ponchada();

        Computadora compu1 = new Computadora("Laptop",8,"intel CORE i3");
        System.out.println(compu1);
        compu1.encender();
        compu1.actualizar();

        CuboRubik cubo1 = new CuboRubik("3x3x3","Rubiks",339.00F);
        System.out.println(cubo1);
        cubo1.rotar();
        cubo1.resuelto();

        Gato gato1 = new Gato(Color.ORANGE,"Bobtail Japones","Pepe",2,"Masculino");
        System.out.println(gato1);
        gato1.maullar();
        gato1.ronronear();

        Giroscopio giro1 = new Giroscopio("Lase",70,"Joytech");
        System.out.println(giro1);
        giro1.girar();
        giro1.horizonte();

        Lampara lamp1 = new Lampara("De mesa","Ghome Smart",434.37F,true);
        System.out.println(lamp1);
        lamp1.prender();
        lamp1.fundido();

        Libro libro1 = new Libro("Hernan Melville","Moby Dick",1851,155);
        System.out.println(libro1);
        libro1.empezar();
        libro1.finalizar();

        Pais pais1 = new Pais("México",126014024,"America del Norte");
        System.out.println(pais1);
        pais1.pasaporte();
        pais1.saludo();
    }
}