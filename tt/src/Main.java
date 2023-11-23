import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("Andrey", 100, 50);
        Warrior w2 = new Warrior("KOOR", 50, 40);
        w1.createWar(w2);
        w1.war(w2);
        for (int i = 0; i < 10; i++) {
            w2.workout();
        }
        w1.createWar(w2);
        w1.war(w2);
    }
}
