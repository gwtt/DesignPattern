package Mediator;

public class MediatorPattern {
    public static void main(String[] args) {
        MarriageAgency marriageAgency = new MarriageAgencyImpl();

        //男嘉宾
        Person 鲍老师 = new Person("鲍老师",18,Sex.MALE,18,marriageAgency);
        //四个女嘉宾
        Person 高老师 = new Person("高老师",25,Sex.FEMALE,18,marriageAgency);
        Person 李老师 = new Person("李老师",25,Sex.FEMALE,18,marriageAgency);
        Person 贾老师 = new Person("贾老师",25,Sex.FEMALE,18,marriageAgency);
        Person 吴老师 = new Person("吴老师",18,Sex.FEMALE,18,marriageAgency);

        鲍老师.findPartner();
    }
}
