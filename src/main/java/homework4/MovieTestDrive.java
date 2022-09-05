package homework4;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie("Gone with the Stock","Tragic", -2);
        one.playIt();
        Movie two = new Movie("Lost in Cubicle Space","Comedy", 5);
        two.playIt();
        Movie three = new Movie("Byte Club","Tragic but ultimately uplifting", 127);
        three.playIt();
    }
}
