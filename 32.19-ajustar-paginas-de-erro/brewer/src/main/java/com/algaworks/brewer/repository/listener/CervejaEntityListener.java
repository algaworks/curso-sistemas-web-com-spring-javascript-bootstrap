package com.algaworks.brewer.repository.listener;

import javax.persistence.PostLoad;

import com.algaworks.brewer.BrewerApplication;
import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.storage.FotoStorage;

public class CervejaEntityListener {

	@PostLoad
	public void postLoad(final Cerveja cerveja) {
		FotoStorage fotoStorage = BrewerApplication.getBean(FotoStorage.class);
		
		cerveja.setUrlFoto(fotoStorage.getUrl(cerveja.getFotoOuMock()));
		cerveja.setUrlThumbnailFoto(fotoStorage.getUrl(FotoStorage.THUMBNAIL_PREFIX + cerveja.getFotoOuMock()));
	}
	
}
