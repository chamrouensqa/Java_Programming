public class test{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Multiple output");
        System.out.println("Multiple println");
        System.out.println(3+7);
        System.out.print("Not insert new line");
        System.out.println("Test about not insert new line");
        System.out.println("--------------------------------------");
        //Single command test
        System.out.println("Here above is the single comment");
        System.out.println("--------------------------------------");
        System.out.println("Using a comment after code");//This the commenter after code
        System.out.println("-----------------Multiple Line Comments---------------------");
        /* I just want to test my muliple line of code here
           Don't worry about this line of code,
           It wont affect the performance.
         */
        System.out.println("Mulple line of code is working fine");
        System.out.println("-----------------Variable---------------------");
        int myInt = -10;
        System.out.println(myInt);
        myInt = 20;
        System.out.println(myInt);
        String myText = "Starting in programming";
        System.out.println(myText);
        myText = "Cambodia";
        System.out.println(myText);
        float myFloat = 500.9f;
        System.out.println(myFloat);
        float newFloat = myFloat = 10000.9f;
        System.out.println(newFloat);
        System.out.println(myFloat);
        double myDec = 99999.9999;
        System.out.println(myDec);
        char oneChar = 'c';
        char twoChar = '@';
        char threeChar = '4';
        int asciiValue1 = (int) oneChar;
        int asciiValue2 = (int) twoChar;
        int asciiValue3 = (int) threeChar;
        System.out.println(asciiValue1);
        System.out.println(asciiValue2);
        System.out.println(asciiValue3);
        System.out.println(asciiValue1+asciiValue2+asciiValue3);
        boolean isCheckTrue = true;
        boolean isCheckFalse = false;
        System.out.println(isCheckTrue);
        System.out.println(isCheckFalse);
        final boolean isAlwaysTrue = true;
        System.out.println(isAlwaysTrue);
        System.out.println("-----------------Print Variable---------------------");
        String myName = "Chamrouen Sann";
        System.out.println("Hello my name is "+myName);
        String firstName = "Chamrouen ";
        String lastName = "Sann";
        String fullname = (firstName+lastName);
        System.out.println("This is my full name "+fullname);
        System.out.println(firstName+lastName);
        System.out.println("-----------------Declarative multiple Variable---------------------");
        int x=10,y=20,z=30;
        System.out.println(x+y+z);
        int x1,y1,z1;
        x1 = 30;
        y1 = 30;
        z1 = 30;
        System.out.println(x1+y1+z1);
        byte lowByte = -127;
        byte highByte = 127;
        System.out.println(lowByte);
        System.out.println(highByte);
        System.out.println("The byte is starting from "+lowByte+" to "+highByte);
        short lowShort = -32768;
        short highShort = 32767;
        System.out.println("The short is starting from "+lowShort+" to "+highShort);
        int lowInt = -2147483648;
        int highInt = 2147483647;
        System.out.println("The integer is starting from "+lowInt+" to "+highInt);
        long lowLong = -9223372036854775808L;
        long highLong = 9223372036854775807L;
        System.out.println("The long is starting from "+lowLong+" to "+highLong);
        float lowFloat = -1.2326881170964210133235844493647578399896761397f;
        float highFloat = 1.2326881170964210133235844493647578399896761397f;
        System.out.println("This float is starting form "+lowFloat+" to "+highFloat);
        double lowDouble = -1.2319424262968340690959569303592166698667749656295512558902457374820000000000000000000000000000000000000000000000000000000000000000000d;
        double highDouble = 1.2319424262968340690959569303592166698667749656295512558902457374820000000000000000000000000000000000000000000000000000000000000000000d;
        System.out.println("This doulbe is starting form "+lowDouble+" to "+highDouble);
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        System.out.println("This Boolean are having two type "+trueBoolean+" to "+falseBoolean);
        char charType = 'a';
        System.out.println("This character is strong a single value "+charType);
        System.out.println("-----------------Java Type Casting---------------------");
        int wideningCasting = 10;
        System.out.println("The original value " + wideningCasting);
        double convertWideningCasting = wideningCasting;
        System.out.println("The convert value " + convertWideningCasting);
        double narrowCasting = 9.9d;
        int convertNarrowCasting = (int) narrowCasting;
        System.out.println("The original value is " + narrowCasting);
        System.out.println("The convert value is " + convertNarrowCasting);
        System.out.println("-----------------Java Operators---------------------");
        int operatorx=103, operatorY=4;
        int operatorAnswer = operatorx + operatorY;
        System.out.println(operatorAnswer);
        System.out.println(operatorAnswer+100);
        System.out.println(100-operatorx-operatorY);
        System.out.println(operatorx*operatorY);
        System.out.println(100/operatorx/operatorY);
        System.out.println(operatorx%operatorY);
        System.out.println(++operatorx);
        System.out.println(--operatorY);
        System.out.println("-----------------Java Assingment Operator---------------------");
        int assignmentX = 10;
        System.out.println("This is assignment operator "+assignmentX);
        assignmentX += 90;
        System.out.println("This is the assignment operator assingning shortcut addition "+assignmentX);
        assignmentX -= 3;
        System.out.println("This is the assignment operator assingning shortcut subtraction "+assignmentX);
        assignmentX *= 3;
        System.out.println(assignmentX);
        assignmentX /= 3;
        System.out.println(assignmentX);
        assignmentX %= 2;
        System.out.println(assignmentX);
        //Bitwise operator
        int bitwiseOpAnd = 100;
        bitwiseOpAnd &= 3;
        System.out.println("Binary AND is = "+bitwiseOpAnd);
        int bitwiseOpOr = 200;
        bitwiseOpOr |= 2;
        System.out.println("Binary Or is = "+bitwiseOpOr);
        int bitwiseOpXor = 200;
        bitwiseOpXor ^= 2;
        System.out.println("Binary Xor is = "+bitwiseOpXor);
        int bitwiseOpCompliment = 200;
        bitwiseOpCompliment = ~bitwiseOpCompliment;
        System.out.println(bitwiseOpCompliment);
        System.out.println("-----------------Java Comparison Operators---------------------");
        int e1 = 10, e2 = 10;
        if (e1==e2){
            System.out.println("The equal comparison operators is correct");
        }
        float e3 = 20.2f, e4 = 40.2f;
        if (e3!=e4){
            System.out.println("The not equal comparison operator is correct");
        }
        float e5 = 20.2f, e6 = 40.2f;
        if (e6>e5){
            System.out.println("The greater than comparison operator is correct");
        }
        float e7 = 20.2f, e8 = 40.2f;
        if (e7<e8){
            System.out.println("The less than comparison operator is correct");
        }
        float e9 = 10, e10 = 10;
        if (e9>=e10){
            System.out.println("The greater than or equal comparison operator is correct");
        }
        float e11 = 10, e12 = 10;
        if (e11<=e12){
            System.out.println("The less than or equal comparison is correct");
        }
        System.out.println("-----------------Java Logical Operators---------------------");
        //Logical AND
        int logical1=100, logical2=200;
        if (logical1==100 && logical2==200){
            System.out.println("The logical operator AND is working correctly");
        }
        //Logical Or
        int logical3=300, logical4=400;
        if (logical3==300 || logical4==100){
            System.out.println("The logical operator Or is working correctly");
        }
        //Logical Not
        int logical5=500, logical6=600;
        if (!(logical5>1000 && logical6>1000)){
            System.out.println("The logical operator Not is working correctly");
        }
        System.out.println("-----------------Java String---------------------");
        String stringLength="Chamrouensann is worker at NBC IT";
        System.out.println("The text leght contains is "+stringLength.length());
        System.out.println("String to lowercase"+stringLength.toLowerCase());
        System.out.println("String to uppercase"+stringLength.toUpperCase());
        //Finding index
        System.out.println("Finding index is "+stringLength.indexOf("is"));
        System.out.println("-----------------Java Special Character---------------------");
        String specialTxt1 = "This text contain \"special string\"";
        String specialTxt2 = "This text contain \'special string\'";
        String specialTxt3 = "This text contain \\special string\\";
        System.out.println(specialTxt1);
        System.out.println(specialTxt2);
        System.out.println(specialTxt3);
        System.out.println("-----------------Java Math---------------------");
        //Maximum Value
        System.out.println("Maximum Value "+Math.max(5,10));
        //Minimum Value
        System.out.println("Minimum Value "+Math.min(210,2));
        //Squard Root
        System.out.println("Square root "+Math.sqrt(64));
        //Absolute Positive
        System.out.println("Absolute positive "+Math.abs(-6.7));
        //Random Number
        System.out.println("Random number "+Math.random());
        int numRandom = (int)(Math.random()*101);
        System.out.println("Random number from 0 to 100 = "+numRandom);
        System.out.println("-----------------Java Booleans---------------------");
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("The result of boolean is Java Fun? "+isJavaFun);
        System.out.println("The result of boolean is Fish Tasty? "+isFishTasty);
        //Boolean Expression
        int boolean1=10;
        int boolean2=20;
        System.out.println(boolean1<boolean2);
        System.out.println(boolean1>boolean2);
        System.out.println(boolean1==10);
        System.out.println(boolean1==20);
        System.out.println(10==20);
        System.out.println(10!=20);
    }
}