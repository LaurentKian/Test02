package Problem1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class MyCatCafe implements CatCafe {
    public static int totalRuaNum;
    private double balance;
    private ArrayList<Cat> listOfCat;
    private ArrayList<Customer> listOfCustomer;

    public MyCatCafe(double balance, ArrayList<Cat> listOfCat, ArrayList<Customer> listOfCustomer) {
        this.balance = balance;
        this.listOfCat = listOfCat;
        this.listOfCustomer = listOfCustomer;
    }

    public void buyNewCat(Cat newCat) throws InsufficientBalanceException {
        if (newCat == null) {
            System.out.println("请输入猫猫对象");
        }
        if (!(this.balance < newCat.price)) {
            balance = balance - newCat.price;
            this.listOfCat.add(newCat);
            System.out.println("购买成功！");
        } else {
            InsufficientBalanceException e = new InsufficientBalanceException("没钱买猫猫啦！猫猫是" + newCat.nameOfCat);
            throw e;
        }
    }

    public void serveCustomer(Customer customer) throws CatNotFoundException {
        if (!this.listOfCustomer.contains(customer)) {
            this.listOfCustomer.add(customer);
        } else {
            System.out.println("rua猫猫的老顾客又来啦！");
        }

        if (this.listOfCat.isEmpty()) {
            CatNotFoundException e = new CatNotFoundException("无猫可rua!");
            throw e;
        } else {
            for (int i = 0; i < customer.getRuaNumber(); ++i) {
                ++totalRuaNum;
                this.balance += 15.00;
                int randomCat = (int) (Math.random() * (double) this.listOfCat.size());
                PrintStream var10000 = System.out;
                String var10001 = customer.getName();
                var10000.println(var10001 + " rua到的猫猫：" + ((Cat) this.listOfCat.get(randomCat)).toString());
            }

        }
    }

    public void closeDown() {
        for (int i = 0; i < this.listOfCustomer.size(); ++i) {
            if (((Customer) this.listOfCustomer.get(i)).getComeTime() == LocalDate.now()) {
                System.out.println(((Customer) this.listOfCustomer.get(i)).toString());
            }
        }

        System.out.println("今天猫猫共被rua了" + totalRuaNum + "次");
        System.out.println("今天猫猫一共赚了" + totalRuaNum * 15 + "元");
    }
}
