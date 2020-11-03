package demo04;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字 new 来创建对象时，其实就是在调用构造方法。
格式：
public 类名称(参数类型 参数名称){  //多个参数逗号隔开，无参数留空
     方法体
}
注意事项
1，构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样。
2，构造方法不要写返回值类型，连void都不写。
3，构造方法不能return一个具体的返回值。
4,如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数、方法体什么事情都不做。
  public Student() {},这就是编译器赠送的构造方法！
5，一旦编写了至少一个构造方法，那么编译器将不再赠送。
6,构造方法也是可以进行重载的。
重载：方法名称相同，参数列表不同。
 */
public class Student {
    private String name;
    private int age;
    //方法的名称必须和所在的类名称完全一样
    //这种特殊格式的构造方法就是用来创建对象的，这种方法的使用不是“对象.方法名()”
    //而是“new Student();”
    public Student(){
        System.out.println("无参数构造方法执行啦！");
        //return 100;
    }
    //重载形式的构造方法:只是在创建对象的时候更加方便我们把那些现成的数据通过参数的形式
    //设置进来，而省去老调用setXXX（）方法的麻烦
    public Student(String name,int age){//这样就省得去写set方法了
        System.out.println("有参数构造方法执行啦！");
        this.age=age;
        this.name=name;
    }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public int getAge() { return age; }
}
