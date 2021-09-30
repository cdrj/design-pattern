package Factory.AbstFactory;

public interface IFactory {
    IMask createMask();

    IProtectiveSuit createSuit();
    IToy createToy();
}
