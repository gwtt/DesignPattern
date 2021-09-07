package composite;

public class Client {
    public static void main(String[] args) {
        Composite china = new Composite();
        china.add(new City(1000));//直辖市 -- 上海
        china.add(new City(2000));//直辖市 -- 北京

        Composite jiangsu = new Composite();
        jiangsu.add(new City(3000));//南京
        jiangsu.add(new City(3000));//南通
        //...
        china.add(jiangsu);
        /*
            china
                |_北京
                |_上海
                |_江苏
                    |_南京
                    |_南通
         */
        System.out.println(china.count());
    }
}
