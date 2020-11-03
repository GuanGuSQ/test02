package demo02;
/*面向对象的三大特征：封装，继承，多态
  面向对象的最大特点：找人帮我做事。
=====封装性在Java当中的体现。=====
*    1.方法就是一种封装。下面的getMax方法就是一种封装
*    2.关键字private也是一种封装。（私有化）

封装就是将一些信息隐藏起来，对于外界不可见，达到省心的目的。
* */
public class Method {
    public static void main(String[] args) {
        int[] array = {5,15,25,20,100};
        int max = getMax(array);//利用getMax方法就是 找人帮我做事。
        System.out.println("最大值："+max);
    }
    //给我一个数组，还你一个最大值。
    public static  int getMax(int[] array){
        int max = array[0];
        for (int i = 1;i < array.length;i++){
            if (array[i] > max){ max = array[i];}
        }
        return max;
    }
}
