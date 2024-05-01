package week1.day1;

public class SwitchCases {
	public static void main(String[] args) {
		char a = 'f';
		
		switch (a) {
		case 'c':
			System.out.println("Chrome browser");
			break;
		case 'f':
			System.out.println("Firefox browser");
			break;
		case 'e':
			System.out.println("Microsoft Edge browser");
			break;
		case 'i':
			System.out.println("Internet Explorer browser");
			break;

		default:
			System.out.println("Invalid browser");
			break;
		}
	}

}
