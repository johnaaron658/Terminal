package MPA4;

import java.util.List;

public static class Terminal{  // This is the Tree class.
    private DIR root;
    private DIR curr;
    public Terminal(String f){  // constructor.
      File sav = new File(f);
      if(!sav.exists()||sav.length()==0)
        curr = root = null;
      else{
        /* Insert File-to-Tree creation algorithm here */
      }
    }
    public boolean cd(String[] path){  // 'cd' takes in a path defined by strings.

    }
    public boolean mkdir(String dir_name){

    }
    public boolean rmdir(String dir_name){

    }

    /*Node Classes */
    private enum NodeType{directory,file};

    private class Node {
      public String id;
      public DIR parent;
      NodeType type;
      public boolean equals(Node n){  // equality of nodes.
        return this.id == n.id && this.type == n.type ? true: false;
      }
    }
    private class DIR extends Node{
      public List<Node> children;
      public DIR(String s){ this.id = s; this.parent = null; this.type = directory; }
    }
    private class FILE extends Node{
      public String content;
      public FILE(String s){ this.id = s; this.parent = null; this.type = file; }
    }
}
