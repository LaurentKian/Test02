package Problem1;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;

public class Customer {
    private String name;
    private int ruaNumber;
    private LocalDate comeTime;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuaNumber() {
        return this.ruaNumber;
    }

    public void setRuaNumber(int ruaNumber) {
        if (ruaNumber <= 0) {
            System.out.println("请输入大于0的数！");
        } else {
            this.ruaNumber = ruaNumber;
        }

    }

    public LocalDate getComeTime() {
        return this.comeTime;
    }

    public void setComeTime(LocalDate comeTime) {
        this.comeTime = comeTime;
    }

    public Customer(String name, int ruaNumber, LocalDate comeTime) {
        this.name = name;
        this.ruaNumber = ruaNumber;
        this.comeTime = comeTime;
    }

    @Override
    public String toString() {
        return "Customer{姓名= " + this.name +
                "', 想rua猫猫的次数= " + this.ruaNumber +
                ", 要来的时间= " + this.comeTime + "}";
    }
}
