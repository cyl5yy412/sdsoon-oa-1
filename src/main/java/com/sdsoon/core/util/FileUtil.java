package com.sdsoon.core.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Paths;

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

    /**
     * 下载
     *
     * @param path
     * @param fileName
     * @param res
     * @return
     * @throws UnsupportedEncodingException
     */
    public static boolean downloadFile(String path, String fileName, HttpServletResponse res) throws UnsupportedEncodingException {
        if (fileName == null) {
            return false;
        }
        //通过文件名查找文件信息fileInfo=selectByFileName(fileName);
        //查看文件信息,存储路径
        res.setContentType("application/force-download");// 设置强制下载不打开
        res.addHeader("Content-Disposition", //
                "attachment;fileName=" +
                        new String(fileName.getBytes("utf-8"), "iso8859-1"));// 设置文件名

        res.setHeader("Context-Type", "application/xmsdownload");

        //判断文件是否存在
        File file = new File(Paths.get(path, fileName).toString());
        if (file.exists()) {
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = res.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                log.info("下载成功");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return true;
    }

    /*

    String fileName = "FileUploadTests.java";
        if (fileName != null) {
            //当前是从该工程的WEB-INF//File//下获取文件(该目录可以在下面一行代码配置)然后下载到C:\\users\\downloads即本机的默认下载的目录
            String realPath = request.getServletContext().getRealPath(
                    "//WEB-INF//");
            File file = new File(realPath, fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition",
                        "attachment;fileName=" +  fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("success");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;

     */

}
