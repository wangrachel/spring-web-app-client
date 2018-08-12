package com.bogdanovpd.spring.webapp.spring.webapp.client.service;

import com.bogdanovpd.spring.webapp.spring.webapp.client.model.Role;

import java.util.List;

public interface RoleRestService {
    List<Role> getAllRoles();
    Role getRoleById(long id);
}
