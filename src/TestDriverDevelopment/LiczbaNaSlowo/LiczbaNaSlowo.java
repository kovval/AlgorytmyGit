package TestDriverDevelopment.LiczbaNaSlowo;


public class LiczbaNaSlowo {
    private String[] tysiace = {"", "tysiąc", "tysiące", "tysiące", "tysiące", "tysiący", "tysiący", "tysiący", "tysiący", "tysiący", "tysiący"};
private String[] slowaDoDziesieć = {"", "jeden", "dwa", "trzy", "cztery" ,
"pięć", "sześć", "siedem", "osiem","dziewięć", "dziesieć","jedynaście", "dwanaście",
"trzynaście", "czternaście", "pietnaście", "szesnaście", "siedemnaście", "osiemnaście", "dziewiętnaście" };

private String[] dziesiatki = {"", "", "dwadzieścia", "trzydzieści", "czterdziesci", "piędziesiąt", "sześdziesiąt", "siedemdziesiąt",
"osiemdziesiąt", "dziewiedzieisąt"};

    private String[] setki = {"", "sto", "dwieście", "trzysta", "czterysta" , "pięćset", "sześćset", "siedemset" ,"osiemset" ,"dziewięćset"};


//private int[] liczbyDodziesiec = {1 ,2 ,3 ,4 ,5 ,6, 7 ,8 ,9, 10};

    public String slowo(int n) {



        String word = "";//cały plan poszedł sie..., a chciałem zrobić wszystko w jednej linijce
        if(n>=100) word = setki[n/100];
        n=n%100;
        if(n > 19) {
            word += dziesiatki[n/10]+slowaDoDziesieć[n%10];
        }
        else {
            word += slowaDoDziesieć[n];
        }
        return word;








    }

}
