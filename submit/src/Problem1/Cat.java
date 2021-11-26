package Problem1;

public abstract class Cat {
    protected String nameOfCat;
    protected int age;
    protected boolean sex;
    protected double price;

    public String getNameOfCat() {
        return this.nameOfCat;
    }

    public void setNameOfCat(String nameOfCat) {
        this.nameOfCat = nameOfCat;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return this.sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cat(String nameOfCat, int age, boolean sex, double price) {
        this.nameOfCat = nameOfCat;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    public abstract String toString();


}
