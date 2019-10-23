import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String rain = new String("rain");
        String windy = new String("windy");
        String snow = new String("snow");
        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if (answer.equals(rain)) {
            System.out.println("Take your umbrella!");
        } else if (answer.equals(windy)) {
            System.out.println("Wear your jacket!");
        } else if (answer.equals(snow)) {
            System.out.println("Wear a coat and take a shovel!");
        } else {
            System.out.println("Enjoy your day!");
        }
    }
}
