package template;

//模板类
abstract class Runtime{
    //使用final关键字防止方法被重写
    public final void getRunTime(){
        //代码运行之前记录当前的系统时间
        long startTime = System.currentTimeMillis();
        code();
        //代码运行结束记录当前的系统时间
        long endTime = System.currentTimeMillis();
        System.out.println("程序的运行时间是："+(endTime-startTime));
    }
    //将会改变的代码描述成一个抽象类
    public abstract void code();
}

//继承使用模板类
public class TemplateDemo extends Runtime {
    public static void main(String[] args){
        TemplateDemo d = new TemplateDemo();
        d.getRunTime();
    }

    //重写抽象方法
    @Override
    public void code() {
        for(int i=0; i<100; i++){
            System.out.println("i="+i);
        }
    }
}
