package sec06;

public class EX7 {

	public static void main(String[] args) {
		for (int a = 1; a <= 332; a++) {		//a+b+c=1000
			for (int b = a+1; b < 500; b++) {
				int c = 1000 - a - b;
				if (c < b)
					break;
				if (a*a + b*b == c*c) {
					System.out.println(a + ", " + b + ", " + c);
					System.exit(0);
				}
			}
		}

	}

}
