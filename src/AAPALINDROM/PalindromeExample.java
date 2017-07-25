package AAPALINDROM;

class PalindromeExample {
    public static void main(String args[]) {
        int r, sum = 0, temp, c = 0;
        int n = 124;//It is the number variable to be checked for palindrome

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
            System.out.println("not palindrome but " + temp + " in " + c + " Try!");
        }

    }
}

