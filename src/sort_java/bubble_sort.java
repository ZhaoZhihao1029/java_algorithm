package sort_java;

public class bubble_sort {

	public static void bubble_sort(int[] arr) {

		int n = arr.length;
		/*// 先排小的
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("\n");
			for (int x = 0; x < arr.length; x++) {
				System.out.print(arr[x] + " ");
			}
			System.out.print("\n");
		}*/
		//先排大的
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
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
		bubble_sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
