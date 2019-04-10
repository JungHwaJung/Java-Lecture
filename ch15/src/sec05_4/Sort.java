package sec05_4;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		String strArray[] = { "김", "이", "박", "한", "정" };
		bubbleSort(strArray);
		//Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
	}
	
	static void bubbleSort(String strArray[]) {
		int len = strArray.length;
		for(int i=0; i<len-1; i++) {
			for(int k=i+1; k<len; k++) {
				// strArray[i] 와 strArray[k] 를 비교하여 조건에 맞으면 swap
				if(strArray[i].compareTo(strArray[k]) > 0) {
					String strArrays = strArray[i];
					strArray[i] = strArray[k];
					strArray[k] = strArrays;
				}
			}
		}
	}
}
