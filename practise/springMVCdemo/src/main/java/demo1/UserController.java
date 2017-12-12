/**   
* @Title: UserController.java 
* @Package demo1 
* @Description: TODO
* @author nbc  
* @date 2017年12月5日 下午4:13:51 
* @version V1.0
*/
package demo1;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author nbc
 * @date 2017年12月5日 下午4:13:51
 * 
 */

@Controller
@RequestMapping(path = "/user")
public class UserController {

	static {
		System.out.println("springMVC启动了！");
	}

	@RequestMapping(path = "/*/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/{userId}")
	public ModelAndView showDetail(@PathVariable("userId") String userId) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/hello");
		// mav.addObject("user", userService.getUserById(userId));
		return mav;
	}

}
