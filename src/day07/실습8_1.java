package day07;

public class Visualizer {
    public String getStars(int n) {
        return "★".repeat(n);
    }

    public static void main(String[] args) {
        Visualizer v = new Visualizer();
        System.out.println(v.getStars(5));
    }
}