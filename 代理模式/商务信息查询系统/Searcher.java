/**
 * 抽象查询类，充当抽象主题的角色，申明了doSearch()方法
 */
public interface Searcher {
    public String doSearch(String userId,String keyword);
}
