// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        int temp = N, count = 0;
        while (temp != 0)
        {
        
             // extract the last digit
            int d = temp % 10;
            temp /= 10;
             
            // check if d divide N completly
            if (d > 0 && N%d == 0)
              count++;
        }
        
        return count;
    }
}