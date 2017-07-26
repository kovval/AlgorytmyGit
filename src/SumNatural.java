/**
 * Created by RENT on 2017-07-20.
 */
public class SumNatural {
    private int i = 1;
    private int n = 15;
    private int suma = 0;
    
   
    while(i <= n) {
        suma = suma + i;
        i++;
    }
        

    public static void main(String[] args) {
        
        System.out.println(suma);


    }
}
