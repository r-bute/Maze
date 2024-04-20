public class TraditionalSwitch {
    public static void main(String[] args) {
        System.out.println(getLetter("A"));


    }
    public static  String getLetter(String myWord) {
        switch(myWord){
            case "A":
                return "Able";
            case "B":
                return "Baker";
            case "C":
                return "Charlie";
            case "D":
                return "Dog";
            case "E":
                return "Easy";
            default:
                return "not found";
        }
    }
   
}
