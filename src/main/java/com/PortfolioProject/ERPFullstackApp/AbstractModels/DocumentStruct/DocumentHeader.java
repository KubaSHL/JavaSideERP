package com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.IContractor;
import com.PortfolioProject.ERPFullstackApp.Payment.Abstract.Payment;
import jakarta.persistence.*;


import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class  DocumentHeader {

    @Id
    @SequenceGenerator(
            name = "document_head_sequence",
            sequenceName = "document_head_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "document_head_sequence"
    )
    private Long docHeadId;
    @OneToOne(cascade = CascadeType.PERSIST)
    public IContractor contractor;
    Date date;
    Date dueTo;
    @OneToOne(cascade = CascadeType.PERSIST)
    Payment payment;

    public DocumentHeader() {
    }

    public DocumentHeader(IContractor contractor, Date date, Date dueTo, Payment payment) {
        this.contractor = contractor;
        this.date = date;
        this.dueTo = dueTo;
        this.payment = payment;
    }

    public Long getDocHeadId() {
        return docHeadId;
    }

    private void setDocHeadId(Long docHeadId) {
        this.docHeadId = docHeadId;
    }

    public IContractor getContractor() {
        return contractor;
    }

    public void setContractor(IContractor contractor) {
        this.contractor = contractor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDueTo() {
        return dueTo;
    }

    public void setDueTo(Date dueTo) {
        this.dueTo = dueTo;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}