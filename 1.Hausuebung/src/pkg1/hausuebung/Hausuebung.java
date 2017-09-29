/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.hausuebung;

import java.util.LinkedList;

/**
 *
 * @author Doris Lehner
 */
public class Hausuebung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = gcdEucledian(1989,867);
        int result2 = gcdPrimeFactor(1989,867);
        System.out.println(result);
        System.out.println(result2);
    }
    
    public static int gcdEucledian(int a, int b){
       if (b==0){
           return a;
       }
       return gcdEucledian(b,a%b);
    }
    public static int gcdPrimeFactor(int a, int b){
       /* LinkedList<Integer> linkedListA = new LinkedList<>();
        LinkedList<Integer> linkedListB = new LinkedList<>();
        int resultA = a;
        int resultB = b;
        for(int i = 0; resultA != 1; i++)
        {
           if(isPrime(i)) 
           {
               if(resultA % i == 0)
               {
                   resultA /= i;
                   linkedListA.add(resultA);
               }
           }
        }
        for(int i = 0; resultB != 1; i++)
        {
            if(isPrime(i))
            {
                if(resultB % i == 0)
                {
                    resultB /= i;
                    linkedListB.add(resultB);
                }
            }
        }  
        return 0;*/
        int h = (a > b) ? b : a;
        for (int i = h; i > 1; i--) {
            if ((a % i) == 0 && (b % i) == 0) {
                return i;
            }
        }
        return 1;

    }
     
    
    static boolean isPrime(int i)
    {
        if(i <= 1)
        {
            return false;
        }
           
        for(int j = 2; j <= Math.sqrt(i)+1 ;j++ )
        {
            if(i % j == 0)
            {
                return false;
            }
        }
        return true;
        
    }
    
     
    
}
