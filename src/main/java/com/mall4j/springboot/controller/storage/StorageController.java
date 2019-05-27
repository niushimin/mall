package com.mall4j.springboot.controller.storage;


import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.service.sotrage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 17:08
 * @Description:
 */

@RestController
@RequestMapping("/admin/storage")
public class StorageController {
    @Autowired
    StorageService storageService;

    @RequestMapping("/create")
    public ReponseVoo insertStorage(@RequestParam("file") MultipartFile multipartFile) {
        ReponseVoo reponseVoo = storageService.insertStorage(multipartFile);
        return reponseVoo;
    }
}
