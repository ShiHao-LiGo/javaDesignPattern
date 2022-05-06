/**
 * 客户端测试类
 */
public class client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
