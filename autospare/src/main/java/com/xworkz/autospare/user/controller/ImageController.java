package com.xworkz.autospare.user.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ImageController {

    // Serve image as a stream
    @GetMapping("/image/{fileName}")
    public void showImage(@PathVariable String fileName, HttpServletResponse response) throws IOException {
        System.out.println("Serving image: " + fileName);

        // Sanitize fileName to avoid directory traversal
        if (fileName.contains("..")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid file name.");
            return;
        }

        // Construct the file path dynamically
        Path path = Paths.get("/home/durgaprasad/products/", fileName);
        File file = path.toFile();

        if (!file.exists()) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "File not found.");
            return;
        }

        // Dynamically set the content type (assuming image/jpeg for simplicity)
        String contentType = "image/jpeg";  // Or use something dynamic like Files.probeContentType(path)
        response.setContentType(contentType);

        try (InputStream buffer = new BufferedInputStream(new FileInputStream(file));
             ServletOutputStream out = response.getOutputStream()) {
            IOUtils.copy(buffer, out);
            response.flushBuffer();
        } catch (IOException e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error while serving image.");
            e.printStackTrace();
        }
    }
}
