package ch02.ex02.case02;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//사용할 타입을 <>(다이아몬드 연산자)에 지정
		
		GenericPrinter<Yellow> yPrinter = new GenericPrinter<>();
		yPrinter.setInk(new Yellow());
		
		Yellow y = yPrinter.getInk();
		System.out.println(y);
		
		GenericPrinter<Pink> pPrinter = new GenericPrinter<>();
		pPrinter.setInk(new Pink());
		
		Pink p = pPrinter.getInk();
		System.out.println(p);
		
		GenericPrinter printer = new GenericPrinter<>(); // <> 안에 아무 타입도 안 넣어주면 Object 타입이 들어감
		printer.setInk(new Pink());
		
		Pink pObj = (Pink) printer.getInk();
		System.out.println(pObj);
	}
}
