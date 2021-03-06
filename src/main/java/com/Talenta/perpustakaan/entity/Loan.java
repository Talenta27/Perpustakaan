package com.Talenta.perpustakaan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "loan")
@Getter
@Setter
@NoArgsConstructor
public class Loan extends BaseEntity<Loan>{
    public enum StatusLoan{
        BORROWED,
        RETURNED
    }



    @Column(name = "type_identity")
    private String typeIdentity;

    @Column(name = "number_identity")
    private String numberIdentity;

    @Column(name = "duration")
    private Integer duration;

    @Column (name = "loan_date")
    @Temporal(TemporalType.DATE)
    private Date loanDate;

    @Column (name = "return_date")
    @Temporal( TemporalType.DATE)
    private Date returnDate;

    @Column (name = "Status")
    @Enumerated(EnumType.STRING)
    private StatusLoan status;

    @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "book_id")
    private Book book;

    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Book user;



}
