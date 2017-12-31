package com.kunyang.android.qq.Data.Restapi;

import com.hyphenate.exceptions.HyphenateException;

/**
 * Created by 坤阳 on 2017/12/30.
 */

public class LiveException extends HyphenateException {
    protected int errorCode = -1;



    public LiveException(){}



    public LiveException(int errorCode, String desc){

        super(desc);

        this.errorCode = errorCode;

    }



    public LiveException(String message) {

        super(message);

    }





    public int getErrorCode() {

        return errorCode;

    }
}
