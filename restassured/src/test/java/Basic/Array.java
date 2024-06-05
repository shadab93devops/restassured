package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		
		int[] arr= {3,7,99,10,89,100,103,1000,889};
		
//		swap(arr,0,3);
//		
//		System.out.println(Arrays.toString(arr));
	
		maxvalue(arr,1,7);
	}
	
	
	static void maxvalue(int[] arr,int start ,int end) {
		int max=arr[start];
		
		for(int i=start;i<end;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}




}
