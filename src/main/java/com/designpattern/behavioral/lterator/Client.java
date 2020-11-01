package com.designpattern.behavioral.lterator;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 11:21
 * @Description: 迭代器模式测试
 */
public class Client {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository(new String[]{"张三", "李四", "王五"});

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
