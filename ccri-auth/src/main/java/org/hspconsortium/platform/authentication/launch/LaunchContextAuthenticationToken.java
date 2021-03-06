package org.hspconsortium.platform.authentication.launch;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Functionality this is no different than the UsernamePasswordAuthentiationToken, however this allows us to distinguish
 * a persona login in the oic.saved_user_auth table.
 */
public class LaunchContextAuthenticationToken extends UsernamePasswordAuthenticationToken {
    public LaunchContextAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public LaunchContextAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
