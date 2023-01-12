package ch02.ex03;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("하이");
		list.add("곤니찌와");
		list.add(0, "23");
		list.remove(0);
		list.clear();
		list.add("하이");
		list.add("곤니찌와");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.isEmpty());
		System.out.println(list.indexOf("하이"));
		System.out.println(list.contains("곤니찌와"));
	}
}
