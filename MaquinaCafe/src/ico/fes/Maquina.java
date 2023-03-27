package ico.fes;

public class Maquina {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;
    public Maquina() {
    }

    public Maquina(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void Americano(){
        getAgua();
        getCafe();
        getCrema();
        getVasos();
        if(agua>=180&&cafe>=15&&vasos>=1){
        setAgua(agua-180);
        setCafe(cafe-15);
        setVasos(vasos-1);
        System.out.println("Americano servido");
            if(agua>180&&cafe>15&&vasos>0){
                System.out.println("Todavia hay ingredientes disponibles para un Americano");}
        Mostrar();}
        else{
            System.out.println("No hay suficientes ingredientes");
        }
    }
    public void Expreso(){
        getAgua();
        getCafe();
        getCrema();
        getVasos();
        if(agua>=120&&cafe>=20&&vasos>=1){
        setAgua(agua-120);
        setCafe(cafe-20);
        setVasos(vasos-1);
        System.out.println("Expreso servido");
            if(agua>120&&cafe>20&&vasos>0){
                System.out.println("Todavia hay ingredientes disponibles para un Expreso");}
        Mostrar();}
        else{
            System.out.println("No hay suficientes ingredientes");
        }
    }
    public void Capuchino(){
        getAgua();
        getCafe();
        getCrema();
        getVasos();
        if(agua>=100&&cafe>=14&&crema>=70&&vasos>=1){
        setAgua(agua-100);
        setCafe(cafe-14);
        setCrema(crema-70);
        setVasos(vasos-1);
        System.out.println("Capuchino servido");
            if(agua>100&&cafe>14&&vasos>0){
                System.out.println("Todavia hay ingredientes disponibles para un Capuchino");}
        Mostrar();}
        else{
            System.out.println("No hay suficientes ingredientes");
        }
    }
    public void Mostrar(){
        System.out.print("| Agua restante: " +agua);
        System.out.print(" | Cafe restante: "+cafe);
        System.out.print(" | Crema restante: "+crema);
        System.out.print(" | Vasos restantes: "+vasos);
        System.out.println();
    }
}
