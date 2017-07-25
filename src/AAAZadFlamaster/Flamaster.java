package AAAZadFlamaster;

public class Flamaster {
    private String word;
//    private int sum;

    public Flamaster (String word) {
        this.word = word;
        wordPrepared();
    }

    @Override
    public String toString() {
        return word;
    }

    private void wordPrepared() {
        String tmp = "";
        int len = word.length();

        for ( int i = 0; i < len; i++) {
           int sum = 0;
            if (word.charAt(i) == word.charAt(i+1))  {
                int j = i;
               while (word.charAt(j)== word.charAt(j+1)) {
                   sum++;
                   j++;
//               } if (word.charAt(j) != word.charAt(j)) {
               } if (sum >= 3) {
                   tmp += word.charAt(j)+sum;
                }
                }
                tmp += word.charAt(i);
                }
    }

    public static void main(String[] args) {
        Flamaster f1 = new Flamaster("katarzyna");
//        Flamaster f2 = new Flamaster("aaakaaaakaaaa");

//        System.out.println(f1.wordPrepared());
//        System.out.println(f2.wordPrepared());
    }

}

