import java.util.*;
class Main{
    public static boolean searchStr(char target,String a){
        for(int i=0;i<a.length();i++){
           if(target==a.charAt(i)){
               System.out.print("yes");
               return true;
           } 
        }
        System.out.print("no");
        return false;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char target=s.nextLine().charAt(0);
        String a=s.nextLine();
        searchStr(target,a);
    }
}