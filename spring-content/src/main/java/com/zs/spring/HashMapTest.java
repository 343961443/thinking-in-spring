package com.zs.spring;

import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/8
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(1,1);
        map.put(1,1);
        map.put(17,1);

    }
}
