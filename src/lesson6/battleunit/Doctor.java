package lesson6.battleunit;

public class Doctor extends BattleUnit
                    implements ISpeakerUnit{ // если надо реализовать несколько интерфейсов, перечисляем их через запятую; все недефольные методы интерфейса д.б. реализованы
    public Doctor (int health, int attackScore) {
        super(health, attackScore);
    }

    @Override
    public void attack(BattleUnit unit) {
        unit.health += attackScore;
    }

    @Override
    public void say(String text) {
        System.out.println(text);
    }

    @Override
    public void sing(String song) {
        System.out.println(song);
    }
}
