package com.benjamin.service;

import com.benjamin.domain.DTO.UserDTO;

/**
 * hpmake (hpmake.org)
 * <p>
 * com.benjamin.service
 * https://github.com/hpmake/hpmake
 */
public interface IUserService {

    UserDTO create(UserDTO userDTO);
    void remove(Long userID);
    UserDTO update(UserDTO userDTO);
    UserDTO getByID(Long ID);
}
