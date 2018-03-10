package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hhx
 * @since 2018/3/6 21:56
 */
public class HeapOOM {
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

    static class OOMObject {

        byte[] array = new byte[1024];
    }
}
