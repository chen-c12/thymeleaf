package com.chenddd.thymeleaf.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author 金鱼
 * @title: FormController
 * @projectName thymeleaf
 * @description: 文件上传测试
 * @date 2022/3/129:45
 */
@Slf4j
@Controller
public class FormController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    /**
     * MultipartFile 自动封装上传的文件
     * @param email
     * @param username
     * @param headerImg
     * @param photos
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {

        log.info("上传的信息：email={},username={},headerImg={},photos={}",
                   email,username,headerImg.getSize(),photos.length);

        if (!headerImg.isEmpty()){
            //保存到文件服务器，OSS服务器
            String filename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("D:\\cache\\"+filename));
        }

        if (photos.length>0){
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()){
                    String file = photo.getOriginalFilename();
                    photo.transferTo(new File("D:\\cache\\"+file));
                }
            }
        }

        return "redirect:/main.html";
    }
}
