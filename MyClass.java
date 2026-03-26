/*
Welcome to JDoodle!

You can execute code here in 110+ languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class MyClass {
  public static void main(String args[]) {
    yourResp("help");
    int n= 1;
    while(n<=10){
        if(n % 2 == 0){
            System.out.println(n);
        }
    n++;
    }
  }
  
  public static void yourResp(String ans){
      if(ans.trim().equals("help")){
          help();
      }else if (ans.trim().equals("quit")){
          quit();
      }else{
          System.out.println("Sorry I don't understand your command");
      }
  }
    public static void help(){
        System.out.println("How can I help you?");
    }
    public static void quit(){
        System.out.println("Go kill your self");
    }
    
  
}