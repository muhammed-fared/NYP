public static void main(String[] args) {
        
//       
        
       System.out.println(MyUtils2.ucgenCevre(15,5,4));
	System.out.println(MyUtils2.ucgenAlan(6,10,4));
        System.out.println(MyUtils2.cokgenCevre(5, 4, 5, 4));
        System.out.println(MyUtils2.cokgenAlan(7, 5));
	double[] arr = new double[500];
        int j = 0;
	 for(int i = -100; i <= 100; i++)
        {
            arr[j] = i;
            j++;
            
        }
         double [] sonuc = MyUtils2.yap(arr);
          for(int i = 0; i < sonuc.length; i++)
        {
            System.out.println(sonuc[i]);
            
        }
        
    }
