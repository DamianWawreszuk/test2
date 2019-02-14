public class LongExample {
    public static void main(String[] args){
        int lightSpeed = 300_000;
        long numberOfDays = 1000;
        long seconds;
        long distance;

        seconds = numberOfDays * 24 * 60 * 60;
        distance = lightSpeed * seconds;
        System.out.println("W " + numberOfDays + " dni światło przebędzie dany dystans " + distance + " kilometrów");


    }
}
