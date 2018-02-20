import java.util.Scanner;

public class Worker {  //klasa wykonująca główne funkcje w programie

    public void hello() {  //funkcja wyświetlająca informacje powitalne
        System.out.println("Witaj w programie matematycznym!");
        System.out.println("Bedzięsz mógł w nim policzyć pole i obwód wybranej figury na podstawie punktów współrzędnych danej figury.");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        hello2();

    }
    public void hello2(){  //druga funkcja wyświetlająca dalsze informacje powitalne
        System.out.println("Do wyboru są trzy figury: ");
        System.out.println("Trójkąt \"t\"");
        System.out.println("Prostokąt \"p\"");
        System.out.println("Koło \"k\"");
        System.out.println("Wybierz: t, p lub k: ");
    }

    public void read() {  //funkcja odczytująca dane wprowadzone przez użytkownika
        Scanner scan = new Scanner(System.in);
        String reader = scan.next();
        char sign = reader.charAt(0); //zmienna przechowująca znak wpisany przez użytkownika

        while (sign != 't' && sign != 'p' && sign != 'k') {  //pętla umożliwiająca ponowne wpisanie danych
            System.out.println(sign);
            System.out.println("Wpisz ponownie");
            reader = scan.next();
            sign = reader.charAt(0);

        }

        choose(sign);
    }

    public void choose(char sign) {  //funkcja rozpoznająca wpisany znak i przekazująca funkcji count parametr odpowiedniego typu
        if (sign == 't') {
            Triangle triangle = new Triangle();
            count(triangle);
        } else if (sign == 'p') {
            Rectangle rectangle = new Rectangle();
            count(rectangle);
        }
        if (sign == 'k') {
            Circle circle = new Circle();
            count(circle);
        }
    }

    public void count(Shape shape){ //funkcja sterująca, umożliwiająca wywołanie w zależności od typu przekazanego argumentu
        shape.show();
        System.out.println("``````````````````");
        System.out.println("Pole wynosi="+shape.count_field());
        System.out.println("Obwód wynosi="+shape.count_circuit());
        System.out.println("``````````````````");
        System.out.println("");
        System.out.println("Chcesz policzyć jeszcze raz? Wciśnij tak/\"t\" lub dowolny klawisz, aby zamknąć.");
        ending();
    }

    public void ending(){  //funkcja umożliwiająca powtórzenie obliczeń lub zamknięcie programu
        Scanner scan = new Scanner(System.in);
        String reader = scan.next();
        char sign = reader.charAt(0);
        if(sign=='t') {
            System.out.println("");
            hello2();
            read();
        }
        else {
            System.out.print("Dziękuję za skorzystanie z programu!");
        }
    }
}
