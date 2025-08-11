package lab23_july;

public class searchinganelement {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		int element = 60;
		boolean found = false;

		for (int i = 0; i < 5; i++) {
			if (a[i] == element) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present");
		}
	}
}


