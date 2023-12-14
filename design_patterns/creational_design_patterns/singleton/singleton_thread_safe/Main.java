package design_patterns.creational_design_patterns.singleton.singleton_thread_safe;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1.equals(s2)) {
            System.out.println("\nYes a Singleton");
        } else {
            System.out.println("\nNot a Singleton");
        }
    }
}
