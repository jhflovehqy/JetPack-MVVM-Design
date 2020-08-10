package com.bis.cloudphone.ui.binding;



import net.steamcrafted.materialiconlib.MaterialDrawableBuilder;
import net.steamcrafted.materialiconlib.MaterialIconView;

import androidx.databinding.BindingAdapter;

/**
 * Create by KunMinX at 2020/3/13
 */
public class IconBindingAdapter {



    @BindingAdapter(value = {"mdIcon"}, requireAll = false)
    public static void setIcon(MaterialIconView view, MaterialDrawableBuilder.IconValue iconValue) {
        view.setIcon(iconValue);
    }


}
