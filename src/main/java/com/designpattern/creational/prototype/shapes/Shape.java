package com.designpattern.creational.prototype.shapes;

import java.io.*;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/13 14:51
 * @Description:
 */
public abstract class Shape {
    private String id;
    protected String type;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝
        // return super.clone();

        // 深拷贝
        ByteArrayInputStream bais = null;
        ByteArrayOutputStream baos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);

            return (Shape) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bais.close();
                baos.close();
                ois.close();
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}












