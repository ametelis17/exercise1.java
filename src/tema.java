public class tema {
    public static void main(String[] args) {
        //Scrieti un program Java care primeste la intrare un numar de secunde si intoarce
        // numarul maxim de ore, de minute, de secunde care este echivalent ca timp cu numarul
        // initial de secunde. De exemplu, 7384 secunde ese echivalent cu 2 ore, 3 minute si 4 secunde.

        int nrSecunde = 5000;
        int nrOre = 5000/60/60;
        int sec = 5000%60;
        System.out.println("Nr ore: " + nrOre);
        int nrMin =  5000/60%60;
        System.out.println("Nr min: " + nrMin);
        System.out.println("Nr sec: " + sec);


    }
}
