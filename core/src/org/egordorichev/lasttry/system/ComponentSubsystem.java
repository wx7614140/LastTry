package org.egordorichev.lasttry.system;

import org.egordorichev.lasttry.entitySystem.ComponentSystem;
import org.egordorichev.lasttry.injection.Context;
import org.egordorichev.lasttry.injection.InjectionHelper;
import org.reflections.Reflections;

public class ComponentSubsystem implements Subsystem {
    @Override
    public String name() {
        return "Component System";
    }

    @Override
    public void load(Context context) {


    }
}
