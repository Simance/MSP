package com.doo.dao;

import com.doo.dataobject.UserPwdDO;

public interface UserPwdDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Tue Jun 04 21:14:37 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Tue Jun 04 21:14:37 CST 2019
     */
    int insert(UserPwdDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Tue Jun 04 21:14:37 CST 2019
     */
    int insertSelective(UserPwdDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Tue Jun 04 21:14:37 CST 2019
     */
    UserPwdDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Tue Jun 04 21:14:37 CST 2019
     */
    int updateByPrimaryKeySelective(UserPwdDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Tue Jun 04 21:14:37 CST 2019
     */
    int updateByPrimaryKey(UserPwdDO record);
}