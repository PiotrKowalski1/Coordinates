public class Main {

    public static void main (String [] args) //klasa główna, służąca do wywołanie pierwszej funkcji
    {
        Worker worker=new Worker();
        worker.hello();  //wyświetlenie powitania na ekranie
        worker.read();   //wywołanie funkcji umożliwiającej odczyt danych wprowadzonych przez użytkownika

    }
}
