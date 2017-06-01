package com.lugowoy.util.filling.models;

import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.models.Model;

/** Created by Konstantin Lugowoy on 01.06.2017. */

public interface FillableModel<T extends Model> extends Fillable {

    void fill(T t);

}
