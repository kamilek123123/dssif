import java.util.Scanner;
public class zadanie2 {
    public static void main (String[] args){
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj dzien : " );
        int dzien = dane.nextInt();
        System.out.println("Podaj miesiac: ");
        int miesiac  = dane.nextInt();
        System.out.println("Podaj dwie ostatnie liczby roku");;
        int rok = dane.nextInt();

        if(dzien*miesiac==rok){
            System.out.println("Data jest magiczna");
        }
        else{
            System.out.println("Data nie jest magiczna10");
        }
    }
}