package Patterns;
public class basicPatterns {

    //star pattern
    /*  
     * 
     * *
     * * *
     * * * *
     */
    public static void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //invertedstar pattern
    /*
     * * * *
     * * *
     * *
     * 
     */
    public static void invertedStar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //half pyramid with numbers 
    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     */
    public static void halfNumPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //half pyramid with characters 
    /*
     * A
     * B C
     * D E F
     * G H I J
     */
     public static void halfCharPyramid(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
     }
    public static void main(String args[]){
        System.out.println("\nStars in traingle shape");
        star(4);
        System.out.println("\nStars in inverted triagnle");
        invertedStar(5);
        System.out.println("\nHalf pyramid with numbers");
        halfNumPyramid(4);
        System.out.println("\nHalf pyramid formed by characters");
        halfCharPyramid(7);
    }
}
