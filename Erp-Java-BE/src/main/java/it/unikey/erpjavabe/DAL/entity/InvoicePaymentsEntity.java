package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "InvoicePayments", schema = "public", catalog = "ErpDB")
public class InvoicePaymentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "InvoiceId")
    private int invoiceId;
    @Basic
    @Column(name = "DateOfPayment")
    private Timestamp dateOfPayment;
    @Basic
    @Column(name = "Amount")
    private BigInteger amount;
    @Basic
    @Column(name = "PaymentType")
    private int paymentType;
    @ManyToOne
    @JoinColumn(name = "InvoiceId", referencedColumnName = "Id", nullable = false)
    private InvoicesEntity invoicesByInvoiceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Timestamp getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Timestamp dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoicePaymentsEntity that = (InvoicePaymentsEntity) o;
        return id == that.id && invoiceId == that.invoiceId && paymentType == that.paymentType && Objects.equals(dateOfPayment, that.dateOfPayment) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoiceId, dateOfPayment, amount, paymentType);
    }

    public InvoicesEntity getInvoicesByInvoiceId() {
        return invoicesByInvoiceId;
    }

    public void setInvoicesByInvoiceId(InvoicesEntity invoicesByInvoiceId) {
        this.invoicesByInvoiceId = invoicesByInvoiceId;
    }
}
