package com.invest19.demat.persist.endpoints.client;

import java.net.URI;
import java.net.URISyntaxException;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.invest19.demat.persist.pdf.bean.PdfApplicationForm;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore

public class RestTemplateDemoResource {

	@GetMapping("/data/{userId}")
	public ResponseEntity<PdfApplicationForm> getData(@PathVariable String userId) {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/demat-persist/api/pdf-form/" + userId;
		ResponseEntity<PdfApplicationForm> result = restTemplate.getForEntity(url, PdfApplicationForm.class);

		PdfApplicationForm applicationFormReturn = null;
		if (result.getStatusCode() == HttpStatus.OK) {
			applicationFormReturn = result.getBody();
		} else {
			throw new EntityNotFoundException("Rest service is not available in GET");
		}

		return new ResponseEntity<>(applicationFormReturn, HttpStatus.OK);

	}

	@PostMapping("/data/{userId}")
	public ResponseEntity<PdfApplicationForm> setData(@PathVariable String userId,
			@RequestBody PdfApplicationForm applicationForm) throws URISyntaxException {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/demat-persist/api/pdf-form/" + userId;

		URI uri = new URI(url);

		ResponseEntity<PdfApplicationForm> result = restTemplate.postForEntity(uri, applicationForm,
				PdfApplicationForm.class);

		PdfApplicationForm applicationFormReturn = null;
		if (result.getStatusCode() == HttpStatus.CREATED) {
			applicationFormReturn = result.getBody();
		} else {
			throw new EntityNotFoundException("Rest service is not available in POST");
		}

		return new ResponseEntity<>(applicationFormReturn, HttpStatus.CREATED);

	}
}
