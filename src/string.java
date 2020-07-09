import java.util.Scanner;


public class string {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i = 0; i<=s.length()-k;i++)
        {
        	if(s.substring(i, i+k).compareTo(largest)>0)
        	{
        		largest = s.substring(i, i+k);
        	}
        	else if(s.substring(i, i+k).compareTo(smallest)<0)
        	{
        		smallest = s.substring(i, i+k);
        	}	
        }
        
        
        return smallest + "\n" + largest;
    }
	public static String recursiva(String s, int k,String anteM, String anteS)
	{
		if(s.length() < k)
		{
			return anteM+"\n"+anteS;
		}
		else if(s.substring(0, k).compareTo(anteS)>0)
		{
			return recursiva(s.substring(1),k,anteM, s.substring(0, k));
			
		}
		else if(s.substring(0, k).compareTo(anteM)<0)
		{
			return recursiva(s.substring(1),k,s.substring(0,k), anteS);
		}
		else
		{
			return recursiva(s.substring(1),k,anteM, anteS);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		long startTime = System.nanoTime();
		//System.out.println(recursiva(s,k,s.substring(0,k),s.substring(0,k)));
		System.out.println(getSmallestAndLargest(s,k));
		long endTime = System.nanoTime() - startTime;
		System.out.println(endTime);

	}

}
