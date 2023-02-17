package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper//打开注解以后，才能被容器扫描接口，才能够自动实现，然后装配
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);//个人主页功能

    //查询出一个表里一共有多少条数据
    //@param注解用于给参数取别名
    //如果只有一个参数，并且在<if>里面使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);//首页为0,动态sql条件


}
