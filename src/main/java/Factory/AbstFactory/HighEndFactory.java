package Factory.AbstFactory;

/**
 * @author runjie
 * @ClassName LowEndFactory
 * @Description TODO
 * @date 2021/8/5 10:44
 * @Version 1.0
 */
public class HighEndFactory implements IFactory {

    @Override
    public IMask createMask() {
        IMask highEndMask = new HighEndMask();
        return highEndMask;
    }

    @Override
    public IProtectiveSuit createSuit() {
        IProtectiveSuit suit = new HighEndProtectiveSuit();
        return suit;
    }

    @Override
    public IToy createToy() {
        HighEndToy toy = new HighEndToy();
        return toy;
    }
}
