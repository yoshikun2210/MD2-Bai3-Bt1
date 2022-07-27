import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array= {1,2,3,4,5,6,7,8,9};
        boolean found = false;
        System.out.println("Enter a value: ");
        int value = scanner.nextInt();
        System.out.println("old array:");
        for (int k :array){
            System.out.print(k +"\t");
        }
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                found= true;
                System.out.println("Find value in position" +i);
                System.arraycopy(array, i +1, array,i,array.length-1-i);
                array[array.length-1]=0;
                System.out.println("new array:");
                for (int k : array){
                    System.out.print(k+"\t");
                }
            }
        }
        if (!found) System.out.println("value does not exist in array");
    }
}