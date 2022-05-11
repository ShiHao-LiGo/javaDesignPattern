public class Client {
    public static void main(String[] args) {
        //初始化一个环境类对象
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        //设置对象中初始价格
        mt.setPrice(originalPrice);

        System.out.println("原始的价格为："+originalPrice);
        System.out.println("---------------------------");

        //声明一个抽象的环境对象
        Discount dicount;
//        dicount = (Discount)new VIPDiscount();

        //将具体的折扣实现
        dicount = (Discount)new StudentDiscount();

        //注入具体的折扣方案
        mt.setDiscount(dicount);

        currentPrice = mt.getPrice();
        System.out.println("折后价格是："+currentPrice);
    }


}
