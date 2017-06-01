package com.lugowoy.util.filling.models;

import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.models.Model;
import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 01.06.2017. */

public class FillingModelArray<T> implements FillableModel<Array<T>> {

    private FillingArray<T> fillingArray;

    public FillingModelArray(FillingArray<T> fillingArray) {
        this.fillingArray = fillingArray;
    }

    @Override
    public void fill(Array<T> array) {
        this.fillingArray.fillArray(array.getArray());
    }

    public FillingArray getFillingArray() {
        return fillingArray;
    }

}
