package chapter3.ch_13.domain.userinfo.dao.oracle;

import chapter3.ch_13.domain.userinfo.UserInfo;
import chapter3.ch_13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into ORACLE DB useID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete ORACLE DB userID = " + userInfo.getUserId());
    }
}
