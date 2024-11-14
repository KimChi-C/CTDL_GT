package sortAIgorithm;

public class QuickSort {
    // Hàm thực hiện thuật toán QuickSort
    public static void quickSort(int[] arr, int left, int right) {
        // Nếu left < right, nghĩa là mảng có từ 2 phần tử trở lên
        if (left < right) {
            // Chọn một phần tử làm "pivot" và phân đoạn mảng quanh nó
            int pivotIndex = partition(arr, left, right);
            
            // Đệ quy sắp xếp mảng từ vị trí "left" đến "pivotIndex - 1" (phía trái pivot)
            quickSort(arr, left, pivotIndex - 1);
            
            // Đệ quy sắp xếp mảng từ vị trí "pivotIndex + 1" đến "right" (phía phải pivot)
            quickSort(arr, pivotIndex + 1, right);
        }
    }
    // Hàm "partition" để chọn pivot và phân đoạn mảng quanh pivot
    private static int partition(int[] arr, int left, int right) {
        // Chọn phần tử cuối cùng của mảng hiện tại làm pivot
        int pivot = arr[right];  
        // "i" là chỉ số của phần tử nhỏ hơn pivot trong quá trình phân đoạn
        int i = left - 1;
        // Duyệt qua các phần tử từ "left" đến "right - 1"
        for (int j = left; j < right; j++) {
            // Nếu phần tử arr[j] nhỏ hơn pivot
            if (arr[j] < pivot) {
                i++; // Tăng chỉ số i (điểm đặt phần tử nhỏ hơn pivot)   
                // Hoán đổi phần tử tại i và j để đưa phần tử nhỏ hơn pivot về phía bên trái
                swap(arr, i, j);
            }
        }  
        // Sau khi duyệt hết, đưa pivot về đúng vị trí giữa phần tử nhỏ hơn và lớn hơn nó
        swap(arr, i + 1, right);
        // Trả về vị trí của pivot để chia đôi mảng trong các bước đệ quy tiếp theo
        return i + 1;
    }
    // Hàm đổi chỗ hai phần tử trong mảng
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Hàm main để kiểm tra thuật toán
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        // Gọi hàm quickSort để sắp xếp mảng từ vị trí đầu đến cuối
        quickSort(arr, 0, arr.length - 1);
        // In mảng sau khi sắp xếp
        System.out.println("Mang sau khi sap xep:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}