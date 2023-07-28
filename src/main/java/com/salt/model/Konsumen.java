package com.salt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "consumers")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Konsumen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "kota")
    private String kota;

    @Column(name = "provinsi")
    private String provinsi;

    @Column(name = "tgl_registrasi")
    private LocalDateTime tglRegistrasi;

    @Column(name = "status")
    private String status;

}
