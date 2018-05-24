package com.xiaweizi.ssm.test;

import com.xiaweizi.ssm.dao.DeveloperDAO;
import com.xiaweizi.ssm.model.DeveloperModel;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeveloperDAOTest extends BaseTest {
    @Autowired
    private DeveloperDAO developerDAO;


    @Test
    public void testQueryAll() throws Exception {
        List<DeveloperModel> developers = developerDAO.getAllDevelopers();
        for (DeveloperModel developerModel : developers) {
            System.out.println(developerModel.getName());
        }
    }
}
