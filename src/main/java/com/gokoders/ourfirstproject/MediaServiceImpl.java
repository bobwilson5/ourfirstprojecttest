package com.gokoders.ourfirstproject;

import org.springframework.stereotype.Component;

@Component
public class MediaServiceImpl implements MediaService {

	@Override
	public String fetchMedia() {
		return "VIDEO";
	}

}
