public class main {

    public static void main(String[] args){
        //Primitive
        byte numberLessThanZero;
        int wholeNumbers = 122;
        long largeDecimalNumbers = -12;
        float numberWithDecimalPlaces = 8.3f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1232;
        boolean isTrueorFalse = true;
        char singleCharacter = '\u0041';

        /*double doubleNumber;
        int i = 23;
        doubleNumber = i;*/

        //Print all primitive type, output and run

        System.out.println( wholeNumbers);
        System.out.println(largeDecimalNumbers);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumberWithDecimalPlaces);
        System.out.println(isTrueorFalse);
        System.out.println(singleCharacter);

        //Non primitive

        //for loop
        System.out.println("For Loop \r");
        int x, y = 10;

        for(x=0; x<y; x++) {
            System.out.print(x);
        }

        System.out.println("\r");

        //while loop

        System.out.println("While Loop \r");

        int a=11;
        while(a != 20) {
            System.out.print(a );
            a++;
        }

        System.out.println("\r");

        //do .. while

        System.out.println("Do.. While \r");

        int c=21;

        do{

            System.out.print(c);
            c++;

        }while(c != 30);



    }

}
