//next() can read the input only till the space. It can't read two words separated by space. Also, next() places the cursor in the same line after reading the input. nextLine() reads input including space between the words (that is, it reads till the end of line n).
class Next{

    public void salary(){

        double basic = 2500;
        double allowance = 7500;
        double nestsalary = basic + allowance;

        String name = "david";
        System.out.format("name : %s\n" ,name);
        System.out.println("salary:"+ nestsalary);
    }




    public static void main(String[] args){
        
    }  
  }
