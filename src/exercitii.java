import java.util.Scanner;

public class exercitii {
    public static void main(String[] args) {
        //ex 6
        //det si afis cea mai mare cifra care apare in nr 37680

//        Scanner scanner = new Scanner(System.in);
//        int max, c;   //c = cifra
//        int n = scanner.nextInt();
//        max = 0;
//        do{
//            c = n%10;
//            if(c>max)
//                max = c;
//                n=n/10;
//            }while (n!=0);
//            System.out.println(max);

///ex 7 un progrm care aduna nr de la 0 la 100 fara multipli de 11
//        int suma = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 11 != 0) {
//                suma += i;
//
//            }
//
//
//        }
//        System.out.println(suma);

        //ex 8
        //sa se cit de la tast un nr intreg pana cand se va introduce un nr intreg par,
        //cuprins intre 0-10 cu do-whil

//        Scanner scanner = new Scanner(System.in);
//
//       int y = 1;
//       do{
//           System.out.println("introdu nr");
//           int nr1 = scanner.nextInt();
//           if(nr1>=0 && nr1 <= 10){
//               y = nr1;
//           }
//       }while (y%2!=0);
//        System.out.println("nr par introdus este" + y);

//ex 9
        //un progrm care citeste 2 numere de la tast a,b si afis nr cuprintre intre a,b
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti numarul a: ");
//        int a = scanner.nextInt();
//        System.out.println("Introduceti numarul b: ");
//        int b = scanner.nextInt();
//
//
//        if(a<b){
//
//        for(int i = a; i < b; i++){
////            System.out.println(i);
//    }else{
//        for(int i = a; i>=b; i--){
//            System.out.println(i);
//        }
//        }

//ex 10
        //sa se verif daca un nr e par sau impar

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti numarul:");
//
//        int nr = scanner.nextInt();
//
//        if(nr%2==0){
//            System.out.println("nr par");
//        }else{
//            System.out.println("nr impar");
//        }


        //ex11
        //sa se cit anul nasterii si sa printam daca e minor sau major
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("introduceti anul nasterii");
//        int an = scanner.nextInt();
//        int anCurent = 2022;
//
//        if(anCurent - an >= 18){
//            System.out.println("este major");
//
//        }else {
//            System.out.println("este minor");
//        }


        //ex 6
        //Sa se realizeze un program care
        // citeste un numar de la tastatura si afiseaza un mesaj daca numarul respectiv este sau nu numar prim.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti un numar natural: ");
//        int nr = scanner.nextInt();
//        int nrdivizori = 0;
//        for(int d = 1; d<=nr; d++){
//            if(nr%d == 0){
//                nrdivizori++;
//            }
//        }
//        if(nrdivizori == 2){
//            System.out.println("Nr este prim");
//        } else {
//            System.out.println("Nr nu este prim");
//        }


        //ex 7
        //Sa se realizeze un program care calculeaza pentru un numar citit
        // de la tastatura, factorialul numarului respectiv.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti un nr natural");
//        int nr = scanner.nextInt();
//
//        int nrdescompus = 1;
//        int factorial = 1;
//        for(nrdescompus = 1; nrdescompus <=nr; nrdescompus++){
//            factorial*=nrdescompus;
//
//
//
//        }System.out.println(factorial);

        //ex 8
        //Sa se realizeze un program care afiseaza tabla inmultirii pana la 10 sub forma:
        //1 2 3 4 5 6 7 8 9
        //2 4 6 8 10 12 14 16 18
        //......

       
    }

}

