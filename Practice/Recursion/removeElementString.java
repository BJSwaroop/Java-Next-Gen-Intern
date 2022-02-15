public class removeElementString {
    
    public static void main(String[] args) {
        String str = "baccapplbd";
        skipChar(str);
        System.out.println();
        System.out.println( skipchar1("",str) );
        System.out.println( skipApple("",str) );
        System.out.println( skipAppNotApple("",str) );
    }

    static void skipChar(String up){
        if(up.isEmpty()){
            return;
        }
        char curr = up.charAt(0);
        if(curr == 'c'){
            skipChar(up.substring(1));
        }
        else{
            System.out.print(curr);
            // or else you can pass an argument in the function call and print it at the end
            skipChar(up.substring(1));
        }
    }
    static String skipchar1(String p,String up){

        if(up.isEmpty()){
            return p;
        }
        char curr = up.charAt(0);
        if(curr == 'a'){
            return skipchar1(p,up.substring(1));
        }
        else{
            return skipchar1(p+ curr,up.substring(1));
        }
    }
    static String skipApple(String p,String up){

        if(up.isEmpty()){
            return p;
        }
        if(up.startsWith("apple")){
            return skipApple(p,up.substring(5));
        }
        else{
            return skipApple(p+ up.charAt(0),up.substring(1));
        }
    }
    static String skipAppNotApple(String p,String up){

        if(up.isEmpty()){
            return p;
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(p,up.substring(3));
        }
        else{
            return skipAppNotApple(p+ up.charAt(0),up.substring(1));
        }
    }
    // static void removeChar(String str, int i) {
        
    //     String new_str = new String();
    //     if(i == str.length()){
    //         return;
    //     }
    //     if(str.charAt(i) != 'c'){
    //         new_str += str.charAt(i);
    //     }
    //     System.out.print(new_str); 
    //     removeChar(str, i+1);
    // }
    // static String skipChar(String str, int i) {
        
    //     String new_str = new String();
    //     if(i == str.length()){
    //         return "";
    //     }
    //     if(str.charAt(i) != 'a'){
    //         new_str += str.charAt(i);
    //     }
    //     return new_str + skipChar(str, i+1);
    // }

    // static String skipApple(String str,int i){
    //     String new_str = new String();
    //     if(i == str.length()){
    //         return "" ;
    //     }
    //     System.out.println();
    //     if(i <= str.length() -5 && str.substring(i,i+5) == "apple"){
    //         return new_str + skipApple(str, i+4);
    //     }
    //     else{
    //         new_str += str.charAt(i);
    //         return new_str + skipApple(str, i+1);
    //     }
    // }

}
