package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    @Test
    public void computeMonthlyTaxToPay_should_return_correct_tax_value_based_on_tax_rate() {

        SalariedEmployee mabel = new SalariedEmployee("mabel", LocalDate.of(2019, 8, 29), 7500.0);

        double monthlyTaxToPay = mabel.computeMonthlyTaxToPay();
        Assert.assertEquals(2250.0, monthlyTaxToPay, 0.01);
    }
}