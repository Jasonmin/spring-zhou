package com.forezp.Utils.ExceptionHandler;

public class Result {

    private int code;

    private String msg;

    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setResultCode(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    // Success
    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultEnum.SUCCESS);
        return result;
    }

    // Success data
    public  static Result success(Object data) {

        Result result = new Result();
        result.setResultCode(ResultEnum.SUCCESS);
        result.setData(data);

        return result;
    }

    // Failure
    public static Result failure() {
        Result result = new Result();
        result.setResultCode(ResultEnum.FAILURE);
        return result;
    }

    // custome msg
    public  static Result error(int code,String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }


}
