package academy.java.oop;

public class TerminalInteraction {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please especify a location!");
        } else {
            String location = args[0];
            int temperature = 60 + (int) (Math.random()*10);
            System.out.println("The weather in "+location+" is "+temperature+" degrees");
        }
    }
}
