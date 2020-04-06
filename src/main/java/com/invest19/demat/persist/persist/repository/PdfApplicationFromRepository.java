package com.invest19.demat.persist.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invest19.demat.persist.pdf.bean.PdfApplicationForm;

@Repository
public interface PdfApplicationFromRepository extends JpaRepository<PdfApplicationForm, String> {

}
