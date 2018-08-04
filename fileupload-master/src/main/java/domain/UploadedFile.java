package domain;

import org.springframework.web.multipart.MultipartFile;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-10
 */
public class UploadedFile {
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
