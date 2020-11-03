package demo02;
/*
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案：用private关键字将需要保护的成员变量进行修饰。
------一旦使用private进行修饰，那么本类当中仍然可以随意访问
     但是！！超出了本类范围之外就不能再直接访问了。

     间接访问private成员变量，就是定义一对Getter/Setter方法。

     使用格式必须叫setXXX或者是getXXX命名规则。
     对于Getter来说，不能有参数！返回值类型和成员变量对应。
     对于Setter来说，不能有返回值！参数类型和成员变量对应。
 */
public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫："+name+",年龄："+age);
    }
    //这个成员方法，专门用于向age设置数据。
    public void setAge(int number){
        if (number < 100&&number >= 9) {
            age = number;
        }else {
            System.out.println("数据不合理！！");
        }
    }
    //这个成员方法，专门用于获取age的数据。
    public int getAge(){
        return age;
    }
}
