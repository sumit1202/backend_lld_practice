package design_patterns.structural_design_patterns.adapter.with_adapter;

import design_patterns.structural_design_patterns.adapter.with_adapter.third_party_apis.ICICIBankApi;

public class PhonePeICICIBankAdapter implements PhonePeBankApiAdapter{

    ICICIBankApi iciciBankApi =new ICICIBankApi();

    @Override
    public int balanceCheckAndGet() {
        return iciciBankApi.retrieveBalance();
    }
    
}
