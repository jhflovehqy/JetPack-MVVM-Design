package com.bis.cloudphone.design.responsibility;

public class DetectionLoginHandler extends Handler{


    public DetectionLoginHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean handlerRequest(Request request) {
        System.out.println("验证是否登录---");
        if(request.isLogged()){
            Handler next = getNext();
            if(next == null){
                return true;
            }
            if(!next.handlerRequest(request)){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}
