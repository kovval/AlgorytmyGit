package AAPALINDROM;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrom2 {
    private Palindrom2(int n) {
        this.n = n;

    }


    private int r;
    private int sum = 0;
    private int c = 0;
    private int n;
    private int temp = n;




    private void makePalindrom() {

        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number is: " + sum);
        } else {

            while (temp != sum) {
                temp = temp + sum;
                sum=0;
                n = temp;
                c++;
                while (n > 0) {
                    r = n % 10;
                    sum = (sum * 10) + r;
                    n = n / 10;
                }
            }
            System.out.println(sum+ " is Palindrom stacked in : " + c);

        }
    }


    public static void main(String[] args) {

        List<Palindrom2> lista = new ArrayList<>();
        System.out.println("enter a number of Palindroms: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.printf("number: %d\n", i+1);
            int s = scanner.nextInt();
            lista.add(new Palindrom2(s));
        }

//        lista.add(new Palindrom2(12));
//        lista.add(new Palindrom2(15));
//        lista.add(new Palindrom2(14));
//        lista.add(new Palindrom2(28));
//        lista.add(new Palindrom2(22));
//        lista.add(new Palindrom2(1011));
//        lista.add(new Palindrom2(13));
//        lista.add(new Palindrom2(19));
//        lista.add(new Palindrom2(137737));
        for (Palindrom2 p: lista) {
            p.makePalindrom();
        }



        }



//        Palindrom2 p1 = new Palindrom2(101);
//        Palindrom2 p2 = new Palindrom2(10);
//        Palindrom2 p3 = new Palindrom2(102);
//        Palindrom2 p4 = new Palindrom2(28);
//        Palindrom2 p5 = new Palindrom2(76);
//        Palindrom2 p6 = new Palindrom2(93);
//        Palindrom2 p7 = new Palindrom2(84);


        

    }