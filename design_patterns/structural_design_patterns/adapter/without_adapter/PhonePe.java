package design_patterns.structural_design_patterns.adapter.without_adapter;

public class PhonePe {
    // YesBankAPI yesBankAPI;
    ICICIBankApi iciciBankApi;

    PhonePe() {
        // this.yesBankAPI = new YesBankAPI();
        this.iciciBankApi = new ICICIBankApi();
    }

    public int checkBalance() {
        // return yesBankAPI.getBalance();
        return iciciBankApi.retrieveBalance();
    }
}
