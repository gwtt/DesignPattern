package bulider;
//产品
public class Product {
    private String first;
    private String second;
    private String third;
    private String fourth;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "Product{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", third='" + third + '\'' +
                ", fourth='" + fourth + '\'' +
                '}';
    }
}
