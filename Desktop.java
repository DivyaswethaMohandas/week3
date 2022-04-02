package week3.day1;

public class Desktop extends Computer {
public void desktopSize() {
	System.out.println("DesktopSize is 18 inch");
}
	public static void main(String[] args) {
		Desktop obj1 = new Desktop();
		obj1.computerModel();
		obj1.desktopSize();
	}

}
