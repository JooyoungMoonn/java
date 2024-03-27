package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Practice_0319_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		
//		int h = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int minute = 60*h+m-45;
//		
//		h = minute / 60;
//		m = minute % 60;
//		
//		System.out.println(h + " " + m);
//		
		
//		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
//		pitches.add("162");
//		System.out.println(pitches);
//		
////		System.out.println(pitches[2]);
//		
//		String result = String.join(", ", pitches);
//		System.out.println(result);
//		
//		
//		pitches.sort(Comparator.naturalOrder());
//		System.out.println(pitches);
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		map.put("people", "인간");
		System.out.println(map.get("people"));
		System.out.println(map.keySet());
		
		
	}

}
