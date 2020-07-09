import java.util.Scanner;

public class Ejercicio2 {
	public static String conversion(long minutos)
	{
		long conversor[] = {525600000,52560000,5256000,525600,1440,1};
		String senal[] = {"milenio","siglo","d�cada","a�o","d�a","minuto"};
		String cadenaRetorno ="";
		
		long temporal;
		long min = minutos;
		long dias = min/1440;
		if(dias>=1)
		{
			min -=dias*1440;
		}
		
		long a�os = dias/365;
		long bisiestos = a�os/4;
		dias -= bisiestos;
		a�os = dias/365;
		if(a�os%4!=0 && a�os>1)
		{
			dias+=1;
		}
		dias -= a�os*365;
		long decadas = a�os/10;
		if(decadas >=1 )
		{
			a�os -= decadas*10;
		}
		long siglos = a�os/36500;
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
		
		cadenaRetorno = milenios+" milenios "+siglos+" siglos "+decadas+" decadas "+a�os+" a�os "+dias+" dias "+min+" minutos";
		
		return cadenaRetorno;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		long h = input.nextLong();
		System.out.println(conversion(h));
  		}


}
