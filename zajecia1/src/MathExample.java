public class MathExample {
    public static void main(String[] args){
        double liczba =9.0;
        int b = 3;
        double pierwiastek = Math.sqrt(liczba);
        double potega = Math.pow(liczba, b);

        System.out.println("Pierwiastek z " + liczba + "wynosi: " + pierwiastek );
        System.out.println("Liczba " + liczba + " podniesiona do potęgi " + b + " to " + potega );

    }
}
