package sortAIgorithm;

public class MergeSort {

    // Hàm chính để thực hiện Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        // Kiểm tra điều kiện: nếu còn nhiều hơn một phần tử, tiếp tục chia
        if (left < right) {
            // Tìm chỉ số giữa của mảng
            int mid = left + (right - left) / 2;

            // Đệ quy chia nửa trái
            mergeSort(arr, left, mid);
            // Đệ quy chia nửa phải
            mergeSort(arr, mid + 1, right);

            // Gộp hai nửa đã được sắp xếp lại
            merge(arr, left, mid, right);
        }
    }

    // Hàm gộp hai mảng con đã sắp xếp thành một mảng đã sắp xếp
    public static void merge(int[] arr, int left, int mid, int right) {
        // Tính kích thước của hai mảng con
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo các mảng tạm để lưu các phần tử của nửa trái và nửa phải
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Sao chép dữ liệu vào các mảng tạm
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Gộp các mảng tạm lại thành một mảng đã sắp xếp
        int i = 0, j = 0; // Các chỉ số ban đầu của hai mảng con
        int k = left;     // Chỉ số ban đầu của mảng gộp

        // So sánh từng phần tử và gộp lại theo thứ tự tăng dần
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của leftArray nếu có
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của rightArray nếu có
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Hàm main để kiểm tra thuật toán
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Mang ban dau:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Gọi hàm mergeSort để sắp xếp mảng
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nMang sau khi sap xep:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}