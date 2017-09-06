package RekurencyjneMetody;



public class Main {


    public static void main(String[] args) {

        int n = 30;
        System.out.println(Sil(n));

    }
    private static int Sil(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return Sil(n-1) + Sil(n-2);
    }
}
