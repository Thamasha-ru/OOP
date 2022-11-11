class Updowncasting {
    public static void main(String[] args) {
        
    
        //Converting
    
        int xInt = 10;
        float xFloat;
        xFloat = xInt;
    
        int xInt2;
        float xFloat2 = 1.23456f;
    
        //xInt2 =(int) xFloat2;
    
        Float x = new Float("1.23456");
        xInt2 = x.intValue();
    
        System.out.println(xInt2);
    
    }
    
    
}
