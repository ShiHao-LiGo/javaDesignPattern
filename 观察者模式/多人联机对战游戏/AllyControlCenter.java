import java.util.ArrayList;

/**
 * 指挥部（战队控制中心），充当抽象目标类
 */
public abstract class AllyControlCenter {
    protected String allyName;//战队名称
    //定义一个集合用于存储战队成员
    protected ArrayList<Observer> players = new ArrayList<Observer>();

    public void setAllyName(String name) {
        this.allyName = name;
    }

    public String getAllyName() {
        return this.allyName;
    }

    //注册方法
    public void join(Observer obs){
        System.out.println(obs.getName() +"加入"+this.allyName+"战队！");
        players.add(obs);
    }

    //注销方法
    public void quit(Observer obs){
        System.out.println(obs.getName()+"推出"+this.allyName+"战队！");
        players.remove(obs);
    }

    //声明抽象通知方法
    public abstract void notifyObserver(String name);
}
