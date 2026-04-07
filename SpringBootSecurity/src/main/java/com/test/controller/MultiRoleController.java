package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MultiRoleController {

    
    @GetMapping("/admin-only")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminOnly() {
        return "Welcome, Admin!";
    }
 
    @GetMapping("/shared")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String sharedAccess() {
        return "Content for Users and Admins";
    }
 
    @GetMapping("/dashboard")
    public String getDashboard(Authentication authentication) {
        boolean isAdmin = authentication.getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().equals("ADMIN"));
        
        if (isAdmin) {
            return "Advanced Admin Dashboard";
        }
        return "Basic User Dashboard";
    }
}
