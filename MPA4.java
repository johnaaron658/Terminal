package MPA4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MPA4{
  public static void main(String args[]){
    File commands = new File("");
    Terminal t = new Terminal("sav.txt");
    try{
      Scanner sc = new Scanner(System.in);
      while(sc.hasNextLine()){
        String[] cmd = sc.nextLine().split(" ");
        switch(cmd[0]){
          case "cd":      t.cd(cmd[1].split("/")); break;
          case "mkdir":   t.mkdir(cmd[1]);         break;
          case "rmdir":   t.rmdir(cmd[1]);         break;
          default:
            System.out.println("Command not recognized.");
            break;
        }
      }
      sc.close();
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
  }
}
