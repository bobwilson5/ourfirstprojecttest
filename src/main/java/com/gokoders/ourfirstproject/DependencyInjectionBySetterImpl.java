package com.gokoders.ourfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionBySetterImpl {
	private MediaService mediaService;

	@Autowired
	public void setMediaService(MediaService mediaService) {
		this.mediaService = mediaService;
	}
	
	public String getMedia() {
		return mediaService.fetchMedia();
	}
	
}
