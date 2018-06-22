import java.util.*;

public class Fgg{
    public static void main(String[] args){
        System.out.println("猜拳游戏\n请出拳\n1.剪刀\t2.石头\t3.布\t0.退出游戏");
        Scanner ab=new Scanner(System.in);
        boolean f=true;
        while(f){
            int a=6;
            boolean h=true;
            while(h){
                try{
                    a=ab.nextInt();
                    while(a!=1&&a!=2&&a!=3&&a!=0){
                        System.out.println("你输入的整数不符合规定，请重新输入：");
                        a=ab.nextInt();
                    }
                    f=false;
                }catch(Exception e){
                    System.out.println("你输入的不是整数，请重新输入：");
                    ab.nextLine();
                }
                int b=(int)(Math.random()*3)+1;
                String c="出拳";
                switch(a){
                    case 1:
                        c="剪刀";
                        break;
                    case 2:
                        c="石头";
                        break;
                    case 3:
                        c="布";
                        break;
                }
                String d="出拳";
                switch(b){
                    case 1:
                        d="剪刀";
                        break;
                    case 2:
                        d="石头";
                        break;
                    case 3:
                        d="布";
                        break;
                }
                if(a==b){
                    System.out.println("你出"+c+",电脑出"+d+",平局。");
                    h=true;
                }else if(a==1&&b==3||a==2&&b==1||a==3&&b==2){
                    System.out.println("你出"+c+",电脑出"+d+",你赢了！");
                    h=true;
                }else if(a==1&&b==2||a==2&&b==3||a==3&&b==1){
                    System.out.println("你出"+c+",电脑出"+d+",你输了！");
                    h=true;
                }else if(a==0){
                    System.out.println("程序结束");
                    System.exit(0);
                }
            }
        }
        ab.close();
    }
}