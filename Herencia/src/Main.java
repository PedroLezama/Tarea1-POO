import ico.fes.Automovil;
import ico.fes.Taxi;
import ico.fes.Vehiculo;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Moto", Color.red, 19999.99);
        System.out.println(vehiculo1);
        vehiculo1.encender();
        vehiculo1.frenar();


        Automovil auto1 = new Automovil("Coche", Color.gray, 1349900.99, "Nissan", "Nissan Z", 2);
        System.out.println(auto1);
        auto1.abrirPuerta();
        auto1.avanzar();
        auto1.encender();
        auto1.frenar();


        Taxi taxi1 = new Taxi("Automovil", Color.pink, 200000.0,
                "Chevrolet", "Chevrolet Aveo", 5,
                "Taxi normal", true, 10045719);
        System.out.println(taxi1);
        taxi1.abrirPuerta();
        taxi1.encender();
        taxi1.avanzar();
        taxi1.frenar();
        taxi1.empezarTaximetro();
        taxi1.tarifaFinal();

    }
}