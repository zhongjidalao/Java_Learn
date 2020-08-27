package DaHuaPatterns.Decorator;

class Tshirts extends Finery{
    @Override
    public void Show() {
        System.out.println("T恤");
        super.Show();
    }
}

class BigTrouser extends Finery{
    @Override
    public void Show() {
        System.out.println("垮裤");
        super.Show();
    }
}
