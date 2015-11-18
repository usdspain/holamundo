package curso.holamundo;
import org.joda.time.*;
import java.util.Scanner;
public class Holamundo{


DataTime ahora= new DataTime();
DataTime ayer= ahora.plusDays(-1);

	
	/*public static void main(String[] args){
	
		System.out.println("Hola mundo");
		System.out.println("Vicent");
		int l= args.length;
		if(1>=1){


			String nombre= args[0];
			System.out.println(nombre);
		}else {
			System.out.println("Anónimo");
		}
	
	}*/
	public static void main(String[] args) {
		String path= System.getProperty("PATH");
		String nombre = System.getProperty("NOMBRE");
		System.out.println("Path="+ path);
		System.out.println("Nombre="+nombre);
		System.out.println(System.nanoTime());
		System.setProperty("Nombre","Carlos");
		long in=System.currentTimeMillis();
	
		Date d = new Date(in*1000);
		System.out.println(d);

		Scanner entrada=new Scanner(System.in);
		System.out.print("Dame un texto");

		String variableString =entrada.next();

		System.out.println("Texto integrado: "+ variableString);

		int n=0;
		System.out.println(n);
		int v[];
		 v= new int [3];
		System.out.println(v[1]);
		
	}
}