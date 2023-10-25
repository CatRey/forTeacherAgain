public class Person {
    String name;
    int age;
    private int id = -1;
    public Person(int id){
        if(id>1e6) this.id = 0;
        else this.id=id;
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public int birtday(){
        age++;
        return age;
    }
    public void id(){
        System.out.println(id);
    }
}
