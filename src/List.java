import java.util.ArrayList;
import java.util.Scanner;

public class List {
    Scanner scan1 = new Scanner(System.in);
    ArrayList<Integer> lista = new ArrayList<>();
    int suma, max, min;
    boolean status = true;  //

    StringBuilder stringBuilder = new StringBuilder();

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

    public void pokazSkrajneWartosciISume() {
        try {
            max = lista.get(0);
            min = lista.get(0);
            int pomocnicza = 0;

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) < min) min = lista.get(i);
                if (lista.get(i) > max) max = lista.get(i);
                pomocnicza = lista.get(i);
                suma += pomocnicza;
                stringBuilder.append(lista.get(i) + "+");

            }
            System.out.println("Najmmiejsza: " + min);
            System.out.println("Najwieksza: " + max);
            System.out.println("Suma: " + suma);

            String dodawanie = stringBuilder.substring(0, stringBuilder.length() - 1);
            System.out.println(dodawanie + "=" + suma);

        } catch (IndexOutOfBoundsException e){
            System.out.println("Brak liczb dodatnich w liscie");
        }
    }

    public void wypiszWOdwrotnejKolejnosci(){
        for(int i=lista.size()-1; i>=0; i--){
            System.out.println(lista.get(i));
        }
    }

}