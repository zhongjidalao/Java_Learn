package DaHuaPatterns.Decorator;

//服饰类
public class Finery extends Person{
    protected Person component;

    public void Decorate(Person component){
        this.component = component;
    }

    @Override
    public void Show() {
        if(component != null){
            component.Show();
        }
    }
}
