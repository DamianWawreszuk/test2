public class MyVariables {
    public static void main(String[] args) {

        byte myByte;
        short myShort;
        long myLong;
        char myChar;
        int myInt;
        float myFloat;
        double myDouble;

        printMinAndMaxValuesOfImitiveTypes();


        String myText = "ala ma kota";
        System.out.println(myText);

        String number = "2";
        System.out.println(number);

        String rzeczownik = "samolot";
        String przymiotnik = "pasażerski";
        String spacja = " ";
        String opis = rzeczownik + spacja + przymiotnik;
        System.out.println(opis);

        int maxInt;
        maxInt = 2_147_483_647;
        System.out.println(maxInt);
        maxInt = maxInt + 1;
        System.out.println(maxInt);

        String mySuperText = "Piotrek";
        mySuperText = "Adam";
        System.out.println(mySuperText);

       /* final String MY TEXT = "Moj tekst";
        MY TEXT = "Inny tekst";
        to krzyczy, bo tak nie wolno zmieniać. Zmienna MY TEXT.
        Wszystkie zmienne deklarujemy zmałej a nie duzejlitery*/

        printMyCodeFromeMyMethod();
    }

    public static void printMyCodeFromeMyMethod() {
        System.out.println("TO JEST KOD Z MOJEJ METODY myMethod");

    }

    public static void printMinAndMaxValuesOfImitiveTypes()
    {

        System.out.println("Min byte value = " + Byte.MIN_VALUE);
        System.out.println("Max byte value = " + Byte.MAX_VALUE);

        System.out.println("Min short value = " + Short.MIN_VALUE);
        System.out.println("Max short value = " + Short.MAX_VALUE);

        System.out.println("Min long value = " + Long.MIN_VALUE);
        System.out.println("Max long value = " + Long.MAX_VALUE);

        System.out.println("Min  int value = " + Integer.MIN_VALUE);
        System.out.println("Max int value = " + Integer.MAX_VALUE);

        System.out.println("Min  float value = " + Float.MIN_VALUE);
        System.out.println("Max  float value = " + Float.MAX_VALUE);

        System.out.println("Min  double value = " + Double.MIN_VALUE);
        System.out.println("Max  double value = " + Double.MAX_VALUE);


    }

}
