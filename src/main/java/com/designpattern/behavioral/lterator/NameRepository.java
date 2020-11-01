package com.designpattern.behavioral.lterator;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 11:21
 * @Description:
 */
public class NameRepository implements Container {
    private String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }

}
