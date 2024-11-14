package sortAIgorithm;

public class Insertion {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            // Sửa điều kiện trong vòng lặp để so sánh đúng hướng
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--; // Giảm j để tiếp tục so sánh
            }
            arr[j + 1] = temp;
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

        insertionSort(arr); // Gọi hàm sắp xếp

        System.out.println("Mang sau khi sap xep:");
        printArray(arr); // In mảng đã sắp xếp
    }

    // Hàm để in mảng

}