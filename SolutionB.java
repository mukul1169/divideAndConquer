import java.util.Scanner;

public class SolutionB {

    private static int bookBinarySearch(int[] array, int first, int last, int Value) {
        int mid = (first + last) / 2;
        
        try {
            if (last <= first) {
                return -1;
            } else if (array[mid] == Value) {
                return mid;
            } else if (array[mid] > Value) {
                return bookBinarySearch(array, first, mid - 1, Value);
            } else {
                return bookBinarySearch(array, mid + 1, last, Value);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            return bookBinarySearch(array, first, mid, Value);
        }

    }
    public static int search(int[] array, int Value) {
        return bookBinarySearch(array, 1,array.length-1 , Value);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int M = scanner.nextInt();

        if (size == 0) {
            System.out.print("NOT_FOUND");
            return;
        }
        int array[] = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            array[i] = scanner.nextInt();
        }

        int index = search(array, M);
        if(index>0)
            System.out.println(index);
        else
        System.out.println(index == -1 ? "NOT FOUND" : index);

    }
    }