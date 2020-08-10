package com.bis.cloudphone.design.responsibility;

public class DetectionFrequencyHandler  extends Handler{


    public DetectionFrequencyHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean handlerRequest(Request request) {
        System.out.println("控制访问频率---");
        if(request.isFrequency()){
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
