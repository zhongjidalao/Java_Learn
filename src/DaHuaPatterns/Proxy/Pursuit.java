package DaHuaPatterns.Proxy;

public class Pursuit implements IGiveGift {
    SchoolGirl mm;
    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.getName() + "送你鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.getName() + "送你巧克力");
    }
}
