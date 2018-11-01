import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int registerNumber = 0;
		int comandNumber = 0;

		Scanner in = new Scanner(System.in);
		registerNumber = in.nextInt() * 2;
		in.nextLine();
		int array = registerNumber;

		String hi[] = new String[(array)];

		while ((registerNumber) > 0) {
			String slogan = in.nextLine();

			hi[array - registerNumber] = slogan;
			registerNumber--;
		}
		comandNumber = in.nextInt();
		in.nextLine();

		while (comandNumber > 0) {
			String comand = in.nextLine();
			for (int i = 0; i < array; i += 2) {
				if (comand.equals(hi[i])) {
					System.out.println(hi[i + 1]);
				}
			}
			comandNumber--;
		}
	}
}
