package com.weibo.demo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-5:23 PM-
 */

@EnableEncryptableProperties
@RestController
public class EncryptController {

    @Autowired
    StringEncryptor stringEncryptor;


    @RequestMapping(value = "/en")
    public void en() {
        System.out.println("生成加密后的数据库用户名："+stringEncryptor.decrypt("ogWqcIqQzwGIerHGioS0PQ=="));
        System.out.println("生成加密后的数据库密码："+stringEncryptor.encrypt("root"));
    }

}
