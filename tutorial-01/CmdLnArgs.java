/* Command Line Argument Program */

public class CmdLnArgs{
  public static void main(String[] args){
    if (args.length > 0){
      for(i = 0; i < args.length){
        args[i].toLowerCase();
      }
      
      System.out.println("There are " + args.length + " given. Which are:.. ");
      System.out.print(args[0]);
    }
  }
}
