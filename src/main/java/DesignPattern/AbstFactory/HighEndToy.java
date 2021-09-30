package DesignPattern.AbstFactory;

/**
 * @author runjie
 * @ClassName HighEndToy
 * @Description TODO
 * @date 2021/9/29 22:13
 * @Version 1.0
 */
public class HighEndToy implements IToy{
    @Override
    public void showToy() {
        System.out.println("我是高端玩具");
    }
}
