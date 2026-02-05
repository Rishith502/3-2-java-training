public class Employee2 {
    public int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args){
        Employee2 obj=new Employee2();
        obj.setAge(20);
        System.out.println(obj.getAge());
    }
}
