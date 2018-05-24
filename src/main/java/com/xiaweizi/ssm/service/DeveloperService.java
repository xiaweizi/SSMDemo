package com.xiaweizi.ssm.service;


import com.xiaweizi.ssm.dao.DeveloperDAO;
import com.xiaweizi.ssm.model.DeveloperModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeveloperService {

    @Autowired
    private DeveloperDAO developerDAO;

    public List<DeveloperModel> getAllDevelopers() {
        return developerDAO.getAllDevelopers();
    }

    public DeveloperModel getDeveloper(String developerId) {
        return developerDAO.getDeveloper(developerId);
    }

    public boolean addDeveloper(DeveloperModel developerModel) {
        return developerDAO.addDeveloper(developerModel);
    }

    public boolean updateDeveloper(String developerId, String name) {
        return developerDAO.updateDeveloper(developerId, name);
    }

    public boolean deleteDeveloper(String developerId) {
        return developerDAO.deleteDeveloper(developerId);
    }
}
