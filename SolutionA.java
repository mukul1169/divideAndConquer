import java.util.Scanner;

public class SolutionA {
    public static int upgradBookSearch(int[] array) {
        int firstIndex = 1;
        int lastIndex = array.length-1;
        int middleIndex=0;
        while (firstIndex <= lastIndex) 
        {
             middleIndex = (firstIndex + lastIndex) / 2;

            if (middleIndex == array[middleIndex]) {
                return middleIndex;
            }
           else if (middleIndex < array[middleIndex]) {
                lastIndex = middleIndex - 1;
            } else {
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if(size==0)
        {
            System.out.println("NOT_FOUND");
        }
        int array[] = new int[size+1];
        for (int i = 1; i <= size; i++) {
            array[i] = scanner.nextInt();
        }
        int index = upgradBookSearch(array);
        if (index!=-1) {
            System.out.println(index);
        } else {
            System.out.println("NOT_FOUND");
        }
    }
}