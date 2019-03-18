package exercise;

public class Ex08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		int max = array[0][0];
		int min = array[0][0];
		double var = array[0][0];

		for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
                count++;
            }
        }
        avg=(double)sum/count;
        
        for(int i=0; i<array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				if(array[i][k] > max)
					max = array[i][k];
			}
		}
        
        for(int i=0; i<array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				if(array[i][k] < min)
					min = array[i][k];
			}
		}
        
        for (int i=0; i<array.length; ++i) {
        	for (int k = 0; k < array[i].length; k++) {
        		var += (array[i][k] - avg) * (array[i][k] - avg);
        	}
        }
        var /= count;
		
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
        System.out.println("max : " + max);
        System.out.println("min : " + min);
        System.out.println("var : " + var);
        
	}

}
