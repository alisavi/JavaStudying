package JCommit;

public class Main {
    public static void main(String[] args) {
        JCommit commit = new JCommit();
        commit.print();
        double epsilon = 0.000001D;
        float a = 0.4F;
        float b = 0.1F;
        float subtracted = a - b;
        System.out.println(subtracted); // 0.3
        if (subtracted == 0.3) {
            System.out.println("Разница float равно 0,3");
        } else if (subtracted == 0.30000000000000004) {
            System.out.println("Разница float равно 0,30000000000000004"); // float подрезал значение?
        } else if (Math.abs(subtracted - 0.3) < epsilon) {
            System.out.println("Разница float равна 0.3");
        }
        double c = 0.4;
        double d = 0.1;
        double s = c - d;
        System.out.println(s);
        if (s == 0.3) {
            System.out.println("Разница равно 0,3");
        } else if (s == 0.30000000000000004) {
            System.out.println("Разница равно 0,30000000000000004");
        }
        if (Math.abs(s - 0.3) < epsilon) {
            System.out.println("Разница равна 0.3");
        }
    }
}
