public class Main {

    public static void main(String[] args) {
        scenario1();
        scenario2();
        scenario3();
        scenario4();
        scenario5();

    }
        public static void scenario1() {
        int numberTrue = 0; int numberFalse = 0; int count = 100000;
            System.out.println("Scenario one: Expected result from math 50%");
        for (int i = 0; i < count; i++) {
            int result = (int)Math.floor(Math.random()*6)+1;
            if (result == 1 || result == 3 || result== 5)

            { numberTrue++; } else {
                numberFalse++; } }
        System.out.println("Count of True : " + numberTrue);
        System.out.println("Count of False : " + numberFalse);
        System.out.println("Actual Result " + ((float)numberTrue/(float)count)*100 + "%");
    }
    public static void scenario2() {
        System.out.println();
        System.out.println("Scenario two: Expected result from math 80%");
        int numTrue = 0; int numFalse = 0; int count = 100000;
        for (int i = 0; i < count; i++) {

            int result = (int) Math.floor(Math.random() * 10) + 1;

            if (result == 2 || result == 4 || result == 5 || result == 6 || result == 7 || result == 8 || result == 9 || result == 10) {
                numTrue++;
            } else {

                numFalse++;
            }
        }
        System.out.println("Count of True : " + numTrue);
        System.out.println("Count of False : " + numFalse);
        System.out.println("Actual Result " + ((float)numTrue/(float)count)*100 + "%");
        }
    public static void scenario3() {
        System.out.println();
        System.out.println("Scenario three: Expected result from math 25%");
        int numberTrue = 0; int numberFalse = 0; int count = 100000;
        for (int i = 0; i < count; i++) {

            int roll1 = (int)Math.floor(Math.random()*6)+1;

            int roll2 = (int)Math.floor(Math.random()*6)+1;

            if ((roll1 == 2 || roll1 == 4 || roll1 == 6) && (roll2 == 1 || roll2 == 3 || roll2 == 5)) {
                numberTrue++;
            } else {

                numberFalse++;
            }
        }
        System.out.println("Count of True : " + numberTrue);
        System.out.println("Count of False : " + numberFalse);
        System.out.println("Actual Result " + ((float)numberTrue/(float)count)*100 + "%");
    }
    public static void scenario4() {
        System.out.println();
        System.out.println("Scenario Four: Expected result from math 3.70%");
        int numberTrue = 0; int numberFalse = 0; int count = 100000;
        for (int i = 0; i < count; i++) {

            int roll1 = (int)Math.floor(Math.random()*6)+1;
            int roll2 = (int)Math.floor(Math.random()*6)+1;
            int roll3 = (int)Math.floor(Math.random()*6)+1;

            if ((roll1 == 1 || roll1 == 2) && (roll2 == 3 || roll2 == 4) && (roll3 == 5 || roll3 == 6)) {
                numberTrue++;
            } else {

                numberFalse++;
            }
        }
        System.out.println("Count of True : " + numberTrue);
        System.out.println("Count of False : " + numberFalse);
        System.out.println("Actual Result " + ((float)numberTrue/(float)count)*100 + "%");
    }
    public static void scenario5() {
        System.out.println();
        System.out.println("Scenario Five: Expected result from math 27.77%");
        int numberTrue = 0; int numberFalse = 0; int count = 100000;
        for (int i = 0; i < count; i++) {

            int roll1 = (int)Math.floor(Math.random()*6)+1;
            int roll2 = (int)Math.floor(Math.random()*6)+1;
            int roll3 = (int)Math.floor(Math.random()*6)+1;
            int roll4 = (int)Math.floor(Math.random()*6)+1;

            if ((roll2 != roll1 && roll2 != roll3 && roll2 != roll4) && (roll3 != roll1 && roll3 != roll2 && roll3 != roll4) && (roll4 != roll1 && roll4 != roll3 && roll4 != roll3)) {
                numberTrue++;
            } else {

                numberFalse++;
            }
        }
        System.out.println("Count of True : " + numberTrue);
        System.out.println("Count of False : " + numberFalse);
        System.out.println("Actual Result " + ((float)numberTrue/(float)count)*100 + "%");
    }
    }
