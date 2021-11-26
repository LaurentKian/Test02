package Problem3;

import java.util.Scanner;

import static Problem3.receiveEmail.judge;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        if(judge(input)){
            System.out.println("符合");
        }
    }
}
