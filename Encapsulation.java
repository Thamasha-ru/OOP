//using encapsulation protect variables
class Student {

    private int id;
    private String name;
    private int age;

    public void setId(int id){
        this.id=id;
    }

    public int getId(){

        return id;
    }
    public void setName(String name){

        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){

        this.age=age;
    }
    public int getAge(){

        return age;
    }
}
class Demo{
    public static void main(String args[]){

        Student s=new Student();
        s.id=1;
        s.name="asiri";
        s.age=23;

    }
}