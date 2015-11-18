import java.util.*;
import java.io.*;
import java.lang.Object;
import java.io.BufferedReader;

public class Archivo{
	
	public static void main(String []args) throws FileNotFoundException, IOException{
			String cadena="cadenaguardada";
			String cadenabuscar=System.getProperty("CADENA");
			String file=System.getProperty("FILE");
			int contador=0;
			
			FileReader cargamosarchivo= new FileReader(file);

			BufferedReader b= new BufferedReader(cargamosarchivo);


			while((cadena=b.readLine())!=null){
				
				if(cadena.contains(cadenabuscar)==true){
					/* */
					int index = -1;

					while(true){
						index= cadena.indexOf(cadenabuscar, index+1);
						if(index>=0){
							contador++;
						}else{
							break;
						}
					}				
				}
			}
			
			System.out.println("El numero de veces que encontramos la cadena: " +cadenabuscar+"\n"+
			"es de :"+contador );
	}
	
}