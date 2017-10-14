package vshare.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping(path = "upload")
public class UploadController {
    @PostMapping(value = "{name}")
    String doUpload(@PathVariable("name") String name, @RequestParam(name = "file") MultipartFile multipartFile) {
        return null;
    }
}
