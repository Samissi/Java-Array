import java.util.Scanner;

public class findx {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size=s.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size;i++){
            numbers[i]= s.nextInt();
        }
        System.out.print("which number is you search:");
        int x = s.nextInt();

        for(int i=0;i< numbers.length; i++){
            if (numbers[i] == x)
                System.out.println("X is found at index: " +i);
        }
    }
}
