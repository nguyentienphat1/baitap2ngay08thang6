import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang 1");
        n= scanner.nextInt();
        System.out.println("nhap x");
        x = scanner.nextInt();
        int array[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap gia tri phan tu : "+i);
            array[i]= scanner.nextInt();
        }
        int array1[]= new int[n+1];
        array1[n]=x;
        for (int i=0;i< n;i++){
            array1[i]=array[i];
        }
//        for (int i=0;i< array1.length;i++){
//        }
        for (int i=0;i< array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}