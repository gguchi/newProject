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
        System.out.println("PRINTING PRIMITIVE VARIABLE TYPES \n");

        System.out.print("Int Value: " + wholeNumbers + " || ");
        System.out.print("Long Value: " +largeDecimalNumbers + " || ");
        System.out.print("Float Value: " +numberWithDecimalPlaces + " || ");
        System.out.print("Double Value: "+ veryLargeNumberWithDecimalPlaces + " || ");
        System.out.print("Boolean Condition: " + isTrueorFalse + " || ");
        System.out.print("Single Character: " + singleCharacter + " || \n");

        //Non primitive

        //for loop

        System.out.println("LOOPS \n");

        System.out.println("For Loop \r");
        int x, y = 10;

        for(x=0; x<y; x++) {
            System.out.print(x + " ");
        }

        System.out.println("\r");

        //while loop

        System.out.println("While Loop \r");

        int a=11;
        while(a != 20) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println("\r");

        //do .. while

        System.out.println("Do.. While \r");

        int c=21;

        do{

            System.out.print(c + " ");
            c++;

        }while(c != 30);

        //MATH OPERATORS

        System.out.println("BASIC MATH OPERATION \n");

        int ax = 5;
        int ay = 6;

        System.out.println(ax + ay);

        //COMPARISON


            System.out.print((ax > ay) + " ");
            System.out.print((ax < ay) + " ");
            System.out.print((ax >= ay) + " ");
            System.out.print((ax <= ay) + " ");
            System.out.print((ax == ay) + " ");
            System.out.print((ax != ay) + "\n");


        //COMPOUND ASSIGNMENT OPERATORS

        System.out.println("COMPOUNDING VALUES \n");

        int number = 5;
        int newValue;

        number += 3;
        System.out.print(number+ " ");
        number -= 3;
        System.out.print(number+ " ");
        number *= 3;
        System.out.print(number+ " ");
        number /= 3;
        System.out.print(number+ " ");
        number %= 3;
        System.out.print(number+ "\n");

        //INCREMENTAL & DECREMENTAL OPERATOR

        System.out.println("INCREMENTING AND DECRIMENTING OPERATION \n");

        int IDOval = 10;
        int IDOval2 = 40;

        int IDOval3 = IDOval * ++IDOval2;
        System.out.println("Multiplied with incremented second value " + IDOval3);

        int IDOval4 = IDOval * --IDOval2;
        System.out.println("Multiplied with decremented second value " + IDOval4);


        while(IDOval != 20)
            System.out.print(IDOval++ + " ");

        System.out.println("\r");

        while(IDOval2 != 25)
            System.out.print(IDOval2-- + " ");

        //TYPECASTING

        System.out.println("\r TYPECASTING \n");

            //Wide Casting
            // byte -> short - > char -> int -> long -> float -> double

        short myShort = 9;
        double myDouble = myShort;

        System.out.print(myShort + " ");
        System.out.print(myDouble + " \n");

            //Narrow Casting

        double newDouble = 9.78;
        short newShort = (short) newDouble;

        System.out.print(newDouble + " ");
        System.out.print(newShort + " \n");
    }

}
