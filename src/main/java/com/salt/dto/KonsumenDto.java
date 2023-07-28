package com.salt.dto;

import com.salt.model.Konsumen;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class KonsumenDto {

    private Long id;
    private String nama;
    private String alamat;
    private String kota;
    private String provinsi;
    private LocalDateTime tglRegistrasi;
    private String status;

    public KonsumenDto(Konsumen konsumen) {
        this.nama = konsumen.getNama();
        this.alamat = konsumen.getAlamat();
        this.kota = konsumen.getKota();
        this.provinsi = konsumen.getProvinsi();
        this.tglRegistrasi = konsumen.getTglRegistrasi();
        this.status = konsumen.getStatus();
        this.id = konsumen.getId();
    }
}
