package TestDriverDevelopment.LiczbaNaSlowo;


public class LiczbaNaSlowo {
private String[] slowaDoDziesieć = {"zero", "jeden", "dwa", "trzy", "cztery" ,
"pięć", "sześć", "siedem", "osiem","dziewięć", "dziesieć","jedynaście", "dwanaście",
"trzynaście", "czternaście", "pietnaście", "szesnaście", "siedemnaście", "osiemnaście", "dziewiętnaście" };

private String[] dziesiatki = {"", "", "dwadzieścia", "trzydzieści", "czterdziesci", "piędziesiąt", "sześdziesiąt", "siedemdziesiąt",
"osiemdziesiąt", "dziewiedzieisąt"};

    private String[] setki = {"", "sto", "dwieście", "trzysta", "czterysta" , "pięćset", "sześćset", "siedemset" ,"osiemset" ,"dziewięćset"};


//private int[] liczbyDodziesiec = {1 ,2 ,3 ,4 ,5 ,6, 7 ,8 ,9, 10};

    public String slowo(int n) {
        if(n>=100) return setki[n/100]+dziesiatki[(n-(n/100*100))/10]+slowaDoDziesieć[n%10];
        if(n > 19) return dziesiatki[n%10]+slowaDoDziesieć[n- (10*(n%10))];
        return slowaDoDziesieć[n];









    }

}
