package jp.ac.uryukyu.ie.e225740;

public class Hero extends LivingThing{

    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }
    
    
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}