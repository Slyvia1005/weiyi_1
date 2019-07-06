/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weiyi_1;

/**
 *
 * @author 吴小双
 */
public class SingleTon {
   private static Singleton s=null;
        private SingleTon(){ }
        public static Singleton getInstance(){
                //Double Check
                if(s==null){
                    synchronized (Singleton.class) {
                      if(s==null){
                        s=new Singleton();
                      }
                    }
                    }
                return s;

        }
        
    private static class Singleton {
        public Singleton() {
        }
    }

}
