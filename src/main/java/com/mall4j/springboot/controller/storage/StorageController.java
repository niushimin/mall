package com.mall4j.springboot.controller.storage;

import com.mall4j.springboot.pojo.common.ResponseVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 17:08
 * @Description:
 */

@RestController
@RequestMapping("/storage")
public class StorageController {

    @RequestMapping("/create")
    public ResponseVo create(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        long timeMillis = System.currentTimeMillis();
       /* String newFilename = timeMillis + originalFilename.substring(originalFilename.lastIndexOf("."));
        String realPath = request.getSession().getServletContext().getRealPath("/image");
        File realFile = new File(realPath);
        System.out.println(realFile.getAbsolutePath());

        System.out.println(newFilename);*/
        /*file.transferTo();*/
        return null;
    }
}
