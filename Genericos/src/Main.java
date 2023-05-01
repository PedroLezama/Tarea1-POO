import ico.fes.Caja;
import ico.fes.CajaSinGenericos;
import ico.fes.Comida;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> micaja = new Caja<>(new String[10]);
        micaja.add(0,"hola");
        micaja.add(1,"adios");
        micaja.add(2,"hi");
        System.out.println(micaja);
        String temp = micaja.get(0);
        System.out.println("---------------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"hola");
        cajaSin.add(1,"adios");
        cajaSin.add(2,"hi");
        System.out.println(cajaSin);
        String temp2 = (String)cajaSin.get(0);
        System.out.println("------COMIDA--------");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0,new Comida("Yogurth",false));
        System.out.println(cajaComida.get(0));

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Manzana",false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(5));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria",false));
        comidas2.add(new Comida("Yogurth",true));
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("Bistec",false));
        System.out.println(comidas2.get(3));
        comidas2.set(3,new Comida("Fresa",false));
        comidas2.add(3,new Comida("Naranja",false));
        System.out.println("----------FINAL----------");
        for (Comida comida: comidas2) {
            System.out.println(comida);
        }

    }
}