import java.util.Scanner;

class PPAP{ 
    public static void main (String[] args) {
        lyrics();
    }

    public static void lyrics() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter object 1: ");
        String object1 = sc.nextLine();
        System.out.println("Enter object 2: ");
        String object2 = sc.nextLine();

        String newString = object2.toUpperCase();

        System.out.println("I have a " + object1 + ", I have a " + object2);
        System.out.println("Uh! " + newString.substring(0, 1) + object2.substring(1, object2.length()) + " " + object1);
    }
}