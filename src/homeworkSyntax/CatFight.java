package homeworkSyntax;

public class CatFight {
    private Cat cat1;
    private Cat cat2;

    public CatFight(Cat cat1, Cat cat2){
        this.cat1 = cat1;
        this.cat2 = cat2;
    }
        private boolean catfight(){
         if (cat1.getStrength() > cat2.getStrength()) return true;
         else return false;
    }
}
