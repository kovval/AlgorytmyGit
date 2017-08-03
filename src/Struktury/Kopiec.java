package Struktury;

/**
 * Created by jake on 03.08.2017.
 */
public class Kopiec {
    int[] _data;//tworzymy tablice o nazwie data, bedzie przechowywać ilość elementów w tablicy
    int _counter;//zliczanie pomoże nam w tym by określić wielkość tablicy
    public Kopiec(int size) //Konstruktor będzie odpowiadać za utworzenie potrzebnych pól
    //i nadanie im odpowiedniej wartości
    {
        _data = new int[size]; // sciągamy wartość wielkości naszej tablicy
        _counter = 0;// gdyby nie to, że każdy element wsadzamy do kopca pojedynczo to liczba counter nie miała by sensu, zliczanie jednak jes potrzebne
        // przy dodawaniu kolejnych elementów
    }





    public void addNewElement(int newElement){

        int i = _counter++; //Ustawiamy indeks na pozycje wstawianego elementu
        int parent = Math.floorDiv(i-1, 2); //Obliczamy indeks rodzica z zaokrągleniem wyniku w dół
        //indeks rodzica jest nam potrzebny do porównania wstawionego elementu z jego wartością, ponieważ wartość
        //wstawiana w kopcu musi być największa

        while (i > 0 && _data[parent] < newElement) //warunek kopca - dopóki nie doszliśmy do korzenia
        //i jesteśmy więksi od potencjalnego rodzica
        //and oznacza, że dwa warunki mają być spełnione _data[parent] wstawia nam wartość indeksu z drzewa rodzica, a nowy element
        // ma po prostu wstawiana przez nas wartość

        {
            //Zamiana
            _data[i] = _data[parent]; //umieszczamy ojca na miejscu syna
            i = parent; //przensimy się na pozycję ojca
            parent = Math.floorDiv(i-1, 2); //obliczamy indeks ojca
        }
        _data[i] = newElement; //Wstawiamy element kopca
    }
public void delateRoot(){
    int i = _counter++;


}


    public void sort() {
        int size = _counter; // pobiera rozmiar tablicy
        int[] sort = new int[_counter];
        for (int i = _counter - 1; i >= 0; i--) {
//            sort[i] = delateRoot();
        }
    }

        public void drukowanieKopca (){
            int j = 0;
            for (int i = 0; i < _counter;i++){
//                j++;
//                if(j=) {
//                    System.ou
                    System.out.printf(" %d", _data[i]);


    }

    }

}