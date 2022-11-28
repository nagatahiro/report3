package jp.ac.uryukyu.ie.e225740;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);

    }


    public boolean isDead() {
        return dead;
    }

    
    public int gethitPoint(){
        return hitPoint;
    }
    public String getName(){
        return name;
    }
 

    public void attack(LivingThing l){
        if(dead==false){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, l.getName(), damage);
        l.wounded(damage);
    }
    }
   
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
    
}
