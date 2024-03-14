import java.util.Scanner;

public class prac13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int ans = calc(str);
        if(ans != 0){    
            System.out.println("The answer for the given expression is " + ans);
        }
    }
    public static int calc(String str){
        if(str.contains("+")){
            String[] as = str.split("\\+");
            return Integer.parseInt(as[0].strip()) + Integer.parseInt(as[1].strip());
        }
        else if(str.contains("-")){
            String[] as = str.split("\\-");
            return Integer.parseInt(as[0].strip()) - Integer.parseInt(as[1].strip());
        }
        else if(str.contains("/")){
            String[] as = str.split("\\/");
            return Integer.parseInt(as[0].strip()) / Integer.parseInt(as[1].strip());
        }
        else if(str.contains("*")){
            String[] as = str.split("\\*");
            return Integer.parseInt(as[0].strip()) * Integer.parseInt(as[1].strip());
        }
        else{
            System.out.println("There are no operators in the string entered.");
            return 0;
        }
    }
}
