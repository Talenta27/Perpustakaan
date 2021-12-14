package com.Talenta.perpustakaan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
@DynamicUpdate
@SuppressWarnings("Unchecked")

public abstract class BaseEntity<T> implements Serializable {
    private static final long serialVersionUID = -1446398935944895849L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "created time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedTime;

    @Column(name = "Updated_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date Updatedtime;

    @PrePersist
    protected void onCreate(){
        setCreatedTime(new Date());
    }

    @PreUpdate
    protected void onUpdate(){
        setUpdatedtime(new Date());
    }



}
