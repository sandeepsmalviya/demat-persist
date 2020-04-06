package com.invest19.demat.persist.persist.endpoints;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.PdfApplicationForm;
import com.invest19.demat.persist.pdf.bean.page04.KycApplicationForm;
import com.invest19.demat.persist.pdf.bean.page05.AdditionalKycForm;
import com.invest19.demat.persist.pdf.bean.page06.TradingDematAccountRelatedDetails;
import com.invest19.demat.persist.pdf.bean.page07.ForOfficeUseOnly;
import com.invest19.demat.persist.pdf.bean.page09.LetterForAuthorization;
import com.invest19.demat.persist.pdf.bean.page13.NominationDetails;
import com.invest19.demat.persist.pdf.bean.page15.TariffSheet;
import com.invest19.demat.persist.pdf.bean.page16.PowerOfAttorney;
import com.invest19.demat.persist.pdf.bean.page18.AcknowledgementLetter;
import com.invest19.demat.persist.pdf.pdffill.CombinedFormFill;
import com.invest19.demat.persist.persist.services.ApplicationPersistenceService;

@RestController
@RequestMapping("/demat-persist")
@CrossOrigin(origins = "*")
public class ApplicationPersistenceResource {

	@Autowired
	ApplicationPersistenceService applicationPersistenceService;

	@Autowired
	private CombinedFormFill combinedFormFill;

	@GetMapping("/save-db-sample-data")
	public ResponseEntity<PdfApplicationForm> savePdfApplicationFormFromSampleData() throws ParseException {

		PdfApplicationForm pdfApplicationFrom = combinedFormFill.fill();
		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		return new ResponseEntity<>(pdfApplicationFrom, HttpStatus.OK);
	}

	@GetMapping("/pdf-form/{userId}")
	public ResponseEntity<PdfApplicationForm> getPdfApplicationForm(@PathVariable("userId") String userId) {
		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		return new ResponseEntity<>(pdfApplicationFrom, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/{userId}")
	public ResponseEntity<PdfApplicationForm> save(@PathVariable("userId") String userId,
			@Valid @RequestBody PdfApplicationForm pdfApplicationFrom) {

		PdfApplicationForm pdfApplicationFrom1 = applicationPersistenceService.save(pdfApplicationFrom);
		return new ResponseEntity<>(pdfApplicationFrom1, HttpStatus.CREATED);

	}

	@GetMapping("/pdf-form/kyc/{userId}")
	public ResponseEntity<KycApplicationForm> getKycApplicationForm(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		KycApplicationForm kycApplicationForm = pdfApplicationFrom.getKycApplicationForm();
		return new ResponseEntity<>(kycApplicationForm, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/kyc/{userId}")
	public ResponseEntity<KycApplicationForm> saveKycApplicationFrom(@PathVariable("userId") String userId,
			@RequestBody KycApplicationForm kycApplicationForm) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		pdfApplicationFrom.setKycApplicationForm(kycApplicationForm);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		KycApplicationForm kycApplicationForm1 = pdfApplicationFrom.getKycApplicationForm();

		return new ResponseEntity<>(kycApplicationForm1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/adkyc/{userId}")
	public ResponseEntity<AdditionalKycForm> getAdditionalKycForm(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		AdditionalKycForm additionalKycForm = pdfApplicationFrom.getAdditionalKycForm();
		return new ResponseEntity<>(additionalKycForm, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/adkyc/{userId}")
	public ResponseEntity<AdditionalKycForm> saveAdditionalKycForm(@PathVariable("userId") String userId,
			@RequestBody AdditionalKycForm additionalKycForm) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		pdfApplicationFrom.setAdditionalKycForm(additionalKycForm);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		AdditionalKycForm additionalKycForm1 = pdfApplicationFrom.getAdditionalKycForm();

		return new ResponseEntity<>(additionalKycForm1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/tdard/{userId}")
	public ResponseEntity<TradingDematAccountRelatedDetails> getTradingDematAccountRelatedDetails(
			@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);

		TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails = pdfApplicationFrom
				.getTradingDematAccountRelatedDetails();

		return new ResponseEntity<>(tradingDematAccountRelatedDetails, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/tdard/{userId}")
	public ResponseEntity<TradingDematAccountRelatedDetails> saveTradingDematAccountRelatedDetails(
			@PathVariable("userId") String userId,
			@RequestBody TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		;
		pdfApplicationFrom.setTradingDematAccountRelatedDetails(tradingDematAccountRelatedDetails);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails1 = pdfApplicationFrom
				.getTradingDematAccountRelatedDetails();

		return new ResponseEntity<>(tradingDematAccountRelatedDetails1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/tdard/fouo/{userId}")
	public ResponseEntity<ForOfficeUseOnly> getForOfficeUseOnly(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails = pdfApplicationFrom
				.getTradingDematAccountRelatedDetails();
		ForOfficeUseOnly forOfficeUseOnly = tradingDematAccountRelatedDetails.getForOfficeUseOnly();

		return new ResponseEntity<>(forOfficeUseOnly, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/tdard/fouo/{userId}")
	public ResponseEntity<ForOfficeUseOnly> saveForOfficeUseOnly(@PathVariable("userId") String userId,
			@RequestBody ForOfficeUseOnly forOfficeUseOnly) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails = pdfApplicationFrom
				.getTradingDematAccountRelatedDetails();
		tradingDematAccountRelatedDetails.setForOfficeUseOnly(forOfficeUseOnly);

		PdfApplicationForm pdfApplicationFrom1 = applicationPersistenceService.save(pdfApplicationFrom);

		TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails1 = pdfApplicationFrom1
				.getTradingDematAccountRelatedDetails();
		ForOfficeUseOnly forOfficeUseOnly1 = tradingDematAccountRelatedDetails1.getForOfficeUseOnly();

		return new ResponseEntity<>(forOfficeUseOnly1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/lfa/{userId}")
	public ResponseEntity<LetterForAuthorization> getLetterForAuthorization(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		LetterForAuthorization letterForAuthorization = pdfApplicationFrom.getLetterForAuthorization();
		return new ResponseEntity<>(letterForAuthorization, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/lfa/{userId}")
	public ResponseEntity<LetterForAuthorization> saveLetterForAuthorization(@PathVariable("userId") String userId,
			@RequestBody LetterForAuthorization letterForAuthorization) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		pdfApplicationFrom.setLetterForAuthorization(letterForAuthorization);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		LetterForAuthorization letterForAuthorization1 = pdfApplicationFrom.getLetterForAuthorization();

		return new ResponseEntity<>(letterForAuthorization1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/nd/{userId}")
	public ResponseEntity<NominationDetails> getNominationDetails(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		NominationDetails nominationDetails = pdfApplicationFrom.getNominationDetails();
		return new ResponseEntity<>(nominationDetails, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/nd/{userId}")
	public ResponseEntity<NominationDetails> saveNominationDetails(@PathVariable("userId") String userId,
			@RequestBody NominationDetails nominationDetails) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		pdfApplicationFrom.setNominationDetails(nominationDetails);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		NominationDetails nominationDetails1 = pdfApplicationFrom.getNominationDetails();

		return new ResponseEntity<>(nominationDetails1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/poa/{userId}")
	public ResponseEntity<PowerOfAttorney> getPowerOfAttorney(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		PowerOfAttorney powerOfAttorney = pdfApplicationFrom.getPowerOfAttorney();
		return new ResponseEntity<>(powerOfAttorney, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/poa/{userId}")
	public ResponseEntity<PowerOfAttorney> savePowerOfAttorney(@PathVariable("userId") String userId,
			@RequestBody PowerOfAttorney powerOfAttorney) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		pdfApplicationFrom.setPowerOfAttorney(powerOfAttorney);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		PowerOfAttorney powerOfAttorney1 = pdfApplicationFrom.getPowerOfAttorney();

		return new ResponseEntity<>(powerOfAttorney1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/ts/{userId}")
	public ResponseEntity<TariffSheet> getTariffSheet(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		TariffSheet tariffSheet = pdfApplicationFrom.getTariffSheet();
		return new ResponseEntity<>(tariffSheet, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/ts/{userId}")
	public ResponseEntity<TariffSheet> saveTariffSheet(@PathVariable("userId") String userId,
			@RequestBody TariffSheet tariffSheet) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		pdfApplicationFrom.setTariffSheet(tariffSheet);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		TariffSheet tariffSheet1 = pdfApplicationFrom.getTariffSheet();

		return new ResponseEntity<>(tariffSheet1, HttpStatus.OK);

	}

	@GetMapping("/pdf-form/al/{userId}")
	public ResponseEntity<AcknowledgementLetter> getAcknowledgementLetter(@PathVariable("userId") String userId) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		AcknowledgementLetter acknowledgementLetter = pdfApplicationFrom.getAcknowledgementLetter();
		return new ResponseEntity<>(acknowledgementLetter, HttpStatus.OK);

	}

	@PostMapping("/pdf-form/al/{userId}")
	public ResponseEntity<AcknowledgementLetter> saveAcknowledgementLetter(@PathVariable("userId") String userId,
			@RequestBody AcknowledgementLetter tariffSheet) {

		PdfApplicationForm pdfApplicationFrom = applicationPersistenceService.find(userId);
		pdfApplicationFrom.setAcknowledgementLetter(tariffSheet);

		pdfApplicationFrom = applicationPersistenceService.save(pdfApplicationFrom);
		AcknowledgementLetter acknowledgementLetter1 = pdfApplicationFrom.getAcknowledgementLetter();

		return new ResponseEntity<>(acknowledgementLetter1, HttpStatus.OK);

	}
}
