/**
 * 新增具体中介者类
 */
public class SubConcreteMediator extends ConcreteMediator{

    //增加对label对象的引用
    public Label label;
    @Override
    //封装同事对象之间的交互
    public void componentChanged(Component c) {
        //单击按钮
        if(c==addButton){
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
            label.update();
        }
        //从列表框选择用户
        else if(c==list){
            System.out.println("--从列表框选择客户");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if(c== cb){
            System.out.println("--从组合框选择用户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
