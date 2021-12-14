package com.Talenta.perpustakaan.dao;

import com.Talenta.perpustakaan.entity.Loan;
import com.Talenta.perpustakaan.entity.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class LoanDao extends BaseDao<Loan> {

    @Override
    public List<Predicate> predicates(Loan param, CriteriaBuilder builder, Root<Loan> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        return predicates;
    }
}
