package com.zym.gauss;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zym
 * @date 18/10/10 下午3:57
 */
public class GaussIdWorkerTest {
    @Test
    void nextId() {
        GaussIdWorker idWorker = new GaussIdWorker(0, 0);
        Set<Long> set = new HashSet<Long>();
        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
            set.add(id);
        }
        int size = set.size();
        assertEquals(1000, size);
    }
}
