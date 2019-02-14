public class GlobalVariables {
    static int myInteger = 5;

    public static void main(String[] args){

        System.out.println("TO WYWOŁUJE SIĘ W MAIN");
        myMethod();
        System.out.println(myInteger);

    }

    public static void myMethod() {
        System.out.println("TO WYWOŁUJE SIĘ W MYMETHOD");
        System.out.println(myInteger);


    }
}
