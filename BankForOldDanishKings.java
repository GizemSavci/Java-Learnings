// This is a banking program for old Danish kings

public class Customer {
    String name;
    double balance;


    public Customer(String customerName, double initialBalance) {
        name = customerName;
        balance = initialBalance;
    }


    public void invest(String investmentType) {
        System.out.println(name + " is investing in " + investmentType);
    }

    public String toString() {
        return "Customer: " + name + ", Balance: $" + balance;
    }

    public static void main(String[] args) {

        Customer gore = new Customer("Gorm Den Gamle", 1000.00);
        System.out.println(gore);
        

        gore.invest("stocks");
        gore.invest("bonds");
        gore.invest("real estate");

        Customer harald = new Customer("Harald Blåtand", 2000.00);
        System.out.println(harald);
        
        harald.invest("stocks");
        harald.invest("bonds");
        harald.invest("real estate");
    }
}
