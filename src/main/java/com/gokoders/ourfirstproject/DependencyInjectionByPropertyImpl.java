package com.gokoders.ourfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionByPropertyImpl {

	@Autowired
	public MediaService mediaService;
	
	public String getMedia() {
		return mediaService.fetchMedia();
	}

}
