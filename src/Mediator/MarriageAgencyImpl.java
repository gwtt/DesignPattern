package Mediator;

import java.util.ArrayList;
import java.util.List;

//中介者实现类
public class MarriageAgencyImpl implements MarriageAgency{
    List<Person> people = new ArrayList<>();
    @Override
    public void pair(Person person) {
        for(Person p: people){
            if(p.age == person.requestAge && p.sex !=person.sex){
                System.out.println("将"+person.name+"与" +p.name+"送入洞房");
            }
        }
    }

    @Override
    public void register(Person person) {
            people.add(person);
    }
}
