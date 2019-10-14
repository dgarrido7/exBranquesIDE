import java.util.ArrayList;
import java.util.Random;

public class MainLlista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> Valors= new ArrayList<Integer>();
		double num=7;
		boolean sortit=false;
         
		for(int i=0; i<700000;i++) {
			double hola=Math.random()*(50-1)+1;
			Valors.add((int)hola);
		}
		
		  long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
		  TInicio = System.currentTimeMillis();
			
		  for(int z=0;z<Valors.size();z++) {
			  System.out.println(Valors.get(z));
					if(num==Valors.get(z) && Valors.get(z)%2==0) {
						System.out.println(Valors.get(z));
						sortit=true;
					}
		}
		  
		if(sortit){
			System.out.println("Aquest valor ha aparegut");
		}
		else {
			System.out.println("No es repeteix");
		}
		 
		  
		  TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		  tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
		 } 
	}