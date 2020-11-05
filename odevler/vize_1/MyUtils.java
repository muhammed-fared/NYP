package javaapplication5;

import java.util.Random;
import java.math.*;

class MyUtils{
   
    public static float ucgenCevre(float a,float b,float c){
         return a+b+c;
     }
    
     public static float ucgenAlan(float a,float b,float c){
         float s = (a + b +c )/ 2;
         float sonuc = (float)Math.sqrt(s*(s - a)(s - b)(s - c));
         return sonuc;
     }
       public static float cokgenCevre(float a, float b, float c, float d)
    {
        return a + b + c + d;
    }
     public static float cokgenCevre(float a, float b, float c, float d, float e, float f)
    {
        return a + b + c + d + f;
    }
    
    public static float cokgenAlan(float uzunluk, int sayi)
    {
       float alan = sayi * (uzunluk*uzunluk) / 4 * (float)Math.tan(Math.PI / sayi);
       
       return alan;
    }
     private static  int Random_NextInt(int min,int max){
        Random rnd=new Random();
        return rnd.nextInt((max-min)+1)-min;
    }
     
    public static  double[] yap(double[] arr){
        
        
        double [] sonuc = new double[arr.length];
         int index = 0;
        for (int i = 0;i< 201; i++){
            sonuc[index] = f1(arr[i]);
            index += 2;
          
        }
 
        index = 1;
        for (int i = 1; i< 201; i++){
         
            sonuc[index] = f2(arr[i]);
            index += 2;
            
            
        }
        
        
        return sonuc;
    }
    private static double f1(double x){
        
        return 3*x*x - 2 * Math.exp(x) + Math.sqrt(x);
    }
    
    private static double f2(double x){
        
        return 1 / (1+ Math.exp(x));
    }
    
    
}
