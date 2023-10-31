public class Mage extends Unit {
    int mana=-1;
    public Mage(String name, int mana){
        super(name);
        this.mana = mana;
    }
    public void printInfoMage(){
        super.printInfo();
        System.out.println("Person "+this.name+" has mana "+this.mana);
    }
    public void otherMage(Mage other){
        if(this.mana == other.mana) System.out.println("They are friends");
        else System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA!");
    }
    public void changeMana(int mana){
        this.mana = mana;
    }
}
