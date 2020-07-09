import java.util.Scanner;
public class Ejercicio {
	public static String conversion(long pMinutos)
	{
		long conversor[] = {525600000,52560000,5256000,525600,1440,1};
		String senal[] = {"milenio","siglo","década","año","día","minuto"};
		String cadenaRetorno ="";
	
		long minutos = pMinutos;
		long dias = minutos/1440;
		long bisiestos = dias/1461;
		minutos += minutos%1440;
		minutos -= dias*1440;
		long años = dias/365;
		dias +=dias%365;
		dias -= (365*años+bisiestos);
		
		/*long decadas = años/10;
		años+= años%10;
		años -= decadas*10;
		
		long siglos = decadas/10;
		decadas+= decadas%10;
		decadas -= siglos*10;
		
		long milenios = siglos/10;
		siglos+= siglos%10;
		siglos -= milenios*10;*/
	
		
		cadenaRetorno = años+" años "+dias+" dias "+minutos+" minutos";
		
		return cadenaRetorno;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		long h = input.nextLong();
		System.out.println(conversion(h));
  		}

}
