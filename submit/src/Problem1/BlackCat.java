package Problem1;

public class BlackCat extends Cat {
    public BlackCat(String nameOfCat, int age, boolean sex) {
        super(nameOfCat, age, sex, 350);
    }

    @Override
    public String toString() {
        String sexOfCat = "";
        if (this.sex) {
            sexOfCat = "公猫";
        } else {
            sexOfCat = "母猫";
        }

        return "Cat{猫猫的名字='" + this.nameOfCat + "', 年龄=" + this.age + "岁, 性别=" + sexOfCat + ", 价格=" + this.price + "元}";
    }
}
