package com.invest19.demat.persist.persist.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invest19.demat.persist.exception.ApplicationEntiyNotFoundException;
import com.invest19.demat.persist.pdf.bean.PdfApplicationForm;
import com.invest19.demat.persist.persist.repository.PdfApplicationFromRepository;

@Service
public class ApplicationPersistenceService {

	@Autowired
	PdfApplicationFromRepository pdfApplicationFromRepository;

	public PdfApplicationForm save(PdfApplicationForm pdfApplicationFrom) throws ApplicationEntiyNotFoundException {

		try {
			PdfApplicationForm pdfApplicationFormReturnValue = pdfApplicationFromRepository.save(pdfApplicationFrom);
			return pdfApplicationFormReturnValue;
		} catch (Exception exception) {
			throw new ApplicationEntiyNotFoundException(exception);
		}
	}

	public PdfApplicationForm find(String userId) throws ApplicationEntiyNotFoundException {

		try {
			Optional<PdfApplicationForm> optional = pdfApplicationFromRepository.findById(userId);
			PdfApplicationForm pdfApplicationForm = optional.get();
			return pdfApplicationForm;
		} catch (NoSuchElementException exception) {
			String message = "Entity with id=" + userId + " is not found ";
			throw new ApplicationEntiyNotFoundException(message, exception);
		} catch (Exception exception) {
			String message = "Entity with id=" + userId + " is not found ";
			throw new ApplicationEntiyNotFoundException(message, exception);
		}
	}
}
