package com.benjamin.rest.api;

import com.benjamin.domain.UserDO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * hpmake (hpmake.org)
 * <p>
 * com.benjamin.rest.api
 * https://github.com/hpmake/hpmake
 */
@RestController
@RequestMapping("${REGISTRATION.path.index}")
@PropertySource("${classpath:RegistrationURLMapping.properties}")
public class RegistrationController {

    @RequestMapping(value = "index", method = RequestMethod.POST)
//    @RequestMapping("${registation.handle.path}")
    public @ResponseBody UserDO
        handleUserRegistration(
            @Valid UserDO userDO
    ) {

        System.out.println(userDO);
        System.out.println(userDO.getEmail());

        return null;

    }
}
