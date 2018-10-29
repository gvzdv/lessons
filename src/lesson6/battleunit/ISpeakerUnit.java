package lesson6.battleunit;

public interface ISpeakerUnit {

//    private - доступно в интерфейсе Java, начиная с 9-й версии

    void say(String text); // модификатор доступа не нужен, все методы публичные и абстрактные
    void sing(String song);

    default void greeting() {
        // начиная с 8-й версии доступны методы default с реализацией
        System.out.println("Hello");
    }
}
