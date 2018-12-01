import java.util.Scanner;
import java.util.ArrayList;

public class  Main {
    static Scanner sc = new Scanner(System.in);
    static int buy,number,capability,price[] = new int[99],name[]= new int[99],buy1[]= new int[99],priceall;
    static String bookall="";
    public static void main(String[] args) {
          System.out.println("想要开始进行买书的过程了吗？（y/n）");
          String answer = sc.nextLine();
          if (answer.equalsIgnoreCase("y")){
              System.out.println("请为你自己的虚拟书店设置拥有书的数量.价格以及书名由系统生成（技术太差不会做）");
               number = sc.nextInt();
               for (int i=0;i<99;i++){
                   price[i] = 3*(i+1);
                   name[i] = i+1;
               }
              Book(number);
              System.out.println("请设置你书包的容量:");
              capability = sc.nextInt();
              Bag(buy);
          }
          if (answer.equalsIgnoreCase("n")){
              System.exit(0);
          }
    }
    private static void Book(int number){//书店的书的数量，书的价格，书名。
        if (number<=0){
            System.out.println("不好意思书店现在没书,该游戏无法进行");
            System.exit(0);
        }
        else {
            System.out.println("现在书店有"+ number +"本书，你要购买几本书？");
        buy = sc.nextInt();
            while (buy>number){
                System.out.println("你买的太多了,请减少几本书。");
                int x = sc.nextInt();
                buy = buy-x;
            }
        System.out.println("好的，你现在购买了"+buy+"本书，请问是哪几本？");
        for (int i=0;i<buy;i++){
            buy1[i] = sc.nextInt();
        }
        }
    }
    private static void Bag(int buy){//书包的容量(打扰了，想不出来了）
       /*while (buy>capability){
            System.out.println("你买的太多了,请减少几本书。");
            int x = sc.nextInt();
           buy = buy-x;
        }*/

        System.out.println("你的书买好了，你现在书包里面有"+buy+"本书。");
        for (int i=0;i<buy;i++){
            priceall+=price[Integer.valueOf(buy1[i])];
        }
        System.out.println("你共计花了"+priceall+"元。");
        for (int k = 0;k<buy;k++){
            bookall +=buy1[k]+" ";
        }
        System.out.println("你所买的书的名字分别为:"+bookall);
        System.out.println("谢谢惠顾！");

    }
}