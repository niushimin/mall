package com.mall4j.springboot.service.sotrage.impl;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.mapper.MallStorageMapper;
import com.mall4j.springboot.pojo.MallStorage;
import com.mall4j.springboot.service.sotrage.StorageService;
import com.mall4j.springboot.utils.UUIDUitls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    MallStorageMapper mallStorageMapper;

    @Override
    public ReponseVoo insertStorage(MultipartFile multipartFile) {
        String myHost = "http://localhost/admin/wx/storage/fetch/";
        /*参数获取*/
        long size = multipartFile.getSize();
        String filename = multipartFile.getOriginalFilename();
        String contentType = multipartFile.getContentType();

        String[] split = filename.split("\\.");
        String key = UUIDUitls.getUUID() + "." + split[1];
        /*封装参数*/
        MallStorage mallStorage = new MallStorage();
        mallStorage.setAddTime(new Date());
        mallStorage.setUpdateTime(new Date());
        mallStorage.setSize((int)size);
        mallStorage.setName(filename);
        mallStorage.setKey(key);
        mallStorage.setType(contentType);
        mallStorage.setUrl(myHost + key);
        mallStorage.setDeleted(false);
        /*写入数据库*/
        mallStorageMapper.insertSelective(mallStorage);
        /*文件写入*/
        try {
            File file = new File("target\\classes\\static\\wx\\storage\\fetch");
            if (!file.exists()) {
                file.mkdirs();
            }
            File fileOut = new File(file, key);
            InputStream inputStream = multipartFile.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(fileOut);
            byte[] bytes = new byte[1024];
            int read;
            while ((read = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes,0,read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*封装返回参数*/
        ReponseVoo<MallStorage> reponseVoo = new ReponseVoo<>();
        reponseVoo.setData(mallStorage);

        return reponseVoo;
    }
}
