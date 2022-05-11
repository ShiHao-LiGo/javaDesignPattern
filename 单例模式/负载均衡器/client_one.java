public class client_one {
    public static void main(String[] args) {
        //创建4个LoadBalancer对象
        Loadbalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = Loadbalancer.getLoadBalancer();
        balancer2 = Loadbalancer.getLoadBalancer();
        balancer3 = Loadbalancer.getLoadBalancer();
        balancer4 = Loadbalancer.getLoadBalancer();

        //判断服务器负载均衡是否相同
        if(balancer1 == balancer2 && balancer2 == balancer3 && balancer4 == balancer3){
            System.out.println("服务器负载均衡器具有唯一性");
        }

        //增加服务器
        balancer1.addServer("Server 1");
        balancer1.addServer("Server 2");
        balancer1.addServer("Server 3");
        balancer1.addServer("Server 4");

        //模拟客户端请求的分发，如果输出结果为同一个server，可以将i适当放大
        //例如改为"i<100"
        for (int i =0 ;i<10000;++i){
            String server = balancer1.getServer();
            System.out.println("分发请求到服务器："+server);
        }
    }
}
