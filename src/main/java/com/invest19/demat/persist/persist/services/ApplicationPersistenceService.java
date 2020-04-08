package com.invest19.demat.persist.persist.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invest19.demat.persist.pdf.bean.PdfApplicationForm;
import com.invest19.demat.persist.persist.repository.PdfApplicationFromRepository;

@Service
public class ApplicationPersistenceService {

	@Autowired
	PdfApplicationFromRepository pdfApplicationFromRepository;

	public PdfApplicationForm save(PdfApplicationForm pdfApplicationFrom) {

		PdfApplicationForm pdfApplicationFormReturnValue = pdfApplicationFromRepository.save(pdfApplicationFrom);
		return pdfApplicationFormReturnValue;

	}

	public PdfApplicationForm find(String userId) {

		try {
			Optional<PdfApplicationForm> optional = pdfApplicationFromRepository.findById(userId);
			PdfApplicationForm pdfApplicationForm = optional.get();
			return pdfApplicationForm;
		} catch (NoSuchElementException exception) {
			String message = "Entity with id=" + userId + " is not found " + "\n" + exception.getLocalizedMessage();
			throw new EntityNotFoundException(message);
		} catch (Exception exception) {
			String message = "Entity with id=" + userId + " is not found " + "\n" + exception.getLocalizedMessage();
			throw new EntityNotFoundException(message);
		}
	}

	public void delete(String userId) {

		try {
			pdfApplicationFromRepository.deleteById(userId);
		} catch (NoSuchElementException exception) {
			String message = "Entity with id=" + userId + " is not found for delete " + "\n"
					+ exception.getLocalizedMessage();
			throw new EntityNotFoundException(message);
		} catch (Exception exception) {
			String message = "Entity with id=" + userId + " is not found for delete " + "\n"
					+ exception.getLocalizedMessage();
			throw new EntityNotFoundException(message);
		}
	}
	
	
	public long count() {
		return pdfApplicationFromRepository.count();
	}

}
