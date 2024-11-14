package sortAIgorithm;

public class BubbleSort {
    // sắp xếp tăng dần
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b]; // Sửa lại để gán giá trị đúng
        arr[b] = temp;
    }
    //sắp xếp giảm dần
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // Mảng số nguyên mẫu
        System.out.println("Mang truoc khi sap xep:");
        printArray(arr);

        bubbleSortAscending(arr); // Gọi hàm sắp xếp tăng dần
        System.out.println("Mang sau khi sap xep tang dan:");
        printArray(arr); // In mảng đã sắp xếp

        // Reset mảng để kiểm tra sắp xếp giảm dần
        int[] arrDesc = {64, 25, 12, 22, 11}; 
        bubbleSortDescending(arrDesc); // Gọi hàm sắp xếp giảm dần
        System.out.println("Mang sau khi sap xep giam dan:");
        printArray(arrDesc); // In mảng đã sắp xếp
    }

    // Hàm để in mảng

}