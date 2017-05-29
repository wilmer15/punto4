/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco2;

/**
 * Clase que simula una clase del modelo.
 * @author fabian.giraldo
 */
public class Model {
    
    private String Annual_Interest_Rate;
    private String Number_of_Years;
    private String Loan_Amount;

    public String getAnnual_Interest_Rate() {
        return Annual_Interest_Rate;
    }

    public void setAnnual_Interest_Rate(String Annual_Interest_Rate) {
        this.Annual_Interest_Rate = Annual_Interest_Rate;
    }

    public String getNumber_of_Years() {
        return Number_of_Years;
    }

    public void setNumber_of_Years(String Number_of_Years) {
        this.Number_of_Years = Number_of_Years;
    }

    public String getLoan_Amount() {
        return Loan_Amount;
    }

    public void setLoan_Amount(String Loan_Amount) {
        this.Loan_Amount = Loan_Amount;
    }


}
