package com.xiaweizi.ssm.dao;

import com.xiaweizi.ssm.model.UserModel;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.ssm.dao.UserDAO
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/05/24
 *     desc   :
 * </pre>
 */

public interface UserDAO {
    boolean register(@Param("name") String name, @Param("password")String password);
    boolean login(@Param("name") String name, @Param("password")String password);
    boolean updateUserInfo(@Param("name") String name, @Param("nickName")String nickName);
    UserModel getUserInfo(String name);
}
