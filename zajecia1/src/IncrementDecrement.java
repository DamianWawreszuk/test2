public class IncrementDecrement {
    public static void main(String[] args) {
        int myNumber = 3;
        myNumber++;
        System.out.println(myNumber);
        myNumber = myNumber + 1;
        System.out.println(myNumber);

        /*myNumber++;
        myNumber = myNumber + 1;*
        to jest to samo, 2 metody, krótsza i dłuższa*/

        int mySecondNumber = 20;
        mySecondNumber--;
        System.out.println(mySecondNumber);
        mySecondNumber = mySecondNumber - 1;
        System.out.println(mySecondNumber);
        /*mySecondNumber--;
        * mySecondNumber = mySecondNumber - 1;*/

        int myVariable = 100;
        System.out.println(myVariable++);
        System.out.println(myVariable);

        int mySecondVariable = 2000;
        System.out.println(++mySecondVariable);

        int myInteger = 5;
        int mySecondInteger = 10;

        myInteger = mySecondInteger++;
        System.out.println(myInteger);
        System.out.println(mySecondInteger);

       byte sto = 100;
       byte dwa = 2;
       short stoDwa = (short) (sto + dwa);
       System.out.println(stoDwa);






    }
}
