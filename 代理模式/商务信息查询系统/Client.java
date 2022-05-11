public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        String result = searcher.doSearch("杨过","玉女心境");
    }

}
