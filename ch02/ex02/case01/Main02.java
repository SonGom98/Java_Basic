package ch02.ex02.case01;

public class Main02 {
	public static void main(String[] args) {
		
		Yellow yInk = new Yellow();
		Pink pInk = new Pink();
		ColorPrinter03 cp3 = new ColorPrinter03();
		
		cp3.setInk(yInk);
		System.out.println(cp3);
		cp3.setInk(pInk);
		
		Pink p = (Pink) cp3.getInk();
		
		System.out.println(cp3);
	}
}
