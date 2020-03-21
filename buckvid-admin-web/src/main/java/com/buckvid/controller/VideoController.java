package com.buckvid.controller;

import com.buckvid.pojo.Bgm;
import com.buckvid.service.VideoService;
import com.buckvid.utils.BuckvidJSONResult;
import com.buckvid.utils.PagedResult;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

@Controller
@RequestMapping("video")
public class VideoController {

    @Autowired
    private VideoService videoService;
    @GetMapping("/showBgmList")
    public String showBgmList() {
        return "video/bgmList";
    }

    @PostMapping("/queryBgmList")
    @ResponseBody
    public PagedResult queryBgmList(Integer page) {
        return videoService.queryBgmList(page, 10);
    }

    @GetMapping("/showAddBgm")
    public String login() {
        return "video/addBgm";
    }

    @PostMapping("/addBgm")
    @ResponseBody
    public BuckvidJSONResult addBgm(Bgm bgm) {

        videoService.addBgm(bgm);
        return BuckvidJSONResult.ok();
    }

    @PostMapping("/delBgm")
    @ResponseBody
    public BuckvidJSONResult delBgm(String bgmId) {
        videoService.deleteBgm(bgmId);
        return BuckvidJSONResult.ok();
    }

    @PostMapping("/bgmUpload")
    @ResponseBody
    public BuckvidJSONResult bgmUpload(@RequestParam("file") MultipartFile[] files) throws Exception {

        // 文件保存的命名空间
//		String fileSpace = File.separator + "imooc_videos_dev" + File.separator + "mvc-bgm";
//		String fileSpace = "C:" + File.separator + "imooc_videos_dev" + File.separator + "mvc-bgm";
        String FILE_SPACE = "C:" + File.separator + "/buckvid_admin";
        // 保存到数据库中的相对路径
        String uploadPathDB = File.separator + "bgm";

        FileOutputStream fileOutputStream = null;
        InputStream inputStream = null;
        try {
            if (files != null && files.length > 0) {

                String fileName = files[0].getOriginalFilename();
                if (StringUtils.isNotBlank(fileName)) {
                    // 文件上传的最终保存路径
                    String finalPath = FILE_SPACE + uploadPathDB + File.separator + fileName;
                    // 设置数据库保存的路径
                    uploadPathDB += (File.separator + fileName);

                    File outFile = new File(finalPath);
                    if (outFile.getParentFile() != null || !outFile.getParentFile().isDirectory()) {
                        // 创建父文件夹
                        outFile.getParentFile().mkdirs();
                    }

                    fileOutputStream = new FileOutputStream(outFile);
                    inputStream = files[0].getInputStream();
                    IOUtils.copy(inputStream, fileOutputStream);
                }

            } else {
                return BuckvidJSONResult.errorMsg("Upload Error...");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return BuckvidJSONResult.errorMsg("Upload Error...");
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }

        return BuckvidJSONResult.ok(uploadPathDB);
    }
}
