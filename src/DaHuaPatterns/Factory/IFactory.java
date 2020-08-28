package DaHuaPatterns.Factory;

public interface IFactory {
    LeiFeng CreateLeiFeng();
}

class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraduate();
    }
}

class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
