package sort_java;

public class merge_sort {

	public static void merge_sort(int[] arr, int low, int high) {

		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;

		merge_sort(arr, low, mid);
		merge_sort(arr, mid + 1, high);
		merge(arr, low, mid, high);

		System.out.print("\n");
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
		System.out.print("\n");

	}

	public static void merge(int[] arr, int low, int mid, int high) {

		int[] temp = new int[high - low + 1];
		int k = 0;
		int left = low, right = mid + 1;
		// 把较小的数先移到新数组中
		while (left <= mid && right <= high) {
			if (arr[left] < arr[right]) {
				temp[k++] = arr[left++];
			} else {
				temp[k++] = arr[right++];
			}
		}
		// 把左边剩余的数移入数组
		while (left <= mid) {
			temp[k++] = arr[left++];
		}
		// 把右边边剩余的数移入数组
		while (right <= high) {
			temp[k++] = arr[right++];
		}
		
		for (int i = 0; i < temp.length; i ++) {
			arr[low + i] = temp[i];
		}

	}

	public static void main(String[] args) {
		int[] arr = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		int n = arr.length;
		merge_sort(arr, 0, n - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
