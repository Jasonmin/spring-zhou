package com.mysql.Utils.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandle {

    //拦截的错误
//    @ExceptionHandler(value = Exception.class)
//    //一些异常是因为请求逻辑导致，而非服务器本身内部处理异常，这时服务器端是接受了请求，而在返回时发生异常，这时服务器接受请求
//    //的状态是成功的，此时再处理请求逻辑异常,将会进入这个方法处理。需要ResponseStatus注解
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public Result handle(Exception e) {
//        //如果异常为自定义异常就走自定义异常
//        if (e instanceof CustomizeException) {
//            CustomizeException girlException = (CustomizeException) e;
////            log.error("【自定义异常】{}", girlException.getMessage());
//            return Result.error(girlException.getCode(), girlException.getMessage());
//        } else {
////            log.error("【系统异常】{}", e);
//            return Result.error(-1, "未知错误");
//        }
//    }

}
