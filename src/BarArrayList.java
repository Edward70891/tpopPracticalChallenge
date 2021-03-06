import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarArrayList {

	private static List<Bar> barList = new ArrayList<Bar>();
	private static int left, right, height;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter '1' to enter a bar, or '2' in order to stop making bars");
			int input = 0;
			try {
				input = Integer.parseInt(keyboard.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid input");
				continue;
			}
			if (input == 1) {
				while (true) {
					System.out.println("Please enter the left value: ");
					try {
						left = Integer.parseInt(keyboard.nextLine());
						if (left < 0) {
							System.out.println("Pleae enter a value greater than 0");
							continue;
						}
					}catch (Exception e) {
						System.out.println("Invalid input");
						continue;
					}
					break;
				}
				while (true) {
					System.out.println("Please enter the right value: ");
					try {
						right = Integer.parseInt(keyboard.nextLine());
						if (right <= left) {
							System.out.println("Please enter a value greater than "+left);
							continue;
						}
					}catch (Exception e) {
						System.out.println("Invalid input");
						continue;
					}
					break;
				}
				while (true) {
					System.out.println("Please enter the height value: ");
					try {
						height = Integer.parseInt(keyboard.nextLine());
						if (height <= 0) {
							System.out.println("Please enter a value greater than 0");
							continue;
						}
					}catch (Exception e) {
						System.out.println("Invalid input");
						continue;
					}
					break;
				}
				
				Bar bar = new Bar(left, right, height);
				barList.add(bar);
				
			} else if (input == 2) {
				break;
			} else {
				System.out.println("Invalid input, please try again");
				continue;
			}
		}keyboard.close();
	}

	public List<Bar> getBarList() {
		return barList;

	}

}

// Scanner keyboard = new Scanner(System.in);
// System.out.print("Enter an integer: ");
// int number = keyboard.nextInt();
