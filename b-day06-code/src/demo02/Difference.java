package demo02;
/*局部变量和成员变量的区别
1.定义的位置不一样【重点】
局部变量：定义在方法的内部
成员变量：在方法的外部，直接写在类当中
2.作用范围不一样【重点】
局部变量：只有方法当中可以使用，出了方法就不能再使用
成员变量：整个类当中全都可以通用
3.默认值不一样【重点】
局部变量：没有默认值，如果想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值，规则和数组一样
 */
public class Difference {
    String name;//成员变量
    public void methodA(){
        int sum = 20;//局部变量
        System.out.println(sum);
        System.out.println(name);
    }
    public void methodB(int param){//方法的参数也是局部变量
        //参数在方法调用的时候，必然会被赋值的。
        System.out.println(param);
        int age;
        //System.out.println(age);//报错，age是局部变量! 没有默认值不可以使用
        //System.out.println(sum);//报错，sum是局部变量! 只可以在methodA方法中使用
        System.out.println(name);
    }
}
