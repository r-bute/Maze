public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, ron");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("i'm scared of aliens");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got a high score");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is an error");
        }

        double myVar = 20.00d;
        double myVar1 = 80.00d;
        double myVar2 = (myVar1 + myVar)*100d;
        System.out.println(myVar2);
        double myVar3 = myVar2 % 40 ;
        System.out.println(myVar3);

        boolean isRemainder = (myVar3 == 0) ? true: false;
        System.out.println(isRemainder);
        if (myVar3 == 0){
            System.out.println("remainder is zero");

        }
    }

    /* now update the branch */
}
