package entities;

public class Company extends TaxPayer {

    private Integer employeesNum;

    public Company() {
        super();
    }

    public Company(String name, double annualIncome, Integer employeesNum) {
        super(name, annualIncome);
        this.employeesNum = employeesNum;
    }

    public Integer getEmployeeNum() {
        return employeesNum;
    }

    public void setEmployeeNum(Integer employeesNum) {
        this.employeesNum = employeesNum;
    }

    @Override
    public Double tax() {
        return (employeesNum > 10) ? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.16;
    }
}