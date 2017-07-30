import Algorithms.*;

/**
 * Created by jake on 21.07.2017.
 */
public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "sumowanieliczbnaturalnych":
                return new SumowanieLiczbNaturalnych();
            case "odejmowaniekwoty":
                return new OdejmowanieKwoty();
            case "sumaliczbwejsciowych":
                return new SumaLiczbWejsciowych();
            case "rokprzestepny":
                return new RokPrzestepny();
            case "silnia":
                return new Silnia();
            case "fibonacci":
                return new Fibonacci();
            case "szyfrcezara":
                return new SzyfrCezara();
            case "wyznaczaniecyfrsilni":
                return new WyznaczanieCyfrSilni();
            case "sortowaniebombelkowe":
                return new sortowanieBabelkowe();
            case "sortowaniewzglendemodleglosci":
                return new  SortowanieWzglendemOdleglosci();
            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie();
            case "statki" :
                return new Statki();
            case "flamaster" :
                return new Flamaster();
            case "palindrom" :
                return new Palindrom();
            case "nwd" :
                    return new NWD();
            case "warcaby" :
                return new Warcaby();
            case "tablice" :
                return new Tablice();
            case "interpretacja" :
                return new Interpretacja();
            case "datadzien" :
                return new DataDzien();
            case "wielkanoc" :
                return new Wielkanoc();
            case "obzartuchy" :
                return new Obzartuchy();
            case "nowadzialka" :
                return new NowaDzialka();
            case "zliczanieliter" :
                return new ZliczanieLiter();
            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
