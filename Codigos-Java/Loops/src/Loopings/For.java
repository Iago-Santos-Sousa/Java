package Loopings;

public class For {

    public void loopFor() {
        for(int i = 5; i >= 0; i--) {
            System.out.println("Hello World" + " " + i);
        }
    }

    public static void main(String[] args) {
        For obj = new For();
        obj.loopFor();

    }
}
