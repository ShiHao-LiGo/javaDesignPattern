/**
 * 代理查询类，充当代理主题角色，它是代理查询，维持了对RealSearcher对象、AccessValidator对象和Logger对象的引用
 */
public class ProxySearcher implements Searcher {
    //维持一个对真实主题的引用
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    //创建访问验证对象并调用其vaildate()方法实现身份验证
    public boolean validate(String userId){
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    //创建日志记录对象并调用其log(）方法实现日志记录
    public void log(String userId){
        logger = new Logger();
        logger.log(userId);
    }

    @Override
    public String doSearch(String userId, String keyword) {
        //如果身份验证成功，则执行查询
        if(this.validate(userId)){
            //调用真实主题的查询方法
            String result = searcher.doSearch(userId,keyword);
            //记录查询日志
            this.log(userId);
            return result;
        }else{
            return null;
        }
    }
}
