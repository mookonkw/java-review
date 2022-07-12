package gov.irs;

class IRS {

    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;

//    public IRS(TaxPayer taxPayers) {
//        register(taxPayers);
//    }

    public void register(TaxPayer taxPayers) {
        // - receive Taxpayer object as argument
        // - place that taxPayer object into the first empty bucket of the array

        taxPayers[currentIndex++] = taxPayer;


    }

    public double computeTotalMonthlyTaxToCollect(){

        // = for every TaxPayer object in the array , call
        // computeMonthlyTaxToPay() method
        // - add them up to totalMonthlyTaxToCollect variable
        // - return it

        return 0.0;
    }



}