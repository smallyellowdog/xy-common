package com.xy.common.response;

import com.xy.common.constant.Status;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 6281918550231778129L;
    private int code;
    private String msg;
    private List<T> data;

    public static <T>BaseResponse ok(List<T> t){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(Status.SUCESS.getCode());
        baseResponse.setMsg(Status.SUCESS.getMsg());
        baseResponse.setData(t);
        return baseResponse;
    }

    public static BaseResponse ok(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(Status.SUCESS.getCode());
        baseResponse.setMsg(Status.SUCESS.getMsg());
        return baseResponse;
    }

    public static <T>BaseResponse result(Status status,List<T> t){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(status.getCode());
        baseResponse.setMsg(status.getMsg());
        baseResponse.setData(t);
        return baseResponse;
    }

    public static BaseResponse result(Status status){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(status.getCode());
        baseResponse.setMsg(status.getMsg());
        return baseResponse;
    }

}
