import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        word = word.toLowerCase();
        word = word.replace(" ", "");
        word = word.replace(",", "");
        word = word.replace(":", "");        
        word = word.replace("?", "");
        word = word.replace(".", "");
        
        checkWord(word);
    }

    public static void checkWord(String word) {
        boolean isPalindrome = false;
        int palin = 0;
        
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == word.charAt((word.length()-1)-i)) {
              palin++; 
            }
        }
        
        
        if(palin == word.length()) {
           isPalindrome = true; 
        }
        
        if(isPalindrome) {
           System.out.println("It is a Palindrome");   
        } else {
           System.out.println("It is not a Palindrome"); 
        }
    }
}
