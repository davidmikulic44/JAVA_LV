package lv3;

import java.io.File;

public class dir {
    public static void main(String[] args){
        File dir = new File("C:\\Users\\student\\Desktop");

        if(dir.exists()){
            if(dir.isDirectory()){
                for(File path : dir.listFiles()) {
                    System.out.print(path.getName());
                    if(path.isFile())
                        System.out.print(", datoteka\n");
                    else
                        System.out.print(", direktorij\n");
                }
                System.out.println("---------------------------------------");
                for(File path : dir.listFiles()) {
                    String name = path.getName();
                    if((path.getName().charAt(0)>='a' && path.getName().charAt(0)<='n') || (path.getName().charAt(0)>='A' && path.getName().charAt(0)<='N')) {
                        String s1 = name.substring(0, 1).toUpperCase();
                        System.out.print(s1 + name.substring(1));
                    }
                    else{
                        if(name.charAt(name.length()-1)>='a' && name.charAt(name.length()-1)<='z')
                            name = name.toUpperCase();
                        System.out.print(name);
                    }

                    if(path.isFile())
                        System.out.print(", datoteka\n");
                    else
                        System.out.print(", direktorij\n");
                }
            }
        }
        else{
            System.out.println("path: "+dir.getPath()+" does not exist");
        }
    }
}