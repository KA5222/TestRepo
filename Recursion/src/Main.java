
public class Main {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(result(n));

	}

	public static int result(int n) {
		
		if (n == 1)

			return 2;

		else
			return 2 * result(n - 1);
		
	}
}
