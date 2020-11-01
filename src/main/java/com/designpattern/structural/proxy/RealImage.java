package com.designpattern.structural.proxy;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 08:11
 * @Description:
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("显示图片：" + fileName);
    }

    public void loadFromDisk() {
        System.out.println("图片加载完成...");
    }
}
