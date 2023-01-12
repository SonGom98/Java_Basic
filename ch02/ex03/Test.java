package ch02.ex03;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		MyArrayList<String> mList = new MyArrayList<>();
		mList.add("강남");
		mList.add("싸이");
		mList.insert(1, "삽입1");
//		mList.clear();
		mList.remove(5);
		mList.remove("강남");
		mList.add("연예인");
		mList.add("챔피언");
		for (int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i));
		}
		System.out.println(mList.isEmpty());
		System.out.println(mList.indexOf("챔피언"));
		System.out.println(mList.contains("연예"));
	}
}
