package com.lxs.algorithm.leetcode.others;

/**
 * @ClassName: RandomListNode
 * @Description:
 * @Author: https://github.com/xs-L
 * @Date: 2021年07月19日 下午 10:41
 */
public class RandomListNode {
    public int label;
    public RandomListNode next = null;
    public RandomListNode random = null;

    public RandomListNode(int label) {
        this.label = label;
    }
}
