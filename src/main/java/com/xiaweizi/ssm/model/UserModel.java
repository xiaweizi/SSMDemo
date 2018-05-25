package com.xiaweizi.ssm.model;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.ssm.model.UserModel
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/05/24
 *     desc   : 用户信息 model
 * </pre>
 */

public class UserModel {
    private int uid;
    private String name;
    private String password;
    private String nickName;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
