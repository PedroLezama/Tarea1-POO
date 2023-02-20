public class Tarea1{

	public static void main (String[] args){
	//length
	String longitud = "POO";
	int x = longitud.length();
	System.out.println(x);

	//isEmpty
	String vacia = "";
	boolean b1 = vacia.isEmpty();
	System.out.println(b1);
	String llena = "Hola";
	boolean b2 = llena.isEmpty();
	System.out.println(b2);

	//equals
	String llena2 = "Hola";
	if(vacia.equals(llena)){
		System.out.println("Si son iguales");
	}
	else{
		System.out.println("No son iguales");
	}

	//indexOf y lastIndexOf
	String prueba = "Hola mundo :)";
	int p1 = prueba.indexOf('o');
	System.out.println(p1);
	int p2 = prueba.lastIndexOf('o');
	System.out.println(p2);

	//upperCase y toLowerCase
	String upperLower = "Mayusculas y minusculas";
	String mayus = upperLower.toUpperCase();
	System.out.println(mayus);
	String min = upperLower.toLowerCase();
	System.out.println(min);

	//subString
	String sub = "Tarea uno POO";
	String sub1 = sub.substring(0,5);
	System.out.println(sub1);
	String sub2 = sub.substring(5,9);
	System.out.println(sub2);	
	String sub3 = sub.substring(9);
	System.out.println(sub3);

	//Integer parseInt y toString
	String cad1 = "2772";
	int i = Integer.parseInt(cad1);
	System.out.println("Numero: "+ i);
	String cad2 = Integer.toString(i);
	System.out.println("Cadena: "+ cad2);

	//StringBuilder
	StringBuilder sb = new StringBuilder();
	sb.append("Hola ");
	sb.append("mundo");
	System.out.println(sb);
}
}
