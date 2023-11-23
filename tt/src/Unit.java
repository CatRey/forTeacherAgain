public class Unit {
    private int hp;
    private String name;
    public Unit(int hp,String name){
        this.hp=hp;
        this.name=name;
    }
    public Unit(String name){
        this.hp=100;
        this.name=name;
    }
    public int getHp() {
        return hp;
    }
    public String getName() {
        return name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void heal(){
        System.out.println(this.getName()+" вылечился");
        this.hp=80;
    }
}
