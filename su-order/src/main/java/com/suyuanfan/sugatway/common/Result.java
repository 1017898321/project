package com.suyuanfan.sugatway.common;

import com.suyuanfan.sugatway.enums.ResultStatusEnum;

/**
 * 返回结果
 *
 * @author SuYuanFan
 * @company 湖南安第斯信息科技有限公司, 版权所有
 * @date 2021/6/4 18:06
 */
public class Result<T>{
    private String code;
    private String msg;
    private T data;

    public Result() {
    }

    private Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result();
        result.setCode(ResultStatusEnum.SUCCESS.getCode());
        result.setMsg(ResultStatusEnum.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> of(String code, String msg, T data) {
        return new Result(code, msg, data);
    }

    public static <T> Result<T> of(String code, String msg) {
        return new Result(code, msg, (Object) null);
    }

    public static <T> Result<T> fail(String code, String msg) {
        Result<T> result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> fail(String msg) {
        return fail(ResultStatusEnum.FAIL.getCode(), msg);
    }

    public static <T> Result<T> fail(String msg, T data) {
        Result<T> result = new Result();
        result.setCode(ResultStatusEnum.FAIL.getCode());
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(T data) {
        Result<T> result = new Result();
        result.setCode(ResultStatusEnum.FAIL.getCode());
        result.setMsg(ResultStatusEnum.FAIL.getMsg());
        result.setData(data);
        return result;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
