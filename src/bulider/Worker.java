package bulider;
//建造者
public class Worker extends Builder{
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void first() {
        product.setFirst("First");
        System.out.println("First");
    }

    @Override
    void second() {
        product.setSecond("Second");
        System.out.println("Second");
    }

    @Override
    void third() {
        product.setThird("Third");
        System.out.println("Third");
    }

    @Override
    void fourth() {
        product.setFourth("Fourth");
        System.out.println("Fourth");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
