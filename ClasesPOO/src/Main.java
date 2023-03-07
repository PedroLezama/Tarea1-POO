import java.awt.*;

public class Main {
    public static void main(String[] args) {

    Automovil auto = new Automovil("Toyota","Corolla",(byte)20, Color.ORANGE);
        System.out.println(auto);


    Persona perso = new Persona(20,1.72F,"Pedro","Masculino",60.5F);
        System.out.println(perso);

    Monitor mon = new Monitor(20,"LG","GAMING X27",1024);
        System.out.println(mon);

    Telefono tel = new Telefono(6.4F,1570,"Iphone","Iphone 12");
        System.out.println(tel);
    }


}