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
public class ChineCut {

public static void main(String[] args) {
        String str2="我ABc汉def";
        int last=ChineCut.splitString(str2,6);
        System.out.println(str2.substring(0, last));
    }
    //获取截取字符串的末位
    public static int splitString(String str,int cutNum) {
        //将字符串转化为字节数组
        byte[] byteArray=str.getBytes();
        //读取字节数组长度，并将其与输入的截取长度比较，如果截取长度比字节数组长度长，则将截取长度改为字节数组长度
        int arrayLength=byteArray.length;
        if(cutNum>arrayLength) {
            cutNum=arrayLength;
        }
         
        //记录需要截取的长度
        int needCut=0;
        boolean isMinus=false;
        //遍历该字节数组
        for(int i=0;i<cutNum;i++) {
            //中文字符只有一半时对应的字节在ASCll码中为负数
            //判断对应的字节的ASCll码是否为负数以及是否为中文字符的第一半
            if(byteArray[i]<0&&!isMinus) {
                isMinus=true;
            }else {
                /*因为一个中文字符在ASCll码中占两个字节，
                 * 所以在作条件判断时一个中文字符会判断两次，
                 * 而截取的字符串长度是根据字符数来截取，
                 * 所以需要用一个boolean类型的变量作为判断条件，
                 * 使一个中文字符只增加一个字符长度
                 */
                needCut++;
                isMinus=false;
            }
        }
        return needCut;
    }

}
