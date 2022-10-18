package com.helium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        System.out.println("c".compareTo("b"));
        List<Root> rootList = new ArrayList<>();
        Root root = new Root();
        rootList.add(root);
        List<Root> point = rootList;
        System.out.println(point.indexOf(point.get(0)));
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        // 构造词根树
        List<Root> rootList = new ArrayList<>();
        rootList.add(new Root());
        for (String dic : dictionary) {
            List<Root> point = rootList;

            point.indexOf(point.get(0));
            String[] str_arr = dic.split("");
            for (String str : str_arr) {

            }
        }


        return null;
    }

    public static class Root {
        private String cur;

        private List<Root> next;

        public String getCur() {
            return cur;
        }

        public void setCur(String cur) {
            this.cur = cur;
        }

        public List<Root> getNext() {
            return next;
        }

        public void setNext(List<Root> next) {
            this.next = next;
        }
    }
}
