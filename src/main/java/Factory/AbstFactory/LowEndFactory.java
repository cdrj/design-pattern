package Factory.AbstFactory;

/**
 * @author runjie
 * @ClassName LowEndFactory
 * @Description TODO
 * @date 2021/8/5 10:44
 * @Version 1.0
 */
public class LowEndFactory implements IFactory {

    @Override
    public IMask createMask() {
        IMask lowEndMask = new LowEndMask();
        return lowEndMask;
    }

    @Override
    public IProtectiveSuit createSuit() {
        IProtectiveSuit lowSuit = new LowEndProtectiveSuit();
        return lowSuit;
    }

    @Override
    public IToy createToy() {
        LowEndToy lowEndToy = new LowEndToy();
        return lowEndToy;
    }
}
