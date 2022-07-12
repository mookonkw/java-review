package gov.irs;

public interface TaxPayer {
    //Key point:  Interface has to be absolutely abstract
    static final double HOURLY_TAX_RATE = 0.25;
    static final double SALARIED_TAX_RATE = 0.30;
    static final double CORP_TAX_RATE = 0.10;

    //final is used when you don't want a value to change
    double computeMonthlyTaxToPay();
}
