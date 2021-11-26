package Problem3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class receiveEmail {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入您的邮箱");
        String input=reader.nextLine();
        if(judge(input)){
            System.out.println("正确");
        }
    }


    public static boolean judge(String st){

        //查找邮箱
        //mailRegex是整体邮箱正则表达式，mailName是@前面的名称部分，mailDomain是后面的域名部分
        String mailRegex,mailName,mailDomain;
        mailName="^[0-9a-z]+\\w*";       //^表明一行以什么开头；^[0-9a-z]表明要以数字或小写字母开头；\\w*表明匹配任意个大写小写字母或数字或下划线
        mailDomain="([0-9a-z]+\\.)+[0-9a-z]+$";       //***.***.***格式的域名，其中*为小写字母或数字;第一个括号代表有至少一个***.匹配单元，而[0-9a-z]$表明以小写字母或数字结尾
        mailRegex=mailName+"@"+mailDomain;          //邮箱正则表达式      ^[0-9a-z]+\w*@([0-9a-z]+\.)+[0-9a-z]+$
        Pattern pattern = Pattern.compile(mailRegex);
        Matcher matcher = pattern.matcher(st);
        if(matcher.matches()){
           return true;
        }else {
            return false;
        }
    }

}

