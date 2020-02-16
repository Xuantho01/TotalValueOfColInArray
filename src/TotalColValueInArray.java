import java.util.Scanner;
public class TotalColValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter col to calculate total: ");
        int col = scanner.nextInt();
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int total = 0;
        for(int i = 0; i < array.length; i++){
             total += array[col][i];
        }
        System.out.println("Total value of col "+col +" is: "+total);
    }
}
