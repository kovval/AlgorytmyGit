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

    public void delateRoot() {
        int i = _counter++;

    }

    public void sort() {
        int size = _counter;
        int[] sort = new int[_counter];
        for (int i = _counter; i >= 0; i--) {
//            sort[i] = delateRoot();
        }
    }

    public void drukowanieKopca() {

            for (int i = 0; i < _counter; i++) {
                System.out.printf("%d ", _data[i]);
//                for (int j = 0; j < Math.pow(2, i/2); j++) {
//                    System.out.printf("\n");
//            }

        }

    }
}
