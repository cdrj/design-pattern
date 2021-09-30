package DesignPattern.AbstFactory;

public interface IFactory {
    IMask createMask();

    IProtectiveSuit createSuit();
    IToy createToy();
}
