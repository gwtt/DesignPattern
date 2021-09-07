package prototype.demo1;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象 v1
        Date date = new Date();
        Video v1 = new Video("gwt",date);
        Video v2 = (Video) v1.clone();      //v2克隆v1
        System.out.println("v1->"+v1);
        System.out.println("v2->"+v2);
        System.out.println("==============");
        date.setTime(22111111);
        System.out.println("v1->"+v1);
        System.out.println("v2->"+v2);
    }
}
