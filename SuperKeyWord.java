//method overriding krata psse method ek cl krama super clz ekei sub clz ekei dekem method 1 thibunta cl wenne sub class eke method eka.
//

class Monkey{

    Monkey(int x){

    }
    int legs;
    void climb(){
        //something

    }
}
class Man{

    Monkey(){
        super(33);

    }
    void climb(){
        super.climb();
        super.legs;//super clz eke variable ekak access krn 1
        //using lader or something (super clz eke method body 1ta wda wens body ekak)

    }
}
Man a = new Man();
a.climb();
//mange ewa thmai cl wenne.monkeyge method cl wenn thmai constructers use kre.
//super class eke constructer eka sub clz eke constructer eken cl krnw super() keyword eken.
//supper keyword : super class eke constructer ekt cl krnw
//               : super class eke variable ekak hri method ekak cl krnn