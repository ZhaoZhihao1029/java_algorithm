package sort_java;

public class insert_sort {
	public static void insert_sort(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i ++) {
			for (int j = i; j > 0; j --) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
			System.out.print("\n");
			for (int x = 0; x < arr.length; x++) {
				System.out.print(arr[x] + " ");
			}
			System.out.print("\n");
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		insert_sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
