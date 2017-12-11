package com.chris.mybatisdemo.base;

import com.chris.mybatisdemo.exception.ReturnFormat;

/**
 * Created by Chris on 2017/12/11.
 */

public abstract class BaseController {
    protected String retContent(int status,Object data) {
        return ReturnFormat.retParam(status, data);
    }
}