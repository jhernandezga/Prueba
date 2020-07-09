import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio6 {
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
	public static long[] ordenamientoBurbuja(long[] arreglo)
    {
      long auxiliar;
      long[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
	public static void main(String[] args) 
	{
		ArrayList<Long> entradas = new ArrayList();
		Scanner input = new Scanner(System.in);
		long entrada;
		long mayor = 0;
		long menor;
		do{
			entrada = input.nextLong();
			entradas.add(entrada);
			
		}while(entrada!=0);
		
		if(entradas.get(0)!=0)
		{
			long array[] = new long[entradas.size()];
			for(int i = 0; i<entradas.size();i++)
			{
				array[i] = entradas.get(i);
			}
			array = ordenamientoBurbuja(array);
			mayor = array[0];
			menor = array[array.length-2];
			System.out.println("Los tiempos son");
			for(long c: array)
			{
				if(c!=0)
				{
					System.out.println(conversion(c));
					
				}
			}
			System.out.println("El mayor es "+conversion(mayor));
			System.out.println("El menor es "+conversion(menor));
			
		}
		else
		{
			System.out.println("No hay tiempos para reportar");
		}
	
			
		}
}
