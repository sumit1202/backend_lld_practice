package design_patterns.structural_design_patterns.adapter.with_adapter;

public class PhonePe {
    private PhonePeBankApiAdapter phonePeBankApiAdapter;

    public PhonePe(PhonePeBankApiAdapter phonePeBankApiAdapter) {
        this.phonePeBankApiAdapter = phonePeBankApiAdapter;
    }

    public int knowBalance() {
        return this.phonePeBankApiAdapter.balanceCheckAndGet();
    }

}
