package com.sdsoon.core.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * file上传下载工具类
 * <p>
 * Created By Chr on 2019/6/24.
 */
@Slf4j
public class FileUtil {

    /**
     * 单个文件上传:原文件名上传
     *
     * @param file 前端的file
     * @param path 存储本地的path
     * @return
     */
    public static boolean upLoadFile(MultipartFile file, String path, String fileName) {
        if (file.isEmpty()) {
            return false;
        }
//        int size = (int) file.getSize();
        File dest = new File(path + "/" + fileName);
        if (!dest.getParentFile().exists()) { //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return true;
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            log.info("上传失败--------");
            return false;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            log.info("上传失败--------");
            return false;
        }
    }


}
