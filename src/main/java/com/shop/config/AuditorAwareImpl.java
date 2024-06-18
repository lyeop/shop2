package com.shop.config;


import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    //Optional 클래스는 아래와 같은 value에 값을 저장하기 때문에 값이 null이더라도
    //바로 NullPointError가 발생하지 않으며, 클래스이기 때문에 각종 메소드를 제공


    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userId="";
        if(authentication !=null){
            userId= authentication.getName();
        }
        return Optional.of(userId);
    }
}
