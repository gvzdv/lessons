package lesson6.battleunit;

abstract public class BattleUnit
                implements ISpeakerUnit{ // абстрактный класс не обязан реализовывать интерфейсы
    //    private int health;
//    private int attackScore;
    protected int health;
    protected int attackScore;

    public int getHealth() {
        return health;
    }

    public BattleUnit(int health, int attackScore) { // 100 20
        this.health = health;
        this.attackScore = attackScore;
    }

    public boolean isAlive(){
        return health > 0;
    }

    abstract public void attack(BattleUnit enemy);
}