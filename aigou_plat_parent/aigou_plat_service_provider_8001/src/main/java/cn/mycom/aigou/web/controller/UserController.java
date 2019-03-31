package cn.mycom.aigou.web.controller;

import cn.mycom.aigou.common.AjaxResult;
import cn.mycom.plat.domain.User;
import org.apache.commons.lang.StringUtils;
import org.mockito.internal.util.StringUtil;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plat")
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        //调用servicet 和mapper
        if(user!=null&& !StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
            if ("admin".equals(user.getName())&&"123456".equals(user.getPassword())){
                return AjaxResult.me().setMsg("登录成功");
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("登录失败");
            }
        }

            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
}
