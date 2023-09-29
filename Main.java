
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Main{
    private static Map<String, User> users = new HashMap<>();
    public static final List<User>ALL_USERS=new ArrayList<User>();
    public static final Map<Business,List<movie>>ALL_MOVIE=new HashMap<>();
    public static void main(String[] args) {
        Main.showMain();
    }

    private static void showMain() {
        Scanner SC = new Scanner(System.in);
        int command = 1;
        while (command<=9&&command>=1) {
            System.out.println("=========电影首页=========");
            System.out.println("1.用户登录");
            System.out.println("2.用户注册");
            System.out.println("3.管理员注册");
            System.out.println("4.管理员登录");
            System.out.println("5.经理注册");
            System.out.println("6.经理登录");
            System.out.println("7.前台注册");
            System.out.println("8.前台登录");
            System.out.println("9.退出");
            System.out.println("请输入操作命令:");
            command = SC.nextInt();
            switch (command) {
                case 1:
                    login1();
                    break;
                case 2:
                    System.out.println("==========用户注册==========");
                    System.out.println("请输入登录名称:");
                    Scanner SA=new Scanner(System.in);
                    String loginName=SA.nextLine();
                        System.out.println("请输入登陆密码:");
                        String password1=SA.nextLine();
                        System.out.println("请再次输入登录密码:");
                        String password2=SA.nextLine();
                        if(password1.equals(password2)){
                            System.out.println("注册成功");
                        }else{System.out.println("两次输入的密码不一致,以第二次密码作为账户密码");}
                    System.out.println("请输入真实姓名:");
                    String username= SA.nextLine();
                    System.out.println("请输入邮箱地址:");
                    String mail=SA.nextLine();
                    registerUser(loginName,password2,username,mail);
                    break;
                case 3:
                    System.out.println("=====管理员注册=====");
                    System.out.println("请输入管理员账号：");
                    Scanner SB=new Scanner(System.in);
                    String name=SB.nextLine();
                    System.out.println("请输入管理员密码：");
                    String password=SB.nextLine();
                    System.out.println("请输入真实姓名:");
                    String realname= SB.nextLine();
                    System.out.println("请输入邮箱地址:");
                    String Amail=SB.nextLine();
                    registerUser(name,password,realname,Amail);
                    break;
                case 4:
                    login2();
                    break;
                case 5:
                    System.out.println("=====经理注册=====");
                    System.out.println("请输入经理账号：");
                    Scanner SD=new Scanner(System.in);
                    String name11=SD.nextLine();
                    System.out.println("请输入经理密码：");
                    String password11=SD.nextLine();
                    System.out.println("请输入真实姓名:");
                    String realname11= SD.nextLine();
                    System.out.println("请输入邮箱地址:");
                    String Amail11=SD.nextLine();
                    registerUser(name11,password11,realname11,Amail11);
                    break;
                case 6:
                    login3();
                    break;
                case 7:
                    System.out.println("=====前台注册=====");
                    System.out.println("请输入前台账号：");
                    Scanner SDa=new Scanner(System.in);
                    String name111=SDa.nextLine();
                    System.out.println("请输入前台密码：");
                    String password111=SDa.nextLine();
                    System.out.println("请输入真实姓名:");
                    String realname111= SDa.nextLine();
                    System.out.println("请输入邮箱地址:");
                    String Amail111=SDa.nextLine();
                    registerUser(name111,password111,realname111,Amail111);
                    break;
                case 8:
                    login4();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("命令有误，请重新确认");
                    break;
            }
        }
    }
    private static void login1(){
        while(true){
            System.out.println("请输入登录名称:");
            Scanner SC=new Scanner(System.in);
            String loginName=SC.nextLine();
            System.out.println("请输入登录密码:");
            String password=SC.nextLine();
            User u = users.get(loginName);
           if(u !=null){
               if(u.getPassword().equals(password)){
                   System.out.println("登陆成功,你好用户");
                   menu1();
                   break;
               }else{System.out.println("密码错误");}
           }
        }
    }
    public static void registerUser(String loginName, String password,String userName,String mail) {
        User user = new User(loginName, password,userName, mail);
        users.put(loginName, user);
        System.out.println("用户(管理员，经理，前台） " + loginName + " 注册成功");
    }
    private static void login2(){
        while(true){
            System.out.println("请输入登录名称:");
            Scanner SC=new Scanner(System.in);
            String loginName=SC.nextLine();
            System.out.println("请输入登录密码:");
            String password=SC.nextLine();
            User u = users.get(loginName);
            if(u !=null){
                if(u.getPassword().equals(password)){
                    System.out.println("登陆成功，你好管理员");
                    menu2();
                    break;
                }else{System.out.println("密码错误");}
            }
        }
    }
    private static void login3(){
        while(true){
            System.out.println("请输入登录名称:");
            Scanner SD=new Scanner(System.in);
            String loginName=SD.nextLine();
            System.out.println("请输入登录密码:");
            String password=SD.nextLine();
            User u = users.get(loginName);
            if(u !=null){
                if(u.getPassword().equals(password)){
                    System.out.println("登陆成功，你好经理");
                    menu4();
                    break;
                }else{System.out.println("密码错误");}
            }
        }
    }
    private static void login4(){
        while(true){
            System.out.println("请输入登录名称:");
            Scanner SDa=new Scanner(System.in);
            String loginName=SDa.nextLine();
            System.out.println("请输入登录密码:");
            String password=SDa.nextLine();
            User u = users.get(loginName);
            if(u !=null){
                if(u.getPassword().equals(password)){
                    System.out.println("登陆成功，你好前台");
                    menu5();
                    break;
                }else{System.out.println("密码错误");}
            }
        }
    }
    public static void menu5(){
        System.out.println("1.列出影片信息");
        System.out.println("2.列出上映影片信息");
        System.out.println("3.列出指定信息");
        System.out.println("4.售票功能");
    }
    public static void menu4(){
        System.out.println("1.影片管理");
        System.out.println("2.排片管理");
        System.out.println("3.列出场次");
        System.out.println("4.登出");
    }
    public static void menu1(){
        System.out.println("1.密码管理");
        System.out.println("2.购票功能");
        int a;
        Scanner SD=new Scanner(System.in);
        a=SD.nextInt();
        switch(a){
            case 1:
                System.out.println("请输入新密码");
                break;
            case 2:
                System.out.println("请选择要购买的电影票");
                menu3();
                Scanner SC=new Scanner(System.in);
                String number=SC.nextLine();
                System.out.println("选票成功。");
        }
    }
    public static void menu2(){
        System.out.println("1.用户管理");
        System.out.println("2.影片管理");
        int b;
        Scanner SE=new Scanner(System.in);
        b=SE.nextInt();
        switch(b){
            case 1:
                System.out.println("请输入管理的用户名：");
                break;
            case 2:
                menu3();
                System.out.println("请选择要管理的影片的序号：");
                break;
        }
    }
    public static void menu3(){
        System.out.println("=========选票首页=========");
        System.out.println("1.封神");
        System.out.println("2.复仇者联盟4");
        System.out.println("3.消失的她");
        System.out.println("4.孤注一掷");
        System.out.println("5.长安三万里");
    }
        }