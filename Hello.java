
class Hello {
    public static void main(String[] args) {
        // object senobj ="This is a regular sentence";
        //     System.out.println(senobj);
        //     System.out.println(senobj.getClass());
        //     int x=10;
            
        //     System.out.println("x="+x);
        //     System.out.println(strobj.getClass());
        //     System.out.println(x.getClass());
            
        //     String stobj = "This is as tring";
            
        //     System.out.println(strobj.getClass());

        try{

        String sval =" 123 ";
        int ival=Integer.parseInt(sval.trim());
        System.out.println(sval);
        System.out.println(ival*2);
        }
        catch(NumberFormatException exc){
            System.out.println("NumberFormatException:"+exc.getMessage());
        }
    }
}
