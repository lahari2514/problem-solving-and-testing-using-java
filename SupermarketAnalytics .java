import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Product {
    int id;
    String name;
    int sold;
    Product(int id, String name, int sold) {
        this.id = id;
        this.name = name;
        this.sold = sold;
    }
}
class SalesPeriod {
    String period;
    double sales;
    SalesPeriod(String period, double sales) {
        this.period = period;
        this.sales = sales;
    }
}
class Customer {

    int id;
    String name;
    int purchases;
    double totalSpent;
    Customer(int id, String name,
             int purchases, double totalSpent) {
        this.id = id;
        this.name = name;
        this.purchases = purchases;
        this.totalSpent = totalSpent;
    }
}
public class SupermarketAnalytics {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products =
            new ArrayList<Product>();
    static ArrayList<SalesPeriod> periods =
            new ArrayList<SalesPeriod>();
    static ArrayList<Customer> customers =
            new ArrayList<Customer>();
    public static void main(String[] args) {
        // Product sales data
        products.add(new Product(101, "Rice", 150));
        products.add(new Product(102, "Milk", 250));
        products.add(new Product(103, "Soap", 120));
        products.add(new Product(104, "Oil", 300));
        products.add(new Product(105, "Sugar", 180));
        // Sales period data
        periods.add(
            new SalesPeriod("Morning", 12500));
        periods.add(
            new SalesPeriod("Afternoon", 18500));
        periods.add(
            new SalesPeriod("Evening", 32000));
        periods.add(
            new SalesPeriod("Night", 21000));
        // Customer purchase data
        customers.add(
            new Customer(1, "Customer A", 5, 4500));
        customers.add(
            new Customer(2, "Customer B", 8, 7800));
        customers.add(
            new Customer(3, "Customer C", 3, 2800));
        customers.add(
            new Customer(4, "Customer D", 10, 9500));
        int choice;
        do {
            System.out.println(
                "\n======================================");

            System.out.println(
                "     SUPERMARKET SALES ANALYTICS");
            System.out.println(
                "======================================");
            System.out.println(
                "1. Most Sold Products");
            System.out.println(
                "2. Peak Sales Period");
            System.out.println(
                "3. Customer Purchase Analysis");
            System.out.println(
                "4. Complete Analytics Report");
            System.out.println(
                "5. Exit");
            System.out.print(
                "Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mostSoldProducts();
                    break;
                case 2:
                    peakSalesPeriod();
                    break;
                case 3:
                    customerAnalysis();
                    break;
                case 4:
                    completeReport();
                    break;
                case 5:
                    System.out.println(
                        "Exiting Analytics System...");
                    break;
                default:
                    System.out.println(
                        "Invalid choice!");
            }
        } while (choice != 5);
    }
    // Most sold products
    static void mostSoldProducts() {
        Collections.sort(
            products,
            new Comparator<Product>() {
                public int compare(
                        Product p1, Product p2) {
                    return Integer.compare(
                        p2.sold,
                        p1.sold);
               }
            });
        System.out.println(
            "\n========== MOST SOLD PRODUCTS ==========");
        System.out.printf(
            "%-8s %-15s %-12s%n",
            "ID",
            "Product",
            "Units Sold");
        System.out.println(
            "-----------------------------------------");
        for (Product p : products) {
            System.out.printf(
                "%-8d %-15s %-12d%n",
                p.id,
                p.name,
                p.sold);
        }
    }
    // Find peak sales period
    static void peakSalesPeriod() {
        SalesPeriod peak = periods.get(0);
        for (SalesPeriod p : periods) {
            if (p.sales > peak.sales) {
                peak = p;
            }
        }
        System.out.println(
            "\n========== PEAK SALES PERIOD ==========");
        for (SalesPeriod p : periods) {
            System.out.printf(
                "%-12s Rs.%.2f%n",
                p.period,
                p.sales);
        }
        System.out.println(
            "\nPeak Sales Period : "
            + peak.period);
        System.out.println(
            "Peak Sales Amount : Rs."
            + peak.sales);
    }
    // Customer purchase analysis
    static void customerAnalysis() {
        Customer topCustomer =
                customers.get(0);
        System.out.println(
            "\n======= CUSTOMER PURCHASE ANALYSIS =======");
        System.out.printf(
            "%-8s %-15s %-12s %-15s%n",
            "ID",
            "Customer",
            "Purchases",
            "Total Spent");
        System.out.println(
            "------------------------------------------------");
        for (Customer c : customers) {
            System.out.printf(
                "%-8d %-15s %-12d Rs.%-12.2f%n",
                c.id,
                c.name,
                c.purchases,
                c.totalSpent);
            if (c.totalSpent >
                    topCustomer.totalSpent) {
                topCustomer = c;
            }
        }
        System.out.println(
            "\nTop Customer : "
            + topCustomer.name);
        System.out.println(
            "Total Purchases : "
            + topCustomer.purchases);

        System.out.println(
            "Total Spent : Rs."
            + topCustomer.totalSpent);
    }
    // Complete analytics report
    static void completeReport() {
        System.out.println(
            "\n==========================================");
        System.out.println(
            "       SUPERMARKET ANALYTICS REPORT");
        System.out.println(
            "==========================================");
        mostSoldProducts();
        peakSalesPeriod();
        customerAnalysis();
        System.out.println(
            "\n==========================================");
    }
}






Output
