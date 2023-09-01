package countFlowers;

public class soluzione {
	
	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        
	        int size = flowerbed.length;

	        int[] flowerbed2 = new int[size+2];

	        flowerbed2[0] = 0;
	        flowerbed2[size + 1] = 0;

	        for(int j = 1; j <= size; j++)
	            flowerbed2[j] = flowerbed[j - 1];        
	                

	        for(int i = 1; i <= size;i++)
	            if(flowerbed2[i-1] == 0 && flowerbed2[i+1] == 0 &&flowerbed2[i] == 0){
	                flowerbed2[i] = 1;
	                n--;
	            }
	            return n<=0;
	    }
	}

