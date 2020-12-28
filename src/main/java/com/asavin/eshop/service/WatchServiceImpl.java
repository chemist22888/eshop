package com.asavin.eshop.service;

import com.asavin.eshop.Entity.Watch;
import com.asavin.eshop.repository.WatchRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Service
public class WatchServiceImpl implements WatchService {
    @Autowired
    WatchRepository watchRepository;

    @Override
    public boolean isValid(Watch watch) {
        boolean result = (watch.getPrice() > 0)
                && (watch.getTitle().length() > 0) && (isImageCorrect(watch.getFountain()));
        return result;
    }

    @Override
    public Watch save(Watch watch) {
        return watchRepository.save(watch);
    }

    private boolean isImageCorrect(String base64Image) {
        boolean isCorrect = true;
        byte[] imageByte = Base64.decodeBase64(base64Image);

        try (ByteArrayInputStream bis = new ByteArrayInputStream(imageByte)) {
            BufferedImage image = ImageIO.read(bis);
            if (image == null)
                throw new IOException();
        } catch (Exception e) {
            isCorrect = false;
        }
        return isCorrect;
    }
}
