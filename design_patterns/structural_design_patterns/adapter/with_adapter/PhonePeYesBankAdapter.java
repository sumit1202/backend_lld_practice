package design_patterns.structural_design_patterns.adapter.with_adapter;

import design_patterns.structural_design_patterns.adapter.with_adapter.third_party_apis.YesBankApi;

public class PhonePeYesBankAdapter implements PhonePeBankApiAdapter {

    YesBankApi yesBankApi = new YesBankApi();

    @Override
    public int balanceCheckAndGet() {
        return yesBankApi.getBalance();
    }

}
