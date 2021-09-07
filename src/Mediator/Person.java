package Mediator;

//参与者
public class Person {
    String name;
    int age;
    Sex sex;
    int requestAge;
    MarriageAgency agency;

    public Person(String name, int age, Sex sex, int requestAge, MarriageAgency agency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;
        agency.register(this);
    }
    //寻找对象
    public void findPartner(){
        agency.pair(this);
    }
}
