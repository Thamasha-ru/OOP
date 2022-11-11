abstract class vehicle{
    abstract void park();
        //no meaning so no body
    void method(){
        //hgjjgkh
    }
}
abstract class Car extends Vehicle{

}
abstract class Bus extends Vehicle{
    void park(){
        //body
    }
}
//abstract super class ekk thiyeddi sub class liyddi ekko sub class abstract krnn oni extend krddi,nthnm method overiding krnn oni

//normal method==>can
//object hadann++>baaa
//sub class object===>can
//cunstructor==>baa

Vehicle v = new Vehicle(); //no
Vehicle v1 = new Car(); //yes
