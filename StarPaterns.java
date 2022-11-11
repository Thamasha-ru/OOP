class StarPaterns {
    public static void main(String args[]){
       // System.out.println("*");
        int x;
        int y;
       // for (x=0;x<5;x++){
        //    System.out.print("*");
       // }  
       // System.out.println(" ");
        //System.out.println(" ");
        

            
            for (y=0;y<5;y++){
            
                for (x=0;x<=y;x++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            System.out.println(" ");


            for (y=0;y<4;y++){
            
                for (x=0;x<5;x++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }

            System.out.println(" ");
            System.out.println(" ");

            // for (y=0;y<5;y++);{
            //     for(x=5;x>=0;x--);{
            //         System.out.print(" ");
            //     }
            //     System.out.println(" * ");
            // }
            for(int j=0;j<5;j++){
                for(int k=4; k-j>0;k--){
                    System.out.print(" ");
                }
                for(int i=0;i<=j;i++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }

            System.out.println(" ");
            System.out.println(" ");

            for(int j=0;j<4;j++){
                for(int k=3; k-j>0;k--){
                    System.out.print(" ");
                }
                for(int i=0;i<=j;i++){
                    System.out.print(" *");
                }
                System.out.println(" ");
            }

            System.out.println(" ");
            System.out.println(" ");

            for(int j=0;j<5;j++){
                for(int k=4; k-j>0;k--){
                    System.out.print(" * ");
                }
                for(int i=0;i<=j;i++){
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

        }
}  

