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
            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
