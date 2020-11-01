package com.designpattern.structural.proxy;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 08:11
 * @Description:
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
