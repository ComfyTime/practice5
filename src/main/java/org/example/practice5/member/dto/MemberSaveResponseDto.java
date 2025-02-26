package org.example.practice5.member.dto;

import lombok.Getter;

@Getter
public class MemberSaveResponseDto {

    private final Long id;
    public final String email;

    public MemberSaveResponseDto(Long id, String email) {
        this.id = id;
        this.email = email;
    }
}
