package demo02;
public class Demo02Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name="赵丽颖";
        //person.age = -18;//直接访问private内容，是错误写法。
        person.setAge(-20);
        person.show();
    }
}
