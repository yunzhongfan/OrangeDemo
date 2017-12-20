/**   
* @Title: StudentInfo.java 
* @Package com.mybatis.responsity 
* @Description: TODO
* @author nbc  
* @date 2017年12月20日 下午2:23:12 
* @version V1.0
*/
package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

/** 
* @ClassName: StudentInfo 
* @Description: TODO
* @author nbc
* @date 2017年12月20日 下午2:23:12 
*  
*/
public interface StudentMapper {
	int update( @Param("stunm") int  id);
}
