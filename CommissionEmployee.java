
public class CommissionEmployee
{
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales; // gross weekly sales
    protected double commissionRate; // commission percentage

    // five-argument constructor
    public CommissionEmployee( String first, String last, String ssn,
                               double sales, double rate )
    {
        // implicit call to Object constructor occurs here

        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales ); // validate and store gross sales
        setCommissionRate( rate ); // validate and store commission rate
    } // end five-argument CommissionEmployee constructor

    // set first name
    public void setFirstName( String first )
    {
        firstName = first; // should validate
    } // end method setFirstName

    // return first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName( String last )
    {
        lastName = last; // should validate
    } // end method setLastName

    // return last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setSocialSecurityNumber( String ssn )
    {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    // set gross sales amount
    public void setGrossSales( double sales )
    {
        grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    } // end method setGrossSales

    // return gross sales amount
    public double getGrossSales()
    {
        return grossSales;
    } // end method getGrossSales

    // set commission rate
    public void setCommissionRate( double rate )
    {
        commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate()
    {
        return commissionRate;
    } // end method getCommissionRate

    // calculate earnings
    public double earnings()
    {
        return commissionRate * grossSales;
    } // end method earnings

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate );
    } // end method toString
} // end class CommissionEmployee

// BasePlusCommissionEmployee inherits protected instance
// variables from CommissionEmployee.

class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary; // base salary per week

    // six-argument constructor

    public BasePlusCommissionEmployee( String first, String last,
                                       String ssn, double sales, double rate, double salary )
    {
        super( first, last, ssn, sales, rate );
        setBaseSalary( salary ); // validate and store base salary
    } // end six-argument BasePlusCommissionEmployee constructor

    // set base salary
    public void setBaseSalary( double salary )
    {
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings
    @Override // indicates that this method overrides a superclass method
    public double earnings()
    {
        return baseSalary + ( commissionRate * grossSales );
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee
    @Override // indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary );
    } // end method toString
} // end class BasePlusCommissionEmployee


class BasePlusCommissionEmployeeTest
{
    public static void main( String[] args )
    {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        // get base-salaried commission employee data
        System.out.println(
                "Employee information obtained by get methods: \n" );
        System.out.printf( "%s %s\n", "First name is",
                employee.getFirstName() );
        System.out.printf( "%s %s\n", "Last name is",
                employee.getLastName() );
        System.out.printf( "%s %s\n", "Social security number is",
                employee.getSocialSecurityNumber() );
        System.out.printf( "%s %.2f\n", "Gross sales is",
                employee.getGrossSales() );
        System.out.printf( "%s %.2f\n", "Commission rate is",
                employee.getCommissionRate() );
        System.out.printf( "%s %.2f\n", "Base salary is",
                employee.getBaseSalary() );

        employee.setBaseSalary( 1000 ); // set base salary

        System.out.printf( "\n%s:\n\n%s\n",
                "Updated employee information obtained by toString",
                employee.toString() );
    } // end main
} // end class BasePlusCommissionEmployeeTest





