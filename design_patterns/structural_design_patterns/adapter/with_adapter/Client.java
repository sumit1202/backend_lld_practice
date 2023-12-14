package design_patterns.structural_design_patterns.adapter.with_adapter;

public class Client {

    public static void main(String[] args) {

        PhonePeBankApiAdapter yesbankAdapter = new PhonePeYesBankAdapter();
        PhonePeBankApiAdapter iciciBankAdapter = new PhonePeICICIBankAdapter();

        PhonePe phonePe1 = new PhonePe(iciciBankAdapter);
        PhonePe phonePe2 = new PhonePe(yesbankAdapter);

        System.out.println("\n=> Logging for icici bank...");
        System.out.println(phonePe1.knowBalance());

        System.out.println("\n=> Logging for yes bank...");
        System.out.println(phonePe2.knowBalance());

    }

}
