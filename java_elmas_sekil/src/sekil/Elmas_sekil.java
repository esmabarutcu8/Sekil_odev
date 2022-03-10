package sekil;
import java.util.Scanner;
public class Elmas_sekil {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 1; i <=n ; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            for (int j= 1; j <= (2 * i )- 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //ters ucgen
        for(int a=0;a<n;a++){
            for(int b=0;b<=a;b++){
                System.out.print(" ");
            }
            for(int c=2*n-1;c>=(2*a+1);c--){
                System.out.print("*");

            }
            System.out.println();

        }


        }


    }

