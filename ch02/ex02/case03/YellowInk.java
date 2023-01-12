package ch02.ex02.case03;

public class YellowInk extends Ink{

	@Override
	public String toString() {
		return "노랑색 잉크 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("노랑색 잉크로 출력합니다.");
		
	}
}
