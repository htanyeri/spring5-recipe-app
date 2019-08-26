package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by htanyeri on 8/26/2019.
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
