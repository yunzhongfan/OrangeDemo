/**   
* @Title: ExceptionHandlerAdvice.java 
* @Package com.produce 
* @Description: TODO
* @author nbc  
* @date 2017年12月19日 下午4:41:08 
* @version V1.0
*/
package com.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/** 
 * 处理页面
 * 统一错误
* @ClassName: ExceptionHandlerAdvice 
* @Description: TODO
* @author nbc
* @date 2017年12月19日 下午4:41:08 
*  
*/

@ControllerAdvice
public class ExceptionHandlerAdvice {

	@ExceptionHandler(value = Exception.class)
	public  ModelAndView  modelAndView(Exception e, WebRequest webRequest){
		ModelAndView  modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		modelAndView.addObject("errorMsg",e.getMessage());
		return modelAndView;
	}
	
	
	/*有的时候我们需要预设键值对到Model中，就像上面那个案例那样，这个时候我们可以在ExceptionHandlerAdvice类中再添加一个方法：
	在这个方法中我们向Model中绑定键值对，绑定完成之后，在任何Controller中我们都可以通过给方法的参数设定@ModelAttribute注解来访问这里存入的值，
	相当于这里的值是一个全局变量。OK ,这里的访问案例和上文一致，我就不再赘述了。*/
	@ModelAttribute //③
	public void addAttributes(Model model) {
		model.addAttribute("msg", "错误信息"); //④
	}
	
/*	OK，还有一种需求，有的时候我们需要预处理前台传来的参数，比如说禁止掉某一个参数，这个也可以统一处理，OK，继续在ExceptionHandlerAdvice方法中添加方法
	这个表示将客户端传来的id参数忽略掉，但是注意接收的方式，这里通过对象来接收参数的时候才有效(通过对象接收这个参数的时候才会屏蔽掉id)，如果直接提取还是可以提取到的，
	我们来看一下控制器方法，还是刚才抛异常那个方法，但是在抛异常之前我先打印一下日志：*/
	@InitBinder //④
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields("id"); //⑤
	}
}
