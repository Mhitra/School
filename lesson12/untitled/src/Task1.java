class Person {
    private String name;
    private String nationalInsuranceNumber;
    public Person() {
        this("", "");
    }
    public Person(String name, String nationalInsuranceNumber) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStartedWork;

    public Employee() {
        this("", "", 0, 0);
    }

    public Employee(String name, String nationalInsuranceNumber, double annualSalary, int yearStartedWork) {
        super(name, nationalInsuranceNumber);
        this.annualSalary = annualSalary;
        this.yearStartedWork = yearStartedWork;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStartedWork() {
        return yearStartedWork;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStartedWork(int yearStartedWork) {
        this.yearStartedWork = yearStartedWork;
    }
}