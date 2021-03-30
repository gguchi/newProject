import java.util.Scanner;

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

        System.out.println("\n \nTYPECASTING \n");

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

        //CONDITIONAL STATEMENT

        if(20 > 18 ){
            System.out.println("20 is greatr than 18");
        }else if (5 > 2 ){

            //conditions here

        } else {

        }

        int time = 18;

        String resultA = (time < 18 ) ? "Good day." : "Good evening.";
                System.out.println(resultA);


        // SWITCH / IF

        int day = 0;
        int method = 0;
        String weekDay = "Default";
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for IF method | Press 2 for SWITCH method :");
        method = sc.nextInt();


        if( method == 1) {

            System.out.println("Please input a number from 1 ~ 7 :");
            day = sc.nextInt();

            if (day == 1)
                weekDay = "Monday";
            if (day == 2)
                weekDay = "Tuesday";
            if (day == 3)
                weekDay = "Wednesday";
            if (day == 4)
                weekDay = "Thursday";
            if (day == 5)
                weekDay = "Friday";
            if (day == 6)
                weekDay = "Saturday";
            if (day == 7)
                weekDay = "Sunday";
        }

        if(method == 2) {

            System.out.println("Please input a number from 1 ~ 7 :");
            day = sc.nextInt();

            switch (day) {
                case 1:
                    weekDay = "Is Monday";
                    break;
                case 2:
                    weekDay = "Is Tuesday";
                    break;
                case 3:
                    weekDay = "Is Wednesday";
                    break;
                case 4:
                    weekDay = "Is Thursday";
                    break;
                case 5:
                    weekDay = "Is Friday";
                    break;
                case 6:
                    weekDay = "Is Saturday";
                    break;
                case 7:
                    weekDay = "Is Sunday";
                    break;
            }
        }

        System.out.println("Corresponding Day for the number: " + weekDay);

        //WHILE LOOP EXERCISE

        int ranNum = 1;

        while( ranNum <= 6){

            System.out.print("[" + ranNum + "]" + " ");
            ranNum++;

        }

        int addNum = 0;
        int newNum = 0;
        int maxNum = 0;

        System.out.println("\n Please input a number: ");
        maxNum = sc.nextInt();

        while(addNum <= maxNum){

            newNum = newNum + addNum++;
            System.out.print(" " + newNum + " ");

        }

        //DO WHILE EXERCISE

        int evenNum = 1;
        int counter = 1;
        int dwCount = 0;

        System.out.println("Please input a new number: ");
        dwCount = sc.nextInt();

        do{

            if(counter % 2 == 0) {
                System.out.println(" " + counter + " ");
                evenNum++;
            }

            counter++;

            /*
            evenNum = counter * 2;
            System.out.print(" " + evenNum + " ");
            counter++;
            */

        } while (evenNum <= dwCount);


    }

}
