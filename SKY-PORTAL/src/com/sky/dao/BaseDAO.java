
 /*   
 * 文件名：BaseDAO.java    
 * 版本信息：    
 * 日期：2014年7月3日 下午10:27:29  
 * Copyright Sky Corporation 2014     
 * 版权所有    
 *    
 */
package com.sky.dao;

import org.hibernate.SessionFactory;


/**     
 * Title: BaseDAO.java    
 * Description: 描述   
 * @author Yun       
 * @version 1.0     
 * @created 2014年7月3日 下午10:27:29    
 */
public abstract class BaseDAO {
    public SessionFactory sessionFactory;
    
    

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
}
