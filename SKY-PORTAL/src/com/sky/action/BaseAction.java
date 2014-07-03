/*   
 * 文件名：BaseAction.java    
 * 版本信息：    
 * 日期：2014年7月3日 下午9:43:43  
 * Copyright Sky Corporation 2014     
 * 版权所有    
 *    
 */
package com.sky.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Title: BaseAction.java Description: 描述
 * 
 * @author Yun
 * @version 1.0
 * @created 2014年7月3日 下午9:43:43
 */
public class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
  
    private static final long serialVersionUID = -7580935667338359204L;

    protected HttpServletResponse response;

    protected HttpServletRequest request;

    protected Map<String, Object> session;

    public void setServletResponse(HttpServletResponse arg0) {
        this.response = arg0;
    }

    public void setServletRequest(HttpServletRequest arg0) {
        this.request = arg0;
    }

    public void setSession(Map<String, Object> arg0) {
        this.session = arg0;
    }

}
