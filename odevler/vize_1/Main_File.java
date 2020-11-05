public static void main(String[] args) {
        
//       
        
       System.out.println(MyUtils.ucgenCevre(15,5,4));
	System.out.println(MyUtils.ucgenAlan(6,10,4));
        System.out.println(MyUtils.cokgenCevre(5, 4, 5, 4));
        System.out.println(MyUtils.cokgenAlan(7, 5));
	double[] arr = new double[500];
        int j = 0;
	 for(int i = -100; i <= 100; i++)
        {
            arr[j] = i;
            j++;
            
        }
         double [] sonuc = MyUtils.yap(arr);
          for(int i = 0; i < sonuc.length; i++)
        {
            System.out.println(sonuc[i]);
            
        }
        
    }
