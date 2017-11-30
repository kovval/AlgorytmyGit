import Algorithms.*;

/**
 * Created by jake on 21.07.2017.
 */
public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()) {
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
                return new SortowanieWzglendemOdleglosci();
            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie();
            case "statki":
                return new Statki();
            case "flamaster":
                return new Flamaster();
            case "palindrom":
                return new Palindrom();
            case "nwd":
                return new NWD();
            case "warcaby":
                return new Warcaby();
            case "tablice":
                return new Tablice();
            case "interpretacja":
                return new Interpretacja();
            case "datadzien":
                return new DataDzien();
            case "wielkanoc":
                return new Wielkanoc();
            case "obzartuchy":
                return new Obzartuchy();
            case "nowadzialka":
                return new NowaDzialka();
            case "zliczanieliter":
                return new ZliczanieLiter();
            case "spacjecamelcase":
                return new SpacjeCamelCase();
            case "odwrotnosccamelcase":
                return new OdwrotnoscCamelCase();
            case "mrandom":
                return new mRandom();
            case "drukowanykopiec":
                return new drukowanyKopiec();
            case "szukanielidera" :
                return new SzukanieLidera();
//            case "testowanielisty" :
//                return new TestowanieListy();
            case "listakolor":
                return new ListaKolor();
            case "drzewokompletne":
                return new DrzewoKompletne();
            case "prostedrzewo":
                return new ProsteDrzewo();
            case "przeliczaniesystemu":
                return new PrzeliczanieSystemu();
            case "odwrotnanotacjapolska":
                return new OdwrotnaNotacjaPolska();
            case "zmienneitablice":
                return new ZmienneITablice();
            case "todelete":
                return new toDelete();
            case "stospalindrom":
                return new StosPalindrom();
            case "odwrotnanotacjapolskazad":
                return new OdwrotnaNotacjaPolskaZad();
            case "nww":
                return new NWW();
//                ========================================================= <= nowe kody
            case "dzientygodnia":
                return new DzienTygodnia();
            case "bojtockieswietotrojkota":
                return new BojtockieSwietoTrojkota();
            case "namedayjohnny":
                return new  NameDayJohnny();
            case "htmllovve":
                return new  HTMLLovve();
            case "idnumberweryfikacj":
                return new IDNumberWeryfikacja();
            case "peselver":
                return new PESELVER();
            case "ciazowyspecjalista":
                return new CiazowySpecjalista();
            case "punktywkole":
                return new PunktyWKole();
            case "removal":
                return new Removal();
            case "snow":
                return new Snow();
            case "rownanieliniowe":
                return new RownanieLiniowe();
            case "airplane":
                return new Airplane();
            case "przedszkolanka":
                return new Przedszkolanka();
            case "porownanieliczb":
                return new PorownanieLiczb();
            case "kabalistycznyzapisdaty":
                return new KabalistycznyZapisDaty();
            case "pieczatkidzieci":
                return new PieczatkiDzieci();


            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
