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
@Table(name = "appication")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private long userId;

    @NonNull
    private String company;

    @NonNull
    private String description;

    @NonNull
    private String role;

    @NonNull
    private String platform;

    @NonNull
    @CreationTimestamp
    private String appliedOn;

    @NonNull
    private String resume;

    @NonNull
    private String coverLetter;

    @NonNull
    private String tags;



}
