import java.util.Scanner;

class toBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();

        convert(decimal);
    }

    public static void convert(int decimal) {
        int value = 1;
        int num = 0;

        for(int i = 0; 0 < decimal; i++) {
            if(decimal%2 == 1) {
                num = num + 1*value; 
                decimal = decimal/2;
            } else {
                decimal = decimal/2;
            }
            value = value*10;
        }

        System.out.println(num);
    }
}
