import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("dzień dobry");
        //typy proste
        //zmienne nie obiekty - pisane małymi literami
        //typy całkowite
        byte liczba = 1;
        short liczba2 = 300;
        int liczba3 = 13452352;
        long liczba4 = 417264982;
        //System.out.println("Liczba całkowita "+liczba4);
        //typy zmiennoprzecinkowe
        float liczba5 = 12.546f;
        double liczba6 = 12341234.1234134;
        //typ logiczny
        boolean truealbofalse = true;
        //typ znakowy
        char znak = 'a';

        /* Napisz program w którym zgadniesz liczbę wylosowaną z zakresu od 1 do 100 */
        //losowanie liczby

        int wylosowanaLiczba = (int)(Math.random()*100+1); //rzutowanie typów
        //System.out.println("Wylosowana liczba: "+wylosowanaLiczba);
        //wylosowanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int wpisanaLiczba = scanner.nextInt();
        System.out.println("Wpisano: "+wpisanaLiczba);

        //instrukcja warunkowa
        if(wpisanaLiczba == wylosowanaLiczba){
            System.out.println("Brawo, trafione");
        }else{
            System.out.println("Pudło");
        }

        int roznica;
        if(wylosowanaLiczba>wpisanaLiczba){
            roznica = wylosowanaLiczba - wpisanaLiczba;
        }else{
            roznica = wpisanaLiczba - wylosowanaLiczba;
        }
        //wyrażenie warunkowe -> zwraca wartość
    roznica = wpisanaLiczba>wylosowanaLiczba?wpisanaLiczba - wylosowanaLiczba:wylosowanaLiczba - wpisanaLiczba;

        System.out.println("Różnica: "+roznica);
        roznica = roznica / 10; //bo dzielimy dwie całkowite

//        switch (roznica){
//            case 0:
//                System.out.println("Prawie się udało lub trafione");
//                break;
//            case 1:
//                System.out.println("Blisko");
//                break;
//            case 2:
//                System.out.println("nie najgorzej");
//                break;
//            default:
//                System.out.println("Spróbuj innym razem");
//        }
        System.out.println(
                switch (roznica){
                    case 0->"Prawie się udało lub trafione";
                    case 1->"Blisko";
                    case 2->"Nienajgorzej";
                    default -> "spróbuj innym razem";
                }
        );
    }
}