package com.zym.gauss;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zym
 * @date 18/10/8 下午5:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GaussId {
    private long timestamp;
    private long dataCenterId;
    private long workerId;
    private long sequence;
}
