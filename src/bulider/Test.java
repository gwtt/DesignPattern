package bulider;

public class Test {
    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥具体的工人完成产品
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
