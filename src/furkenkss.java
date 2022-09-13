import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("Bir Sayı Girin: ");


        int num = input.nextInt();

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam +=  (num%10);
            num /= 10;
            ++adet;
        }
        System.out.println("basamak sayısı : " + adet);
        System.out.println("basamak toplamı: " + toplam);
    }
}
