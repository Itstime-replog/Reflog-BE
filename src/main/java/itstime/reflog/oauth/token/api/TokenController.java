package itstime.reflog.oauth.token.api;

import itstime.reflog.common.CommonApiResponse;
import itstime.reflog.oauth.token.dto.TokenDto;
import itstime.reflog.oauth.token.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TokenController {
    private final TokenService authService;

    // 액세스 토큰을 재발행하는 API
    @GetMapping("/reissue/access-token")
    public CommonApiResponse<TokenDto.TokenResponse> reissueAccessToken(
            @RequestHeader("Authorization") String authorizationHeader) {

        TokenDto.TokenResponse accessToken = authService.reissueAccessToken(authorizationHeader);
        return CommonApiResponse.onSuccess(accessToken);
    }
}