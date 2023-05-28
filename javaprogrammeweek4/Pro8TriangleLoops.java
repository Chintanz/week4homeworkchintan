package javaprogrammeweek4;
/** Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@*/
public class Pro8TriangleLoops {
    public static void main(String[] args) {
        int a, b;
        for(a = 0; a < 5; a++) {
            for(b = 0; b <= a; b++) {
                System.out.print("@ ");
            }
            System.out.println();
    }
}}
