import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,m,i,j,temp;
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("\\s");
        m = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        int prev = Integer.parseInt(s[0]);
        a[0] = prev;
        for(i=1, j=1; i<n; i++){
            temp = Integer.parseInt(s[i]);
            if(prev == temp)
                continue;
            a[j] = temp;
            prev = temp;
            j++;
        }
        j--;
        String[] b = br.readLine().split("\\s");
        for(i=0; i<m; i++){
            temp = Integer.parseInt(b[i]);
            while(j>=0 && a[j]<=temp)
                j--;
            //if(j>=0 && a[j] == temp)
            System.out.println(j+2);
        }
        
        
        
    }
}
