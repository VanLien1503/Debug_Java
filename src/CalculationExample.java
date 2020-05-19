import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Nhap Y : ");
        int y = sc.nextInt();
        CalculationExample calc =new CalculationExample();
        calc.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try {
            int a= x+y;
            int b= x-y;
            int c= x*y;
            int d= x/y;
            System.out.println("Tong x+y : "+a);
            System.out.println("Tong x-y : "+b);
            System.out.println("Tong x*y : "+c);
            System.out.println("Tong x/y : "+d);
        }catch (Exception ex){
            System.out.println("error: "+ex.getMessage());
        }
    }
}
