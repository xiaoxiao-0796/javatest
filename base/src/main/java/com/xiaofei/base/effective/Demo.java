package com.xiaofei.base.effective;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
import java.io.*;

public class Demo {

    public static void main(String[] args) {
        People people = new People();
        try {
            //序列化
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("people.dat")));
            oos.writeObject(people);
            oos.close();
            //反序列化
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.dat"));
            people = (People) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //线程
        MyRunner boy = new MyRunner(people, "GG", "boy");
        MyRunner girl = new MyRunner(people, "MM", "girl");
        Thread thread1 = new Thread(boy,"boy");
        Thread thread2 = new Thread(girl,"girl");
        thread1.start();
        thread2.start();
        //断言
        boolean isPeople = people instanceof People;
        assert !isPeople:"it's wrong";
    }

}

class People implements Serializable{
    private String name;
    private String sex;
    private transient String school = "FJNU";

    public void set(String name,String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void print(){
        System.out.println("name="+name+",sex="+sex+",school="+school);
    }
}

class MyRunner implements Runnable{

    private People people;
    private String name;
    private String sex;

    public MyRunner(People people,String name,String sex) {
        this.people = people;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            people.set(name, sex);
            people.print();
        }
    }

}
