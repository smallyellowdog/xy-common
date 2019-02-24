package com.xy.common.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 6281918550231778129L;
    private int insult;
    private String msg;
    private List<T> data;
}
