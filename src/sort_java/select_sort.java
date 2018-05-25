package sort_java;

public class select_sort {
	public static void select_sort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i ++) {
			int min_index = i;
			for (int j = i + 1; j < n; j ++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			
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
		select_sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
