import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle extends Shape {  //klasa służąca do wykoywania obliczeń dla prostokąta
    private double Ax=0,Ay=0,Bx=0,By=0,Cx=0,Cy=0;  //zmienne przechowujące informacje o współrzędnych prostokąta
    private double field=0;  //zmienna przechowująca informację o polu prostokąta
    private double circuit=0;  //zmienna przechowująca informację o obwodzie prostokąta
    private Scanner scanner=new Scanner(System.in);  //zmienna przechowująca informację o danych wprowadzonych przez użytkownika

    public void show (){ //funkcja umożliwiająca użytkownikowi podanie charakterystycznych punktów prostokąta
        System.out.println("Podaj 3 KOLEJNE wierzchołki prostokąta");

        try {  // przechwytywanie wyjątków, jeśli użytkownik wprowadziłby zły format danych
            System.out.println("Podaj pierwszy punkt:");
            System.out.print("Ax:");
            Ax = scanner.nextDouble();
            System.out.print("Ay:");
            Ay = scanner.nextDouble();

            System.out.println("Podaj drugi punkt:");
            System.out.print("Bx:");
            Bx = scanner.nextDouble();
            System.out.print("By:");
            By = scanner.nextDouble();

            System.out.println("Podaj trzeci punkt:");
            System.out.print("Cx:");
            Cx = scanner.nextDouble();
            System.out.print("Cy:");
            Cy = scanner.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("Źle wpisana liczba! Spróbuj ponownie");
            System.out.println("");
            System.out.println("********************");
            System.out.println("********************");
            System.out.println("");
            new Rectangle().show();

        }
    }
    public double count_field(){ //funkcja obliczająca pole prostokąta
        field=Math.sqrt(Math.pow(Ax-Bx,2)+Math.pow(Ay-By,2))*Math.sqrt(Math.pow(Cx-Bx,2)+Math.pow(Cy-By,2));
        field=field*10000;
        field=Math.round(field);
        field=field/10000;
        return field;
    }
    public double count_circuit() { //funkcja obliczająca obwód prostokąta
        circuit=Math.sqrt(Math.pow(Ax-Bx,2)+Math.pow(Ay-By,2))*2+Math.sqrt(Math.pow(Cx-Bx,2)+Math.pow(Cy-By,2))*2;
        circuit=circuit*10000;
        circuit=Math.round(circuit);
        circuit=circuit/10000;
        return circuit;
    }
}
