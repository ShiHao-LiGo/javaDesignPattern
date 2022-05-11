/**
 * 用户DAO类，具体主题角色
 */
public class UserDAO implements AbstractUserDao{
    @Override
    public Boolean findUserById(String userId) {
        if(userId.equalsIgnoreCase("张无忌")){
            System.out.println("查询ID为"+userId+"的用户信息成功！");
            return true;
        }else{
            System.out.println("查询ID为"+userId+"的用户信息失败！");
            return false;
        }
    }
}
