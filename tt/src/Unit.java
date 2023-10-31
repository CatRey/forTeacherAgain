public class Unit {
    private int hp;
    private String name;
    public Unit(String name){
        this.name = name;
        this.hp = 100;
    }
    public void shp(){
        this.hp-=5;
    }
    public void php(){
        if (this.hp+5<=100){
            this.hp+=5;
        }
    }
    public void printInfo(){
        System.out.println("NPC name: "+this.name);
        System.out.println("NPC "+this.name+" has HP: "+this.hp);
    }
    public void battle(Unit otherUnit){
        if(this.hp>=otherUnit.hp)System.out.println(this.name+" has won");
        else System.out.println(otherUnit.name+" has won");
    }
}
