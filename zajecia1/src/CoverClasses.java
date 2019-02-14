public class CoverClasses {
    public static void main(String[] args){
        char a = 'A';
        char b = 'B';
        char alpha = '\u03B1'; //grecka litera alfabetu
        Character.isDigit('1'); //true
        Character.isDigit('f'); //false
        Character.isLetter('x'); //true
        Character.isLowerCase('d'); //true

        System.out.println(alpha);
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('f'));
        System.out.println( Character.isLetter('x'));
        System.out.println(Character.isLowerCase('d'));


    }
}
