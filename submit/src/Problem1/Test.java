package Problem1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Cat> listOfCat = new ArrayList();
        ArrayList<Customer> listOfCustomer = new ArrayList();
        MyCatCafe catCafe1 = new MyCatCafe(10000.00, listOfCat, listOfCustomer);
        OrangeCat mimi = new OrangeCat("mimi", 2, true, true);
        BlackCat dahua = new BlackCat("dahua", 3, false);
        WhiteCat daBai = new WhiteCat("daBai", 5, true);
        WhiteCat niuNai = new WhiteCat("niuNai", 1, false);
        catCafe1.buyNewCat(dahua);
        catCafe1.buyNewCat(mimi);
        catCafe1.buyNewCat(daBai);
        catCafe1.buyNewCat(niuNai);
        catCafe1.closeDown();
        Customer customer = new Customer("xiaming", 10, LocalDate.now());
        Customer customer1 = new Customer("xiahong", 13, LocalDate.now());
        Customer customer2 = new Customer("xiaLv", 4, LocalDate.now());
        catCafe1.serveCustomer(customer);
        catCafe1.serveCustomer(customer1);
        catCafe1.serveCustomer(customer2);
        catCafe1.closeDown();

    }
}