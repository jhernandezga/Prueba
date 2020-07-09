import java.util.Scanner;

public class Ejercicio5 {
	public static String conversion(long minutos)
	{
		long tiempos[] = {0,0,0,0,0,0};
		String senal[] = {"milenio","siglo","década","año","día","minuto"};
		String cadenaRetorno ="";
		tiempos[5] = minutos;
		tiempos[4] = tiempos[5]/1440;
		if(tiempos[4]>=1)
		{
			tiempos[5] -=tiempos[4]*1440;
		}
		
		tiempos[3] = tiempos[4]/365;
		long bisiestos = tiempos[3]/4;
		tiempos[4] -= bisiestos;
		tiempos[3] = tiempos[4]/365;
		if(tiempos[3]%4!=0 && tiempos[3]>1)
		{
			tiempos[4]+=1;
		}
		tiempos[4] -= tiempos[3]*365;
		
		for(int i = 2; i>=0;i--)
		{
			tiempos[i] = tiempos[i+1]/10;
			if(tiempos[i] >=1 )
			{
				tiempos[i+1] -= tiempos[i]*10;
			}	
		}
		for(int i = 0; i<6;i++)
		{
			if(tiempos[i]>=1)
			{
				if(tiempos[i] == 1)
				{
					cadenaRetorno+=tiempos[i]+" "+senal[i]+" ";
				}
				else
				{
					cadenaRetorno+=tiempos[i]+" "+senal[i]+"s ";
				}
			}		
		}
		
		return cadenaRetorno;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		long h = input.nextLong();
		System.out.println(conversion(h));
  		}
}
