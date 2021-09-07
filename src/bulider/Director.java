package bulider;

//指挥
public class Director {

    public Product build(Builder builder){
        builder.first();
        builder.second();
        builder.third();
        builder.fourth();

        return builder.getProduct();
    }
}
