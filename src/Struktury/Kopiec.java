package Struktury;
//tworzymy tablice o nazwie data, bedzie przechowywać ilość elementów w tablicy
//zliczanie pomoże nam w tym by określić wielkość tablicy
//i nadanie im odpowiedniej wartości
//Konstruktor będzie odpowiadać za utworzenie potrzebnych pól
// sciągamy wartość wielkości naszej tablicy
// gdyby nie to, że każdy element wsadzamy do kopca pojedynczo to liczba counter nie miała by sensu, zliczanie jednak jes potrzebne
// przy dodawaniu kolejnych elementów
//Ustawiamy indeks na pozycje wstawianego elementu
//Obliczamy indeks rodzica z zaokrągleniem wyniku w dół
//indeks rodzica jest nam potrzebny do porównania wstawionego elementu z jego wartością, ponieważ wartość
//wstawiana w kopcu musi być największa
//warunek kopca - dopóki nie doszliśmy do korzenia
//i jesteśmy więksi od potencjalnego rodzica
//and oznacza, że dwa warunki mają być spełnione _data[parent] wstawia nam wartość indeksu z drzewa rodzica, a nowy element
// ma po prostu wstawiana przez nas wartość
//Zamiana
//umieszczamy ojca na miejscu syna
//przensimy się na pozycję ojca
//obliczamy indeks ojca
//Wstawiamy element kopca
// pobiera rozmiar tablicy


import static java.lang.Enum.valueOf;
import static javafx.scene.input.KeyCode.T;

public class Kopiec {
    int[] _data;
    int _counter;

    public Kopiec(int size) {
        _data = new int[size];
        _counter = 0;
    }

    public void addNewElement(int newElement) {
        int i = _counter++;
        int parent = Math.floorDiv(i - 1, 2);

        while (i > 0 && _data[parent] < newElement) {
            _data[i] = _data[parent];
            i = parent;
            parent = Math.floorDiv(i - 1, 2);
        }
        _data[i] = newElement;
    }
//    k01: Dla i = n, n -1,...,2: wykonuj K02...K08
//    k02: d[1] <--> d[i]
//    k03: j<-1; k<-2
//    k04: Dopóki (k <i) wykonuj k05...k08
//    k05: jeżeli (k +1 , i) i (d[k+1] > d[k]), to m<- k+1
//    inaczej m<-k
//    k06: jeżeli d[m] <= d[j] to wydź z pętli k04 i kontynuuj następny obieg k01
//    k07: d[j] <--> d[m]
//    k08: j - m; k <j + j
//    k09: zakończ


//    public int delateRoot() {
//
//        int root = 0;
//        if (_counter-- > 0) {
//
//            root = _data[0];
//            int i = 0;
//            int j = 1;
//            int elementLast = _data[_counter];
//
//            while (j < _counter) {
//                if (j++ < _counter && _data[j++] > _data[j]) {
//                    j++;
//                }
//                if (_data[j] <= elementLast)
//                    break;
//                else {
//                    _data[i] = _data[j];
//                    i = j;
//                    j = 2 * j + 1;
//                }
//            }
//            _data[i] = elementLast;
//        }
//        return root;
//    }

     public int deleteRoot(){
        int root = 0;
        int i = 0; //iterator, któy posłuży do przeszukiwania kopca zaczynając od korzenia


        if(_counter-- > 0) //Sprawdzamy czy możemy cokolwiek usunąć jednocześnie zmniejszając licznik
        {
            root = _data[0];
            int lastElement = _data[_counter]; //zapamiętujemy ostatni element kopca
            i = 0; //przeszukiwanie drzewa rozpoczynamy od korzenia
            int j = 1; //wskazujemy w którym miejscu w tablicy znajduje się lewy syn

            while (j < _counter) //dopóki uda nam się odnaleźć lewego syna idziemy w dół kopca
            {
                if(j+1 < _counter && _data[j+1] > _data[j]) //szukamy większego syna
                {
                    j = j+1;
                }
                if(lastElement >= _data[j]) //jeśli warunek kopca spełniony, wychodzimy z pętli
                    break;
                else {
                    //Zamiana
                    _data[i] = _data[j]; //kopiujemy większego syna do ojca
                    i = j; //przechodzimy na pozycję większego syna
                    j = 2 * j + 1; //j wskazuje lewego syna
                }
            }

            _data[i] = lastElement; //w odpowiednim miejscu umieszczamy ostatni element, aby zachowany był
            //warunek kopca
        }
        return root;
    }


    public void sort() {
            int size = _counter; //pobieram sobie rozmiar kopca
            int[] sort = new int[_counter]; //tworzę tablice, która posłuży mi do sortowania
            for(int i = _counter-1 ; i >= 0; i--){
                sort[i] = deleteRoot(); //kasuje korzeń i jednocześnie zapisuje sobie jego wartość na ostatnim wolnym
                //miejscu tablicy
            }
            for(int i = 0; i < size; i++){
                System.out.printf("%d ", sort[i]);
            }
        }

    public void drukowanieKopca() {

        for (int i = 0; i < _counter; i++) {
            System.out.printf("%d ", _data[i]);
            }
        System.out.printf("\n");

        }

    }

