package Ch10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C01원시타입배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();
//		System.out.println("배열길이 : " + arr1.length);
//		System.out.println(arr1 instanceof Object);
//		System.out.println("---------------------");
//		for(int i=0; i<arr1.length; i++) {
//			System.out.println(arr1[i]+" ");
//		}
//		System.out.println();
//		System.out.println("---------------------");
//		for(int el : arr1) {
//			System.out.printf(el + " ");
//		}
//		System.out.println("\n---------------------");
//		Arrays.stream(arr1).forEach(el->System.out.printf(el + " "));
//		System.out.println("\n---------------------");
//		Arrays.stream(arr1).forEach(System.out::print);

		//배열에 입력된 값들 중 최소값 / 최대값을 출력해보세요

//		Arrays.sort(arr1);
//		System.out.println("최대값 " + arr1[4]);
//		System.out.println("최소값 " + arr1[0]);
		int max = arr1[0];
		int min = arr1[0];
		int sum = 0;
		for(int el :arr1) {
			if(el>max)
				max=el;
			if(el<min)
				min=el;
			sum+=el;
		}
		System.out.printf("max : %d min : %d avg : %f \n", max,min,(double)sum/arr1.length);
		
		System.out.println(Arrays.stream(arr1).max().getAsInt());
		System.out.println(Arrays.stream(arr1).min().getAsInt());
		
	}

}
