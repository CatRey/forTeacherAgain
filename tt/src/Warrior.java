public class Warrior extends Unit implements War {
    private int s;
    public Warrior(String name,int hp,int s){
        super(hp,name);
        this.s=s;
    }
    public void workout(){
        this.s+=(int)((super.getHp()/100d)*(s/3d));
    }
    public void createWar(Warrior warrior){
        System.out.println(this.getName()+" объявил бой "+warrior.getName());
    }
    public int getS() {
        return s;
    }
    public void war(Warrior w1){
        if (this.s*this.getHp()>=w1.s*w1.getHp()){
            System.out.println(this.getName()+" выиграл!");
            w1.setHp(0);
            w1.heal();
        }
        else{
            System.out.println(w1.getName()+" выиграл!");
            this.setHp(0);
            this.heal();
        }
    }
}
