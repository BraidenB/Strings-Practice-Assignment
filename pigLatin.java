import java.util.Scanner;

class pigLatin{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        word = word.toLowerCase();
        if(word.length() > 2) {
            translate(word);
        } else {
            System.out.println("Too short of a word..."); 
        }
    }

    public static void translate(String word) {
        int front = 0;
        int back = 0;
        boolean space = false;
        word = word + " ";

        for(int i = 0; i < word.length(); i++) {
            if(word.substring(i, i+1).equals(" ")) {
                space = true;
                back = i;
                String first = word.substring(front, back);
                if(first.length() > 2) {
                    System.out.print(first.substring(1, first.length()) + first.substring(0, 1) + "ay ");
                } else {
                    System.out.print(first + " ");
                }
                front = back +1;
            } 
        }
    }
}

