package com.example.springdata.biz.user.action;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Joeson on 2017/11/5.
 */
@RestController
public class UserAction {

    /**
     * 获取商铺的商品分类
     *
     * @throws Exception
     */
    @ApiOperation(value = "获取商铺的商品分类", notes = "")
    @ApiImplicitParams({@ApiImplicitParam(name = "shopId", value = "商铺ID", required = true, dataType = "Integer")})
    @RequestMapping(value = "/user/test", method = RequestMethod.POST)
    @ResponseBody
    public void test(){
        System.out.printf(" ===== test ======");
    }

}
