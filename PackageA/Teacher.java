package PackageA;

public class Teacher extends Person{
    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        
    }
    public static void main(String[] args){
        Teacher obj=new Teacher();
        obj.setName("Rishith");
        System.out.println(obj.getName);
    }
}
