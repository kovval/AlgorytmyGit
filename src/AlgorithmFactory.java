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
            case "porownanieliczb":
                return new porownanieLiczb();
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
            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
