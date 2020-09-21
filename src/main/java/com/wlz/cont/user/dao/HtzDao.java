package com.wlz.cont.user.dao;

import com.wlz.cont.user.pojo.Htzqcljg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HtzDao {

    List<Htzqcljg> selAllHtz();
}
