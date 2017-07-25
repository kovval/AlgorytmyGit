package AAAZadFlamaster;


import java.util.Scanner;

class Flamaster2 {
    public static String formattedString(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {//pętla [0]...[n-1] po długosci slowa
            char c = s.charAt(i);//znak char na tablicy stringa
            builder.append(c);//metoda string builder dodaje c
            int count = 1; // zliczanie powtorzeń
            if (i == s.length() - 1) { // warunek kończący
                break;
            }
            while (c == s.charAt(i + 1)) { // warunek powtórzeń znaku
                count++;
                i++;
                if (i == s.length() - 1) {
                    break; //warunek końca
                }
            }
            if (count == 2) {//warunek kolejnych powtórzeń
                builder.append(c); // dodanie chara
            } else if (count > 2) { // jeżeli więcej niż 2 dodanie liczby powtórzeń
                builder.append(count);
            }
            if(i==s.length()-2){//jeżeli przedostatni znak = i
                builder.append(s.charAt(i+1));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tabString[] = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            tabString[i] = formattedString(s);
        }
        for (String x : tabString) {
            System.out.println(x);
        }
    }
}
