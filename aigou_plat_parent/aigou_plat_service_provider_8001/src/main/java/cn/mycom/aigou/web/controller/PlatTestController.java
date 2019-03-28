package cn.mycom.aigou.web.controller;

import cn.mycom.aigou.common.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/plat")
public class PlatTestController {
    @RequestMapping("/name")
    public AjaxResult test(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "冯大侠");
        return AjaxResult.me().setSuccess(false).setMsg("操作失败了哈").setObject(map);
    }
}
