interface ClothFactory{
    void producerCloth();
}
//代理对象
class ProxyClothFactory implements ClothFactory{
    //将被代理对象类实例化
    private ClothFactory factory;
    public ProxyClothFactory(ClothFactory factory){ this.factory=factory; }
    @Override
    public void producerCloth() {
        System.out.println("前期工作");
        factory.producerCloth();
        System.out.println("后期工作");
    }
}
//被代理对象
class NikeClothFactory implements ClothFactory{

    @Override
    public void producerCloth() {
        System.out.println("Nike");
    }
}
public class Proxy {
    public static void main(String[] args) {
        //被代理类
        NikeClothFactory nike = new NikeClothFactory();
         //代理类
        ProxyClothFactory proxy = new ProxyClothFactory(nike);

        proxy.producerCloth();
    }
}
