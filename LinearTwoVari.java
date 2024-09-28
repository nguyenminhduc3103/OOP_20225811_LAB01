import java.util.Scanner;

public class LinearTwoVari{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a_11: ");
        int a_11 = scanner.nextInt();

        System.out.print("Nhap so a_12: ");
        int a_12 = scanner.nextInt();

        System.out.print("Nhap so a_21: ");
        int a_21 = scanner.nextInt();

        System.out.print("Nhap so a_22: ");
        int a_22 = scanner.nextInt();

        System.out.print("Nhap so b_1: ");
        int b_1 = scanner.nextInt();

        System.out.print("Nhap so b_2: ");
        int b_2 = scanner.nextInt();

        int D = a_11 * a_22 - a_21 * a_12;
        int D1 = b_1 * a_22 - b_2 * a_12;
        int D2 = a_11 * b_2 - a_21 * b_1;

        if(D == 0){
            System.out.println("Dung voi moi x, y");
        }
        else{
            double x = D1 / D;
            double y = D2 / D;
            System.out.println("x = " + x + " and " + "y = " + y); 
        }
        scanner.close();
    }
}