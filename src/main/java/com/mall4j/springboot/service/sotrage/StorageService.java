package com.mall4j.springboot.service.sotrage;

import com.mall4j.springboot.actionform.ReponseVoo;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
    ReponseVoo insertStorage(MultipartFile multipartFile);
}
