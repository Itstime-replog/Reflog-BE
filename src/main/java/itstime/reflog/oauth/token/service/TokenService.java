package itstime.reflog.oauth.token.service;

import itstime.reflog.oauth.token.dto.TokenDto;
import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    TokenDto.TokenResponse reissueAccessToken(String authorizationHeader);
}