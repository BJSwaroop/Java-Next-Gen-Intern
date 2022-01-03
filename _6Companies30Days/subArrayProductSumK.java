package _6Companies30Days;

// sliding window logic: https://youtu.be/SxtxCSfSGlo
public class subArrayProductSumK {
    
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
     int res =0,s=0,e=0; 
     long p =1;
     for(e=0;e<a.length;e++){
         p = p* a[e];
         while(s < e && p>=k){
             p /= a[s];
             s = s+1;
         }
         res = res + e- s+1;
     }
     return res;
    }
}
