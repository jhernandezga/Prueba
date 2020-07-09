import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution { 
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);   
	    int  mayor = 0, dias1 = 1, total = 0, cont = 0, index = 0;
	    String nombre = "";
	    int numeros = input.nextInt();   
	    String [][] frase1 = new String [numeros][3];
	    ArrayList<Integer> mayores =new ArrayList<Integer>();
	    
	    while(numeros>cont){
	        frase1 [cont][0] = input.next();
	        frase1 [cont][1] = input.next();
	        frase1 [cont][2] = input.next();
	        cont+=1;
	    }   
	    input.close();
	    
	    quicksort(frase1,0,frase1.length-1);
	    
	    mayor = Integer.parseInt(frase1[0][2]);
	    
	    int ultimoIndex = 0;
	    
	    ArrayList<Integer> mayoresTemp =new ArrayList<Integer>();
	  
	    int dias = Integer.parseInt(frase1[0][1]);
	    int iteraciones =contarDias(frase1);
	    for(int i = 0; i<iteraciones; i++) {
	    	
	    	int contadorDias = contarDiazPlazo(dias, ultimoIndex, frase1);
		    
		    if(contadorDias <dias) {
		    	 for(int k = ultimoIndex; k <(ultimoIndex+contadorDias);k++ ) {
		    		 mayoresTemp.add(Integer.parseInt(frase1[k][2]));
		    	 }
		    	
		    }else {
		    	for(int k = contadorDias-1; k>dias;k--) {
		    		 mayoresTemp.add(Integer.parseInt(frase1[k][2]));
		    	}
		    }
		    ultimoIndex = dias+contadorDias -1;
		    dias = Integer.parseInt(frase1[ultimoIndex][1]);
		    
		    mayores = comparador(mayoresTemp, mayores, dias);
		    mayoresTemp.clear();
		    
		
	    }
	    
	    int suma = 0;
	    for(int i = 0; i<mayores.size();i++) {
	    	suma += mayores.get(i);
	    	
	    }
	    System.out.println(suma);
	    
	    
	    /*for(int i = 1;i<frase1.length;i++) {
	    	if(Integer.parseInt(frase1[i][1]) == dias1) {
	    		if(Integer.parseInt(frase1[i][2]) > mayor ) {
	    			mayor = Integer.parseInt(frase1[i][2]);
	    			mayores.add(index, mayor);
	    		}
	    	}
	    	if(Integer.parseInt(frase1[i][1])>dias1) {
	    		dias1 = Integer.parseInt(frase1[i][1]);
	    		mayor = Integer.parseInt(frase1[i][2]);
	    		index++;
	    		mayores.add(index, mayor);
	    	}
	    }*/
	   
	    for(int i = 0; i<mayores.size();i++) {
	    	System.out.println(mayores.get(i));
	    }
	    

}
	
public static void quicksort(String[][] frase1, int izq, int der) {

		  int pivote=Integer.parseInt(frase1[izq][1]); 
		  String[] pivote2 = frase1[izq];// tomamos primer elemento como pivote
		  int i=izq;         // i realiza la búsqueda de izquierda a derecha
		  int j=der;         // j realiza la búsqueda de derecha a izquierda
		  String[] aux;
		 
		  while(i < j){                          // mientras no se crucen las búsquedas                                   
		     while(Integer.parseInt(frase1[i][1]) <= pivote && i < j) i++; // busca elemento mayor que pivote
		     while(Integer.parseInt(frase1[j][1]) > pivote) j--;           // busca elemento menor que pivote
		     if (i < j) {                        // si no se han cruzado                      
		         aux= frase1[i];                      // los intercambia
		         frase1[i]=frase1[j];
		         frase1[j]=aux;
		     }
		   }
		   
		   frase1[izq]=frase1[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
		   frase1[j]=pivote2;      // los menores a su izquierda y los mayores a su derecha
		   
		   if(izq < j-1)
		      quicksort(frase1,izq,j-1);          // ordenamos subarray izquierdo
		   if(j+1 < der)
		      quicksort(frase1,j+1,der);          // ordenamos subarray derecho
		   
		}

//acomoda comparando con el arraylist a
static ArrayList<Integer> comparador(ArrayList<Integer> a, ArrayList<Integer> b, int day) {
	
	Collections.sort(b);
	Collections.sort(a);
	int[] temp = new int[a.size()];
	if(b.isEmpty()) {
		b = (ArrayList<Integer>) a.clone();
	}
	else {
		for(int i = 0; i<a.size();i++) {
			temp[i] = b.get(i);
		}
		for(int k = 0; k<a.size();k++) {
			if(temp[k]<a.get(k) ) {
				if(day >=a.size()) {
					
					b.set(k, a.get(k));
				}
				else {
					b.add(a.get(k));
				
					
					
				}
				
			}
		}
		
	}
	return b;
	
	
		
}

static int contarDiazPlazo(int dia, int ultimoIndice , String[][] a) {
	
	int contador = 0;
	for(int i = ultimoIndice; i < a.length;i++) {
		if(Integer.parseInt(a[i][1]) == dia) {
			contador++;
		}
		else {
			break;
		}
	}
	return contador;
	
}

static int contarDias(String[][] a) {
	
	int contador = 1;
	int index = 0;
	int dia =Integer.parseInt(a[0][1]);
	
	for(int i = 0; i < a.length;i++) {
		
		if(Integer.parseInt(a[i][1]) == dia) {
		
		}
		else {
			dia =  Integer.parseInt(a[index][1]);
			contador++;
		}
	}
	return contador;
	
}
}
