package demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        //设置一下自己的名字。
        person.name = "王健林";
        person.sayHello("王思聪");//优先使用这个参数里的name
        System.out.println(person);
    }
}
