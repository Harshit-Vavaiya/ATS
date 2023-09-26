package com.hv.ats.models;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="applications",schema = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private String company;
    private String description;
    private String role;
    private String platform;
    @CreationTimestamp
    private String appliedOn;
    private String resume;
    private String coverLetter;
    private String tags;
    private String status;



}
