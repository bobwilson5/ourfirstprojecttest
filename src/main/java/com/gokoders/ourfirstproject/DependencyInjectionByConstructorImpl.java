package com.gokoders.ourfirstproject;

import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionByConstructorImpl {
	private final MediaService mediaService;

	public DependencyInjectionByConstructorImpl(MediaService mediaService) {
		super();
		this.mediaService = mediaService;
	}
	
	public String getMedia() {
		return mediaService.fetchMedia();
	}

}
