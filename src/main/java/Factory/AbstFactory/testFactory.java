package Factory.AbstFactory;

/**
 * @author runjie
 * @ClassName testFactory
 * @Description TODO
 * @date 2021/8/5 10:49
 * @Version 1.0
 */
public class testFactory {
    public static void main(String[] args) {
        IFactory lowEndFactory = new LowEndFactory();
        IFactory highEndFactory = new HighEndFactory();
        IMask lowMask = lowEndFactory.createMask();
        IMask highMask = highEndFactory.createMask();


        IProtectiveSuit lowSuit = lowEndFactory.createSuit();
        IProtectiveSuit highSuit = highEndFactory.createSuit();

        IToy lowToy = lowEndFactory.createToy();
        IToy highToy = highEndFactory.createToy();

        lowMask.showMask();
        highMask.showMask();

        lowSuit.showSuit();
        highSuit.showSuit();

        lowToy.showToy();
        highToy.showToy();
    }
}
