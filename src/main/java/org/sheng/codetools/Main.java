package org.sheng.codetools;

/**
 * @author shengxingyue, created on 2018/1/15
 */
public class Main {
    /**
     * 这里的 for 循环会提前终止，进不到循环体中的时候，i 没有机会进行自增动作，循环在一步判断之后就结束了
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10 && i > 3; i++) {
            System.out.println(i);
        }
    }
}
