import java.util.Scanner;

public class Ejercicio2 {
	public static String conversion(long minutos)
	{
		long conversor[] = {525600000,52560000,5256000,525600,1440,1};
		String senal[] = {"milenio","siglo","década","año","día","minuto"};
		String cadenaRetorno ="";
		
		long temporal;
		long min = minutos;
		long dias = min/1440;
		if(dias>=1)
		{
			min -=dias*1440;
		}
		
		long años = dias/365;
		long bisiestos = años/4;
		dias -= bisiestos;
		años = dias/365;
		if(años%4!=0 && años>1)
		{
			dias+=1;
		}
		dias -= años*365;
		long decadas = años/10;
		if(decadas >=1 )
		{
			años -= decadas*10;
		}
		long siglos = años/36500;
		if(siglos >=1)
		{
			decadas-=siglos*10;
		}
		long milenios= dias/3650000;
		if(milenios >=1)
		{
			siglos-=milenios*10;
		}
		int indiceConversorMayor=0;
		
		cadenaRetorno = milenios+" milenios "+siglos+" siglos "+decadas+" decadas "+años+" años "+dias+" dias "+min+" minutos";
		
		return cadenaRetorno;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		long h = input.nextLong();
		System.out.println(conversion(h));
  		}


}
