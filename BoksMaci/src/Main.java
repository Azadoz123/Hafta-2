// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,120,100,100);
        Fighter f2 = new Fighter("B",20,85,85,50);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}