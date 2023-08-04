package com.springtest2.day02;

import java.util.Set;

/**
 * Author:李海旭
 * Date : 2023/8/4 13:49
 */
public class Story {
    private Set<String> chan;

    public void setChan(Set<String> chan) {
        this.chan = chan;
    }

    @Override
    public String toString() {
        return "Story{" +
                "chan=" + chan +
                '}';
    }
}
