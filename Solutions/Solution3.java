import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {	 
	 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max;
		long sum;
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String[] p = br.readLine().split("\\s");
		    int n = Integer.parseInt(p[0]);
		    long k = Long.parseLong(p[1]);
		    long[] a = new long[n];
		    long[] b = new long[n];
		    max=0;
		    sum = 0;
		    String[] q = br.readLine().split("\\s");
		    String[] r = br.readLine().split("\\s");
		    for(int i=0; i<n; i++){
		        a[i] = Long.parseLong(q[i]);
		        b[i] = Long.parseLong(r[i]);
		        if(Math.abs(b[i])>Math.abs(b[max]))
		            max = i;
		        sum+=(a[i]*b[i]);
		    }
		    //sum+=(k*b[max]);
		    if(b[max]<0)
		        sum-=(k*b[max]);
		    else
		        sum+=(k*b[max]);
		    System.out.println(sum);
		    
 		}
	}
 
} 
