import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int colums = s.nextInt();
        int[][] matrix = new int[rows][colums];

        //input
        //rows
        for(int i=0;i<rows;i++){
            //column
            for (int j=0;j<colums;j++){
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.print("which number is you search:");
        int X = s.nextInt();

        for(int i=0; i< matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==X)
                    System.out.println("X is found at index: "+i+","+j);
            }
            System.out.println();
        }
    }
}
