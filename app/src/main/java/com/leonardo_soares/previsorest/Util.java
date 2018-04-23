package com.leonardo_soares.previsorest;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;
/**
 * Created by Leonardo Soares on 21/04/18.
 * ra 816114026
 */
public class Util {
    public static Drawable getDrawable(Context context, String nome){

        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nome);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}


