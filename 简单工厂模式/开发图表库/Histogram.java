/**
 * 柱状图类，充当具体产品类
 */
public class Histogram implements Chart{
    public Histogram(){
        System.out.println("创建柱状图");
    }
    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
