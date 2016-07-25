package org.educraft.multitool.proxy;

import org.educraft.multitool.init.ModItems;

import static org.educraft.multitool.init.ModItems.registerRender;


/**
 * Created by admiralmattbar on 7/24/2016.
 */
public class ClientProxy {

    @Override
    public void init() {
        ModItems.registerRender();

    }
}
