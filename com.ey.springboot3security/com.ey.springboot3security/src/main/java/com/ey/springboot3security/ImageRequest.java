package com.ey.springboot3security;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotNull;

public class ImageRequest {

    @NotNull(message = "Image file must be provided")
    private MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
