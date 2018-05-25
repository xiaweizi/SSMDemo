package com.xiaweizi.ssm.service;

import com.xiaweizi.ssm.dao.UserDAO;
import com.xiaweizi.ssm.model.CommonModel;
import com.xiaweizi.ssm.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.ssm.service.UserService
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/05/24
 *     desc   :
 * </pre>
 */

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public CommonModel login(String name, String password) {
        CommonModel commonModel = new CommonModel();
        UserModel userInfo = userDAO.getUserInfo(name);
        if (userInfo != null) {
            if (userInfo.getPassword().equals(password)) {
                commonModel.setSuccess("登录成功");
                commonModel.setData(userInfo);
            } else {
                commonModel.setCode(1007);
                commonModel.setMsg("密码输入用户，请重试");
            }
        } else {
            commonModel.setCode(1007);
            commonModel.setMsg("用户不存在");
        }
        return commonModel;
    }

    public CommonModel register(String name, String password) {
        System.out.println("name:" + name);
        System.out.println("password:" + password);
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setPassword(password);
        CommonModel commonModel = new CommonModel();
        UserModel userInfo = userDAO.getUserInfo(name);
        if (userInfo != null) {
            commonModel.setCode(1007);
            commonModel.setMsg("用户名已经存在");
            return commonModel;
        }
        if (userDAO.register(name, password)) {
            commonModel.setSuccess();
        } else {
            commonModel.setFail();
        }
        return commonModel;
    }

    public void updateUserInfo(String name, String nickName) {
        userDAO.updateUserInfo(name, nickName);
    }

}
