import java.util.ArrayList;
import java.util.Scanner;

public class List {
    Scanner scan1 = new Scanner(System.in);
    ArrayList<Integer> lista = new ArrayList<>();
    int suma, max, min;
    boolean status = true;  //

    public void dodawanie() {
        do {
            System.out.println("Podaj dodatnia liczbe");
            int liczba = scan1.nextInt();

            if (liczba >= 0) {
                lista.add(liczba);
            } else {
                System.out.println("Zakończone dodawanie");
                status = false;
            }

        } while (status);
    }

    public void najmniejszaINajwiekszaLiczba() {
        try {
            max = lista.get(0);
            min = lista.get(0);
            int pomocnicza = 0;

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) < min) min = lista.get(i);
                if (lista.get(i) > max) max = lista.get(i);
                pomocnicza = lista.get(i);
                suma += pomocnicza;

            }
            System.out.println("Najmmiejsza: " + min);
            System.out.println("Najwieksza: " + max);
            System.out.println("Suma: " + suma);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Brak liczb dodatnich w liscie");
        }
    }



}