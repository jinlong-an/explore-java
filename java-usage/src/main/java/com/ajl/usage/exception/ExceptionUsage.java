package com.ajl.usage.exception;

/**
 * @Author anjinlong
 * @create 2020-10-02 17:05
 * @description description
 */
public class ExceptionUsage {

    public static void main(String[] args) {
        errMsg();
    }

    public static void errMsg() {
        String str = null;
        try {
            str.length();
        } catch (Exception e) {
            StringBuffer errmsg = new StringBuffer();
            errmsg.append(e.getMessage()).append("\n");
            StackTraceElement [] stackTraceElements = e.getStackTrace();
            for(StackTraceElement stackTraceElement : stackTraceElements){
                errmsg.append(stackTraceElement.toString()).append("\n");
            }
            System.out.println(errmsg);
        }

    }
}
