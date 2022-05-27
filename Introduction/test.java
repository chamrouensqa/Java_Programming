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
    }
}