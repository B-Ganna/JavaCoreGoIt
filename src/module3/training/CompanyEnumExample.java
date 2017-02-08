package module3.training;


public class CompanyEnumExample {
    public enum Company {
        EBAY, PAYPAL, GOOGLE, YAHOO, ATL
    }

    Company name;

    public CompanyEnumExample(Company name) {
        this.name = name;
    }

    public void companyDetails() {
        switch (name) {
            case EBAY:
                System.out.println("Biggest company");
                break;
            case PAYPAL:
                System.out.println("Simplest way to manage money");
                break;
            case YAHOO:
                System.out.println("Dood search machine");
                break;
            default:
                System.out.println("Other good companies");
                break;
        }
    }

    public static void main(String[] args) {
        CompanyEnumExample name1 = new CompanyEnumExample(Company.ATL);
        name1.companyDetails();
        CompanyEnumExample name2 = new CompanyEnumExample(Company.EBAY);
        name2.companyDetails();
    }
}
