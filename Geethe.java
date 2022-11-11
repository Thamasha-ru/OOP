

class Geethe {
    public static void main(String[] args) {
        char ch='U';
        //char to string using character class
        String charToString=Character.toString(ch);
        System.out.println("converting cha to string:"+charToString);
        
        String str=" "+ch;
        System.out.println("converting char to string:"+str);

        
        String valueofchar = String.valueOf(ch);
        System.out.println("converting char to string:"+valueofchar);
    }
}
