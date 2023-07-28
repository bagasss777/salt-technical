package com.salt.service;

import com.salt.dto.KonsumenDto;
import com.salt.model.Konsumen;
import com.salt.repository.KonsumenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KonsumenService {
    @Autowired
    private KonsumenRepository konsumenRepository;
    public void create(KonsumenDto konsumenDto) {
        Konsumen data = convertDtoToModel(konsumenDto);
        konsumenRepository.save(data);
    }
    public List<KonsumenDto> getAll() {
        List<Konsumen> list = konsumenRepository.findAll();
        List<KonsumenDto> userList = list.stream()
                .map(KonsumenDto::new)
                .collect(Collectors.toCollection(ArrayList::new));
        return userList;
    }
    public void delete(Long id) {
        konsumenRepository.deleteById(id);
    }
    public KonsumenDto edit(Long id) {
        Konsumen konsumen = konsumenRepository.getReferenceById(id);
        return convertModelToDTO(konsumen);
    }
    private Konsumen convertDtoToModel(KonsumenDto userDto) {
        Konsumen data = new Konsumen();
        if (userDto.getId() != null) {
            data.setId(userDto.getId());
        }
        data.setNama(userDto.getNama());
        data.setAlamat(userDto.getAlamat());
        data.setKota(userDto.getKota());
        data.setProvinsi(userDto.getProvinsi());
        data.setStatus(userDto.getStatus());
        data.setTglRegistrasi(LocalDateTime.now());
        return data;
    }
    private KonsumenDto convertModelToDTO(Konsumen konsumen) {
        KonsumenDto konsumenDTO = new KonsumenDto();
        konsumenDTO.setId(konsumen.getId());
        konsumenDTO.setNama(konsumen.getNama());
        konsumenDTO.setAlamat(konsumen.getAlamat());
        konsumenDTO.setKota(konsumen.getKota());
        konsumenDTO.setProvinsi(konsumen.getProvinsi());
        konsumenDTO.setTglRegistrasi(konsumen.getTglRegistrasi());
        konsumenDTO.setStatus(konsumen.getStatus());
        return konsumenDTO;
    }

}
