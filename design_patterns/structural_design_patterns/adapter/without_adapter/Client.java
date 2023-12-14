package design_patterns.structural_design_patterns.adapter.without_adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();

        // System.out.println("\n=> Logging for Yes Bank API:");
        // System.out.println(phonePe.checkBalance());

        // ? say for certain reason phone pe need to migrate to different bank api i.e.
        // ? ICICI bank api
        // ? too many modifications needed - SRP,OCP,Dependency Inversion violation

        System.out.println("\n=> Logging for ICICI Bank API:");
        System.out.println(phonePe.checkBalance());

    }
}
