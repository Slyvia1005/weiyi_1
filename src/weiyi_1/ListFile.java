/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weiyi_1;

import java.io.File;
/**
 *
 * @author 吴小双
 */
public class ListFile {
    public static void main(String[] args){
 
        File file = new File("D:\\a");
        ListFile.listFile(file);
    }
 
    public static void listFile(File f){
        if(f.isDirectory()){
            System.out.println("directory:"+f.getPath()+"--parent:"+f.getParent());
            File[] t = f.listFiles();
            for(int i=0;i<t.length;i++){
                listFile(t[i]);
            }
        }else {
            System.out.println("fileName:"+f.getAbsolutePath()+"--parent:"+f.getParent());
        }
    }
}
