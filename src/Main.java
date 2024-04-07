import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Kyrgyzstan"+"\n"+
                "What area do you want to know?");
        String a = sc.nextLine();
        switch (a.toLowerCase(Locale.ROOT)){
            case "chui" :
                System.out.println("Chui"+Area.CHUI);
                break;
            case "osh" :
                System.out.println("Osh"+Area.OSH);
                break;
            case "jalal-abad" :
                System.out.println("Jalal - Abad"+Area.JALALABAD);
                break;
            case "naryn":
                System.out.println("Naryn"+Area.NARYN);
                break;
            case "yssyk-kol":
                System.out.println("Yssyk-kol"+Area.YSSYKKOL);
                break;
            case "talas":
                System.out.println("Talas"+Area.TALAS);
                break;
            case "batken" :
                System.out.println("Batken"+Area.BATKEN);
            default:
                System.out.println("not is area");
        }
    }
}