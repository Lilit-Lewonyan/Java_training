public class FirstTask {
    public static void main(String[] args) {
      for (int i =1; i<=9; i++){
          printline(i);
      }

    }

    private static void printline(int line){
        String string1 = "-";
        String string2 = ". .";
        String string3 = "|||";
        String string4 = "Lilit";
        if (line==1 || line==9)
        System.out.println("   "+string1+"   ");
        if (line==2 || line==8)
        System.out.println("  "+string2+"  ");
        if (line==3 || line==7)
        System.out.println("  "+string3+"  ");
        if(line==4 || line==6)
        System.out.println(" "+string1+string1+string1+string1+string1+" ");
        if(line==5)
        System.out.println(string1+string4+string1);

    }
}
