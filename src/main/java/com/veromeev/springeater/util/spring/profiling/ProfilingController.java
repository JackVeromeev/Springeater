package com.veromeev.springeater.util.spring.profiling;

/**
 * Created by jack on 8/16/17.
 *
 * @author Jack Veromeyev
 */
public class ProfilingController implements ProfilingControllerMBean {

    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
