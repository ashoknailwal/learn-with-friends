import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {

    static long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    
    static long gcdArray(long[] a){
        int i;
        long gcdValue = a[0];
        for(i=1; i<a.length; i++){
            gcdValue = gcd(gcdValue, a[i]);
        }
        return gcdValue;
    }
    
    static long lcm(long a, long b){
        return (a*b)/gcd(a,b);
    }
    static long lcmArray(long[] a){
        long gcdValue;
        long lcmVal = a[0];
        for(int i=1; i<a.length; i++){
            lcmVal = lcm(lcmVal, a[i]);
        }
        return lcmVal;
    }
    
    static long getTotalX(long[] a, long[] b) {
        long count=0;
        long gcdVal, lcmVal, i;
        gcdVal = gcdArray(b);
        lcmVal = lcmArray(a);
        i = lcmVal;
        while(gcdVal >= i){
            if(gcdVal%i == 0)
                count++;
            i+=lcmVal;
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        long[] a = new long[n];
        String[] aArr = br.readLine().split("\\s");
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = Long.parseLong(aArr[a_i]);
        }
        long[] b = new long[m];
        String[] bArr = br.readLine().split("\\s");
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = Long.parseLong(bArr[b_i]);
        }
        long total = getTotalX(a, b);
        System.out.println(total);
        //in.close();
    }
}
