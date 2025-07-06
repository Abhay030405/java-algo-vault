// Given n friends, each one can remain single or can be paired up with some other friend. 
// Each friend can be paired only once. Find out the total number of ways in which friends 
// can remain single or can be paired up.

package Week1;

public class FreindsPairing {
     public static int findPairs(int n) {
         if(n<=2) {
             return n;
         }
         return findPairs(n-1) + (n-1)*findPairs(n-2);
     }  
     public static void main(String args[]) {
         System.out.println(findPairs(4));
     }
}
