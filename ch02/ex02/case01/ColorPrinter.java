package ch02.ex02.case01;

public class ColorPrinter {
	
	private Yellow ink;
	
	
	public Yellow getInk() {
		return ink;
	}
	
	public void setInk(Yellow ink) {
		this.ink = ink;
	}
	
	@Override
	public String toString() {
		return "프린터의 색은 노랑색입니다.";
	}
	
}
