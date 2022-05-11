import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client_one {
    public static void main(String[] args) {
        InvocationHandler handler = null;
        AbstractUserDao userDao = new UserDAO();
        handler = new DAOLogHandler(userDao);
        AbstractUserDao proxy = null;

        //动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象
        proxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(),new Class[]{AbstractUserDao.class},handler);
        proxy.findUserById("张无忌");//调用代理对象的业务方法

        System.out.println("------------------------");

        AbstractDocumentDAO docDAO = new DocumentDAO();
        handler = new DAOLogHandler(docDAO);
        AbstractDocumentDAO proxy_new = null;

        //动态创建代理对象，用于代理一个AbstractDocumentDAO类型的真实主题对象
        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),new Class[]{AbstractDocumentDAO.class},handler);
        proxy_new.deleteDocumentById("D001");//调用代理对象的业务方法
    }
}
