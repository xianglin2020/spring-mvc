package controller;

import domain.UploadedFile;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-10
 */
@Controller
public class HtmlFileUploadController {
    private static final Log LOG = LogFactory.getLog(HtmlFileUploadController.class);

    @RequestMapping("/html5")
    public String inputProduct() {
        return "Html5";
    }

//    @RequestMapping("/file_upload")
//    public void saveProduct(HttpServletRequest servletRequest, @ModelAttribute UploadedFile uploadedFile, HttpServletRequest request, HttpServletResponse response) {
//        LOG.info("get");
//
//        MultipartFile multipartFile = uploadedFile.getMultipartFile();
//        String fileName = multipartFile.getOriginalFilename();
//
//        try {
//            File file = new File(servletRequest.getServletContext().getRealPath("/file"), fileName);
//            multipartFile.transferTo(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    // 当使用@RequestMapping返回值为void时，会自动跳到对应的视图。[这样会导致，找不到响应视图]

    @RequestMapping("/file_upload")
    public ModelAndView saveProduct(HttpServletRequest servletRequest, @ModelAttribute UploadedFile uploadedFile) {
        LOG.info("get");

        MultipartFile multipartFile = uploadedFile.getMultipartFile();
        String fileName = multipartFile.getOriginalFilename();

        try {
            File file = new File(servletRequest.getServletContext().getRealPath("/file"), fileName);
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
