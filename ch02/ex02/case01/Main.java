package ch02.ex02.case01;

public class Main {
	public static void main(String[] args) {
		 Yellow yInk = new Yellow();
		 ColorPrinter cp = new ColorPrinter();
		 
		 cp.setInk(yInk);
		 System.out.println(cp);
		 
		 Pink pInk = new Pink();
		 ColorPrinter02 cp2 = new ColorPrinter02();
		 cp2.setInk(pInk);
		 System.out.println(cp2);
		 
		 
	}
}
