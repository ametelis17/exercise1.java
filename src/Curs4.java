import java.util.Scanner;

public class Curs4 {
    public static void main(String[] args) {
        ////ex 1


//        System.out.println("Introdu primul nr: ");
//        int nr1 = scanner.nextInt();
//        System.out.println("Introdu al doilea nr: ");
//        int nr2 = scanner.nextInt();
//        System.out.println("Introdu al treilea nr: ");
//        int nr3 = scanner.nextInt();
//
//        //sa comparam cele 2 nr, daca primul este mai mare il afisam si daca al doilea
//        //este mai mare il afisam
//
//        if(nr1 > nr2 && nr1 > nr3){
//            System.out.println("primul nr este mai mare");
//        }else if (nr2>nr1 && nr2>nr3){
//            System.out.println("al 2 lea nr este mai mare");
//        }else if(nr3>nr1 && nr3>nr2){
//            System.out.println("al 3 lea nr este mai mare");
//        }

//        ex 2
//        Scanner scanner = new Scanner(System.in);
//        String ziDinSapt = scanner.nextLine();
//        switch(ziDinSapt){
//            case "Luni":
//                System.out.println("spor la munca");
//                break;
//            case "Marti":
//                System.out.println("spor la munca");
//                break;
//            case "Miercuri":
//                System.out.println("spor la munca");
//                break;
//            case " Joi":
//                System.out.println("Spor la munca");
//                break;
//            case"vineri":
//                System.out.println("spor la munca");
//                break;
//            case"sambata":
//                System.out.println("e sambata");
//                break;
//            case "duminica":
//                System.out.println("e duminica");
//                break;
//            default:
//                System.out.println("val gresita");
//        }


        Scanner scanner = new Scanner(System.in);
        for( int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("introdu un nr de la care sa inceapa while");
        int x = scanner.nextInt();
//        while(x<10){
//            System.out.println(x);
//            x++;
//        }


        do{
            System.out.println("sunt in do while");
            x++;

        }while(x<10);
    }
}
