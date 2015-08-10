package com.benjamin.domain;

/**
 * hpmake (hpmake.org)
 * User activity types
 * com.benjamin.domain
 * https://github.com/hpmake/hpmake
 */
public enum  UserEventType {

    LOGIN,          // login on app
    LOGOUT,         // logout from app
    REGISTRATION,   // user registration complete
    SEND_MESSAGE,   // user send internal/external message
    CHARGE         // charge on balance

}
