package com.wlz.cont;


import com.wlz.cont.user.dao.HtzDao;
import com.wlz.cont.user.dao.UserDao;
import com.wlz.cont.user.pojo.Htzqcljg;
import com.wlz.cont.user.pojo.User;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ContApplicationTests {

    @Autowired
    HtzDao htzDao;


    @Test
   public void contextLoads() {
        List<Htzqcljg> list = htzDao.selAllHtz();
        List zkjList = new ArrayList();
        List kList = new ArrayList();
        List zList = new ArrayList();
        List jList = new ArrayList();
        List zwszList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String zkj = list.get(i).getZkj();
            String zwsz = list.get(i).getZwsz();
            String[] split = zkj.split("-");
            String z = split[0];
            String k = split[1];
            String j = split[2];
            zList.add(z);
            kList.add(k);
            jList.add(j);

            zkjList.add(zkj);
            zwszList.add(zwsz);
        }
        for (int o = 0; o < kList.size() - 1; o++) {
            for (int p = 1; p < kList.size() - o; p++) {
                Integer a = Integer.parseInt((String) kList.get(p - 1));
                Integer b = Integer.parseInt((String) kList.get(p));

                if (a.compareTo(b) > 0) { // 比较两个整数的大小

                    String temp = (String) kList.get(p - 1);
                    kList.set((p - 1), kList.get(p));
                    kList.set(p, temp);
                }
            }
        }
        System.out.println("k"+kList);
//        System.out.println("zkjlist:"+zkjList);
//        System.out.println("zwszList:"+zwszList);
    }



}
