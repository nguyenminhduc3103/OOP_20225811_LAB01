import java.util.Scanner;
public class LinearEquation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

        if(a == 0){
            if(b == 0){
                System.out.println("Dung voi moi so.");
            }
            else{
                System.out.println("Khong co x thoa man.");
            }
        }
        else{
            double x = -b / a;
            System.out.println("x = " + x);
        }
        scanner.close();
    }
}
