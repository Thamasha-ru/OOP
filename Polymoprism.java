class Vehicle{
    void park(){

    }
}
class Car extends Vehicle{
    void park(){
        //car park
    }

} 
class Van extends Vehicle{
    void park(){
        //van park
    }

}
class Bus extends Vehicle{
    void park(){
    //bus park
    }   

}
class Demo{
public static void main(String args[]){
Vehicle v=new Van();
v.park();
}

}