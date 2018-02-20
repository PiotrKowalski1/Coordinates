import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle extends Shape { //klasa służąca do wykoywania obliczeń dla koła
    private double Ax=0,Ay=0,Bx=0,By=0; //zmienne przechowujące informacje o współrzędnych koła
    private double field=0;  //zmienna przechowująca informację o polu koła
    private double circuit=0;  //zmienna przechowująca informację o obwodzie koła
    private Scanner scanner=new Scanner(System.in); //zmienna przechowująca informację o danych wprowadzonych przez użytkownika

    public void show (){ //funkcja umożliwiająca użytkownikowi podanie charakterystycznych punktów koła
        System.out.println("Podaj współrzędną środka koła i dowolny punktu na jego obwodzie");

        try { // przechwytywanie wyjątków, jeśli użytkownik wprowadziłby zły format danych
            System.out.println("Podaj punkt środka koła:");
            System.out.print("0x:");
            Ax = scanner.nextDouble();
            System.out.print("0y:");
            Ay = scanner.nextDouble();

            System.out.println("Podaj drugą dowolny punkt na obwodzie koła:");
            System.out.print("Bx:");
            Bx = scanner.nextDouble();
            System.out.print("By:");
            By = scanner.nextDouble();


        }
        catch(InputMismatchException e){
            System.out.println("Źle wpisana liczba! Spróbuj ponownie");
            System.out.println("");
            System.out.println("********************");
            System.out.println("********************");
            System.out.println("");
            new Circle().show();

        }
    }
    public double count_field(){ //funkcja obliczająca pole koła
        field=Math.pow(Math.sqrt(Math.pow(Ax-Bx,2)+Math.pow(Ay-By,2)),2)*Math.PI;
        field=field*10000;
        field=Math.round(field);
        field=field/10000;
        return field;
    }
    public double count_circuit() { //funkcja obliczająca obwód koła
        circuit=Math.sqrt(Math.pow(Ax-Bx,2)+Math.pow(Ay-By,2))*2*Math.PI;
        circuit=circuit*10000;
        circuit=Math.round(circuit);
        circuit=circuit/10000;
        return circuit;
    }
}
