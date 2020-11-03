package demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();//这就是在调用无参构造方法
        System.out.println("=============================");
        Student stu2 = new Student("赵丽颖",20);//这就是在调用有参构造方法
        //这样省掉了去使用stu2.setXXX()方法了。
        System.out.println("姓名:"+stu2.getName()+"   年龄:"+stu2.getAge());

        //如果需要改变对象当中的成员变量的数据内容，仍然还需要stu2.setXXX()方法
        stu2.setAge(21);
        System.out.println("姓名:"+stu2.getName()+"   年龄:"+stu2.getAge());
    }
}
