package ch02.ex02.case01;

public class ColorPrinter02 {

	private Pink ink;
	
	
	public Pink getInk() {
		return ink;
	}
	
	public void setInk(Pink ink) {
		this.ink = ink;
	}
	
	@Override
	public String toString() {
		return "프린터의 색은 핑크색입니다.";
	}
}
