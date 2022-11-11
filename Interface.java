class A {
    
}
interface B{
public abstract void method()

}
interface D{

}
class C extends A implements B,D{

}



B b= new C();
A a=new C();
D d=new C();

//interface 1ka variable +++> public static final   (variable+++>constant)
//interface 1ka method+++> public abstract
//object+++>no
//constructor+++>no
//subclass objct+++>yes
//normal method+++>no
//static mean++++> object hdnne nthuw use krnn puluwn