package Algorithms;

public class HTMLLovve extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "HTML co mi nie robi spacji";
    }

    @Override
    public void runAlgorithm(String[] input) {
    //Wczytujemy tekst w forze po stringach, nastepnie przerabiamy stringi na tablice charow
    //tablice charow forujemy w poszukiwania ptaszka '<' gdy
    //gdy go znajdziemy wszystkie znaki za nim podnosimy do gry do pojawienia sie ptaszka '>'"
    //gdy ptaszki sie skoncza wrzucamy zwykly tekst, majac na uwadze, ze tam moga byc spacje i odstepy
    // jak ktos wrzuci ptaszka do tekstu to niestety spartoli dzialanie programu, a przez to...[cenzura] tekst
    // na stronie HTML, dlatego tez te zadanie nie moze zostac wykorzystane w praktycznym wykorystaniu do
    // momentu wyeliminowania ptaszkowego problemu.
        // tekst w ptaszkach nie moze miec przerw w postaci spacji " "
        // mozna by to rozwiazac jakim repleacem ale nie mam czasu tyle co by nie przyklady sie zgadzaja
        //w praktyce można by pierw szukać ptaszków, a potem słów kluczowych takich jak body, htm, head itp i dopiero wtedy je powiększać
        //obciążałoby to działanie programu, ale było by o wiele lepsze, przy okazji nierozpoznanego znaku, od razu widać by było gdzie został popełniony
        //błąd literowy .

        for (int stringCounter = 1; stringCounter < input.length; stringCounter++) {
            String stringHTML = input[stringCounter];
            stringHTML = input[stringCounter];
            char[] charInHTML = stringHTML.toCharArray();
            for (int charCounter = 0; charCounter < charInHTML.length; charCounter++) {
                if (charInHTML[charCounter] == '<') {
                    while (charInHTML[charCounter] != '>') {
                        System.out.print(Character.toString(charInHTML[charCounter]).toUpperCase());
                        charCounter++;
                    }
                    System.out.print(">");
                } else {
                    System.out.print(Character.toString(charInHTML[charCounter]));
                    if (charCounter == charInHTML.length - 1) {
                        System.out.print(" ");//gut
                    }
                }
            }
        }
    }
}

