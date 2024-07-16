package com.tweets.springsecutiry.dtos;

public record LoginResponseDto(String accessToken, Long expiresIn) {
}
