package bee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController{
	/**
	 * �û���¼
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
    @RequestMapping("/doLogin.ajax")
	public @ResponseBody JsonResultInfo login(String user, String password,HttpServletRequest request) {
    	System.out.println(user+password);
    	if("liguoquan".equals(user)&&"aaa111".equals(password)){
    		request.getSession().setAttribute("user", "OK");
    		return new JsonResultInfo(0,"","�ɹ�");
    	}
    	return new JsonResultInfo(1,"�û��������벻��ȷ","");
	}
}
